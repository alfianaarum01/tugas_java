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
public class percabangan_switch_case {
    public static void main(String[] args) {
         String rambulalulintas;
        Scanner scan = new Scanner(System.in);

        System.out.print("warna rambu lalulintas: ");
        rambulalulintas = scan.nextLine();

        switch(rambulalulintas){
            case "merah":
                System.out.println("Lampu merah, silahkan berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, diharapkan hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan maju jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
    }
        
}
        
        
}
