/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_pert9;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Array_satuDimensi_lagi {
    public static void main(String[] args) {
        
        String[] namaWarga = new String[3];
        for(int i=0; i<namaWarga.length;i++){
            namaWarga[i] = JOptionPane.showInputDialog(null, "masukkan data nama warga ke-"+i);
            System.out.println(namaWarga[i]);
        }
        
       String cariData = JOptionPane.showInputDialog(null, "cari nama warga");
       
       for(int i=0; i<namaWarga.length; i++){
           if(namaWarga[i].equals(cariData)){
               JOptionPane.showMessageDialog(null, "Nama warga yang dicari"+ cariData +"terdeteksi pada indeks ke-" +i);
           }
         }
    }
}