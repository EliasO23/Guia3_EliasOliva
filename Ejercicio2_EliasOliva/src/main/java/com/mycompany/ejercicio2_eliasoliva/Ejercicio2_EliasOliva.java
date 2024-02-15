/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_eliasoliva;
import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio2_EliasOliva {

    public static void main(String[] args) {
        System.out.println("Identifique si un numero es Par o Impar\n");
        int number;
        
        do{
            String num = JOptionPane.showInputDialog("Ingrese un numero: ");
            number = Integer.parseInt(num);
            
            if (number <= 50){
                if (number % 2 == 0){
                    System.out.println(" - El numero " + number + " es Par");
                }
                else{
                    System.out.println(" - El numero " + number + " es Impar");
                }
            }
            else{
                System.out.println("\nIngreso un numero mayor a 50");
            } 
        } 
        while (number <= 50);
    }
}
