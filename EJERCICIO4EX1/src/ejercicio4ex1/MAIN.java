
package ejercicio4ex1;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        INTERFACE APARATOS;
        /*
        APARATOS=new REFRIGERADORES();
        System.out.printf("\nREFRIGERADOR\n");
        APARATOS.prendido();
        APARATOS.apagado();
        
        APARATOS=new LAVADORAS();
        System.out.printf("\nLavadoras\n");
        APARATOS.prendido();
        APARATOS.apagado();
        
        APARATOS=new TELEVISORES();
        System.out.printf("\nTelevisores\n");
        APARATOS.prendido();
        APARATOS.apagado();
        
        APARATOS=new MICROONDAS();
        System.out.printf("\nMicroondas\n");
        APARATOS.prendido();
        APARATOS.apagado();
        
        APARATOS=new EQUIPO_DE_AUDIO();
        System.out.printf("\nEquipo de audio\n");
        APARATOS.prendido();
        APARATOS.apagado();
        
        APARATOS=new EQUIPO_DE_VIDEO();
        System.out.printf("\nEquipo de video\n");
        APARATOS.prendido();
        APARATOS.apagado();
        
        APARATOS=new SECADORAS();
        System.out.printf("\nSecadoras\n");
        APARATOS.prendido();
        APARATOS.apagado();
        
        APARATOS=new MAQUINAS_DE_AFEITAR();
        System.out.printf("\nMaquinas de afeitar\n");
        APARATOS.prendido();
        APARATOS.apagado();
        */
        int vector[]=new int[10];
        int opcion;
        for(int i=0;i<10;i++){
            System.out.printf("\n\nEspacio "+(i+1)+" del vector");
            System.out.printf("\nTipo de aparato:\n");
            System.out.printf("\n1. Refigerador");
            System.out.printf("\n2. Lavadora");
            System.out.printf("\n3. Television");
            System.out.printf("\n4. Microondas");
            System.out.printf("\n5. Equipo de audio");
            System.out.printf("\n6.Equipo de video");
            System.out.printf("\n7. Secadoras");
            System.out.printf("\n8. Maquinas");
            System.out.printf("\nOPCION:");
            opcion=entrada.nextInt();
            vector[i]=opcion;
        }
        for(int i=0;i<10;i++){
            System.out.printf("\n\nESPACIO "+(i+1)+" del vector");
            if(vector[i]==1){
                APARATOS=new REFRIGERADORES();
                System.out.printf("\nREFRIGERADOR\n");
                APARATOS.prendido();
                APARATOS.apagado();
                APARATOS.conectado();
                APARATOS.desconectado();
            }
            if(vector[i]==2){
                APARATOS=new LAVADORAS();
                System.out.printf("\nLavadoras\n");
                APARATOS.prendido();
                APARATOS.apagado();
                APARATOS.conectado();
                APARATOS.desconectado();
            }
            if(vector[i]==3){
                APARATOS=new TELEVISORES();
                System.out.printf("\nTelevisores\n");
                APARATOS.prendido();
                APARATOS.apagado();
                APARATOS.conectado();
                APARATOS.desconectado();
            }
            if(vector[i]==4){
                APARATOS=new MICROONDAS();
                System.out.printf("\nMicroondas\n");
                APARATOS.prendido();
                APARATOS.apagado();
                APARATOS.conectado();
                APARATOS.desconectado();
            }
            if(vector[i]==5){
                APARATOS=new EQUIPO_DE_AUDIO();
                System.out.printf("\nEquipo de audio\n");
                APARATOS.prendido();
                APARATOS.apagado();
                APARATOS.conectado();
                APARATOS.desconectado();
            }
            if(vector[i]==6){
                APARATOS=new EQUIPO_DE_VIDEO();
                System.out.printf("\nEquipo de video\n");
                APARATOS.prendido();
                APARATOS.apagado();
                APARATOS.conectado();
                APARATOS.desconectado();
            }
            if(vector[i]==7){
                APARATOS=new SECADORAS();
                System.out.printf("\nSecadoras\n");
                APARATOS.prendido();
                APARATOS.apagado();
                APARATOS.conectado();
                APARATOS.desconectado();
            }
            if(vector[i]==8){
                APARATOS=new MAQUINAS_DE_AFEITAR();
                System.out.printf("\nMaquinas de afeitar\n");
                APARATOS.prendido();
                APARATOS.apagado();
                APARATOS.conectado();
                APARATOS.desconectado();
            }
            
        }   
    }
}
