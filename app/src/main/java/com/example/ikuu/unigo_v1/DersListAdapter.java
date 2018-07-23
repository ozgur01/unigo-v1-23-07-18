package com.example.ikuu.unigo_v1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.List;

public class DersListAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Ders> mDersListesi;

    public DersListAdapter(Activity activity, List<Ders> dersler) {
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mDersListesi = dersler;
    }

    @Override
    public int getCount() {
        return mDersListesi.size();
    }

    @Override
    public Object getItem(int i) {
        return mDersListesi.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView;

        satirView = mInflater.inflate(R.layout.button_list_row_layout, null);

        Ders sinav = mDersListesi.get(i);

        Button button = (Button) satirView.findViewById(R.id.sinav_text);

        button.setText(sinav.getDers_adi());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), KonularActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        return satirView;
    }
}
