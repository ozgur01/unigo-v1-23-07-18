package com.example.ikuu.unigo_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DersActivity extends AppCompatActivity {

    final List<Ders> dersler = new ArrayList<Ders>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_list_layout);

        dersler.add(new Ders("ders1"));
        dersler.add(new Ders("ders2"));
        dersler.add(new Ders("ders3"));
        dersler.add(new Ders("ders4"));
        dersler.add(new Ders("ders5"));

        final ListView list_item = (ListView) findViewById(R.id.button_list);
        DersListAdapter adapter = new DersListAdapter(this, dersler);
        list_item.setAdapter(adapter);

    }
}
