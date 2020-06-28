package com.example.pruebatopicos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import dependencia
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
//Toast
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText authUsername, authMail, authPassword;
    TextView login;
    Button btnRegister;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        authUsername=findViewById(R.id.txt_username);
        authMail=findViewById(R.id.txt_mail);
        authPassword=findViewById(R.id.txt_password);
        btnRegister=findViewById(R.id.btn_register);
        login = findViewById(R.id.lbl_login);


        fAuth=FirebaseAuth.getInstance();

        /*
        if(fAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        }
        */

        btnRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String email=authMail.getText().toString().trim();
                String password=authPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    authMail.setError("No válido!");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    authPassword.setError("No válido!");
                    return;
                }


                if(password.length() < 5){
                    authPassword.setError("Use una clave más chévere.");
                    return;
                    //  Toast.makeText(RegisterActivity.this," se registro correctamente", Toast.LENGTH_SHORT).show();
                }

                //Registrar un usuario nuevo
                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(RegisterActivity.this," se registro correctamente", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                        }else{
                            if(task.getException() instanceof FirebaseAuthUserCollisionException){ //Si el usuario ya existe
                                Toast.makeText(RegisterActivity.this,"Ese usuario ya existe.", Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(RegisterActivity.this,"Ha ocurrido un problema, intente otra vez", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }
        });

        //¿Ya tienes cuenta?: Login
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
    }
}