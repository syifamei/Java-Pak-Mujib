/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13no1;

/**
 *
 * @author ttete
 */
public class Bab13no1 {

    public static void main(String[] args) {
       
class Kalkulator {

    // Method untuk pertambahan dua angka
    public int hitung(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan dua angka
    public int hitungPengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian dua angka
    public int hitungPerkalian(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian dua angka
    public int hitungPembagian(int a, int b) {
        return a / b;
    }
}


        
        // Menampilkan informasi universitas dan program studi
        System.out.println("Universitas Pamulang");
        System.out.println("Sistem Informasi");
        System.out.println("Pemrograman Berorientasi Objek (Java 1)");
        System.out.println("Sistem Informasi S-1");

        // Membuat objek Kalkulator
        Kalkulator kalkulator = new Kalkulator();

        // Deklarasi variabel
        int angka1 = 20;
        int angka2 = 10;

        // Melakukan operasi aritmatika
        int hasilPertambahan = kalkulator.hitung(angka1, angka2);
        int hasilPengurangan = kalkulator.hitungPengurangan(angka1, angka2);
        int hasilPerkalian = kalkulator.hitungPerkalian(angka1, angka2);
        int hasilPembagian = kalkulator.hitungPembagian(angka1, angka2);

        // Menampilkan hasil operasi aritmatika
        System.out.println("Hasil Pertambahan : " + hasilPertambahan);
        System.out.println("Hasil Pengurangan : " + hasilPengurangan);
        System.out.println("Hasil Perkalian : " + hasilPerkalian);
        System.out.println("Hasil Pembagian : " + hasilPembagian);
    }
}
