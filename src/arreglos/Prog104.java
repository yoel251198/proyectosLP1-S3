
package arreglos;
import utils.Leer;

public class Prog104 {
      public static  int[] numeros = new int[1000];
    public static int cantidad;
    public static void escribirarreglo() {
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros ["+ i + "]: ");
            numeros[i]= Leer.entero();
        }
    }
   
     public static void eliminarelemento() {
         
        int posición;
        listararreglo();
         System.out.println("Indique la poisición a eliminar: ");
         posición= Leer.entero();
         for (int i = posición; i < cantidad-1; i++) {
             numeros[i]=numeros[i+1];
             
         }
        numeros[cantidad-1] = 0;
        cantidad --;
    }
       public static void listararreglo() {
        System.out.println("Valores del arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Numero ["+i+"] : "+ numeros [i]);
            
        }
        
    }
    
    public static void inicio() {
        System.out.println("Cantidad: ");
        cantidad=Leer.entero();
        escribirarreglo();
        eliminarelemento();
        listararreglo();
    }
    public static void main(String[] args) {
        inicio();
    }
}
