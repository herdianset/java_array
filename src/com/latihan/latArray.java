package com.latihan;

public class latArray {
    public static void main(String[] args) {
        int[] nilai = new int[8];

        nilai[0] = 20;
        nilai[1] = 30;
        nilai[2] = 10;
        nilai[3] = 40;
        nilai[4] = 60;
        nilai[5] = 25;
        nilai[6] = 35;
        nilai[7] = 45;

        System.out.println(nilai[7]);
        System.out.println("Menampilkan dengan perulangan =============");

        for(int i = 0; i < nilai.length; i++){
            System.out.println("Nilai index ke " + i + " - " + nilai[i]);
        }
    }
    
}
