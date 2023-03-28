package examen_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BOTES extends JComponent{
    
    private final static int ANCHO=1150;
    private final static int ALTO=750;
    private float xk=505,yk=490;
    public float x=500,y=500;
    public float cx=167,cy=371;
    public float cxB=1130,cyB=50;
    public float ix=10, iy=40;
    public float ix2=200,iy2=40;
    public float ix3=390,iy3=40;
    public float ix4=580,iy4=40;
    public float ix5=770,iy5=40;
    public float ix6=960,iy6=40;
    public float ix7=10,iy7=690;
    private int xm=0,ym=0;
    public boolean arriba,abajo,izquierda,derecha;
    
     private String Desechos = "0",Organicos= "0", Vidrio= "0", Plastico= "0",Papel= "0" , Hospitalarios= "0",puntajeErroneo="PUNTUAJE ERRONEO = ",puntajeErroneo1="0",puntajeCorrecto="PUNTAJE CORRECTO = ",puntajeCorrecto1="0",puntajeTotal="0";
      
     int contador,contador2,contador3,contador4,contador5,contador6,contadorTotal,id,i=0;
    boolean band;
    

    public ImageIcon img=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Desechos.jpeg");
    public ImageIcon img2=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Organicos.jpeg");
    public ImageIcon img3=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Vidrio.jpeg");
    public ImageIcon img4=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Plasticos.jpeg");
    public ImageIcon img5=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Papel.jpeg");
    public ImageIcon img6=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Hospitalarios.jpeg");
    
    
    ImageIcon Nivel1[] = {
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Desechos3.jpeg"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Organica1.jpeg"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Organica3.png"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Plasticos2.jpeg"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Hospitalarios2.jpeg"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Papel2.jpeg"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Organica6.png"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Hospitalarios5.png"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Desechos4.jpeg"),
        new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Hospitalarios1.jpeg"),

    };

    BOTES(){
        setPreferredSize(new Dimension(ANCHO, ALTO));
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
                    arriba = pressed;
                    break;
                case KeyEvent.VK_DOWN:
                    abajo = pressed;
                    break;
                    
                case KeyEvent.VK_LEFT:
                    izquierda = pressed;
                    break;
                    
                case KeyEvent.VK_RIGHT:
                    derecha = pressed;
                    break;
                
                 }
            }        
        });
    }
    
    public void actualiza_kb(){
        if( arriba && yk >0){
            yk -= .10;
        }
        
        if(abajo && yk<590){
            yk += .10;
        }
        
        if(izquierda && xk > 0){
            xk -= .10;
        }
        
        if(derecha && xk <1020){
            xk += .10;
        }
        
    }
    
    public void iniciaMouse() {
        addMouseListener(new MouseAdapter() {
        public void mouseCliked(MouseEvent evento){
            xm  = evento.getX();
            ym  = evento.getY();
        }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent evento) {
                xm = evento.getX();
                ym = evento.getY();
      
            }

            @Override
            public void mouseMoved(MouseEvent evento) {
            
            }
        });

        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, ANCHO, ALTO);
        
        g.setColor(Color.GRAY);
        g.fillRect((int)ix,(int)iy , (int)cx, (int)cy);
        g.setColor(Color.BLACK);
        g.drawImage(img.getImage(),20,50, this);
        
        g.setColor(Color.ORANGE);
        g.fillRect((int)ix2,(int)iy2  , (int)cx, (int)cy);
        g.setColor(Color.BLACK);
        g.drawImage(img2.getImage(),212,50, this);
        
        g.setColor(Color.GREEN);
        g.fillRect((int)ix3,(int)iy3  , (int)cx+5, (int)cy);
        g.setColor(Color.BLACK);
        g.drawImage(img3.getImage(),398,50, this);
        
        g.setColor(Color.YELLOW);
        g.fillRect((int)ix4,(int)iy4 , (int)cx, (int)cy);
        g.setColor(Color.BLACK);
        g.drawImage(img4.getImage(),596,50, this);
        
        g.setColor(Color.BLUE);
        g.fillRect((int)ix5,(int)iy5 , (int)cx, (int)cy);
        g.setColor(Color.BLACK);
        g.drawImage(img5.getImage(),785,50, this);
       
        g.setColor(Color.RED);
        g.fillRect((int)ix6,(int)iy6  , (int)cx, (int)cy);
        g.setColor(Color.BLACK);
        g.drawImage(img6.getImage(),967,50, this);
    
        g.setColor(Color.WHITE);
        g.fillRect((int)ix7,(int)iy7, (int)cxB, (int)cyB);
        g.setColor(Color.RED);

        
        g.setColor(Color.WHITE);
        g.drawString(Desechos, 90, 30);
        
        g.setColor(Color.WHITE);
        g.drawString(Organicos, 280, 30);
        
        g.setColor(Color.WHITE);
        g.drawString(Vidrio, 476, 30);
        
        g.setColor(Color.WHITE);
        g.drawString(Plastico, 660, 30);
        
        g.setColor(Color.WHITE);
        g.drawString(Papel, 850, 30);
        
        g.setColor(Color.WHITE);
        g.drawString(Hospitalarios, 1040, 30);
        
        g.setColor(Color.BLACK);
        g.drawString(puntajeCorrecto, 200, 720);
        
        g.setColor(Color.BLACK);
        g.drawString(puntajeCorrecto1, 350, 720);
        
        g.setColor(Color.BLACK);
        g.drawString(puntajeErroneo, 750, 720);
        
        g.setColor(Color.BLACK);
        g.drawString(puntajeErroneo1, 900, 720);
        
        g.setColor(Color.CYAN);
        g.drawOval(1000, 500, 10, 10);
        
        imagen(g);
 
        
        
       
       
    }
    
    private void imagen(Graphics g){ 
        g.drawImage(Nivel1[i].getImage(),(int)xk,(int)yk, this);
        switch(i){
            case 0:
                id=1;
                break;
                case 1:
                id=1;
                break;
                case 2:
                id=1;
                break;
                case 3:
                id=1;
                break;
                case 4:
                id=1;
                break;
                case 5:
                id=1;
                break;
                case 6:
                id=1;
                break;
                case 7:
                id=1;
                break;
                case 8:
                id=1;
                break;
                case 9:
                id=1;
                break;
        }
        
    }
    

    
    private void valida(){
        int validar=1,validar2=2,validar3=3,validar4=4,validar5=5,validar6=6;
        if( validar== id){
         if((ix <= xk && ix+130 >=xk)  && (iy <= yk && iy+95 >=yk)){
            contador++;
            
            Desechos = String.valueOf(contador); 
            contadorTotal++;
            
            puntajeTotal= String.valueOf(contadorTotal); 
             
            xk=400;
            yk=400;
        }
    }else{
            if((ix <= xk && ix+130 >=xk)  && (iy <= yk && iy+95 >=yk)){
            contadorTotal--;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            xk=400;
            yk=400;
        } 
        }
        
        if( validar2== id){
         if((ix2 <= xk && ix2+130 >=xk)  && (iy2 <= yk && iy2+95 >=yk)){
            contador2++;
            
          
            contadorTotal++;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            Organicos = String.valueOf(contador2); 
            xk=400;
            yk=400;
        }
    }else{
            if((ix2 <= xk && ix2+130 >=xk)  && (iy2 <= yk && iy2+95 >=yk)){
            contadorTotal--;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            xk=400;
            yk=400;
        } 
        }
        
        if( validar3== id){
         if((ix3 <= xk && ix3+130 >=xk)  && (iy3 <= yk && iy3+95 >=yk)){
            contador3++;
            contadorTotal++;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            Vidrio = String.valueOf(contador3); 
            xk=400;
            yk=400;
        }
    }else{
            if((ix3 <= xk && ix3+130 >=xk)  && (iy3 <= yk && iy3+95 >=yk)){
            contadorTotal--;
            
            puntajeTotal=String.valueOf(contadorTotal); 
            xk=400;
            yk=400;
        } 
        }
        
        if( validar4== id){
         if((ix4 <= xk && ix4+130 >=xk)  && (iy4 <= yk && iy4+95 >=yk)){
            contador4++;
            contadorTotal++;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            Plastico = String.valueOf(contador4); 
            xk=400;
            yk=400;
        }
    }else{
            if((ix4 <= xk && ix4+130 >=xk)  && (iy4 <= yk && iy4+95 >=yk)){
            contadorTotal--;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            xk=400;
            yk=400;
        } 
        }
        
        if( validar5== id){
         if((ix5 <= xk && ix5+130 >=xk)  && (iy5 <= yk && iy5+95 >=yk)){
            contador5++;
            contadorTotal++;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            Papel = String.valueOf(contador5); 
            xk=400;
            yk=400;
        }
    }else{
            if((ix5 <= xk && ix5+130 >=xk)  && (iy5 <= yk && iy5+95 >=yk)){
            contadorTotal--;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            xk=400;
            yk=400;
        } 
        }
        
        if( validar6== id){
         if((ix6 <= xk && ix6+130 >=xk)  && (iy6 <= yk && iy6+95 >=yk)){
            contador6++;
            contadorTotal++;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            Hospitalarios=String.valueOf(contador6); 
            xk=400;
            yk=400;
        }
    }else{
            if((ix6 <= xk && ix6+130 >=xk)  && (iy6 <= yk && iy6+95 >=yk)){
            contadorTotal--;
            
            puntajeTotal = String.valueOf(contadorTotal); 
            xk=400;
            yk=400;
        } 
        }
    }
    
    private void fisica1() throws InterruptedException {
     
       valida();
       actualiza_kb();

    }
    
     private void dibuja()throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                paintImmediately(0, 0, ANCHO, ALTO);
            }
        });

    }

    
    
    public void cicloPrincipalJuego() throws Exception {
        long tiempoViejo = System.nanoTime();
        while (true) {
            long tiempoNuevo = System.nanoTime();
            float dt = (tiempoNuevo - tiempoViejo) / 1000000000f;
            tiempoViejo = tiempoNuevo;
            fisica1();
            dibuja();
            
        }
    }
    
}

    

