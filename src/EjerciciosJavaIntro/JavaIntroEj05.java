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
public class JavaIntroEj05 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un numero:");
        numero=leer.nextInt();
        System.out.println("el doble del numero es: "+ numero*2);
        System.out.println("el triple del numero es: "+ numero*3);
        System.out.println("la raiz cuadrada del numero es: "+ Math.sqrt(numero));
    }
    
}
