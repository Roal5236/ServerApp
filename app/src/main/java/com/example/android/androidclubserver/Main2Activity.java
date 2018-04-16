package com.example.android.androidclubserver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        doit();

    }


    public void doit(){

        MainActivity m = new MainActivity();

        final ArrayList<Song_Creator> androidFlavors = new ArrayList<Song_Creator>();
        androidFlavors.add(new Song_Creator(m.StoreReg, m.mcaA, m.uniId));

        SongCreatorAdapter flavorAdapter = new SongCreatorAdapter(this, androidFlavors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);

    }

}
