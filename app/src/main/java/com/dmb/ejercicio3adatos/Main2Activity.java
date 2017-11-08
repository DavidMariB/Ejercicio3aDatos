package com.dmb.ejercicio3adatos;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText et1,et2,et3,et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1 = (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);

        retrieveData();
    }

    public void retrieveData(){
        SharedPreferences preferences = getSharedPreferences("datos",MODE_PRIVATE);
        String name = preferences.getString("name","name");
        String dni = preferences.getString("dni","dni");
        String birthday = preferences.getString("birthday","birthday");
        String gender = preferences.getString("gender","Sexo no introducido");
        et1.setText(name);
        et2.setText(dni);
        et3.setText(birthday);
        et4.setText(gender);
    }

    public void backToMain(View v){
        this.finish();
    }
}
