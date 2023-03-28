
package tarea.herencia;

import java.util.Scanner;

public class PAGOS extends TENIS{
    Scanner teclado=new Scanner(System.in);
    int meses;
    long precio;
    PAGOS(){
        super();
    }
    PAGOS(String n,int s){
        super();
    }
    void asignarPrecio(int Precio){
        precio=Precio;
    }
    public String toString(){
        String s=super.toString();
        System.out.println("Precio del tenis: ");
        precio=teclado.nextLong();
        System.out.println("A cuantos meses: ");
        meses=teclado.nextByte();
        precio=precio/meses;
        s=s+"\nQueda a "+meses+" pagos de "+precio;
        return s;
    }
}
