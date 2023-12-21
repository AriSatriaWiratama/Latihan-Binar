package com.latihanJava;

import java.util.ArrayList;
import java.util.List;

public class arrayLooping {
    public static void main(String[] args){
        int[] arrayData = {10,11,12,13,14,15,16,17};
        //list

        System.out.println("panjang data array = "+ arrayData.length);
        System.out.println("Looping dengan properti");
        for (int i= 0; i < arrayData.length; i++){
            System.out.print(arrayData[i]+" ");
        }

        System.out.println();

        System.out.println("Looping data");
        // fitur ini dinamakan For Each (:)
        for (int angka : arrayData){
            System.out.print(angka+" ");
        }
    }
}
