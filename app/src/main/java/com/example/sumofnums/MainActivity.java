package com.example.sumofnums;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView txtop, plus, txt;
private EditText n1,n2;
private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtop = findViewById(R.id.textView3);
        plus = findViewById(R.id.textView);
        n1 = findViewById(R.id.editTextNumber);
        n2 = findViewById(R.id.editTextNumber2);
        txt = findViewById(R.id.textView2);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "`Clicked", Toast.LENGTH_SHORT).show();
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int sum = num1 + num2;
                txt.setText("" + sum);
            }
        });
    }
}