/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan.pert6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class percabangan_if_else {

    public static void main(String[] args) {
        
        int tahun;
        String nama;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("tahun: ");
        tahun = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if( tahun >= 70 ) {
            System.out.println("Selamat " + nama + ", anda tua!");
        } else {
            System.out.println("Maaf " + nama + ", anda muda");

                }
    }
       }

           
    
        