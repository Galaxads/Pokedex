package com.example.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class info2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info2);
        ImageButton but1=(ImageButton) findViewById(R.id.imageButton);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            but1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Создаем объект класса
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
// Выполняем переход
                    startActivity(intent);
                }
            });
            return insets;
        });
    }
}