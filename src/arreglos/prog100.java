
package arreglos;
// author YOEL
//Utilizando métodos, diseñe un programa que permite el ingreso de valores
// a un arreglo y los muestre.
import utils.Leer;
public class prog100 {
    public static int [] numeros = new int [1000];      
    public static int cantidad;
    
    public static void escribirarreglo (){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numero ["+i+"]: ");
            numeros [i]= Leer.entero();
        }
    }
    
    public static void imprimirarreglo() {
        System.out.println("Valores del arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Numero ["+i+"] : "+ numeros [i]);
            
        }
        
    }
    public static void inicio (){
        System.out.println("Cantidad de elementos: " );
        cantidad=Leer.entero();
        escribirarreglo();
        imprimirarreglo();
        
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
