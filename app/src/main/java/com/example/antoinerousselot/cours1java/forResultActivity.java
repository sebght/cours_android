package com.example.antoinerousselot.cours1java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class forResultActivity extends AppCompatActivity {
    EditText tf =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result);

        Button button1 = (Button) findViewById(R.id.button1);
        tf=(EditText) findViewById(R.id.editText1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                data.putExtra("returnKey1",tf.getText().toString());
                setResult(RESULT_OK, data);
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //Get data via the key
            String value1 = extras.getString("Value1");
            if (value1 != null) {
                //Do something with the data
                tf.setText(value1);
            }
        }
    }
}
