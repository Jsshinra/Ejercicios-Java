
package ejercicio.pkg7;

import java.util.Scanner;


public class Ejercicio7 {

  
    public static void main(String[] args) {
     String frase;
        System.out.println("Ingrese eureka");
        Scanner leer = new Scanner(System.in);
        frase = leer.next();
        frase= frase.toLowerCase();
        
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
            
        } else {
            System.out.println("Incorrecto");
        }
        
               
    }
    
}
