package com.codekul.littlemoreui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnRocket).setOnClickListener(this::showRocket);
        findViewById(R.id.btnBus).setOnClickListener(this::showBus);
    }

    private void showBus(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageBig);
        imageView.setImageResource(R.drawable.ic_buses);
    }


    private void showRocket(View view) {
        ((ImageView) findViewById(R.id.imageBig)).setImageResource(R.drawable.ic_airplane);
    }
}
