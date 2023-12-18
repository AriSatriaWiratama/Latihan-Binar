package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        boolean menu = true;
        while (menu) {
            clearScreen();// bisa digunakan kalau aplikasi ini sudah jar
            System.out.println("---------------------------------------");
            System.out.println("Kalkulator Penghitung Luas dan Volume");
            System.out.println("---------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Hitung Luas Bidang");
            System.out.println("2. Hitung Volume");
            System.out.println("3. Tutup Aplikasi");
            System.out.println("---------------------------------------");
            System.out.printf("masukan pilihan = ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                getLuas();
            } else if (pilihan == 2) {
                getVolume();
            } else if (pilihan == 3) {
                System.out.println("aplikasi tertutup");
                break;
            } else {
                System.out.println("pilihan tidak ada");
            }
            menu = Desision("apakah anda ingin melanjutkan atau tidak? y/n");
        }
    }

    public static Boolean Desision(String pesan) {
        Scanner input = new Scanner(System.in);
        String masukanDesision;
        System.out.println(pesan);
        System.out.println("masukan pesan anda :");
        masukanDesision = input.next();
        while (!masukanDesision.equalsIgnoreCase("y") && !masukanDesision.equalsIgnoreCase("n")){
            System.out.println("silakan check pesan anda kembali!");
            System.out.println(pesan);
            masukanDesision = input.next();
        }
        return masukanDesision.equalsIgnoreCase("y");
    }

    public static void getLuas() {
        Scanner input = new Scanner(System.in);
        int pilihanCase1;
        float hasil, var1, var2;
        double phi = 3.14, hasilLingkaran;
        System.out.println("--------------------------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("--------------------------------");
        System.out.println("1.Persegi");
        System.out.println("2.Lingkaran");
        System.out.println("3.Segitiga");
        System.out.println("4.Persegi Panjang");
        System.out.println("0.Kembali ke menu sebelumnya");
        System.out.printf("Masukan Pilihan = ");
        pilihanCase1 = input.nextInt();
        switch (pilihanCase1) {
            case 1:
                System.out.println("--------------------------------");
                System.out.println("Anda memilih Persegi");
                System.out.println("--------------------------------");
                System.out.printf("masukan sisi :");
                var1 = input.nextInt();
                System.out.println();
                System.out.println("processing...");
                System.out.println();
                hasil = var1 * var1;
                System.out.println("--------------------------------");
                System.out.println("Luas dari persegi panjang adalah " + hasil);
                System.out.println("--------------------------------");
                break;
            case 2:
                System.out.println("--------------------------------");
                System.out.println("Anda memilih Lingkaran");
                System.out.println("--------------------------------");
                System.out.printf("masukan jari2:");
                var1 = input.nextInt();
                System.out.println();
                System.out.println("processing...");
                System.out.println();
                hasilLingkaran = var1 * var1 * phi;
                System.out.println("--------------------------------");
                System.out.println("Luas dari lingkaran adalah " + hasilLingkaran);
                System.out.println("--------------------------------");
                break;
            case 3:
                System.out.println("--------------------------------");
                System.out.println("Anda memilih segitiga");
                System.out.println("--------------------------------");
                System.out.printf("masukan alas :");
                var1 = input.nextInt();
                System.out.println("masukan tinggi");
                var2 = input.nextInt();
                System.out.println();
                System.out.println("processing...");
                System.out.println();
                hasil = (var1 * var2) / 2;
                System.out.println("--------------------------------");
                System.out.println("Luas dari persegi panjang adalah " + hasil);
                System.out.println("--------------------------------");
                break;
            case 4:
                System.out.println("--------------------------------");
                System.out.println("Anda memilih Persegi panjang");
                System.out.println("--------------------------------");
                System.out.printf("masukan panjang :");
                var1 = input.nextInt();
                System.out.println("masukan lebar");
                var2 = input.nextInt();
                System.out.println();
                System.out.println("processing...");
                System.out.println();
                hasil = var1 * var2;
                System.out.println("--------------------------------");
                System.out.println("Luas dari persegi panjang adalah " + hasil);
                System.out.println("--------------------------------");
                break;
            case 0:
                System.out.println("--------------------------------");
                System.out.println("kembali kemenu awal");
                System.out.println("--------------------------------");
                break;
            default:
                System.out.println("--------------------------------");
                System.out.println("tidak ada pilihan");
                System.out.println("--------------------------------");
                break;
        }
    }

    public static void getVolume() {
        Scanner input = new Scanner(System.in);
        int pilihanCase2;
        float var1, var2, var3, hasil;
        double phi = 3.14, hasilTabung;
        System.out.println("--------------------------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("--------------------------------");
        System.out.println("1.kubus");
        System.out.println("2.balok");
        System.out.println("3.tabung");
        System.out.println("0.Kembali ke menu sebelumnya");
        System.out.printf("Masukan Pilihan = ");
        pilihanCase2 = input.nextInt();
        switch (pilihanCase2) {
            case 1:
                System.out.println("--------------------------------");
                System.out.println("Anda memilih kubus");
                System.out.println("--------------------------------");
                System.out.printf("masukan sisi :");
                var1 = input.nextInt();
                System.out.println();
                System.out.println("processing...");
                System.out.println();
                hasil = var1 * var1 * var1;
                System.out.println("--------------------------------");
                System.out.println("Volume dari Kubus adalah " + hasil);
                System.out.println("--------------------------------");
                break;
            case 2:
                System.out.println("--------------------------------");
                System.out.println("Anda memilih Balok");
                System.out.println("--------------------------------");
                System.out.printf("masukan panjang :");
                var1 = input.nextInt();
                System.out.println("masukan lebar");
                var2 = input.nextInt();
                System.out.println("masukan tinggi");
                var3 = input.nextInt();
                System.out.println();
                System.out.println("processing...");
                System.out.println();
                hasil = var1 * var2 * var3;
                System.out.println("--------------------------------");
                System.out.println("Volume dari Balok adalah " + hasil);
                System.out.println("--------------------------------");
                break;
            case 3:
                System.out.println("--------------------------------");
                System.out.println("Anda memilih Tabung");
                System.out.println("--------------------------------");
                System.out.printf("masukan tinggi :");
                var1 = input.nextInt();
                System.out.println("masukan jari2");
                var2 = input.nextInt();
                System.out.println();
                System.out.println("processing...");
                System.out.println();
                hasilTabung = var1 * var1 * var2 * phi;
                System.out.println("--------------------------------");
                System.out.println("Volume dari tabung adalah " + hasilTabung);
                System.out.println("--------------------------------");
                break;
        }
    }
    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }


}






