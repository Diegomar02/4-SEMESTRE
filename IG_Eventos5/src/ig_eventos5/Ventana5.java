
package ig_eventos5;

import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana5 extends JFrame implements ChangeListener{
    private JRadioButton radio1,radio2,radio3;
    private ButtonGroup grupoBotones;

    public Ventana5(){
        grupoBotones=new ButtonGroup();
        radio1=new JRadioButton("640*480");
        radio1.setBounds(10,20,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        grupoBotones.add(radio1);
        radio2=new JRadioButton("800*600");
        radio2.setBounds(10,70,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        grupoBotones.add(radio2);
        radio3=new JRadioButton("1024*768");
        radio3.setBounds(10,120,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        grupoBotones.add(radio3);
        initPantalla();
    }
    private void initPantalla(){
        setLayout(null);
        setTitle("Ejemplo 11");
        setSize(350,230);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e){
        if(radio1.isSelected()){
            setSize(640,480);
        }
        if(radio2.isSelected()){
            setSize(800,600);
        }
        if(radio3.isSelected()){
            setSize(1024,768);
        }
        
    }
}
