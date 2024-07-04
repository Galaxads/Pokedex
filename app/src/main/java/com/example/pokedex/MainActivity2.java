package com.example.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Button filtre=(Button) findViewById(R.id.button);
        ImageButton but3=(ImageButton) findViewById(R.id.imageButton3);
        ImageButton but4=(ImageButton) findViewById(R.id.imageButton4);
        ImageButton but5=(ImageButton) findViewById(R.id.imageButton5);
        ImageButton but6=(ImageButton) findViewById(R.id.imageButton6);
        ImageButton but7=(ImageButton) findViewById(R.id.imageButton9);
        ImageButton but8=(ImageButton) findViewById(R.id.imageButton8);
        ImageButton but9=(ImageButton) findViewById(R.id.imageButton7);
        ImageButton but10=(ImageButton) findViewById(R.id.imageButton12);
        ImageButton but11=(ImageButton) findViewById(R.id.imageButton11);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            filtre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), PokemonInfo.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), info2.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), info3.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), info4.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), info7.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), info6.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), info5.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), info9.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            but11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), info8.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            return insets;
        });
    }
}