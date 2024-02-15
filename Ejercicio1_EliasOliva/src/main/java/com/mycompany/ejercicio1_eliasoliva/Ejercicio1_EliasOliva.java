/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_eliasoliva;
import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio1_EliasOliva {

    public static void main(String[] args) {
        System.out.println("Identifique un año Bisisesto o Comun\n");
        
        String num;
        
        num = JOptionPane.showInputDialog("Ingrese un año: ");
        
       int year = Integer.parseInt(num);
       
       if (year % 4 == 0 && year % 100 != 0 ){
           System.out.println(" - El año " + year + " es un año Bisiesto\n");
       }
       
       else if (year % 400 == 0){
           System.out.println(" - El año " + year + " es un año Bisiesto\n");
       }
       
       else{
           System.out.println(" - El año " + year + " es un año Comun\n");
       }
       
    }
}
