
package tarea.herencia;

import java.util.Scanner;

public class CONTADO extends TENIS{
    Scanner teclado=new Scanner(System.in);
    long precio;
    CONTADO(){
        super();
    }
    CONTADO(String n,int s){
        super();
    }
    void asignarPrecio(int Precio){
        precio=Precio;
    }
    public String toString(){
        String s=super.toString();
        System.out.println("Precio del tenis: ");
        precio=teclado.nextLong();
        s=s+"\nPrecio: "+precio+" de contado";
        return s;
    }
}
