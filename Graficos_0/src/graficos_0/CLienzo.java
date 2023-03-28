/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos_0;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 *
 * @author diegomarquezgomez
 */
public class CLienzo extends JComponent {
    private final static int ANCHO=512;
    private final static int ALTO=384;
    private final static int LARGO=20;
    
    public float x=0,y=0;
    
    public CLienzo(){
        setPreferredSize(new Dimension(ANCHO,ALTO));
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0,0,ANCHO,ALTO);
        g.setColor(Color.RED);
        g.fillRect(10,10,ANCHO,ALTO);
        g.setColor(Color.BLACK);
        g.drawString("Hola",20+(int)x,20+(int)y);
        g.setColor(new Color(100,0,0,100));
        g.drawRect(30,40,100,200);
    }
    public void dibuja()throws Exception{
        SwingUtilities.invokeAndWait(new Runnable(){
            public void run(){
                paintImmediately(0,0,ANCHO,ALTO);
            }
        });
    }
    private void fisica(float dt){
        x+=0.1;
        y+=0.1;
    }
    public void cicloPrincipalJuego()throws Exception{
        long tiempoViejo=System.nanoTime();
        while(true){
            long tiempoNuevo=System.nanoTime();
            float dt=(tiempoNuevo-tiempoViejo)/1000000000f;
            tiempoViejo=tiempoNuevo;
            fisica(dt);
            dibuja();
        }
    }
}
