package com;

public class Main {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(2, "coklat");

        kubus.berwarna();
        kubus.setNamakubus("Bagus");
        System.out.println("Nama Kubus : " + kubus.getNamakubus());
        System.out.println("Luas Sisi Kubus : " + kubus.luas(4));
    }
}
