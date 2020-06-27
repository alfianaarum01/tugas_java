/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output.pert4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class contohScanner {
    public static void main(String[] args){
        double beratbadan;
        int tinggibadan = 0;
        int nilaiUTS = 0;
        int usia = 0;
        int jarak = 0 ; 
        //membuat scanner
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("berapa beratbadan anda?");
        beratbadan = inputUser.nextDouble();
        
        System.out.println("berapa tinggibadan anda?");
        tinggibadan = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa nilai UTSmu kemaren?");
        nilaiUTS = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa usiamu saat ini?");
        usia = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa jarak rumahmu dengan kampus?");
        jarak = Integer.parseInt(inputUser.nextLine());
        
        //output
        System.out.println("berat badan saya adalah" + beratbadan);
        System.out.println("tinggi badan saya adalah" + tinggibadan);
        System.out.println("saya berusia" + usia);
        System.out.println("nilai uts saya " + nilaiUTS);
        System.out.println("jaraknya" + jarak);
    }
    
}
