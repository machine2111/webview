package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (EditText) findViewById(R.id.tv1);

    }

    //Metodo para realizar busqueda en webview

    public void navegar (View view){
        Intent i = new Intent(this, ActivityWeb.class);
        i.putExtra("pagina", tv1.getText().toString());
        startActivity(i);
    }
}