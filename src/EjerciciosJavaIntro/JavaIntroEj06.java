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
public class JavaIntroEj06 {
    
    public static void esPar(int numero){
        if(numero%2==0){
            System.out.println("el numero "+ numero + " es par.");
        }
        else{
            System.out.println("el numero "+ numero + " es impar.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un numero:");
        numero=leer.nextInt();
        esPar(numero);
        
    }
    
}
