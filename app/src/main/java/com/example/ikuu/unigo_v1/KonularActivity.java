package com.example.ikuu.unigo_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class KonularActivity extends AppCompatActivity {

    final List<Konu> konular = new ArrayList<Konu>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standart_list_layout);

        konular.add(new Konu("konu1", false));
        konular.add(new Konu("konu2", true));
        konular.add(new Konu("konu3", false));
        konular.add(new Konu("konu4",false));
        konular.add(new Konu("konu5", false));

        final ListView list_item = (ListView) findViewById(R.id.standart_list);
        KonuListAdapter adapter = new KonuListAdapter(this, konular);
        list_item.setAdapter(adapter);

    }
}
