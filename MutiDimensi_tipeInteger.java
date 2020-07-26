/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_pert10;

/**
 *
 * @author ASUS
 */
public class MutiDimensi_tipeInteger {
    public static void main(String[] args) {
        
        int matrikA[][] = {{7,9,5},
                           {1,5,0},
                           {4,1,2}};
        int matrikB[][] = {{5,7,3},
                           {0,4,6},
                           {3,4,5}};
        System.out.println("matrik A");
        for (int i=0; i<matrikA.length; i++){
            for(int x=0; x<matrikA.length; x++){
                System.out.print(matrikA[i][x] + "  ");
            }
            System.out.println();
    }
        System.out.println("");
        System.out.println("Matrik B");
        for (int c=0; c<matrikB.length; c++){
            for (int d=0; d<matrikB[0].length; d++){
                  System.out.print(matrikB[c][d] +"  ");
        }
             System.out.println();
        }
        int matrikC[][] = new int[matrikA.length][matrikA[0].length];
            System.out.println();
            System.out.println("hasil penjumlahan");
            for (int m=0; m<matrikC.length; m++){
                for(int n=0; n<matrikC[0].length; n++){
                    matrikC[m][n] = matrikA[m][n] + matrikB[m][n];
                    System.out.print(matrikC[m][n] + "\t");    
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("hasil pengurangan");
            for (int m=0; m<matrikC.length; m++){
                for(int n=0; n<matrikC[0].length; n++){
                    matrikC[m][n] = matrikA[m][n] - matrikB[m][n];
                    System.out.print(matrikC[m][n] + "\t");    
                }
                System.out.println();
            }
            
    }
    }

