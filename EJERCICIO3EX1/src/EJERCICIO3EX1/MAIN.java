
package EJERCICIO3EX1;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        String nombre;
        Scanner entrada=new Scanner(System.in);
        CElectrodomesticos aparato=new CElectrodomesticos(1,1,"Refrigerador",5.5,6,10);
        aparato.encender();
        aparato.apagar();
        aparato.conectado();
        aparato.desconectado();
        
        
        
        
    }  
}
