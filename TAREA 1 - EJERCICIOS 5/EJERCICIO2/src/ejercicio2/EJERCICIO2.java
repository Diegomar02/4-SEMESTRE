
package ejercicio2;
import java.util.Scanner;

public class EJERCICIO2 {

    
    public static void main(String[] args) {
        int tamaño,dato;
        Scanner teclado=new Scanner(System.in);
        System.out.println("TAMAÑO DEL ARREGLO");
        tamaño=teclado.nextInt();
        estadistica[]arreglo=new estadistica[tamaño];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("DATO "+i);
            System.out.println("Numero?: ");
            dato=teclado.nextByte();
        }
    }
}
