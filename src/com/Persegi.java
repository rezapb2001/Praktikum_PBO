package com;

public abstract class Persegi {
    int sisi;
    String warna;

    public Persegi(int sisi, String warna) {
        this.sisi = sisi;
        this.warna = warna;
    }

    public Persegi(float sisi2) {
    }

    abstract void berwarna();

    double luas() {
        System.out.println();
        return 0;
    }
}
