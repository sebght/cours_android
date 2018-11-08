package com.example.antoinerousselot.cours1java.Service;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.antoinerousselot.cours1java.R;

public class ServiceActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Button btn1=(Button) findViewById(R.id.button1);
        Button btn2=(Button) findViewById(R.id.button2);

        if (btn1 != null)
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent service= new Intent(ServiceActivity.this, UpdaterService.class);
                    startService(service);
                }
            });
        if (btn2 != null)
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent service= new Intent(ServiceActivity.this, UpdaterService.class);
                    stopService(service);
                }
            });
        }
}


