package com.example.groupproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = (RecyclerView) findViewById(R.id.car_recycler);
        String[] captions = new String[Car.cars.length];
        int[] ids = new int[Car.cars.length];

        for(int i=0; i<captions.length; i++){
            captions[i] = Car.cars[i].getNameCar();
            ids[i] = Car.cars[i].getImageID();
//             Car.cars[i].setImageID(i);
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions,ids);
        recycler.setAdapter(adapter);
    }
}