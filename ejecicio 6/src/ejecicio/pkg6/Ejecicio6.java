//Crear un programa que dado un numero determine si es par o impar.
package ejecicio.pkg6;

import java.util.Scanner;


public class Ejecicio6 {

   
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un numero para saber si es par o impar");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        if (num%2 == 0)  {
            System.out.println("su numero es par");
            
        }else {
            System.out.println("Su numero es impar");
        }
    }
    
    
}
