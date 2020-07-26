/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_pert10;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MultiDimensi_tipeString {
    public static void main(String[] args) {
        //membuat variabel array
     String[][] laptop ={{"toshiba","6.000.000"},{"hp","5.000.000"},{"asus","4.000.000"},{"acer","3.000.000"}};
        
        for(int i=0; i<laptop.length; i++){
    
            System.out.println("merek laptop :" + laptop[i][0]);
            System.out.println("merek laptop :" + laptop[i][1]);
            System.out.println(".............................");
            
        }
            
      String cari = JOptionPane.showInputDialog(null,"cari harga berdasarkan merek laptop");
         for(int i=0; i<laptop.length; i++){
           for (int a=0; a<laptop[0].length; a++){
               if(laptop[i][a].equals(cari)){
                    JOptionPane.showMessageDialog(null,"harga berdasarkan merek " + cari+ " dengan harga Rp."+ laptop[i][a+1]);
                  }
               
      
           }
         }
}
}
        
    



