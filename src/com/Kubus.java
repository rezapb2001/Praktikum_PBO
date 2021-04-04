package com;

public class Kubus extends Persegi {

    private String namaKubus;

    public Kubus(int sisi, String warna) {
        super(sisi, warna);
    }

    public Kubus(float sisi) {
        super(sisi);
    }

    public void setNamakubus(String namaKubus) {
        this.namaKubus = namaKubus;
    }

    public String getNamakubus() {
        return namaKubus;
    }

    @Override
    void berwarna() {
        System.out.println("Berwarna : " + warna);
    }

    double luas(int sisi) {
        return sisi * sisi;
    }

    double luas() {
        System.out.println("Luas Sisi Kubus tanpa parameter");
        return sisi * sisi;
    }
}
