package com.example.antoinerousselot.cours1java;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class TextActivitySimpleAdapterListView extends ListActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Créationdela ArrayList quinouspermettra d'alimenter la listView
        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();
        //On déclarela HashMap quicontiendrales informations pour un item
        HashMap<String, String> map;

        //Création d'une HashMap pour insérerles informations du premier item denotre listView
        map = new HashMap<String, String>();
        map.put("title", "Android");
        map.put("description", "Hello Android");
        map.put("img", String.valueOf(R.drawable.logo_android));
        listItem.add(map);

        //On refait la même chose pour remplir le reste des items de la liste
        map = new HashMap<String, String>();
        map.put("title", "iOS");
        map.put("description", "Hello iOS");
        map.put("img", String.valueOf(R.drawable.logo_apple));
        listItem.add(map);
        map = new HashMap<String, String>();
        map.put("title", "Bada");
        map.put("description", "Hello Bada");
        map.put("img", String.valueOf(R.drawable.logo_samsung));
        listItem.add(map);
        map = new HashMap<String, String>();
        map.put("title", "Windows Phone 7");
        map.put("description", "Hello Windows Phone 7");
        map.put("img", String.valueOf(R.drawable.logo_windows));
        listItem.add(map);

        //Création d'un SimpleAdapter qui se chargera de mettre les items présents dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.layoutitem,new String[] {"img", "title", "description"}, new int[] {R.id.img, R.id.title, R.id.description});
        //On attribue à notre listActivity l'adapter que l'on vientdecréer
        setListAdapter(mSchedule);
        Log.i(TAG,"Lancement activity");
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //Récupèrer la Map qui contient les informations de l'item (titre, decription et image)
        HashMap<String, String> map = (HashMap<String, String>) getListAdapter().getItem(position);
        Toast.makeText(this, map.get("title")+ " selected", Toast.LENGTH_LONG).show();
    }
}
