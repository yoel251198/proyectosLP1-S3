
package arreglos;

//Desarrollar un arreglo que permita ingreso de valores

import utils.Leer;

// a un arreglo y muestre la sumatoria de sus elementos utilizando metodos
public class Prog101 {
    public static  int[] numeros = new int[1000];
    public static int cantidad;
    
    public static void escribirarreglo (){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros ["+ i + "]: ");
            numeros[i]= Leer.entero();
            
        }
    }
    public static void sumatoria() {
        int suma=0;
        for (int i = 0; i < cantidad; i++) {
            suma+=numeros[i];
            
            
        }
        System.out.println("Resultado(sumatoria): " + suma);
    }
    public static void inicio() {
        System.out.println("Cantidad: ");
        cantidad=Leer.entero();
        escribirarreglo();
        sumatoria();
        
    }
    public static void main(String[] args) {
     inicio();
        
        
    }
    }
 

