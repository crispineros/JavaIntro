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
public class JavaIntroEj09 {
    
    public static void esEureka(String frase){
        if(frase.substring(0, 1).equalsIgnoreCase("A")){
            System.out.println("la frase es correcta.");
        }
        else{
            System.out.println("frase incorrecta.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba una frase:");
        frase=leer.nextLine();
        esEureka(frase);
        
    }
    
}
