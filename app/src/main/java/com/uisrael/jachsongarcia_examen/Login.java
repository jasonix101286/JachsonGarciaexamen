package com.uisrael.jachsongarcia_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button ingresar = (Button) findViewById(R.id.button);
        ingresar.setOnClickListener(new View.OnClickListener() {

                                        @Override

                                        public void onClick(View v) {
                                            String usuario = ((EditText)findViewById(R.id.editText2)).getText().toString();
                                            String password = ((EditText)findViewById(R.id.editText4)).getText().toString();
                                            if (usuario.equals("estudiante2019") &&password.equals("uisrael2019"))
                                            {
                                                Intent menu = new Intent(Login.this,Registro.class);
                                                menu.putExtra("valor enviado","Usuario\n" +
                                                        "conectado: estudiante2019");
                                                startActivity(menu);
                                            }
                                            else
                                            { Toast.makeText(getApplicationContext(),"No puede ingresar, revise usuario &/o contraseña",Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }

        );    }
    }

