package com.example.groupproject1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class cardDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("Id");

        Car car = Car.cars[id];;

        ImageView image = (ImageView)findViewById(R.id.imageId2);
        TextView txtName= (TextView)findViewById(R.id.carName);
        TextView txtColor= (TextView)findViewById(R.id.color);
        TextView txtManufactorer = (TextView)findViewById(R.id.manufactorer);
        TextView txtYear = (TextView)findViewById(R.id.year);

        image.setImageDrawable(ContextCompat.getDrawable(this, car.getImageID()));
        txtName.setText(car.getNameCar());
        txtColor.setText(car.getColor());
        txtManufactorer.setText(car.getManufactorer());
        txtYear.setText(car.getYear());

    }
}
