
package tarea.herencia;

import java.util.Scanner;

class TENIS{
    String nombreCliente,direccion,correo;
    int edad,numClientes;
    static private int contador=0;
    Scanner teclado=new Scanner(System.in);
    
    TENIS(){
        numClientes=++contador;
        System.out.println("\nCliente "+numClientes);
        System.out.println("Nombre: ");
        nombreCliente=teclado.next();
        System.out.println("Edad: ");
        edad=teclado.nextByte();
        System.out.println("Correo: ");
        correo=teclado.next();
        System.out.println("Direccion de envio: ");
        direccion=teclado.next();  
    }
    TENIS(String nombreCliente,String direccion,String correo,int edad,int precio){
        this.nombreCliente=nombreCliente;
        this.direccion=direccion;
        this.correo=correo;
        this.edad=edad;
        numClientes=++contador;
    }
    public String toString(){
        return "\nCliente "+numClientes+"\nNombre: "+nombreCliente+"\nEdad: "+edad+"\nCorreo: "+correo+"\nDirrecion de envio: "+direccion;
    }
    
}
