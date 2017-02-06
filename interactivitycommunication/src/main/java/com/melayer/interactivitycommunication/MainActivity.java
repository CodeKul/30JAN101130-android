package com.melayer.interactivitycommunication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_EMAIL = "email";
    private static final int REQ_NEXT = 4569;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnNext).setOnClickListener(this::goNext);
    }

    private void goNext(View view) {
        Intent intent = new Intent(this, NextActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString(KEY_EMAIL, getEmail());

        intent.putExtras(bundle);
        //startActivity(intent);

        startActivityForResult(intent, REQ_NEXT);
    }

    private String getEmail() {
        return ((EditText)findViewById(R.id.edtEmail)).getText().toString();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQ_NEXT ) {
            if(resultCode == RESULT_OK) {

                if(data !=  null) {
                    ((EditText)findViewById(R.id.edtEmail))
                            .setText(data.getExtras().getString(NextActivity.KEY_BACK_DATA));

                }
            }
        }
    }
}
