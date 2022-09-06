/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio.pkg10;

import java.util.Scanner;


public class Ejercicio17 {

    
    public static void main(String[] args) {
        int n, unidades=0, decenas=0,centenas=0 , digitos4=0, digitos5=0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del vector");
       n= leer.nextInt();
        int [] vector = new int [n];
        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < n; i++) {
            vector[i]= leer.nextInt();
           
        }
        for (int i = 0; i < n; i++) {
            if (vector[i]>=10000){
                digitos5++;
            }else if (vector[i]>=1000){
                digitos4++;
            }else if (vector[i]>=100){
                centenas++;
            }else if(vector[i]>=10){
                decenas++;       
            }else {
                unidades++;
            }
                   
        }
        
        System.out.println("Se encontraron "+ unidades +" de un digito ");
        System.out.println("Se encontraron "+ decenas +" de 2 digitos ");
        System.out.println("Se encontraron "+ centenas +" de 3 digitos ");
        System.out.println("Se encontraron "+ digitos4 +" de 4 digitos ");
        System.out.println("Se encontraron "+ digitos5 +" de 5 digitos ");
        Mostrarvector(vector, n);
        
    }
     public static void Mostrarvector(int vector[], int n){
         for (int i = 0; i < n; i++) {
             System.out.print(vector[i]+ " ");
         }
         
     }
}
