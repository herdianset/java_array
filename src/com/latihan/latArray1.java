package com.latihan;
import java.io.*;

public class latArray1 {
    public static void main(String[] args) throws IOException {
        /*
       int[] data = {1, 2, 3, 4};

       int[] nilai = new int[4];

       nilai[0] = 10;
       nilai[1] = 20;
       nilai[2] = 33;
       nilai[3] = 45;

       System.out.println(nilai[0]);

       for (int a : nilai){
           System.out.println(a);
       } 

       */

       BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

       System.out.print("Masukkan panjang array : ");
       int panjangArray = Integer.parseInt(bfr.readLine());

       int[] data = new int[panjangArray];

       for (int i = 0; i < panjangArray; i++)
       {
           System.out.print("Masukkan index ke " + i + " : ");
           data[i] = Integer.parseInt(bfr.readLine());
       }

       System.out.println("Hasil =================");
       for(int a = 0; a < data.length; a++)
       {
           System.out.println(data[a] + " ");
       }
   }
}
