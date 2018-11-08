package com.example.antoinerousselot.cours1java;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.antoinerousselot.cours1java.Service.BoundActivity;
import com.example.antoinerousselot.cours1java.Service.ServiceActivity;
import com.example.antoinerousselot.cours1java.receiver.BroadcastActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int requestCode = 1;
    private Button monBouton = null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monBouton = (Button)findViewById(R.id.button1);
        monBouton.setOnClickListener(this);
    }
    static final String Tag="Centrale";

    public void onClick(View arg0){
        if (arg0==monBouton){
            //launch subactivity
            Intent i = new Intent(this,TestActivityIntent.class);
            i.putExtra("Value1","This value one for ActivityTwo");
            i.putExtra("Value2","This value one ActivityTwo");
            //Set the request code to any cde you like, you can identify the callback via this code
            startActivityForResult(i,requestCode);
        }
    }

    protected void onActivityResult(int reqCode,int resultCode,Intent data){
        if (resultCode==RESULT_OK && reqCode==requestCode){
            if (data.hasExtra("returnKey1")){
                //Traitement
                Toast.makeText(this,data.getExtras().getString("returnKey1"),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    protected void onStart(){
        Log.d(Tag,"onStart");
        super.onStart();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag,"onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"onStop");
    }
}
