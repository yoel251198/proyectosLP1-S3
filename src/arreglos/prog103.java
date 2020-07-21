
package arreglos;


import utils.Leer;

public class prog103 {
     public static  int[] numeros = new int[1000];
    public static int cantidad;
    public static void escribirarreglo() {
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros ["+ i + "]: ");
            numeros[i]= Leer.entero();
        }
    }
    public static String parimpar(int numero) {
        String resultado;
        if(numero%2==0){
            if (numero==0) {
              resultado = "par";  
            }
                       
         else {
            resultado= "par";
        }
        }
        else {
            resultado = "impar";
        }
    
        
        return resultado;
    }
    public static String positivonegativo(int numero) {
        String resultado;
        if (numero>0) {
            resultado= "positivo";
            
        }
        else if (numero<0){
            resultado= "negativo";
        }
        else {
            resultado= "neutro";
        }
        
        return resultado;
    }
    public static void imprimir() {
        System.out.println("Resultado: ");
         for (int i = 0; i < cantidad; i++) {
             System.out.println(numeros[i] + ": " + positivonegativo(numeros[i]) + "-"+ parimpar(numeros[i]));
             
         }
    }
    public static void inicio() {
        System.out.println("Cantidad: ");
        cantidad=Leer.entero();
        escribirarreglo();
        imprimir();
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
