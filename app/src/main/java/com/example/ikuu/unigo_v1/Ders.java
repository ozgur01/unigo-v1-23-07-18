package com.example.ikuu.unigo_v1;

public class Ders {

    private String ders_adi;

    public Ders(String ders_adi)
    {
        this.ders_adi = ders_adi;
    }

    public String getDers_adi() {
        return ders_adi;
    }

    public void setDers_adi(String ders_adi){
        this.ders_adi = ders_adi;
    }

    @Override
    public String toString() {
        return this.ders_adi;
    }
}
