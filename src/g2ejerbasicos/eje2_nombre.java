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
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
*/

public class eje2_nombre {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre:");
        String nombre = leer.next();
        System.out.println("el nombre es: " + nombre);
        

    }
}
