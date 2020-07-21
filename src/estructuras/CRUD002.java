/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;
import utils.Leer;
/**
 *
 * @author YOEL
 */
public class CRUD002 {
      public static String[] nombre=new String[1000];
    public static String[] tipo=new String[1000];
    public static String[] dia=new String[1000];
    public static String[] mercado=new String[1000];
    public static String[] cantidad= new String[1000];
    
    public static int posicion = -1;
    
    public static void agregarproducto(){
        String continuar;
        do{
        posicion++;
        System.out.println("Agregar producto");
        System.out.println("Nombre:");
        nombre[posicion]=Leer.cadena();
        System.out.println("tipo de producto");
        tipo[posicion]=Leer.cadena();
        System.out.println("Dia de compra");
        dia[posicion]=Leer.cadena();
        System.out.println("Cantidad comprada");
        cantidad[posicion]=Leer.cadena();
            System.out.println("Desea Agregar otro?[S/N]");
            continuar=Leer.cadena();
        } while(continuar.equalsIgnoreCase("S"));
        
    }
    public static void eliminarproducto(){
        listarproducto();
        System.out.print("Ingrese del producto a eliminar ");
        int numero = Leer.entero();
        numero--;
        for (int i = numero; i < posicion; i++) {
            nombre[i]=nombre[i+1];
            tipo[i]=tipo[i+1];
            dia[i]=dia[i+1];
            cantidad[i]=cantidad[i+1];
                  
        }
        nombre[posicion]="  ";
        tipo[posicion]="  ";
        dia[posicion]="  ";
        cantidad[posicion]="  ";
        posicion--;
    }
    public static void editarproducto(){
        listarproducto();
        String continuar;
        do{
        System.out.print("Ingrese el numero de la persona a editar:");
        int numero = Leer.entero();
        numero--;
        System.out.println("Resultado: "+nombre[numero]+ " ( "+tipo[numero]+ ") - "+dia[numero] + "- " + cantidad[numero]);
        System.out.print("Nuevo producto: ");
        nombre[numero]=Leer.cadena();
        System.out.print("Nuevo tipo de producto: ");
        tipo[numero]=Leer.cadena();
        System.out.print("Nueva día de compra: ");
        dia[numero]=Leer.cadena();
        System.out.print("Nueva cantidad: ");
        cantidad[numero]=Leer.cadena();
        System.out.println("Desea editar otro?[S/N]");
            continuar=Leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    public static void listarproducto(){
        System.out.println("Listado");
        System.out.println("N°\tNombre\t\ttipo\t\tdia\t\tcantidad");
        for (int i = 0; i <=posicion; i++) {
            System.out.println((i+1)+ "\t" + nombre[i] + "\t"+ tipo[i] + "\t"+ dia[i] +"\t" + cantidad[i]);
            
            
        }
    } 
   
    public static void salir(){
        System.out.println("Gracias por su visita.");
    }
    public static void error(){
        System.out.println("ERROR! Seleccione una opcion correcta");
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar productos");
        System.out.println("2. Eliminar productos");
        System.out.println("3. Editar productos");
        System.out.println("4. Listar productos");
        System.out.println("5. Agrupar");
        System.out.println("6. Salir");
        System.out.println("Seleccione una opcion: ");
    }
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: 
                    agregarproducto();
                    break;
                case 2:
                    eliminarproducto();
                    break;
                case 3:
                    editarproducto();
                    break;
                case 4:
                    listarproducto();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    error();
            }
        }while(opcion!=5);
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
