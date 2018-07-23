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

public class SinavListAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Sinav> mSinavListesi;

    public SinavListAdapter(Activity activity, List<Sinav> sinavlar) {
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mSinavListesi = sinavlar;
    }

    @Override
    public int getCount() {
        return mSinavListesi.size();
    }

    @Override
    public Object getItem(int i) {
        return mSinavListesi.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView;

        satirView = mInflater.inflate(R.layout.button_list_row_layout, null);

        Sinav sinav = mSinavListesi.get(i);

        final Button button = (Button) satirView.findViewById(R.id.sinav_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DersActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        button.setText(sinav.getSinav_adi());

        return satirView;
    }

}
