/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7no2;
import java.util.Scanner;

/**
 *
 * @author ttete
 */
public class Bab7no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("NIM : ");
        int NIM = input.nextInt();
        input.nextLine();  // Membersihkan buffer

        System.out.print("NAMA : ");
        String Nama = input.nextLine();

        System.out.print("TAHUN : ");
        int Tahun = input.nextInt();
        input.nextLine();  // Membersihkan buffer

        System.out.print("PILIH PEMINATAN (M/T) : ");
        char Peminatan = input.nextLine().charAt(0);
        
        switch (Tahun) {
            case 1:
                System.out.println("Tahun 1: Belum ada peminatan.");
                break;
            case 2:
                System.out.println("Tahun 2: Belum ada peminatan.");
                break;
            case 3:
                System.out.println("Tahun 3:");
                switch (Peminatan) {
                    case 'M':
                        System.out.println("Peminatan: Manajemen");
                        break;
                    case 'T':
                        System.out.println("Peminatan: Teknik");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                        break;
                }
                break;
            case 4:
                System.out.println("Tahun 4:");
                switch (Peminatan) {
                    case 'M':
                        System.out.println("Peminatan: Manajemen");
                        break;
                    case 'T':
                        System.out.println("Peminatan: Teknik");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                        break;
                }
                break;
            default:
                System.out.println("Tahun tidak valid.");
                break;
        }

        // Menampilkan hasil
        System.out.println("\nOutput:");
        System.out.println("NIM : " + NIM);
        System.out.println("NAMA : " + Nama);
        System.out.println("TAHUN : " + Tahun);
        System.out.println("PILIH PEMINATAN : " + Peminatan);

        input.close();
    }
}
