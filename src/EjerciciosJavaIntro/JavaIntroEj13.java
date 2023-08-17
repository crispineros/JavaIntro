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
public class JavaIntroEj13 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Digite un numero:");
        num=leer.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=0;i<num-2;i++){
            System.out.print("*");
            for(int j=0;j<num-2;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for(int i=0;i<num;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
