
package estructuras;

import java.util.Scanner;


public class prog006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int S=0, N;
        System.out.print("Ingrese la cantidad n:"); 
        N = Integer.valueOf(teclado.nextLine());
        for (int a = 1; a <=N ; a++) {
          S = S + a;
          
            
        }
        
        System.out.println("La sumatoria serà: " + S);
        teclado.close();
    }
    
}
