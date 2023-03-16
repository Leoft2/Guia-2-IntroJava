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
 */

/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/
public class Eje1_sumaNum {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
   
       System.out.println("Ingrese el primer numero");
       int n1 = leer.nextInt();
       System.out.println("Ingrese el segundo numero");
       int n2 = leer.nextInt();
       int suma = n1 + n2;
        System.out.println("el resultado de la suma es: " + suma);
        
       
        }
        
}
