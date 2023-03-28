
package aeropuerto;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class pistaAterrizaje {
    JLabel pista1,pista2,pista3,pista4,pista5,terminal;
    private static final String DEFAULT_GAME_PATH = "/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/AEROPUERTO/IMAGENES/";
    
    public pistaAterrizaje(JFrame ventana){
        //ventana=new JFrame("AEROPUERTO INTERNACIONAL DE AGUASCALIENTES");
        //ventana.setBounds(0,0,1200,700);
        //ventana.setLayout(null);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pista1
        pista1=new JLabel();
        pista1.setBounds(10,10,700,100);
        pista1.setIcon(new ImageIcon(DEFAULT_GAME_PATH+"pista.PNG"));
        ventana.add(pista1);
        //pista2
        pista2=new JLabel();
        pista2.setBounds(10,120,700,100);
        pista2.setIcon(new ImageIcon(DEFAULT_GAME_PATH+"pista.PNG"));
        ventana.add(pista2);
        //pista3
        pista3=new JLabel();
        pista3.setBounds(10,230,700,100);
        pista3.setIcon(new ImageIcon(DEFAULT_GAME_PATH+"pista.PNG"));
        ventana.add(pista3);
        //pista4
        pista4=new JLabel();
        pista4.setBounds(10,340,700,100);
        pista4.setIcon(new ImageIcon(DEFAULT_GAME_PATH+"pista.PNG"));
        ventana.add(pista4);
        //pista5
        pista5=new JLabel();
        pista5.setBounds(10,450,700,100);
        pista5.setIcon(new ImageIcon(DEFAULT_GAME_PATH+"pista.PNG"));
        ventana.add(pista5);
        //terminal
        terminal=new JLabel();
        terminal.setBounds(900,10,300,600);
        terminal.setIcon(new ImageIcon(DEFAULT_GAME_PATH+"terminal.png"));
        ventana.add(terminal);
        //Ser visible 
        ventana.setVisible(true);
        pista1.setVisible(true);
        pista2.setVisible(true);
        pista3.setVisible(true);
        pista4.setVisible(true);
        pista5.setVisible(true);
        terminal.setVisible(true);
    }   
}

