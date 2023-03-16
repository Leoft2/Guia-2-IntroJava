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
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/
public class ej4_grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el valor de grados centigrados");
        double gradosC = leer.nextDouble();
        double gradosF = 32 + (9*gradosC/5);
        System.out.println("El equivalente en grados Fahrenheit es: " + gradosF );
        
        
       
    }
    
}
