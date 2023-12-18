package com.latihanJava;

import java.util.Scanner;

public class loopingFibonanci {
    public static void main(String[] args){
        int f_n,f_n1,f_n2, nilai, i;

        Scanner inputUser = new Scanner(System.in);
        System.out.printf("masukan nilai fibonanci ke - ");
        nilai= inputUser.nextInt();

        f_n2=0;
        f_n1=1;
        f_n=1;
        i = 1;

        while(i <= nilai){
            System.out.println("nilai ke -"+i+" adalah "+ f_n);
            f_n= f_n1+f_n2;
            f_n2=f_n1;
            f_n1=f_n;
            i++;
        }

    }

}
