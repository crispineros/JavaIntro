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
public class JavaIntroEj04 {

    public static void centigradosAFarenheit(float centrigrados){
        float farenheit;
        farenheit=32+(9*centrigrados/5);
        System.out.println("grados en farenheit: "+farenheit);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float centigrados;
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba los grados en centigrados:");
        centigrados=leer.nextFloat();
        centigradosAFarenheit(centigrados);
    }
    
}
