
package ejercicio.herencia.clase;

import java.util.Scanner;

public class EJERCICIOHERENCIACLASE {

    
    public static void main(String[] args) {
        
        EMPLEADO[]empleados=new EMPLEADO[10];
        Scanner s=new Scanner(System.in);
        String opc=new String();
        System.out.println("Capturemos"+empleados.length+"Empleados");
        for(int i=0;i<empleados.length;i++){
            System.out.println("");
            System.out.println("¿Que deseas capturar? 1. Empleado 2. Ejecutivo");
            opc=s.next();
            if(opc.equals("1")){
                empleados[i]=new EMPLEADO();
                System.out.println("Se creo: "+empleados[i]);
            }else if(opc.equals("2")){
                empleados[i]=new EJECUTIVO();
                System.out.println("Se creo: "+empleados[i]);
            }else{
                System.out.println("Opcion no valido");
                System.out.println("No se creo empleado");
            }
        }
    }
    
}
