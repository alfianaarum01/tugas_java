/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_pert9;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Array_satuDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        //membuat array
        String[] bunga = new String[4];
        //scanner
        Scanner scan = new Scanner(System.in);
        //memasukkan data ke array
        for(int a = 0; a<bunga.length; a++){
            System.out.println("bunga ke-" + a +":");
            bunga[a] = scan.nextLine();
           
        }
        System.out.println("...............");
        //menampilkan isi array
        for( String b : bunga){
            System.out.println(b);
        }
    }
    
}
