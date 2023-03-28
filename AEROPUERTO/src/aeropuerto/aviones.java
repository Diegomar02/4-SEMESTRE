
package aeropuerto;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
//import java.util.Timer;
//java.lang.NullPointerException
import java.util.concurrent.TimeUnit;

public class aviones extends Thread{
    JFrame ventana;
    JLabel aviones[];
    //PISTA1 LLEGADA-REGRESO
    int x1=10;int x1_1=10;
    int y1=0;int y1_1=600;
    //PISTA2 LLEGADA-REGRESO
    int x2=100;int x2_2=100;
    int y2=0;int y2_2=600;
    //PISTA3 LLEGADA-REGRESO
    int x3=200;int x3_3=200;
    int y3=0;int y3_3=600;
    //PISTA4 LLEGADA-REGRESO
    int x4=300;int x4_4=300;
    int y4=0;int y4_4=600;
    //PISTA5 LLEGADA-REGRESO
    int x5=400;int x5_5=400;
    int y5=0;int y5_5=600; 
    //CONTADORES
    int contadorAvion1;
    int contadorAvion2;
     //ALEATORIO
    int pistaAleatorio;
    int avionAleatorio;
  
    private static final String DEFAULT_GAME_PATH = "/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/AEROPUERTO/IMAGENES/";
    
    public aviones(JFrame ventana){
        Random aleatorio = new Random();
        //this.ventana=ventana;
        aviones=new JLabel[3];
        aviones[1].setIcon(new ImageIcon(DEFAULT_GAME_PATH+"avion1.jpg"));
        aviones[2].setIcon(new ImageIcon(DEFAULT_GAME_PATH+"avion2.jpg"));
        
        for(int i=0;i<=1000;i++){//NUMERO DE OPERACIONE;
            //TimeUnit.SECONDS.sleep(10);
            //this.sleep(Math.round(Math.random()*1000));
            //CADA 10 SEGUNDOS EJECUTA A PARTIR DE AQUI
            pistaAleatorio=aleatorio.nextInt(5+1)+1;//NUMERO DE PISTAS
            avionAleatorio=aleatorio.nextInt(2+1)+1;
            switch(pistaAleatorio){
                case 1://PISTA #1
                    aviones[avionAleatorio].setBounds(x1,y1,200,200);
                    ventana.add(aviones[avionAleatorio]);
                    aviones[avionAleatorio].setVisible(true);
                    ventana.repaint();
                    contadores(avionAleatorio);
                    try{
                        movimientoRegreso(x1,y1,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                        movimientoRegreso(x1_1,y1_1,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                    }catch(InterruptedException e){
                        
                    }
                    break;
                case 2://PISTA #2
                    aviones[avionAleatorio].setBounds(x2,y2,200,200);
                    ventana.add(aviones[avionAleatorio]);
                    aviones[avionAleatorio].setVisible(true);
                    ventana.repaint();
                    contadores(avionAleatorio);
                    try{
                        movimientoLlegada(x2,y2,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                        movimientoRegreso(x2_2,y2_2,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                    }catch(InterruptedException e){
                    }
                    break;

                case 3://PISTA #3
                    aviones[avionAleatorio].setBounds(x3,y3,200,200);
                    ventana.add(aviones[avionAleatorio]);
                    aviones[avionAleatorio].setVisible(true);
                    ventana.repaint();
                    contadores(avionAleatorio);
                    try{
                        movimientoLlegada(x3,y3,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                        movimientoRegreso(x3_3,y3_3,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                    }catch(InterruptedException e){
                    }
                    break;  
                case 4://PISTA #4
                    aviones[avionAleatorio].setBounds(x4,y4,200,200);
                    ventana.add(aviones[avionAleatorio]);
                    aviones[avionAleatorio].setVisible(true);
                    ventana.repaint();
                    contadores(avionAleatorio);
                    try{
                        movimientoLlegada(x4,y4,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                        movimientoRegreso(x4_4,y4_4,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                    }catch(InterruptedException e){
                        
                    }
                    break;  
                case 5://PISTA #5
                    aviones[avionAleatorio].setBounds(x5,y5,200,200);
                    ventana.add(aviones[avionAleatorio]);
                    aviones[avionAleatorio].setVisible(true);
                    ventana.repaint();
                    contadores(avionAleatorio);
                    try{
                        movimientoLlegada(x5,y5,aviones,avionAleatorio);
                        TimeUnit.SECONDS.sleep(10);
                        TimeUnit.SECONDS.sleep(10);
                        movimientoRegreso(x5_5,y5_5,aviones,avionAleatorio);
                    }catch(InterruptedException e){
                    }
                    break;  
            }
        }
    }
    
    
    public void contadores(int avion){
        
        if(avion==1){
            contadorAvion1++;
        }
        if(avion==2){
            contadorAvion2++;
        }
        
    }
    
    public void movimientoLlegada(int x,int y,JLabel aviones[],int avionAleatorio){
        //aviones=new JLabel[3];
        do{
            aviones[avionAleatorio].getX();
            aviones[avionAleatorio].getY();
            y=y+600;
            aviones[avionAleatorio].setLocation(x,y);
            if(y==601){
            break;
            }
        }while(true);   
    }
    
    public void movimientoRegreso(int x,int y,JLabel aviones[],int avionAleatorio){
        //aviones=new JLabel[3];
        do{
            aviones[avionAleatorio].getX();
            aviones[avionAleatorio].getY();
            y=y-600;
            aviones[avionAleatorio].setLocation(x,y);
            if(y==0){
            break;
            }
        }while(true);  
        
    }
    
    
    
}
