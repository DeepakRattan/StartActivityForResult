package com.example.deepakrattan.startactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by deepak.rattan on 12/27/2016.
 */

public class ActivityTwo extends AppCompatActivity {
    private EditText editText;
    private Button btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        editText = (EditText) findViewById(R.id.edt);
        btn = (Button) findViewById(R.id.btnSubmitMessage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("message", message);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
