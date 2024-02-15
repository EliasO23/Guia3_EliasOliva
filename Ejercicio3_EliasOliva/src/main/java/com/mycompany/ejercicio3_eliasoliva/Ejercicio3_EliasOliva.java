/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_eliasoliva;
import java.util.Scanner;

/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio3_EliasOliva {

    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);
        double num1, num2, resultado;
        
        System.out.println("Bienvenido a la Calculadora CASIO\n");
        
        System.out.println("\nMenu\n  1- Sumar\n  2- Restar\n  3- Multiplicar\n  4- Dividir");
        System.out.println("¿Que desea hacer?");
        int option = Imput.nextInt();
        
        System.out.println("\nIngrese el primer numero:");
        num1 = Imput.nextDouble();
        
        System.out.println("\nIngrese el segundo numero:");
        num2 = Imput.nextDouble();
        
        switch (option){
            case 1:
                resultado = num1 + num2;
                System.out.println("\n " + num1 + " + " + num2 + "\n  - La suma es: " + resultado);
                break;
                
            case 2:
                resultado = num1 - num2;
                System.out.println("\n " + num1 + " - " + num2 + "\n  - La resta es: " + resultado);
                break;
                
            case 3:
                resultado = num1 * num2;
                System.out.println("\n " + num1 + " * " + num2 + "\n  - La multiplicacion es: " + resultado);
                break;
                
            case 4:
                if (num2 != 0){
                    resultado = num1 / num2;
                    System.out.println("\n " + num1 + " / " + num2 + "\n  - La division es: " + resultado);
                }
                else{
                    System.out.println("\n La division no se puede realizar, a ingresado un 0 como divisor");
                }
                break;
                
            default:
                System.out.println("\n Opcion Invalida");
               
        }
    }
}
