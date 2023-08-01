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
public class JavaIntroEj01 {

    public static void sumarNumeros (int a,int b) {
        int c=0;
        c=a+b;
        System.out.println("suma de los numeros: "+c);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,b=0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero:");
        a=leer.nextInt();
        System.out.println("Digite otro numero:");
        b=leer.nextInt();
        
        sumarNumeros(a,b);
    }

}
