package com.example.antoinerousselot.cours1java.receiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.antoinerousselot.cours1java.R;

import static com.example.antoinerousselot.cours1java.R.id.button1;

public class BroadcastActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
        Button btn = (Button) findViewById(button1);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1){
            Intent i = new Intent("eu.corellis.action.NEW_EVENT");
            i.putExtra("Value1","This value one for Broadcast");
            sendBroadcast(i);
        }
    }
}
