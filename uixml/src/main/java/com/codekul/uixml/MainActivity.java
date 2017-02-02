package com.codekul.uixml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOkay = (Button) findViewById(R.id.btnOkay);
        //btnOkay.setOnClickListener(new Click()/*Object of that class which is implementing View.OnClickListener */);

        /*btnOkay.setOnClickListener(*//*anonymous inner class*//*new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doUpperCase();
            }
        });*/

//        btnOkay.setOnClickListener((View v) -> { }); lambda
        //btnOkay.setOnClickListener(v -> doUpperCase()); // lambda
//        btnOkay.setOnClickListener(MainActivity::xyzStatic);
        btnOkay.setOnClickListener(this::xyz); // method reference
    }

    // Inner class
    private class Click implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            doUpperCase();
        }
    }

    private void doUpperCase() {
        EditText edtUserName = (EditText) findViewById(R.id.edtUserName);

        String typedText = edtUserName.getText().toString();
        edtUserName.setText(typedText.toUpperCase());
    }

    public void xyz(View vtx) {
        doUpperCase();
    }

    public static void xyzStatic(View vtx) {

    }
}
