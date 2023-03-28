
package pelota;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;


public class CLIENZO extends JComponent{
    private final static int ANCHO = 512;
    private final static int ALTO= 384;
    private final static int DIAMETRO = 20;
    public float x,y;
    public float vx, vy;
    
    PELOTA[] p = new PELOTA[10];
    
    public CLIENZO(){
        setPreferredSize(new Dimension(ANCHO,ALTO));
        x=10;
        y=20;
        vx=300;
        vy=400;
        for(int i=0; i<p.length;i++){
            p[i]= new PELOTA();
        }
    }
    
    @Override
    public void paint(Graphics  g){
        g.setColor(Color.WHITE);
        g.fillRect(0,0,ANCHO,ALTO);
        for(int i=0; i<p.length; i++){
            g.setColor(p[i].color);
            g.fillOval(Math.round(p[i].x), Math.round(p[i].y), CTES.DIAMETRO, CTES.DIAMETRO);
        }
    }
    
    private void dibuja() throws Exception{
        SwingUtilities.invokeAndWait(new Runnable(){
            public void run(){
                paintImmediately(0,0,ANCHO,ALTO);
            }
        });
    }
    
    private void fisica(float dt){
        for(int i=0; i<p.length; i++){
            p[i].fisica(dt);
        }
    }
    
    public void cicloPrincipalJuego() throws Exception{
        long tiempoViejo = System.nanoTime();
        while(true){
            long tiempoNuevo= System.nanoTime();
            float dt= (tiempoNuevo - tiempoViejo)/1000000000f;
            tiempoViejo = tiempoNuevo;
            fisica(dt);
            dibuja();
        }
    }
    
    
}



