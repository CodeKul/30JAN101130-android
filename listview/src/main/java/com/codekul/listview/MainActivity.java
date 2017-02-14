package com.codekul.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> dataSet = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataSet.add("India");
        dataSet.add("Chiana");
        dataSet.add("Japan");
        dataSet.add("Sri Lanka");
        dataSet.add("America");
        dataSet.add("Thialand");

         adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataSet);

        ((ListView)findViewById(R.id.listView)).setAdapter(adapter);
        ((ListView)findViewById(R.id.listView)).setOnItemClickListener(this::onListItemClicked);

        findViewById(R.id.btnAdd).setOnClickListener(this::addCountry);
    }

    private void onListItemClicked(AdapterView<?> adapterView, View view, int pos, long id) {
        if(adapterView instanceof  ListView) {
            ((EditText) findViewById(R.id.edtCntry)).setText(adapter.getItem(pos));
        }
    }

    private void addCountry(View view) {
        dataSet.add(((EditText)findViewById(R.id.edtCntry)).getText().toString());
        adapter.notifyDataSetChanged();
    }
}
