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
public class JavaIntroEj10 {
    
    public static void superaLimite(int limite){
        int acum=0;
        int num;
        while(limite>=acum){
            Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un numero:");
        num=leer.nextInt();
        acum=acum+num;
        }
        System.out.println("limite superado!");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite;
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un numero:");
        limite=leer.nextInt();
        superaLimite(limite);
        
    }
    
}
