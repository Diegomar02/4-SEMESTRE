
package ig_eventos;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{
    JButton boton1;
    JLabel imagen1;
    public Ventana() throws IOException{
        
        
        /*
        File file = new File("C:\\Users\\User1\\Pictures\\Camera Roll\\java.png");
        BufferedImage bufferedImage = ImageIO.read(file);
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 500);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);
*/

        
        
        
        
        
        
        
        
        
        setLayout(null);
        setSize(1150,750);
        //No redimensionable 
        setResizable(false);
        //Cerrar proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Boton
        boton1=new JButton("FInalizar");
        boton1.setBounds(100,500,100,30);
        imagen1=new JLabel("/Users/diegomarquezgomez/Desktop/UAA/4 SEMESTRE /PROGRAMACIÓN III/EXAMEN 2º/ELEMENTOS/Desechos.jpeg");
        imagen1.setBounds(100,100,100,30);
        add(boton1);
        add(imagen1);
        boton1.addActionListener(this);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            System.exit(0);
        }
    }
    
}
