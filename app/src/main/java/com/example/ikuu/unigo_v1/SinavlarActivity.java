package com.example.ikuu.unigo_v1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SinavlarActivity extends AppCompatActivity {

    final List<Sinav> sinavlar = new ArrayList<Sinav>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.button_list_layout);

        sinavlar.add(new Sinav("sinav1"));
        sinavlar.add(new Sinav("sinav2"));
        sinavlar.add(new Sinav("sinav3"));
        sinavlar.add(new Sinav("sinav4"));
        sinavlar.add(new Sinav("sinav5"));

        final ListView list_item = (ListView) findViewById(R.id.button_list);
        SinavListAdapter adapter = new SinavListAdapter(this, sinavlar);
        list_item.setAdapter(adapter);

    }
}
