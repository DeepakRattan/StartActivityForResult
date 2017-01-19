package com.example.deepakrattan.startactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    private TextView txt;
    private Button btnGetMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        //findViewByID
        txt = (TextView) findViewById(R.id.txtMessage);
        btnGetMessage = (Button) findViewById(R.id.btnGetMessage);

        btnGetMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);
                startActivityForResult(intent, 2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == 2) && (resultCode == Activity.RESULT_OK)) {
            if (data != null) {
                String message = data.getExtras().getString("message");
                txt.setText(message);
            }
        }
    }
}
