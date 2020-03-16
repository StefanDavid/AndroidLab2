package com.example.lab5;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public  class CarAdapter extends BaseAdapter {
    private ArrayList<Car> cars;
    private Activity context;

    public CarAdapter(Activity context) {
        this.context = context;
        cars = new ArrayList<>();

    }

    public void addCar(String name, int image){
        Car car = new Car();
        car.setName(name);
        car.setImg(image);
        cars.add(car);
        this.notifyDataSetChanged();
    }

    public int getCount () {
        return cars.size();

    }
    public Object getItem(int i ){
        return cars.get(i);
    }
    public View getView(int i, View view, ViewGroup viewGroup){
        View element;

        if(view == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            element = layoutInflater.inflate(R.layout.list_item, null);
            TagCar car = new TagCar();
            car.name = element.findViewById(R.id.name);
            car.image = element.findViewById(R.id.image);
            element.setTag(car);
        }else{
            element = view;
        }

        TagCar tag = (TagCar) element.getTag();
        tag.name.setText(cars.get(i).getName());
        tag.image.setImageResource(cars.get(i).getImg());
        return element;
    }

    public long getItemId(int i) {
        return 0;
    }
}