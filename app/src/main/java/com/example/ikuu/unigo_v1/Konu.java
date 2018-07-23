package com.example.ikuu.unigo_v1;

public class Konu {

    private boolean is_selected;
    private String konu_adi;

    public Konu(String konu_adi, boolean is_selected) {
        this.konu_adi = konu_adi;
        this.is_selected = is_selected;
    }

    public String getKonu_adi() {
        return konu_adi;
    }

    public boolean is_selected()
    {
        return this.is_selected;
    }

    public void setIs_selected(boolean is_selected)
    {
        this.is_selected = is_selected;
    }

    public void setKonu_adi(String konu_adi, boolean is_selected)
    {
        this.konu_adi = konu_adi;
        this.is_selected = is_selected;
    }

    @Override
    public String toString() {
        return this.konu_adi;
    }
}
