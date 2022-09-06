
package ejercicio.pkg10;

import java.util.Scanner;


public class Ejercicio13 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("ingrese tamaño del cuadrado");
        int tamaño =leer.nextInt();
        
        for(int j=0;j<tamaño;j++){
          for(int i=0;i<tamaño;i++){
            if(j==0 || j==tamaño-1){
                System.out.print("*");
            }else if(i==0 || i==tamaño-1){
                System.out.print("*");
            }else System.out.print(" ");
                
        }
            System.out.println("");
       }
    }

    }
    

