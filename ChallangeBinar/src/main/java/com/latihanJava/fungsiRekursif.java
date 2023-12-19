package com.latihanJava;

import java.util.Scanner;

public class fungsiRekursif {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("anda memasukan nilai = ");
        int masukan = input.nextInt();
        System.out.println("nilai yang anda masukan = " +masukan);

        rekursif(masukan);
        System.out.println();
        int hasilRekursifPemj = rekursifPenjumlahan(masukan);
        System.out.println();
        int hasilRekursifKali = rekursifPerkalian(masukan);
        System.out.println("hasil fungsi rekursif = tidak ada karena void");
        System.out.println("hasil fungsi rekursif penjumlah =" + hasilRekursifPemj);
        System.out.println("hasil fungsi rekursif perkalian =" + hasilRekursifKali);
    }

    private static int rekursifPerkalian(int parameter){
        System.out.println("nilai anda adalah "+ parameter);
        if (parameter == 1){
            return parameter;
        }
        return parameter * rekursifPenjumlahan(parameter - 1);
    }

    private static int rekursifPenjumlahan (int parameter){
        System.out.println("nilai anda adalah "+ parameter);
        if (parameter == 0){
            return parameter;
        }
        return parameter + rekursifPenjumlahan(parameter - 1);
    }

    private static void rekursif (int parameter){
        System.out.println("nilai anda adalah =" +parameter);
        if (parameter == 0){
            return;
        }
        parameter--;
        rekursif(parameter);
    }
}
