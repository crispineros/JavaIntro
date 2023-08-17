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
public class JavaIntroEj14 {
    
    public static void conversor(float cantidadEuros,String monedaAConvertir){
        if (monedaAConvertir.equals("libras")){
            System.out.println(cantidadEuros+" euros son "+ (cantidadEuros*0.86)+ " libras.");
        }
        else if(monedaAConvertir.equals("dolares")){
            System.out.println(cantidadEuros+" euros son "+ (cantidadEuros*1.28611)+ " dolares.");
        }
        else if(monedaAConvertir.equals("yenes")){
            System.out.println(cantidadEuros+" euros son "+ (cantidadEuros*129.852)+ " yenes.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cantidadEuros;
        String monedaAConvertir;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Digite la cantidad de euros a convertir: ");
        cantidadEuros=leer.nextFloat();
        System.out.println("Digite la moneda a convertir (libras,dolares,yenes): ");
        leer.nextLine();
        monedaAConvertir=leer.nextLine();
        conversor(cantidadEuros, monedaAConvertir);
    }
    
}
