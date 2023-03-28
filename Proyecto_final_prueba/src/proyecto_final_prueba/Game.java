package proyecto_final_prueba;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Game extends JPanel{
    
    private static final String DEFAULT_GAME_PATH = 
            "/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/Proyecto_final_prueba/PROYECTO/";
    
    JFrame ventana_menu,ventana_metodos;
    JLabel chuzzle;
    
    public Game(){
        this.initGame();
        this.setMouseListner();
    }
    
    public void initGame() {
        ventana_menu=new JFrame("Chuzzle");
        ventana_menu.setBounds(0,0,500,400);
        ventana_menu.setLayout(null);
        ventana_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chuzzle = new JLabel(new ImageIcon(DEFAULT_GAME_PATH+"chuzzle.jpeg"));
        chuzzle.setBounds(0,0,500,400);
        ventana_menu.add(chuzzle);
        ventana_menu.setVisible(true);
    }
    
    public void setMouseListner() {
        chuzzle.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                ventana_menu.setVisible(false);
                ventana_metodos=new JFrame("Metodos");
                ventana_metodos.setBounds(0,0,500,800);
                ventana_metodos.setLayout(null);
                ventana_metodos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JLabel metodos=new JLabel(new ImageIcon(DEFAULT_GAME_PATH+"Metodo.jpeg"));
                JLabel sin_limites=new JLabel(new ImageIcon(DEFAULT_GAME_PATH+"inLimite.jpeg"));
                JLabel velocidad=new JLabel(new ImageIcon(DEFAULT_GAME_PATH+"/Velocidad.jpeg"));
                JLabel zen=new JLabel(new ImageIcon(DEFAULT_GAME_PATH+"Zen.jpeg"));
                JLabel patrones=new JLabel(new ImageIcon(DEFAULT_GAME_PATH+"Patrones.jpeg"));
                
                metodos.setBounds(0,0,500,100);
                sin_limites.setBounds(10,10,500,400);
                velocidad.setBounds(10,10,500,700);
                zen.setBounds(10,10,500,1000);
                patrones.setBounds(10,10,500,1300);
                ventana_metodos.add(metodos);
                ventana_metodos.add(sin_limites);
                ventana_metodos.add(velocidad);
                ventana_metodos.add(zen);
                ventana_metodos.add(patrones);
                ventana_metodos.setVisible(true);
                
                sin_limites.addMouseListener(new MouseAdapter(){
                   public void mouseClicked(MouseEvent e){
                       ventana_metodos.setVisible(false);
                       new SinLimite();
                   } 
                });
                velocidad.addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        new Velocidad();
                    }
                });
                zen.addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        new Zen();
                    }
                });
                patrones.addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        new Patrones();
                    }
                });
                
                
            }
        });
    } 
   
    
    public static void main(String[] args){
        new Game();  
    }
    
}
