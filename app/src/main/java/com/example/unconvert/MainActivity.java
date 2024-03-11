package com.example.unconvert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private  Button button;
    private TextView textView4;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.button);
        textView4= findViewById(R.id.textView4);
        editText=findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hi Clicke listener workde", Toast.LENGTH_SHORT).show();
                String s=editText.getText().toString();
                int kg= Integer.parseInt(s);
                double pound=2.205 * kg;
                textView4.setText("The corresponding pound is "+pound);
            }
        });
    }}