
//EJEMPLO DE ALGUNOS OPERADORES... EN CODIGO 
//ES UN JUEGO EN DONDE LA MATRIZ TIENE QUE QUEDAR EN 0 PARA QUE TERMINE 
//JUGADOR 1 VS COMPUTADORA 


package programa.ejemplo.operadores;
    import java.util.Scanner;
    import java.util.Random;

public class PROGRAMAEJEMPLOOPERADORES {
    public static void main(String[] args) {
        int amount=0;
        Scanner entrada=new Scanner(System.in);
        int row=0,column=0,rowBoot=0,columnBoot=0,player1=0,player2=0;
        int history1[]=new int[1000];
        int history2[]=new int[1000];
        System.out.print("BIENVENIDO\nVAMOS A JUGAR\n\nDATOS ESENCIALES\nNUMERO DE FILAS = 6\nNUMERO DE COLUMNAS = 6\n\n");
        System.out.printf("PUNTAJE INICIAL JUGADOR 1 = %d\n",player1);
        System.out.printf("PUNTAJE INICIAL JUGADOR 2 = %d\n\n",player2);
        int[][]matriz=new int[6][6];//36 
        for(int rowRandom=0;rowRandom<6;rowRandom++){
            for(int columnRandom=0;columnRandom<6;columnRandom++){
                Random random=new Random();
                matriz[rowRandom][columnRandom]=random.nextInt(5-(-5)+1)-5;
                if(matriz[rowRandom][columnRandom]==0){
                    amount=amount+1;
                }
                System.out.print(matriz[rowRandom][columnRandom]);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.print("\nOBSERVE EN QUE FILA Y COLUMNA ESTA EL NUMERO QUE DESEA\n");
        int turn=1,a;
        int circly=1;
        while(amount<36){
            System.out.printf("\nTURNO %d\n",turn);
            turn=turn+1;
            //PLAYER 1
            System.out.print("JUGADOR 1\n");
            System.out.print("¿FILA? = ");
            row=entrada.nextInt();
            row=row-1;
            System.out.print("¿COLUMNA? = ");
            column=entrada.nextInt();
            column=column-1;
            if(matriz[row][column]==0){
                System.out.printf("\nESCOGISTE EL NUMERO %d\n",matriz[row][column]);
                player1=player1+matriz[row][column];
                a=matriz[row][column];
                history1[circly]=matriz[row][column];
                System.out.printf("PUNTAJE ACTUAL JUGADOR 1 = %d\n\n",player1);
            }
            else{
                System.out.printf("\nESCOGISTE EL NUMERO %d\n",matriz[row][column]);
                player1=player1+matriz[row][column];
                a=matriz[row][column];
                history1[circly]=matriz[row][column];
                System.out.printf("PUNTAJE ACTUAL JUGADOR 1 = %d\n\n",player1);
                matriz[row][column]=0;
                if(matriz[row][column]==0){
                    amount=amount+1;
                }   
            }
            for(int rowRandom=0;rowRandom<6;rowRandom++){
                for(int columnRandom=0;columnRandom<6;columnRandom++){
                    System.out.print(matriz[rowRandom][columnRandom]);
                    System.out.print("\t");
                }
                System.out.println("");
            }
            if(amount==36){
                System.out.print("\nTERMINADO");
                System.out.printf("\nMARCADOR JUGADOR 1 = %d",player1);
                System.out.printf("\nMARCADOR JUGADOR 2 = %d",player2);
                if(player2<player1){
                    System.out.printf("\n\nEL GANADOR ES EL JUGADOR 1 CON PUNTAJE DE %d\n",player1);
                }
                else{
                    System.out.printf("\n\nEL GANADOR ES EL JUGADOR 2 CON PUNTAJE DE %d\n",player2);
                }
                System.out.print("\nHISTORIAL DEL JUEGO");
                for(int i=1;i<turn;i++){
                    System.out.printf("\n\nTURNO %d",i);
                    System.out.printf("\nJUGADOR 1 = %d",history1[i]);
                    System.out.printf("\nJUGADOR 2 = %d",history2[i]);
                }
                return;
            }
            Random random=new Random();
            System.out.print("\nJUGADOR 2 (COMPUTADORA)\n");
            row=random.nextInt(5+1)+1;
            rowBoot=row;
            row=row-1;
            column=random.nextInt(5+1)+1;
            columnBoot=column;
            column=column-1;
            System.out.printf("FILA = %d  ",rowBoot);
            System.out.printf("\nCOLUMNA = %d ",columnBoot);
            if(matriz[row][column]==0){
                System.out.printf("\nSE ESCOGIO EL NUMERO %d\n",matriz[row][column]);
                player2=player2+matriz[row][column];
                a=matriz[row][column];
                history2[circly]=matriz[row][column];
                System.out.printf("PUNTAJE ACTUAL JUGADOR 2 = %d\n\n",player2);
            }
            else{
                System.out.printf("\nSE ESCOGIO EL NUMERO %d\n",matriz[row][column]);
                player2=player2+matriz[row][column];
                a=matriz[row][column];
                history2[circly]=matriz[row][column];
                System.out.printf("PUNTAJE ACTUAL JUGADOR 2 = %d\n\n",player2);
                matriz[row][column]=0;
                if(matriz[row][column]==0){
                    amount=amount+1;
                }
            }
            for(int rowRandom=0;rowRandom<6;rowRandom++){
                for(int columnRandom=0;columnRandom<6;columnRandom++){
                    System.out.print(matriz[rowRandom][columnRandom]);
                    System.out.print("\t");
                }
                System.out.println("");
            }
            circly=circly+1;
        } 
        System.out.print("\nJUEGO TERMINADO");
        System.out.printf("\nMARCADOR JUGADOR 1 = %d",player1);
        System.out.printf("\nMARCADOR JUGADOR 2 = %d",player2);
        if(player2<player1){
            System.out.printf("\n\nEL GANADOR ES EL JUGADOR 1 CON PUNTUAJE DE %d\n",player1);
        }
        else{
            System.out.printf("\n\nEL GANADOR ES EL JUGADOR 2 CON PUNTUAJE DE %d\n",player2);
        }
        System.out.print("\n\n\n\nHISTORIAL DEL JUEGO");
        for(int i=1;i<turn;i++){
            System.out.printf("\n\nTURNO %d",i);
            System.out.printf("\nJUGADOR 1 = %d",history1[i]);
            System.out.printf("\nJUGADOR 2 = %d",history2[i]);   
        }
        System.out.print("\n\n\n");
    }
    
}

//EN ESTE CODIGO SE USAN LOS OPERADORES LOGICOS QUE HE APRENDIDO, LOS DEMAS NO LOS CONOZCO NI SE 
//COMO USARLOS, ME FALTO IMPLEMENTAR PERO NO SUPE COMO LA COMPARACION ENTRE DOS TERMINOS 
// USANDO EL Y & O |
//EJEMPLO
// IF(VALOR1&VALOR2<10)
//SYSTEM.OUT.PRINTF("...");

