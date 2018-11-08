package com.example.antoinerousselot.cours1java;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestActivityIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intent);
        final Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0==btn1){
                    call(0);
                }
            }
        });
        final Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0==btn2){
                    call(1);
                }
            }
        });
        final Button btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0==btn3){
                    call(2);
                }
            }
        });
        final Button btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0==btn4){
                    call(3);
                }
            }
        });
        final Button btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0==btn5){
                    call(4);
                }
            }
        });
        final Button btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0==btn6){
                    Intent i = new Intent(TestActivityIntent.this,TestActivityArrayAdapterListView.class);
                    startActivity(i);
                }
            }
        });
        final Button btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0==btn7){
                    Intent j = new Intent(TestActivityIntent.this,TextActivitySimpleAdapterListView.class);
                    startActivity(j);
                }
            }
        });
        final Button btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0==btn8){
                    Intent j = new Intent(TestActivityIntent.this,LivreActivity.class);
                    startActivity(j);
                }
            }
        });
    }

    private void call(int position){
        Intent intent=null;
        switch (position){
            case 0:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lequipe.fr"));
                startActivity(intent);
                break;
            case 1:
                //lance un appel
                intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0624948124"));
                startActivity(intent);
                break;
            case 2:
                //préparer l'appel
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0624948124"));
                startActivity(intent);
                break;
            case 3:
                //capture écran
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
                break;
            case 4:
                //affiche la liste des contacts
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(intent);
                break;
        }
    }
}
