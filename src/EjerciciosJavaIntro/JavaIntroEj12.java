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
public class JavaIntroEj12 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        Scanner leer= new Scanner(System.in);
        int cadenasValidas=0;
        int cadenasInvalidas=0;
        
        do{
            System.out.println("Digite una cadena (&&&&&) para terminar:");
            cadena=leer.nextLine();
            if (cadena.length()>2 && cadena.length()<=5 && cadena.substring(0, 1).equals("X") && cadena.substring(cadena.length()-1).equals("O")){
                cadenasValidas+=1;
            }
            else{
                cadenasInvalidas+=1;
            }
            
        }while(cadena.equals("&&&&&")!=true);
        
        
        cadenasInvalidas-=1;
        System.out.println("Numero de lecturas correctas: "+cadenasValidas);
        System.out.println("Numero de lecturas incorrectas: "+cadenasInvalidas);
        
    }
    
}
