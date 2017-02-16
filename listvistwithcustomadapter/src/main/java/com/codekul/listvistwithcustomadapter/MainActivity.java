package com.codekul.listvistwithcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //((ListView)findViewById(R.id.listSettings)).setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1));

        List<CustomItem> dataSet = new ArrayList<>();
        dataSet.add(new CustomItem(R.drawable.ic_place_black_24dp, "Location", "helps to access location"));
        dataSet.add(new CustomItem(R.drawable.ic_bluetooth_black_24dp,"Bluetooth","helps to access location"));
        dataSet.add(new CustomItem(R.drawable.ic_place_black_24dp,"Sensors","Sensor settings"));
        dataSet.add(new CustomItem(R.drawable.ic_place_black_24dp,"Screen","settings for screen"));
        dataSet.add(new CustomItem(R.drawable.ic_place_black_24dp,"Charging","battery information"));
        dataSet.add(new CustomItem(R.drawable.ic_place_black_24dp,"Sound","sound settings"));

        MyAdapter adapter = new MyAdapter(this, dataSet);
        ((ListView)findViewById(R.id.listSettings)).setAdapter(adapter);
    }
}
