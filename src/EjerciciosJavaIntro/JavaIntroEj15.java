/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJavaIntro;


import java.util.Scanner;

/**
 *
 * @author ROUGAN
 */
public class JavaIntroEj15 {
    
    private static int[] vector;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vector=new int[100];
        for(int i=0;i<100;i++){
            vector[i]=i+1;
        }
        
        for(int i=0;i<100;i++){
            System.out.print("[ "+vector[i]+" ]");
        }
        System.out.println("");
    }
    
}
