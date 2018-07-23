package com.example.ikuu.unigo_v1;

public class Sinav {

    private String sinav_adi;

    public Sinav(String sinav_adi){
        super();
        this.sinav_adi = sinav_adi;
    }

    public String getSinav_adi() {
        return this.sinav_adi;
    }

    public void setSinav_adi(String sinav_adi){
        this.sinav_adi = sinav_adi;
    }

    @Override
    public String toString() {
        return this.sinav_adi;
    }
}
