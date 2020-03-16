package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private EditText et;
    private Button btn;
    private CarAdapter carAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        et = findViewById(R.id.et);
        list = findViewById(R.id.list);

        carAdapter = new CarAdapter(this);
        carAdapter.addCar("car1",R.drawable.lab5_car_icon);
        carAdapter.addCar("car2",R.drawable.lab5_car_icon);
        carAdapter.addCar("car3",R.drawable.lab5_car_icon);
        carAdapter.addCar("car4",R.drawable.lab5_car_icon);

        list.setAdapter(carAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newCar = et.getText().toString();
                carAdapter.addCar(newCar,R.drawable.lab5_car_icon);
                et.setText("");
                carAdapter.notifyDataSetChanged();
            }
        });

    }
}
