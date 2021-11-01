package com.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in);

        int panjang;

        System.out.print("Input panjang array : ");
        panjang = baca.nextInt();

        int[] data = new int[panjang];

        for (int i = 0; i < panjang; i++) {
            System.out.print("Masukkan index ke " + i + " : ");
            data[i] = baca.nextInt();
        }

        System.out.println("Hasil =================");
        for (int a = 0; a < data.length; a++) {
            System.out.println(data[a] + " ");
        }

    }
}
