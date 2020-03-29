package com.david.stefan.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button save;
    private Button btn;
    private EditText editText;
    private MySharedPreference mySharedPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        save = findViewById(R.id.save);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.et);
        mySharedPreference = new MySharedPreference(getApplicationContext());

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                mySharedPreference.save(text);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String ca = "fuifilfwerewrrewer";
                intent.putExtra("key1", ca);
                startActivity(intent);
            }
        });


    }
}
