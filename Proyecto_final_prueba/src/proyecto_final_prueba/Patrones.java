
package proyecto_final_prueba;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Patrones{
    Random aleatorio;
    JFrame ventana;
    JLabel imagenes[][];
    JLabel puntaje1,instruccion,patrones2,patrones3,patrones4,patrones5;
    int matriz[][];
    int puntaje;
    int contador;
    int contador_aux;
    int patrones_2=5,patrones_3=5,patrones_4=5,patrones_5=5;
    
    
    
    public Patrones(){
        ventana=new JFrame("Chuzzle");
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
                instruccion.setBounds(250,20,150,20);
                puntaje1.setBounds(280,50,150,20);
                patrones2.setBounds(250,70,150,20);
                patrones3.setBounds(250,90,150,20);
                patrones4.setBounds(250,110,150,20);
                patrones5.setBounds(250,130,150,20);
                ventana.add(instruccion);
                ventana.add(puntaje1);
                ventana.add(patrones2);
                ventana.add(patrones3);
                ventana.add(patrones4);
                ventana.add(patrones5);
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
                                    if(patrones_2>0){
                                        if(contador_aux==2){
                                            patrones_2--;
                                        }
                                    }
                                    if(patrones_3>0){
                                        if(contador_aux==3){
                                            patrones_3--;
                                        }
                                    }
                                    if(patrones_4>0){
                                        if(contador_aux==4){
                                            patrones_4--;
                                        }
                                    }
                                    if(patrones_5>0){
                                        if(contador_aux==5){
                                            patrones_5--;
                                        }
                                    }
                                    
                                    if(patrones_2==0&&patrones_3==0&&patrones_4==0&&patrones_5==0){
                                        System.out.println("Se logro!!!");
                                        new Game();
                                        ventana.setVisible(false);
                                    }
                                    
                                    System.out.println("Puntaje: "+puntaje);
                                    puntaje1.setText("Puntaje = "+puntaje);
                                    patrones2.setText("Gemas 2 faltantes = "+patrones_2);
                                    patrones3.setText("Gemas 3 faltantes = "+patrones_3);
                                    patrones4.setText("Gemas 4 faltantes = "+patrones_4);
                                    patrones5.setText("Gemas 5 faltantes = "+patrones_5);
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
                                    imagenes[d][f].setIcon(new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/Proyecto_final_prueba/PROYECTO/"+matriz[d][f]+".png"));
                                    
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
