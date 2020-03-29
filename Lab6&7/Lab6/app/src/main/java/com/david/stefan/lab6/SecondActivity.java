package com.david.stefan.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
   private MySharedPreference mySharedPreference;
   private TextView textView;
    private TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mySharedPreference = new MySharedPreference(getApplicationContext());
        textView = findViewById(R.id.tv);
        textView2 = findViewById(R.id.tv2);

        textView.setText(mySharedPreference.getValue());
        String data = "ceva";
        data = getIntent().getStringExtra("key1");
           textView2.setText(data);




    }
}
