
package vista;
import utils.Leer; 
/**
 *
 * @author YOEL
 */
public class principal {
    public static void factorial() {
        System.out.println("**FACTORIAL**");
        System.out.print("Ingrese número:");
        int numero=Leer.entero();
        int fac=1;
        for (int i = 1; i <=numero; i++) {
            fac*=i;
                        
        }
        System.out.println(numero+"!-"+fac);
    }
    public static void mayordeedad() {
        System.out.println("** MAYOR DE EDAD**");
        System.out.print("ingrese la edad:");
        int edad;
        edad = Leer.entero();
        if (edad>=18) {
            System.out.println("es mayor de edad");
            
        } else {
            System.out.println("es menor de edad");
        }
    }
    public static void parimpar() {
        System.out.println("** PAR O IMPAR**");
        System.out.print("ingrese el numero:");
        int numero;
        numero = Leer.entero();
        if (numero%2==1) {
            System.out.println("es impar");
            
        } else if (numero==0) {
            System.out.println("es neutro ");
        }
        else { System.out.println("es par3"
                + "");
    }
    }
    public static void primo() {
        System.out.println("** PRIMO O NO PRIMO **");
        int a,numero;
        System.out.print("Ingrese el numero:");
        numero = Leer.entero();
        a=0;
        for (int i = 1; i <=numero; i++) {
            if ((numero%i)==0) {
                a++;
                
            }
            
        }
        if(a<=2)
        {
            System.out.println("es primo");
        }else {System.out.println("no es primo");}
    }
    public static void error() {
        System.out.println("Erro opción Incorrecta");
    }
    public static void salir() {
        System.out.println("Gracias por Visitarnos...:)");
    }
    public static void menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 .FACTORIAL");
        System.out.println("2. MAYOR DE EDAD");
        System.out.println("3. PAR O IMPAR");
        System.out.println("4. PRIMO");
        System.out.println("5. SALIR");
        System.out.print("Ingrese opción [1-5]: ");
        
    }
    public static void inicio() {
        int opcion;
        do {
            menu();
            opcion=Leer.entero();
            switch(opcion){
                case 1: factorial();
                break;
                case 2: mayordeedad();
                break;
                case 3: parimpar();
                break;
                case 4: primo();
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
