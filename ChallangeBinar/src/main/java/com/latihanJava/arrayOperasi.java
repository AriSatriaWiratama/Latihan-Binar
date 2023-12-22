package com.latihanJava;

import java.util.Arrays;
import java.util.Scanner;

public class arrayOperasi {
    public static void main(String[] args) {
        int[] arrayMahasiswa = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Merubah array menjadi string ");
        System.out.println("==============================");
        System.out.println(Arrays.toString(arrayMahasiswa));

        System.out.println("==============================");
        System.out.println("Mengkopi Alamat array");
        System.out.println("==============================");
        int[] arrayMahasiswa1 = new int[7];
        printArrayString("Mahasiswa ->", arrayMahasiswa);
        alamatArray(arrayMahasiswa);
        printArrayString("Mahasiswa 1 ->", arrayMahasiswa1);
        alamatArray(arrayMahasiswa1);
        arrayMahasiswa1 = arrayMahasiswa;
        printArrayString("Mahasiswa ->", arrayMahasiswa);
        alamatArray(arrayMahasiswa);
        printArrayString("Mahasiswa 1 ->", arrayMahasiswa1);
        alamatArray(arrayMahasiswa1);

        System.out.println("==============================");
        System.out.println("Mengkopi Array dengan for");
        System.out.println("==============================");
        int[] arrayDosen = new int[6];
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            arrayDosen[i] = arrayMahasiswa[i];
        }
        printArrayString("Mahasiswa ->", arrayMahasiswa);
        alamatArray(arrayMahasiswa);
        printArrayString("Dosen ->", arrayDosen);
        alamatArray(arrayDosen);

        System.out.println("==============================");
        System.out.println("Mengkopi array dengan copyOf");
        System.out.println("==============================");
        int[] arrayPegawai = Arrays.copyOf(arrayMahasiswa, 7);
        printArrayString("Mahasiswa ->", arrayMahasiswa);
        alamatArray(arrayMahasiswa);
        printArrayString("Pegawai", arrayPegawai);
        alamatArray(arrayPegawai);

        System.out.println("==============================");
        System.out.println("Mengkopi Array dengan copyOfRange");
        System.out.println("==============================");
        int[] arrayRektor = Arrays.copyOfRange(arrayPegawai, 2, 7);
        printArrayString("Pegawai", arrayRektor);
        alamatArray(arrayRektor);

        System.out.println("==============================");
        System.out.println("Mengisi Array dengan fill");
        System.out.println("==============================");
        int[] arrayKampus = new int[10];
        Arrays.fill(arrayKampus, 5);
        printArrayString("Kampus", arrayKampus);
        alamatArray(arrayKampus);

        System.out.println("==============================");
        System.out.println("Melakukan Komparasi Array dengan if/esle");
        System.out.println("==============================");
        int[] arrayKota = {1, 2, 3, 4, 5};
        int[] arrayKecamatan = {1, 2, 3, 4, 5};
        if (Arrays.equals(arrayKota, arrayKecamatan))//arrayKota == arrayKecamatan tidak bisa memakai ini
        {
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini tidak sama");
        }

        System.out.println("==============================");
        System.out.println("Membandingkan array mana yang lebih besar");
        System.out.println("==============================");
        System.out.println(Arrays.compare(arrayKota, arrayKecamatan));

        System.out.println("==============================");
        System.out.println("Mengecheck index array yang berbeda");
        System.out.println("==============================");
        int miss = Arrays.mismatch(arrayKota,arrayKecamatan);//harus diinisialisasi
                if (miss == -1){
                    System.out.println("array ini tidak ada yg berbeda");
                }
                else {
                    System.out.println("array ini salah dibagian ->"+ miss);
                }

        System.out.println("==============================");
        System.out.println("Cara Shorting Array");
        System.out.println("==============================");
        int[] arrayNegara = {5,2,6,8,4,5,2,5,1,2,7,5,7,4,7,9,3,4,2,9,10,5,7,4};
        printArrayString("Negara", arrayNegara);
        Arrays.sort(arrayNegara);
        printArrayString("Negara",arrayNegara);

        System.out.println("==============================");
        System.out.println("Cara Search Index Array");
        System.out.println("==============================");
        printArrayString("Negara",arrayNegara);
        int searching = 10;
        int posisi = Arrays.binarySearch(arrayNegara,searching);
        System.out.println("Angka ->"+searching+" di index ke ->"+posisi);

        Arrays.sort(arrayNegara);
        for (int i=0;i< 1;i++){
            System.out.print("Data Array = [");
            for (int j= arrayNegara.length-1; j>= 0;j--){
                if ( j >= 1){
                    System.out.print(arrayNegara[j]+", ");
                }
                else{
                    System.out.print(arrayNegara[j]+"]");
                }
            }
            System.out.println();
        }

        int[] arrayIbuKota ={1,2,5,8,4,8,4,6,9,4,6,3,2};
        Arrays.sort(arrayIbuKota);
        for(int angka1=0;angka1<1;angka1++){
            System.out.print("Array Ibu Kota = [");
            for(int angka2 = arrayIbuKota.length-1; angka2>=0;angka2--){
                if (angka2 >=1){
                    System.out.print(arrayIbuKota[angka2]+", ");
                }
                else {
                    System.out.print(arrayIbuKota[angka2]+"]");
                }
            }
        }
        System.out.println();
    }


    public static void printArrayString(String namaArray, int[] printArray) {
        System.out.println("Array "+namaArray + Arrays.toString(printArray));
    }

    public static void alamatArray(int[] alamat) {
        System.out.println("Alamat array ->" + alamat);
    }
}
