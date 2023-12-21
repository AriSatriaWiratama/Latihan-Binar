package com.latihanJava;

import java.util.Arrays;

public class arrayOperasi {
    public static void main(String[] args) {
        int[] arrayMahasiswa = {1,2,3,4,5,6};

        System.out.println("==============================");
        System.out.println("Merubah array menjadi string ");
        System.out.println("==============================");
        System.out.println(Arrays.toString(arrayMahasiswa));

        System.out.println("==============================");
        System.out.println("Mengkopi Alamat array");
        System.out.println("==============================");
        int[] arrayMahasiswa1 = new int[7];
        printArrayString("Array Mahasiswa ->",arrayMahasiswa);
        alamatArray(arrayMahasiswa);
        printArrayString("Array Mahasiswa 1 ->",arrayMahasiswa1);
        alamatArray(arrayMahasiswa1);
        arrayMahasiswa1= arrayMahasiswa;
        printArrayString("Array Mahasiswa ->",arrayMahasiswa);
        alamatArray(arrayMahasiswa);
        printArrayString("Array Mahasiswa 1 ->",arrayMahasiswa1);
        alamatArray(arrayMahasiswa1);

        System.out.println("==============================");
        System.out.println("Mengkopi Array dengan for");
        System.out.println("==============================");
        int[] arrayDosen = new int[6];
        for ( int i=0; i < arrayMahasiswa.length; i++){
            arrayDosen[i] = arrayMahasiswa [i];
        }
        printArrayString("Array Mahasiswa ->",arrayMahasiswa);
        alamatArray(arrayMahasiswa);
        printArrayString("Array Dosen ->",arrayDosen);
        alamatArray(arrayDosen);

        System.out.println("==============================");
        System.out.println("Mengkopi array dengan copyOf");
        System.out.println("==============================");
        int [] arrayPegawai = Arrays.copyOf(arrayMahasiswa,7);
        printArrayString("Array Mahasiswa ->",arrayMahasiswa);
        alamatArray(arrayMahasiswa);
        printArrayString("Array Pegawai" , arrayPegawai);
        alamatArray(arrayPegawai);

        System.out.println("==============================");
        System.out.println("Mengkopi Array dengan copyOfRange");
        System.out.println("==============================");
        int [] arrayRektor = Arrays.copyOfRange(arrayPegawai,2,7);
        printArrayString("Array Pegawai" , arrayRektor);
        alamatArray(arrayRektor);

        System.out.println("==============================");
        System.out.println("Mengisi Array dengan fill");
        System.out.println("==============================");
        int [] arrayKampus = new int[10];
        Arrays.fill(arrayKampus,5);
        printArrayString("Array Kampus" , arrayKampus);
        alamatArray(arrayKampus);

        System.out.println("==============================");
        System.out.println("Melakukan Komparasi Array dengan if/esle");
        System.out.println("==============================");
        int [] arrayKota = {1,2,3,4,5};
        int [] arrayKecamatan = {1,2,3,4,5};
        if (Arrays.equals(arrayKota,arrayKecamatan))//arrayKota == arrayKecamatan tidak bisa memakai ini
        {
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini tidak sama");
        }
    }

    public static void printArrayString (String namaArray,int[] printArray){
        System.out.println(namaArray+Arrays.toString(printArray));
    }

    public static void alamatArray (int[] alamat){
        System.out.println("Alamat array ->"+alamat);
    }
}
