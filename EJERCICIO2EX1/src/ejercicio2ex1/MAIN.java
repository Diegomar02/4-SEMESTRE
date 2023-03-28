
package ejercicio2ex1;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        int dia, mes,año;
        CFecha fechaUsuario=new CFecha(0,0,0);
        System.out.printf("BIENVENIDO");
        System.out.printf("\nMENU");
        System.out.printf("\n1.Ingresar fecha");
        System.out.printf("\n2.Bisiesto ");
        System.out.printf("\n3.Dias mes");
        System.out.printf("\n4.Validar fecha");
        System.out.printf("\n5.Fecha corta");
        System.out.printf("\n6.Dias transcurridos");
        System.out.printf("\n7.Dia semana");
        System.out.printf("\n8.Fecha Larga");
        System.out.printf("\n9.Fecha Tras");
        System.out.printf("\n10.Dias entre");
        System.out.printf("\n11.Siguiente");
        System.out.printf("\n12.Anterior");
        System.out.printf("\n13.Copia");
        System.out.printf("\n14.Igual que");
        System.out.printf("\n15.Menor que");
        System.out.printf("\n16.Mayor que");
        do{
            System.out.printf("\nOPCION: ");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    fechaUsuario.leer();
                    break;
                case 2: 
                    fechaUsuario.bisiesto();
                    break;
                case 3:
                    fechaUsuario.diaMes();
                    break;
                case 4:
                    fechaUsuario.validar();
                    break;
                case 5:
                    fechaUsuario.corta();
                    break;
                case 6: 
                    fechaUsuario.diasTranscurridos();
                    break;
                case 7:
                    fechaUsuario.diaSemana();
                    break;
                case 8:
                    fechaUsuario.larga();
                    break;
                case 9:
                    fechaUsuario.fechaTras();
                    break;
                case 10: 
                    fechaUsuario.diasEntre();
                    break;
                case 11:
                    fechaUsuario.siguiente();
                    break;
                case 12:
                    fechaUsuario.anterior();
                    break;
                case 13:
                    fechaUsuario.copia();
                    break;
                case 14:
                    fechaUsuario.igualQue();
                    break;
                case 15:
                    fechaUsuario.menorQue();
                    break;
                case 16:
                    fechaUsuario.mayorQue();
                    break;
            }
            
        }while(opcion!=17);
    }
    
}
