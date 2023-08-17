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
public class JavaIntroEj11 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,op;
        String op2;
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un numero:");
        num1=leer.nextInt();
        System.out.println("Escriba otro numero:");
        num2=leer.nextInt();
        
        do{
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion");
            op=leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("Suma: "+num1+" + "+num2+" = "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Suma: "+num1+" - "+num2+" = "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Suma: "+num1+" * "+num2+" = "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Suma: "+num1+" / "+num2+" = "+((float)num1/(float)num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa(S/N)?");
                    leer.nextLine();
                    op2=leer.nextLine();
                    if (op2.equals("S")){
                        break;
                    }
                    else{
                        op=0;
                    }
                    break;
            }
            
        }while(op!=5);
       
        
    }
    
}
