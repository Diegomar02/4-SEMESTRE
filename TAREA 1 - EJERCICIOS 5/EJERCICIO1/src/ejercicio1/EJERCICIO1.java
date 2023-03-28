
package ejercicio1;

import java.util.Scanner;

public class EJERCICIO1 {

    public static void main(String[] args) {
        String buscar;
        Scanner teclado=new Scanner(System.in);
        CString1 cadena1=new CString1();
        System.out.println("DATO GUARDADO");
        System.out.println("Palabra a buscar: ");
        buscar=teclado.next();
        if(cadena1.search(buscar)!=-1){
            System.out.println("SE HA ENCONTRADO EL CARACTER");
        }else{
            System.out.println("NO SE HA ENCONTRADO");
        }
        
    }
    
}
