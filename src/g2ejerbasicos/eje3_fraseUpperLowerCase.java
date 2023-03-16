/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2ejerbasicos;

import java.util.Scanner;

/**
 *
 * @author Leonel
 * 
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 *  y después toda en minúsculas.
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * 
 * 
 */
public class eje3_fraseUpperLowerCase {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese la primer frase en minusculas");
    String frase1 = leer.nextLine();
    System.out.println("ingrese la segunda frase en mayusculas");
    String frase2 = leer.nextLine();

    System.out.println("la frase 1 en mayusculas es: " + frase1.toUpperCase());
    System.out.println("la frase 2 en minusculas es: " + frase2.toLowerCase());
    
    
    
    
        
        
    
   } 
}
