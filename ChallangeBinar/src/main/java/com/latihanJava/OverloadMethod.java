package com.latihanJava;

public class OverloadMethod {
    public static void main(String[] args) {

        printAngka(10);
        printAngka(10.5f);
        printAngka(10.5d);
        printAngka("GG GAMING");
    }
    public static void printAngka(int angka) {
        System.out.println("angkanya adalah " + angka);
    }

    public static void printAngka(String angka){
        System.out.println("angkanyya adalah " + angka);
    }

    public static void printAngka(double angka) {
        System.out.println("angkanya adalah " + angka);
    }

    public static void printAngka(float angka) {
        System.out.println("angkanya adalah " + angka);
    }
}

