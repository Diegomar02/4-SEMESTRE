
package ig_eventos4;

import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class Ventana4 extends JFrame implements ChangeListener{
    private JCheckBox checkBox1,checkBox2;
    private JLabel label1;
    private JTextField moneda1;
    
    public Ventana4()throws HeadlessException{
        moneda1=new JTextField(20);
        moneda1.setBounds(10,10,150,30);
        add(moneda1);
        checkBox1=new JCheckBox("PESOS A DOLARES");
        checkBox1.setBounds(10,90,150,30);
        checkBox1.addChangeListener(this);
        add(checkBox1);
        checkBox2=new JCheckBox("DOLARES A PESOS");
        checkBox2.setBounds(10,130,150,30);
        checkBox2.addChangeListener(this);
        add(checkBox2);
        label1=new JLabel("VALOR: ninguno");
        label1.setBounds(10,170,250,30);
        add(label1);
        initPantalla();
    }
    private void initPantalla(){
        setLayout(null);
        setTitle("Ejemplo 10");
        setSize(300,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e){
        
        if(checkBox1.isSelected()){
            int valor1=Integer.parseInt(moneda1.getText());
            int total=valor1/21;
            label1.setText(String.valueOf(total));
        }
        if(checkBox2.isSelected()){
            int valor1=Integer.parseInt(moneda1.getText());
            int total=valor1*21;
            label1.setText(String.valueOf(total));
            
        }
        
    }
}
