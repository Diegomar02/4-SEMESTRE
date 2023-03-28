
package aeropuerto1;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.ImageIcon;

public class pantalla extends JComponent{
    private final static int ANCHO=1200;
    private final static int ALTO=700;
    private static final String DEFAULT_GAME_PATH = "/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/AEROPUERTO/IMAGENES/";

    
    private float x1,y1;
    private float x2,y2;
    private float x3,y3;
    private float x4,y4;
    private float x5,y5;
    
    private float avionesAleatorio;
    private float pistaAleatorio;

    avion[] aviones=new avion[3];
    
    
    public pantalla(){
        Random aleatorio=new Random();
        setPreferredSize(new Dimension(ANCHO,ALTO));
        aviones[1].setIcon(new ImageIcon(DEFAULT_GAME_PATH+"avion1.jpg"));
        aviones[2].setIcon(new ImageIcon(DEFAULT_GAME_PATH+"avion2.jpg"));
        for(int i=0;i<=1000;i++){
            avionesAleatorio=aleatorio.nextInt(2+1)+1;
            aviones[avionesAleatorio]=new avion();
            
        }
    }
    
    
}
