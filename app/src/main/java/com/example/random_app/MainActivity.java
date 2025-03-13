package com.example.random_app;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;
import java.text.CollationElementIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView RandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RandomNumber = findViewById(R.id.textViewRandomNumber);

    }

    public void generateRandomNumber(View view) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        RandomNumber.setText("난수: "+randomNumber);

    }
}