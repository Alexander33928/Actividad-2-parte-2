package com.example.actividad_2;

import static com.example.actividad_2.MainActivity.MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class escribir_usuario extends AppCompatActivity {
    private Button b;
    private EditText a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribir_usuario);
        b = findViewById(R.id.boton1);
        a = findViewById(R.id.ingrese);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String mensaje = a.getText().toString();
                intent.putExtra(MESSAGE,mensaje);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
