
package ejercicio.herencia.clase;

import java.util.Scanner;

class EMPLEADO {
    String nombre;
    int numEmpleado,sueldo;
    static private int contador=0;
    Scanner s=new Scanner(System.in);
    
    EMPLEADO(){
        numEmpleado=++contador;
        System.out.println("Nombre? = ");
        nombre=s.next();
        this.nombre="Empleado"+nombre;
        this.sueldo=numEmpleado;        
    }
    EMPLEADO(String nombre,int sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
        numEmpleado=++contador;
    }
    public void aumentarSueldo(int porcentaje){
        sueldo+=(int)(sueldo*porcentaje/100);
    }
    public String toString(){
        return "Numero de Empleado "+numEmpleado+"Nombre: "+nombre+"Sueldo: "+sueldo;
    }
    
}
