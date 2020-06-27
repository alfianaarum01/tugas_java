/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan.pert5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class perulangan_while2 {
    public static void main(String[] args) {
        //membuat variabel dn scanner
        boolean running = true;
        int counter = 0;
        String jawaban;
        Scanner scan = new Scanner (System.in);
        
        while( running ){
            System.out.println("apakah anda kelas 3?");
            System.out.println("jawab [yes/no]> ");
            
            String jawab = scan.nextLine();
            //cek jawaban,
            if( jawab.equalsIgnoreCase("yes") ){
                running = false;
                
            }
            counter++;
        }
        System.out.println("anda melakukan perulangan sebanyak  3x");
  
    
    }
}
