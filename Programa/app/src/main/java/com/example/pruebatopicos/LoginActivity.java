package com.example.pruebatopicos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity {
    EditText authMail, authPassword;
    Button btnStart;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        authMail=findViewById(R.id.txt_mail);
        authPassword=findViewById(R.id.txt_password);
        btnStart=findViewById(R.id.btn_run);

        fAuth= FirebaseAuth.getInstance();

        /*
        if(fAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        }
        */

        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String email=authMail.getText().toString().trim();
                String password=authPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    authMail.setError("Ingrese su correo...");
                    return;
                }else if(TextUtils.isEmpty(password)){
                    authPassword.setError("No pusistes la contraseña");
                    return;
                }else{
                    //Iniciar sesión
                    fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(LoginActivity.this," Bienvenido!", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                            }else{
                                Toast.makeText(LoginActivity.this,"email o contraseña incorrectos", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });

    }
}