package com.example.vsvll.intentresultactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.Submit);
    }

    public void sendData(View view) {

        Intent i = new Intent();

        String Name = editText.getText().toString();
        i.putExtra("Name",Name);
        setResult(2,i);

        finish();
    }
}
