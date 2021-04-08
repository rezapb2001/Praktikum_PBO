package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nilai = 0;

        try {
            System.out.println(" Masukan Nilai Untuk Panjang Sisi : ");
            nilai = input.nextInt();

        } catch (InputMismatchException error) {
            System.out.println(" Input Anda Salah  yang anda masukan adalah string masukan intiger atau angka"
                    + error.getMessage());

        } finally {
            Kubus kubus = new Kubus(nilai, "coklat");
            System.out.println(" Panjang sisi kubus : " + nilai);
            kubus.berwarna();
            kubus.setNamakubus("Bagus");
            System.out.println("Nama Kubus : " + kubus.getNamakubus());
            System.out.println("Luas Sisi Kubus : " + kubus.luas());
        }

    }
}
