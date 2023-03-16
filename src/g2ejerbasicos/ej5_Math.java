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
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().

*/
public class ej5_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("el doble del valor es: " + num*2);
        System.out.println("el triple del valor es: " + num*3);
        System.out.println("la raiz cuadrada del numero es : " + Math.sqrt(num));
        
        
        
    }
    
}
