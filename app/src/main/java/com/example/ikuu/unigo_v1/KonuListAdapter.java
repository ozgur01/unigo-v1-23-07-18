package com.example.ikuu.unigo_v1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

public class KonuListAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Konu> mKonuListesi;

    public KonuListAdapter(Activity activity, List<Konu> konular) {
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mKonuListesi = konular;
    }

    @Override
    public int getCount() {
        return mKonuListesi.size();
    }

    @Override
    public Object getItem(int i) {
        return mKonuListesi.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView;

        satirView = mInflater.inflate(R.layout.standart_list_row_layout, null);

        Konu konu = mKonuListesi.get(i);

        final TextView konu_adi = (TextView) satirView.findViewById(R.id.konu_adi);
        final Switch konu_sec = (Switch) satirView.findViewById(R.id.konu_sec);

        konu_adi.setText(konu.getKonu_adi());
        konu_sec.setChecked(konu.is_selected());

        return satirView;
    }
}
