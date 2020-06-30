
package estructuras;

import java.util.Scanner;


public class Prog002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double importe;
        System.out.print("Importe: ");
        importe = Double.valueOf(teclado.nextLine());
        System.out.print("Categorìa: ");
        if (importe>4000) {
            System.out.print("Categorìa D \n ");
            
        }
        else if (importe>2000){
            System.out.print("Categorìa C \n ");
        }
        else if (importe>100){
            System.out.print("Categorìa B\n");
        }
        else if (importe>=0){
            System.out.print("Categorìa A \n");
        }
        else {
            System.out.print("Fuera de rango \n");
        }
        teclado.close();
    }
 
}
