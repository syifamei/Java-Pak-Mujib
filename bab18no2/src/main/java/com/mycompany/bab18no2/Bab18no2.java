/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18no2;

/**
 *
 * @author ttete
 */
public class Bab18no2 {

    public static void main(String[] args) {
        try {
            // Kode di bawah ini tidak menghasilkan exception
            Float data = 500f / 15;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("blok finally akan selalu di eksekusi");
        }
    }
        }
        


