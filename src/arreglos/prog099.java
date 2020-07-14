
package arreglos;

/**
 *
 * @author YOEL
 */


//diseñar un algoritmo que permita el ingreso de 7
//valores a un arreglo y mostrarlo 
import utils.Leer;
public class prog099 {
    public static void inicio() {
        int [] a = new int [7];
        System.out.println("Tamaño del arreglo: " + a.length);
        System.out.println("Ingresar los elementos: ");
        for (int i = 0; i < a.length ; i++) {
            System.out.print("a["+ i + "]" );
            a[i]= Leer.entero();
            
        }
        System.out.println("los elementos del arreglo son: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+ i + "]" );
            System.out.println(a[i]);
            
        }
    }
    public static void main(String[] args) {
        inicio();
    }
 
}
