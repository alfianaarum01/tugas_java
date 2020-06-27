/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output.pert4;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class contohJoptionPane {
    public static void main(String[] args) {
        
        String tanya = JOptionPane.showInputDialog("dimana anda tinggal?");
        System.out.println("saya tinggal di" + tanya);
        
        String takon = JOptionPane.showInputDialog("anda kuliah dimana?");
        System.out.println("kuliah saya di " + takon);
        
        String tanglet = JOptionPane.showInputDialog("jurusan apa yang kau ambil?");
        System.out.println("saya masuk prodi " + tanglet);
        
        String kepo = JOptionPane.showInputDialog("dimana kamu kerja?");
        System.out.println("kerjanya di " + kepo);
        
        String pitakonan = JOptionPane.showInputDialog("kamu sudah punya pacar?");
        System.out.println(" " + pitakonan);
        
    }
    
}
