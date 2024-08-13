/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9no2;
import java.util.Scanner;

/**
 *
 * @author ttete
 */
public class Bab9no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan bilangan awal ?: ");
        int nilaiAwal = input.nextInt();

        System.out.print("masukan bilangan akhir ?: ");
        int nilaiAkhir = input.nextInt();
        
        System.out.println("Hasil deret bilangan ?:");
        for (int i = nilaiAwal; i >= nilaiAkhir; i +=5) {
            
            System.out.print(i);
            if (i + 5 <= nilaiAkhir) {
                System.out.print(", ");
            }
        }

        input.close();
    }
}

