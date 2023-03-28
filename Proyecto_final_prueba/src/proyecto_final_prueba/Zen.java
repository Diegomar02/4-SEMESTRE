
package proyecto_final_prueba;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Zen{
    Random aleatorio;
    JFrame ventana;
    JLabel imagenes[][];
    JLabel puntaje1,instruccion;
    int matriz[][];
    int puntaje;
    int contador;
    int contador_aux;
    
    
    public Zen(){
        ventana=new JFrame("Chuzzle");
        puntaje1=new JLabel("Puntaje = 0");
        instruccion=new JLabel("Modo Libre");
        ventana.setBounds(0,0,630,800);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aleatorio=new Random();
        imagenes=new JLabel[10][10];
        matriz=new int[10][10];

        for(int i=0;i<imagenes.length;i++){
            for (int j=0;j<matriz.length;j++){
                imagenes[i][j]=new JLabel();
                imagenes[i][j].setBounds(20+i*60,170+j*60,50,50);
                matriz[i][j]=aleatorio.nextInt(5)+1;
                imagenes[i][j].setIcon(new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/Proyecto_final_prueba/PROYECTO/"+matriz[i][j]+".png"));
                imagenes[i][j].setVisible(true);
                ventana.add(imagenes[i][j]);
                puntaje1.setBounds(280,50,150,20);
                instruccion.setBounds(250,20,150,20);
                ventana.add(instruccion);
                ventana.add(puntaje1);
                
            }
        }
        //VALIDAR POSICIONES 
        for(int a=0;a<imagenes.length;a++){
            for(int b=0;b<imagenes.length;b++){
                System.out.println(a+""+b+" = "+matriz[a][b]);
                imagenes[a][b].addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        for(int c=0;c<imagenes.length;c++){
                            for(int d=0;d<imagenes.length;d++){
                                if(imagenes[c][d]==e.getSource()){
                                    System.out.println("Posicion:"+c+""+d);
                                    recursiva(matriz[c][d],c,d);
                                    contador_aux=contador;
                                    contador-=contador_aux;
                                    if(contador_aux<=3){
                                        
                                        System.out.println("Selecciono menos de 4 pelotas");
                                    }else{
                                        puntaje=puntaje+10;
                                        System.out.println("Selecciono 4 o mas pelotas");
                                    }
                                    System.out.println("Puntaje: "+puntaje);
                                    puntaje1.setText("Puntaje = "+puntaje);
                                }
                            }
                        }
                        for(int c=0;c<imagenes.length;c++){
                            for(int d=0;d<imagenes.length;d++){
                                for(int f=0;f<imagenes.length;f++){
                                    if(f>0&&matriz[d][f]==-1||matriz[d][f]==-2){
                                        matriz[d][f]=matriz[d][f-1];
                                        matriz[d][f-1]=-1;
                                    }
                                    //matriz[d][f]=aleatorio.nextInt(4)+1;
                                    imagenes[d][f].setIcon(new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/Proyecto_final/PROYECTO/"+matriz[d][f]+".png"));
                                    
                                }
                            }
                        } 
 
                        System.out.println("P="+matriz[0][0]);
                        System.out.println("P="+matriz[1][0]);
                        
                        for(int w=0;w<matriz.length;w++){
                            for(int d=0;d<matriz.length;d++){
                                llenar_restante(matriz[w][d],w,d);
                            }
                        }

                    }
                }); 
            }
        }
        ventana.setVisible(true);
    }
    
    public void recursiva(int color,int x,int y){
        if(color!=-1)
            matriz[x][y]=-1;
        if(color==-1)
            matriz[x][y]=-2;
            contador++;
        if(x<9&&matriz[x+1][y]==color)
            recursiva(color,x+1,y);
        if(x>0&&matriz[x-1][y]==color)
            recursiva(color,x-1,y);
        if(y<9&&matriz[x][y+1]==color)
            recursiva(color,x,y+1);
        if(y>0&&matriz[x][y-1]==color)
            recursiva(color,x,y-1);  
    }
    
    public void llenar_restante(int valor,int x,int y){
                if(valor==-1){
                    matriz[x][y]=aleatorio.nextInt(5)+1;
                    imagenes[x][y].setIcon(new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/Proyecto_final/PROYECTO/"+matriz[x][y]+".png"));
                    imagenes[y][x].setVisible(true);
                    ventana.add(imagenes[0][0]);
              
        }
    }
   
}
