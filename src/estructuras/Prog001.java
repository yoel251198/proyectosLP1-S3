/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author YOEL
 */
public class Prog001 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int numero;
            System.out.println("numero:   ");
            numero = Integer.valueOf(teclado.nextLine());
            if (numero % 2 == 0){
                System.out.println("Resultado = PAR");
            }
            else { System.out.println("Resultado = IMPAR");
            }
            
        }
        
    }
    
}
