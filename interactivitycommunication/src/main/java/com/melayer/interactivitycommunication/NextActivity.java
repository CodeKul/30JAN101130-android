package com.melayer.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Objects;

public class NextActivity extends AppCompatActivity {

    public static final String KEY_BACK_DATA ="backData";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent responsibleIntent = getIntent();

        Bundle bundle = responsibleIntent.getExtras();
        if(bundle != null) {
            String email = bundle.getString(MainActivity.KEY_EMAIL);
            ((EditText) findViewById(R.id.edtEmail)).setText(email);
        }

        findViewById(R.id.btnOkay).setOnClickListener(this::goBack);
    }

    private void goBack(View view) {
        Intent intent = new Intent();

        Bundle bundle = new Bundle();
        bundle.putString(KEY_BACK_DATA,((EditText) findViewById(R.id.edtEmail)).getText().toString().toUpperCase());

        intent.putExtras(bundle);

        setResult(RESULT_OK, intent);

        finish();
    }
}
