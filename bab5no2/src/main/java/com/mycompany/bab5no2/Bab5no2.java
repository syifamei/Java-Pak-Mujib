/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5no2;
import java.util.Scanner;

/**
 *
 * @author ttete
 */
public class Bab5no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai alas: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;

        // Menampilkan hasil
        System.out.println("Luas Segitiga : " + luas);

        input.close();
    }
}
