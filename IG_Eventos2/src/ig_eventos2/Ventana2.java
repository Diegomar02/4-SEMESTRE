
package ig_eventos2;

import java.awt.event.*;
import javax.swing.*;

public class Ventana2 extends JFrame implements ActionListener{
    private JButton boton1,boton2,boton3;
    public Ventana2(){
        setLayout(null);
        //Tamaño de la ventana
        setBounds(0,0,350,200);
        //Titulo
        setTitle("Ejemplo 2: Botones");
        //No redimensionable
        setResizable(false);
        //Cerrar proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Botones
        boton1=new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
        //muestro JFrame (Lo ultimo para que lo pinte todo correcto)
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            setTitle("boton 1");
        }
        if(e.getSource()==boton2){
            setTitle("boton 2");
        }
        if(e.getSource()==boton3){
            setTitle("boton 3");
        }
    }
}
