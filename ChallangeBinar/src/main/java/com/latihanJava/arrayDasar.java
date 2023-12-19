package com.latihanJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayDasar {
    public static void main(String[] args){

        //assigment data
        int [] data = {1,2,3,4};

        //cara assigment data
        data[1]=5;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);


        System.out.println("Deklarasi array");
        //cara mendeklarasi array
        // tipedata [] nama = new int[jumlah array]
        float [] arrayData = new float [5];

        arrayData[3]=5;

        System.out.println(arrayData[0]);
        System.out.println(arrayData[1]);
        System.out.println(arrayData[2]);
        System.out.println(arrayData[3]);

        System.out.println(Arrays.toString(arrayData));
    }
}
