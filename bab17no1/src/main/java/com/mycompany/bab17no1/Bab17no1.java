/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17no1;
import java.util.Scanner;

/**
 *
 * @author ttete
 */
public class Bab17no1 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Kota: ");
        int jumlahKota = input.nextInt();
        input.nextLine();

        String[] kota = new String[jumlahKota];

        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = input.nextLine();
        }

        System.out.println("Kota-kota yang dimasukan:");
        for (String k : kota) {
            System.out.println(k);
        }

        System.out.println("Universitas Pamulang");
        System.out.println("Sistem Informasi");
        System.out.println("Pemrograman Berorientasi Objek (Java 1) 211");
        System.out.println("Sistem Informasi S-1");

        input.close();
    }
}