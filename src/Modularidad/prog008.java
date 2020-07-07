/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularidad;

/**
 *
 * @author YOEL
 */
public class prog008 {
    //metodo que reciben parámetros
    public static void saludo(String nombre) {
        System.out.println("Bienvenido " + nombre);
        System.out.println("Disfruta tu estadía en este lugar");
    }
    public static void saludo2(String nombre, String carrera) {
        
        System.out.println("disfruta tu estadía en la carrera de " + carrera);
        
    }
    public static void factorial(int num) {
        int fac = 1;
             for (int i = 1; i <= num; i++) {
            fac*=i;
        }
 
        System.out.println("El factorial de "+ num + ": " + fac );
        
    }
    public static void main(String[] args) {
        saludo("Daniel");
        saludo2("Juan","ING. Sistemas");
        factorial(5);
    }
}
