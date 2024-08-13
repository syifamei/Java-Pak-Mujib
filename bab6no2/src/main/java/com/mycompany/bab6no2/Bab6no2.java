/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6no2;
import java.util.Scanner;

/**
 *
 * @author ttete
 */
public class Bab6no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("NIM ? : ");
        int NIM = input.nextInt();
        input.nextLine();  
        
        System.out.print("NAMA ? : ");
        String Nama = input.nextLine();

        System.out.print("NILAI ? : ");
        int Nilai = input.nextInt();

        char grade;
        String keterangan;
        if (Nilai >= 85) {
            grade = 'A';
            keterangan = "Lulus";
        } else if (Nilai >= 70) {
            grade = 'B';
            keterangan = "Lulus";
        } else if (Nilai >= 55) {
            grade = 'C';
            keterangan = "Lulus";
        } else if (Nilai >= 40) {
            grade = 'D';
            keterangan = "Tidak Lulus";
        } else {
            grade = 'E';
            keterangan = "Tidak Lulus";
        }

        System.out.println("\nOutput:");
        System.out.println("NIM : " + NIM);
        System.out.println("NAMA : " + Nama);
        System.out.println("NILAI : " + Nilai);
        System.out.println("GRADE : " + grade);
        System.out.println("KETERANGAN : " + keterangan);

        input.close();
    }
}
