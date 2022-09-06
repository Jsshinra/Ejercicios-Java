
import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/


public class Ejercicio10 {

    public static void main(String[] args) {
       int numLimite;
        int num;
        int suma=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese numero limite");
        numLimite = entrada.nextInt();
        while(suma<=numLimite){
            System.out.println("Ingrese numero a sumar");
            num = entrada.nextInt();
            suma=suma+num;  
        }
        System.out.println("la suma es " + suma);

    }
    
}
