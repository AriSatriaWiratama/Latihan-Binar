package com.latihanJava;

import java.util.Scanner;

public class loopingSederhana {
    public static void main (String[] args){
        Scanner inputUser = new Scanner(System.in);
        int hasilTotal,awalUser,akhirUser;
        System.out.printf("masukan nilai awal = ");
        awalUser = inputUser.nextInt();
        System.out.printf("masukan nilai akhir = ");
        akhirUser = inputUser.nextInt();

        hasilTotal= 0;

//        while (awalUser <= akhirUser){
//            hasilTotal = hasilTotal+awalUser;
//            System.out.printf("bilangan ke =%d hasil totalnya adalah = %d\n",awalUser,hasilTotal);
//            awalUser++;
//        }
        for(; awalUser <= akhirUser;awalUser++){
            hasilTotal = hasilTotal +awalUser;
            System.out.printf("bilangan ke =%d hasil totalnya adalah = %d\n",awalUser,hasilTotal);
        }
    }
}
