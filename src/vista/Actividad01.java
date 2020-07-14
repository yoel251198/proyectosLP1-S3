
package vista;
import utils.Leer; 
/**
 *
 * @author YOEL
 */
public class Actividad01{
    public static void potencia() {
        System.out.println("**POTENCIAL**");
        System.out.print("Ingrese número:");
        int numero=Leer.entero();
        int b;
        
        b=numero*numero;
        System.out.println("LA POTENCIA ES:"+b);
    }
    public static void raiz() {
        System.out.println("** HALLAR LA RAIZ**");
        System.out.print("Ingrese el número:");
        int numero= Leer.entero();
        double resultado;
        resultado= Math.sqrt(numero);
        System.out.println("la raiz es: "+resultado);
        
        
    }
    public static void sumatoria() {
        System.out.println("** SUMATORIA**");
        System.out.print("ingrese La Cantidad (N):");
        int numero, S=0 ;
        numero = Leer.entero();
        for (int a = 1; a <=numero ; a++) {
          S = S + a;
          
            
        }
        System.out.println("la sumatoria es: "+ S);
    }
    public static void positivonegativo() {
        System.out.println("** POSITIVO O NEGATIVO **");
        int numero;
        System.out.print("Ingrese el numero:");
        numero = Leer.entero();
        if (numero>=0) {
            System.out.println("El numero es positivo");
            
        } else {
            System.out.println("el numero es negativo");
        }
        
    
    }
    public static void error() {
        System.out.println("Erro opción Incorrecta");
    }
    public static void salir() {
        System.out.println("Gracias por Visitarnos...:)");
    }
    public static void menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 .POTENCIA");
        System.out.println("2. RAIZ");
        System.out.println("3. SUMATORIA");
        System.out.println("4. POSITIVO O NEGATIVO");
        System.out.println("5. SALIR");
        System.out.print("Ingrese opción [1-5]: ");
        
    }
    public static void inicio() {
        int opcion;
        do {
            menu();
            opcion=Leer.entero();
            switch(opcion){
                case 1: potencia();
                break;
                case 2: raiz();
                break;
                case 3: sumatoria();
                break;
                case 4: positivonegativo();
                break;
                case 5: salir();
                break;
                default:error();
            }
        }while(opcion!=5);
               
    }
    
    //metodo principal
    public static void main(String[] args) {
        inicio();
        
    }
}