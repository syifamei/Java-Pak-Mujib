/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15no1;

/**
 *
 * @author ttete
 */
public class Bab15no1 {

    public static void main(String[] args) {
        class Kalkulator {

     // Method untuk pengurangan
    public int hitungPengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public float hitungPerkalian(float a, float b) {
        return a * b;
    }

    // Method untuk pembagian
    public float hitungPembagian(float a, float b) {
        if (b !=0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0; // Atau bisa lempar exception
        }
    }
        }
    }
}
    
    

