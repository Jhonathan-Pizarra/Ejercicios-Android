package com.example.pruebatopicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private ImageView iv_animal;
    private ImageView iv_answer;
    private EditText nombre;
    public MediaPlayer mp;

    public int num_aleatorio = (int)(Math.random() * 10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nombre = (EditText)findViewById(R.id.txt_Nombre);
        iv_animal = (ImageView)findViewById(R.id.imageView_Personaje);
        iv_answer = (ImageView)findViewById(R.id.imageView_answer);

        //Icono en el action Bar!
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //Imagenes alatorias
        int id;
        switch (num_aleatorio){
            case 0:
                id = getResources().getIdentifier("buho","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 1:
                id = getResources().getIdentifier("cat","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 2:
                id = getResources().getIdentifier("chiken","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 3:
                id = getResources().getIdentifier("cow","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 4:
                id = getResources().getIdentifier("dog","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 5:
                id = getResources().getIdentifier("duck","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 6:
                id = getResources().getIdentifier("eagle","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 7:
                id = getResources().getIdentifier("horse","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 8:
                id = getResources().getIdentifier("lion","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            case 9:
                id = getResources().getIdentifier("pig","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
            default:
                id = getResources().getIdentifier("wolf","drawable", getPackageName());
                iv_animal.setImageResource(id);
                break;
        }
        //Sonido

        mp = MediaPlayer.create(this, R.raw.intro);
        mp.start();
    }

    public  void jugar(View view){
        String animal = nombre.getText().toString();
        int respuesta;

        if(!animal.equals("")){
            mp.stop();
            mp.release();

            if(animal.equals("Gato") || animal.equals("gato") || animal.equals("GATO")){
                if(num_aleatorio==1){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Buho") || animal.equals("buho") || animal.equals("BUHO")){
                if(num_aleatorio==0){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Gallina") || animal.equals("gallina") || animal.equals("GALLINA")){
                if(num_aleatorio==2){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Perro") || animal.equals("perro") || animal.equals("PERRO")){
                if(num_aleatorio==4){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Vaca") || animal.equals("vaca") || animal.equals("VACA")){
                if(num_aleatorio==3){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Pato") || animal.equals("pato") || animal.equals("PATO")){
                if(num_aleatorio==5){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Aguila") || animal.equals("aguila") || animal.equals("AGUILA")){
                if(num_aleatorio==6){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Caballo") || animal.equals("caballo") || animal.equals("CABALLO")){
                if(num_aleatorio==7){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Leon") || animal.equals("leon") || animal.equals("LEON")){
                if(num_aleatorio==8){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Cerdo") || animal.equals("cerdo") || animal.equals("CERDO")){
                if(num_aleatorio==9){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else if(animal.equals("Lobo") || animal.equals("lobo") || animal.equals("LOBO")){
                if(num_aleatorio==10){
                    respuesta = getResources().getIdentifier("check","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }else{
                    respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                    iv_answer.setImageResource(respuesta);
                }

            }else {
                respuesta = getResources().getIdentifier("wrong","drawable", getPackageName());
                iv_answer.setImageResource(respuesta);
            }

            finish();
            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            //Intent intent = new Intent((this, HomeActivity.class));
        }else{
            Toast.makeText(HomeActivity.this,"Escribe :D", Toast.LENGTH_SHORT).show();

            //Si no escribió nada, se abre el teclado para que escriba! :D
            nombre.requestFocus();
            InputMethodManager inm = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            inm.showSoftInput(nombre, InputMethodManager.SHOW_IMPLICIT);

        }
    }

    public void sonidos(View view){
       switch (num_aleatorio){
            case 0:
                //Estas lineaas deben de ley ir juntas:
                mp = MediaPlayer.create(this, R.raw.owl_sound);
                mp.start();
                break;
            case 1:

                mp = MediaPlayer.create(this, R.raw.cat_sound);
                mp.start();
                break;
            case 2:

                mp = MediaPlayer.create(this, R.raw.chiken);
                mp.start();
                break;
            case 3:

                mp = MediaPlayer.create(this, R.raw.cow_sound);
                mp.start();
                break;
            case 4:
                mp = MediaPlayer.create(this, R.raw.dog_sound);
                mp.start();
                break;
            case 5:

                mp = MediaPlayer.create(this, R.raw.duck);
                mp.start();
                break;
            case 6:
                mp = MediaPlayer.create(this, R.raw.eagle_sound);
                mp.start();
                break;
            case 7:
                mp = MediaPlayer.create(this, R.raw.horse_sound);
                mp.start();
                break;
            case 8:

                mp = MediaPlayer.create(this, R.raw.lion_sound);
                mp.start();
                break;
            case 9:

                mp = MediaPlayer.create(this, R.raw.pig_sound);
                mp.start();
                break;
            default:
                mp = MediaPlayer.create(this, R.raw.wolf_sound);
                mp.start();
                break;
        }

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.opciones, menu);
        //que se oculte o que se muestre
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        mp.stop();
        mp.release();
        if(id==R.id.item_salir){
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        }
        //que se oculte o que se muestre
        return super.onOptionsItemSelected(item);
    }

    //Si se presiona el botón regresar o back
    @Override
    public void onBackPressed(){
        //No va a hacer nada jaja
    }


}