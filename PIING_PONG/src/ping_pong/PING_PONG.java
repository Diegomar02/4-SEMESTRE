
package ping_pong;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class PING_PONG extends JComponent {
    private final static int ANCHO=512;
    private final static int ALTO=384;
    private String titulo = "0";
    private String titulo2= "0";
    int cont,cont2;
    private int xm=0,ym=0;
    public float x=0,y=0;
    public float vx=400,vy=600;
    public boolean arriba,abajo,w,s;
    private float xk,yk,yk2;
    
    public PING_PONG(){
        setPreferredSize(new Dimension(ANCHO,ALTO));
        x=10;
        y=20;
        vx=300;
        vy=400;
        yk=100;
        yk2=100;
        iniciaMouse();
        iniciaTeclado();
    }
    
     public void iniciaTeclado(){
        addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                actualiza(e.getKeyCode(),true);
                actualiza(e.getKeyChar(),true);
            }
            public void keyReleased(KeyEvent e){
                actualiza(e.getKeyCode(),false);
                actualiza(e.getKeyChar(),false);
            }
            
            private void actualiza(int KeyCode, boolean pressed ){
                switch (KeyCode){
                case KeyEvent.VK_UP:
                    arriba=pressed;
                    break;
                case KeyEvent.VK_DOWN:
                    abajo=pressed;
                    break;
                    
                case KeyEvent.VK_W:
                    w=pressed;
                    break;
                    
                case KeyEvent.VK_S:
                    s=pressed;
                    break;
                 }
            }        
        });
    }
    
    public void actualiza_kb(){
        if( arriba&&yk>10){
            yk-=.2;
        }
        if(abajo&&yk<ALTO-95){
            yk+=.2;
        }
        if(w&&yk2>10){
            yk2-=.2;
        }
        if(s&&yk2<ALTO-95){
            yk2+=.2;
        }   
    }
    
    public void iniciaMouse(){
        addMouseListener(new MouseAdapter(){
            public void mouseCliked(MouseEvent evento){
                xm=evento.getX();
                ym=evento.getY();
                if(evento.isMetaDown ()){
                    titulo="("+xm+","+ym+")"+"Derecho";
                }
                else if(evento.isAltDown ()){
                    titulo="("+xm+","+ym+")"+"Central";
                }
                else{
                    titulo="("+xm+","+ym+")"+"Izquierda";
                }
            }
        });
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent evento){
                xm=evento.getX();
                ym=evento.getY();
            }
            @Override
            public void mouseMoved(MouseEvent evento){
                titulo="Moved";
            }
        });
        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillRect(0,0,ANCHO,ALTO);

        g.setColor(Color.WHITE);
        g.fillRect(5,5,ANCHO-10,10);
        
        g.setColor(Color.WHITE);
        g.fillRect(5,370,ANCHO-10,10);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,10,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,40,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,70,15,15);
        
         g.setColor(Color.WHITE);
        g.fillRect(242,100,15,15);
        
         g.setColor(Color.WHITE);
        g.fillRect(242,130,15,15);
        
         g.setColor(Color.WHITE);
        g.fillRect(242,160,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,190,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,220,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,250,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,280,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,310,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,340,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(242,365,15,15);
        
        g.setColor(Color.WHITE);
        g.fillRect(5,(int)yk2,10,80);
        
        g.setColor(Color.WHITE);
        g.fillRect(495,(int)yk,10,80);
        
        g.setColor(Color.WHITE);
        g.fillRect(10+(int)x,10+(int)y,15,15);
        
        g.setColor(Color.WHITE);
        g.drawString(titulo,120,40);
        
        g.setColor(Color.WHITE);
        g.drawString(titulo2, 390, 40);      
    }

    private void dibuja() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable(){
            @Override
            public void run() {
                paintImmediately(0,0,ANCHO,ALTO);
            }
        });

    }

    private void fisica(float dt) throws InterruptedException{
        x+=vx*dt;
        y+=vy*dt;
        if (x>ANCHO-20 &&y>yk2-10&&y>yk2-20&&y>yk2-30){
            vx = -vx;
        }else if(x>ANCHO-20){

            x=230;
            y=230;
            cont2++;
            titulo=String.valueOf(cont2);
        }
        if (y>350) {
            vy=-vy;
        }
        if(x<=10&&y<=yk&&y<=yk+10&&y<=yk+20&&y<=yk+30){
           vx = -vx;
        }else if(x <=0){
            x=230;
            y=230;
            cont++;
            titulo2=String.valueOf(cont);  
        }
        if (y<=5) {
            vy=-vy;
        }
        actualiza_kb();
    }

    public void cicloPrincipalJuego() throws Exception {
        long tiempoViejo=System.nanoTime();
        while (true){
            long tiempoNuevo=System.nanoTime();
            float dt=(tiempoNuevo-tiempoViejo)/1000000000f;
            tiempoViejo=tiempoNuevo;
            fisica(dt);
            dibuja();
        }
    }
}

