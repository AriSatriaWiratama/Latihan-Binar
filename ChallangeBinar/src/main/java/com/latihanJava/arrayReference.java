package com.latihanJava;

import java.util.Arrays;

public class arrayReference {
    public static void main (String[] args){
        int [] arrayData1 = {1,2,3,4,5,6,7};
        int [] arrayData2 = new int[5];

        //print alamat array
        System.out.println("alamat array data 1 -> "+ arrayData1);
        //print panjang array
        System.out.println(arrayData1.length);
        //mengecheck semua ini data dalam array
        System.out.println("Isi array -> "+ Arrays.toString(arrayData1));
        //print array pada by nomer
        System.out.println(arrayData1[0]);

        //mengassigment data array
        arrayData2 = arrayData1;
        arrayData2[0] = 100;
        System.out.println("Isi array -> "+ Arrays.toString(arrayData2));
        //isi array pada arrayData1 juga berubah karena alamat pada array2 sama dengan array1
        System.out.println("Isi array -> "+ Arrays.toString(arrayData1));

        //masih terbawa angka array2 karena masih 1 alamat
        arrayAngka(arrayData1);
    }

        public static void arrayAngka(int[] angkaArray){
            angkaArray[5]= 1000;
            for(int arrayAngka1 : angkaArray) {
                System.out.print(arrayAngka1+ " ");
            }
        }
}
