/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output.pert4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/**
 *
 * @author ASUS
 */
public class ContohBufferedReader {

    public ContohBufferedReader(InputStreamReader r) {    
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
    String nama = "";
    String kabar = "";
    int usia;
    double kecepatan;
    double ipk;
    
    // object inputStream
    InputStreamReader isr = new InputStreamReader(System.in);
    // object BufferedReader
    BufferedReader br = new BufferedReader(isr);
    // mengisi variabel nama dengan bufferedreader
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        
        System.out.println("bagaimana kabar anda?");
        kabar = br.readLine();
        
        System.out.println("usia berapa?");
        usia = Integer.parseInt(br.readLine());
        
        System.out.println("berapa kecepatan laju kendaraan pada jarak 100 m ?");
        kecepatan = Double.parseDouble(br.readLine());
        
        System.out.println("apa cita-citamu dimasa depan?");
        ipk = Double.parseDouble(br.readLine());
     
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("alhamdulillah kabarku" + kabar);
        System.out.println("anda berusia " + usia);
        System.out.println("Kecepatan " + kecepatan);
        System.out.println("ipk anda " + ipk);
        
        
       
   
   }

   

  
    }

   

    

