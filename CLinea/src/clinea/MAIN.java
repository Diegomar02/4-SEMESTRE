
package clinea;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion,opcion1,opcion2,continuar;
        double x,y;
        System.out.printf("BIENVENIDO");
        //CPuntos puntoA=new CPuntos();
        //CPuntos puntoB=new CPuntos();
        System.out.printf("\nValor a capturar los puntos");
        System.out.printf("\nPunto A");
        System.out.printf("\nX: ");
        x=entrada.nextDouble();
        System.out.printf("Y: ");
        y=entrada.nextDouble();
        CLinea puntoA=new CLinea(x,y);
        System.out.printf("Punto B");
        System.out.printf("\nX: ");
        x=entrada.nextDouble();
        System.out.printf("Y: ");
        y=entrada.nextDouble();
        CLinea puntoB=new CLinea(x,y);
        System.out.printf("\nPunto A: ("+puntoA.x+","+puntoA.y+")");
        System.out.printf("\nPunto B: ("+puntoB.x+","+puntoB.y+")");
        System.out.print("\n\nDesea modificar los puntos: 1. SI o 2.NO = ");
        opcion=entrada.nextInt();
        if(opcion==1){
            do{
             System.out.printf("Que punto desea modificar, 1.PuntoA o 2.PuntoB = ");
             opcion1=entrada.nextInt();
                if(opcion1==1){
                    System.out.printf("1.Derecha , 2.Izquierda , 3. Arriba , 4. Abajo = ");
                    opcion2=entrada.nextInt();
                    switch(opcion2){
                        case 1:
                            puntoA.derecha();
                            System.out.printf("\nPunto A: ("+puntoA.x+","+puntoA.y+")");
                            break;
                        case 2:
                            puntoA.izquierda();
                            System.out.printf("\nPunto A: ("+puntoA.x+","+puntoA.y+")");
                            break;
                        case 3:
                            puntoA.arriba();
                            System.out.printf("\nPunto A: ("+puntoA.x+","+puntoA.y+")");
                            break;
                        case 4:
                            puntoA.abajo();
                            System.out.printf("\nPunto A: ("+puntoA.x+","+puntoA.y+")");
                            break;
                    }
                }
                if(opcion1==2){System.out.printf("1.Derecha , 2.Izquierda , 3. Arriba , 4. Abajo = ");
                    opcion2=entrada.nextInt();
                    switch(opcion2){
                        case 1:
                            puntoB.derecha();
                            System.out.printf("\nPunto B: ("+puntoB.x+","+puntoB.y+")");
                            break;
                        case 2:
                            puntoB.izquierda();
                            System.out.printf("\nPunto B: ("+puntoB.x+","+puntoB.y+")");
                            break;
                        case 3:
                            puntoB.arriba();
                            System.out.printf("\nPunto B: ("+puntoB.x+","+puntoB.y+")");
                            break;
                        case 4:
                            puntoB.abajo();
                            System.out.printf("\nPunto B: ("+puntoB.x+","+puntoB.y+")");
                            break;
                    } 
                }
                System.out.printf("\n\nQuieres seguir modificando: 1.SI o 2.NO = ");
                continuar=entrada.nextInt();
            }while(continuar!=2);
            System.out.printf("\nLOS PUNTOS QUEDAN DE LA SIGUIENTE MANERA: ");
            System.out.printf("\nPunto B: ("+puntoA.x+","+puntoA.y+")");
            System.out.printf("\nPunto B: ("+puntoB.x+","+puntoB.y+")");
        }
        if(opcion==2){
            System.out.printf("\nLOS PUNTOS QUEDAN DE LA SIGUIENTE MANERA: ");
            System.out.printf("\nPunto A: ("+puntoA.x+","+puntoA.y+")");
            System.out.printf("\nPunto B: ("+puntoB.x+","+puntoB.y+")");
            
        }
    }
}

            
                
               
               
        
        
        
        
        
        

        
 
