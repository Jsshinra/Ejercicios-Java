
package ejercicio.pkg1;

import static java.lang.System.out;
import java.util.Scanner;


public class Ejercicio1 {

  
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Ingrese 2 numeros porfavor");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        int suma; 
        suma = num1 + num2;
        System.out.println("El resultado de la suma es de: " + suma);
        

        
    }
    
}
