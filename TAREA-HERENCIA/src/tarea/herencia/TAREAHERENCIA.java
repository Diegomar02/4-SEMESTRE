
package tarea.herencia;

import java.util.Scanner;

public class TAREAHERENCIA {
    
    public static void main(String[] args) {
        TENIS[]tenis=new TENIS[2];
        Scanner teclado=new Scanner(System.in);
        String opcion=new String();
        System.out.println("VAMOS A CAPTURAR "+tenis.length+" clientes ");
        for(int i=0;i<tenis.length;i++){
            System.out.println("\n¿Cómo se hizo la compra? 1. CONTADO o 2. PAGOS (6 meses)");
            opcion=teclado.next();
            if(opcion.equals("1")){
                tenis[i]=new CONTADO();
                System.out.println("\nCliente Registrado"+tenis[i]);
            }else if(opcion.equals("2")){
                tenis[i]=new PAGOS();
                System.out.println("\nCliente Registrado"+tenis[i]);
            }else{
                System.out.println("Opcion no valido");
                System.out.println("No se creo al cliente");
            }
        }
        //System.out.println("\n\n\n\nRESUMEN DE PEDIDOS");
        //for(int i=0;i<tenis.length;i++){
            //int a;
            //a=i;
            //System.out.println("Cliente "+a+1+""+tenis[i]);
        //}
    }
}
