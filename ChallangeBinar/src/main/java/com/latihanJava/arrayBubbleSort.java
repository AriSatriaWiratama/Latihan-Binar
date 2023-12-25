package com.latihanJava;

import java.util.Arrays;

public class arrayBubbleSort {
    public static void main(String[] args) {
        int[] arrayPembangunan = {54, 64, 23, 12, 67, 23, 97, 23, 12, 74};

        buubleSort(arrayPembangunan);

        System.out.println("setelah diurutkan akan menjadi =" + Arrays.toString(arrayPembangunan));

        reverseBubbleSort(arrayPembangunan);

        System.out.println("diurutkan dari yang terbesar hingga terkecil =" + Arrays.toString(arrayPembangunan));
    }

    //teknik ini menggunakan teknik bubbleSort
    private static void buubleSort(int[] arrayMany) {
        int arrayPanjang = arrayMany.length;
        for (int i = 0; i < arrayPanjang - 1; i++) {
            for (int a = 0; a < arrayPanjang - i - 1; a++) {
                if (arrayMany[a] > arrayMany[a + 1]) {
                    int temp = arrayMany[a];
                    arrayMany[a] = arrayMany[a + 1];
                    arrayMany[a + 1] = temp;
                }
            }
        }
    }

    private static void reverseBubbleSort(int[] arrayLength) {
        int n = arrayLength.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Jika elemen saat ini lebih kecil dari elemen berikutnya, tukar
                if (arrayLength[j] < arrayLength[j + 1]) {
                    int temp = arrayLength[j];
                    arrayLength[j] = arrayLength[j + 1];
                    arrayLength[j + 1] = temp;
                }
            }
        }
    }
}
