
package examen_prueba;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
        
        


public class BOTES extends JFrame implements ActionListener{
    JButton boton1,boton2,boton3,boton4,boton5,boton6;
    int nivel1=10,nivel2=20,nivel3=30,contadorBuenas,contadorMalas,total=0,i=0,identificador;
    private String Desechos = "0",Organicos= "0", Vidrio= "0", Plastico= "0",Papel= "0" , Hospitalarios= "0",puntajeErroneo="PUNTUAJE ERRONEO = ",puntajeErroneo1="0",puntajeCorrecto="PUNTAJE CORRECTO = ",puntajeCorrecto1="0",puntajeTotal="0";
    int n;
    JLabel fotos=new JLabel();
    public ImageIcon imagen1=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Desechos.jpeg");
    public ImageIcon imagen2=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Organicos.jpeg");
    public ImageIcon imagen3=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Vidrio.jpeg");
    public ImageIcon imagen4=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Plasticos.jpeg");
    public ImageIcon imagen5=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Papel.jpeg");
    public ImageIcon imagen6=new ImageIcon("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Hospitalarios.jpeg");
    
    
    /*public String[]imagenes={"Desechos3.jpeg","Organica1.jpeg","Organica3.png","Plasticos2.jpeg",
    "Hospitalarios2.jpeg","Papel2.jpeg","Organica6.png","Hospitalarios5.png","Desechos4.jpeg,Hospitalarios1.jpeg"};
    */
    
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
    
    
    
    public void paint(Graphics g){
        fotos.setBounds(450,200,500,500);
        
        g.drawImage(imagen1.getImage(),20,50,this);
        g.drawImage(imagen2.getImage(),212,50,this);
        g.drawImage(imagen3.getImage(),398,50,this);
        g.drawImage(imagen4.getImage(),596,50,this);
        g.drawImage(imagen5.getImage(),785,50,this);
        g.drawImage(imagen6.getImage(),967,50,this); 
        
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
        
        g.drawImage(Nivel1[total],200,200,this);
    } 
    /*private void imagen(Graphics g){
        for(i=0;i<=10;i++){
            g.drawImage(imagenes[i], 200, 200, this);
            switch(i){
                case 0:
                    identificador=1;
                    break;
                case 1:
                    identificador=2;
                    break;
                case 2:
                    identificador=2;
                    break;
                
            
        }
            
        }
        
        
    }*/
    
    public BOTES() throws IOException{
        int a;
        setLayout(null);
        setSize(1150,750);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //fotos.setBounds(450,200,500,500);
        
        /*Timer tiempo=new Timer(5000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<=10;i++){
                    String imagen=imagenes[i];
                    fotos.setIcon(new ImageIcon(imagen));
                }
            }
        });
*/
        
        
  
        boton1=new JButton("1");
        boton1.setBounds(53,380,80,80);
        add(boton1);
        boton1.addActionListener(this);
        setVisible(true);
        
        boton2=new JButton("2");
        boton2.setBounds(245,380,80,80);
        add(boton2);
        boton2.addActionListener(this);
        setVisible(true);
        
        boton3=new JButton("3");
        boton3.setBounds(440,380,80,80);
        add(boton3);
        boton3.addActionListener(this);
        setVisible(true);
        
        boton4=new JButton("4");
        boton4.setBounds(625,380,80,80);
        add(boton4);
        boton4.addActionListener(this);
        setVisible(true);
        
        boton5=new JButton("5");
        boton5.setBounds(815,380,80,80);
        add(boton5);
        boton5.addActionListener(this);
        setVisible(true);
        
        boton6=new JButton("6");
        boton6.setBounds(1005,380,80,80);
        add(boton6);
        boton6.addActionListener(this);
        setVisible(true);
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(Nivel1[0]==boton1){
            //contador - condicion
        }
        if(Nivel1[1]==boton2){
            //contador - condicion
        }
        if(Nivel1[2]==boton2){
            //contador - condicion
        }
        if(Nivel1[3]==boton4){
            //contador - condicion
        }
        if(Nivel1[4]==boton6){
            //contador - condicion
        }
        if(Nivel1[5]==boton5){
            //contador - condicion
        }
        if(Nivel1[6]==boton2){
            //contador - condicion
        }
        if(Nivel1[7]==boton6){
            //contador - condicion
        }
        if(Nivel1[8]==boton1){
            //contador - condicion
        }
        if(Nivel1[9]==boton6){
            //contador - condicion
        }
        
    }
}
 
