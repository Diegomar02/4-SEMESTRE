
package ig_eventos6;

import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Ventana6 extends JFrame implements ItemListener{
    private JComboBox combo1,combo2,combo3,combo4,combo5,combo6;
    private JCheckBox checkBox1,checkBox2,checkBox3;
    private JTextField valor;
    private JLabel label1;
    float numero,resultado;
    
    public Ventana6(){
        checkBox1=new JCheckBox("MONEDA");
        checkBox1.setBounds(10,10,150,20);
        add(checkBox1);
        combo1=new JComboBox();
        combo1.setBounds(10,40,120,20);
        add(combo1);
        combo1.addItem("PESOS");
        combo1.addItem("DOLAR");
        combo1.addItemListener(this);
        combo2=new JComboBox();
        combo2.setBounds(150,40,120,20);
        add(combo2);
        combo2.addItem("PESOS");
        combo2.addItem("DOLAR");
        combo2.addItemListener(this);
        
        checkBox2=new JCheckBox("TEMPERATURA");
        checkBox2.setBounds(10,70,150,30);
        add(checkBox2);
        combo3=new JComboBox();
        combo3.setBounds(10,100,120,20);
        add(combo3);
        combo3.addItem("CELSIUS");
        combo3.addItem("FARENHEIT");
        combo3.addItemListener(this);
        combo4=new JComboBox();
        combo4.setBounds(150,100,120,20);
        add(combo4);
        combo4.addItem("CELSIUS");
        combo4.addItem("FARENHEIT");
        combo4.addItemListener(this);
        
        checkBox3=new JCheckBox("Medicion");
        checkBox3.setBounds(10,130,150,30);
        add(checkBox3);
        combo5=new JComboBox();
        combo5.setBounds(10,160,120,20);
        add(combo5);
        combo5.addItem("METROS");
        combo5.addItem("CENTIMETROS");
        combo5.addItemListener(this);
        combo6=new JComboBox();
        combo6.setBounds(150,160,120,20);
        add(combo6);
        combo6.addItem("METROS");
        combo6.addItem("CENTIMETROS");
        combo6.addItemListener(this);
        
        valor=new JTextField(20);
        valor.setBounds(10,190,120,20);
        add(valor);
        
          
        label1=new JLabel("________________");
        label1.setBounds(10,220,200,30);
        add(label1);
        
        initPantalla();
    }
    private void initPantalla(){
        setLayout(null);
        setTitle("Ejemplo 12");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void stateChanged(ChangeEvent e){
        if(checkBox1.isSelected()){
            combo1.setEnabled(true);
            combo2.setEnabled(true);
        }else{
            combo1.setEnabled(false);
            combo2.setEnabled(false);
        }
        if(checkBox2.isSelected()){
            combo3.setEnabled(true);
            combo4.setEnabled(true);
        }else{
            combo3.setEnabled(false);
            combo4.setEnabled(false);
        }
        if(checkBox3.isSelected()){
            combo5.setEnabled(true);
            combo6.setEnabled(true);
        }else{
            combo5.setEnabled(false);
            combo6.setEnabled(false);
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent e){
        String texto="";
        String opcion1=(String) combo1.getSelectedItem();
        String opcion2=(String) combo2.getSelectedItem();
        String opcion3=(String) combo3.getSelectedItem();
        String opcion4=(String) combo4.getSelectedItem();
        String opcion5=(String) combo5.getSelectedItem();
        String opcion6=(String) combo6.getSelectedItem();
        
        if(checkBox1.isSelected()){
            if(opcion1.equals("PESOS")&&opcion2.equals("PESOS")){
            numero=Float.parseFloat(valor.getText());
            label1.setText("PESOS A PESOS = "+texto+numero+" PESOS");
            }
            if(opcion1.equals("DOLAR")&&opcion2.equals("DOLAR")){
            numero=Float.parseFloat(valor.getText());
            label1.setText("DOLAR A DOLAR = "+texto+numero+" DOLARES");
            }
            if(opcion1.equals("PESOS")&&opcion2.equals("DOLAR")){
            numero=Float.parseFloat(valor.getText());
            resultado=(numero/21);
            label1.setText("PESOS A DOLAR = "+texto+resultado+" DOLARES");
            }
            if(opcion1.equals("DOLAR")&&opcion2.equals("PESOS")){
            numero=Float.parseFloat(valor.getText());
            resultado=(numero*21);
            label1.setText("DOLAR A PESOS = "+texto+resultado+" PESOS");
            }   
        }
        if(checkBox2.isSelected()){
            if(opcion3.equals("CELSIUS")&&opcion4.equals("CELSIUS")){
            numero=Float.parseFloat(valor.getText());
            label1.setText("CELSIUS A CELSIUS = "+texto+numero+" CELSIUS");
            }
            if(opcion3.equals("FARENHEIT")&&opcion4.equals("FARENHEIT")){
            numero=Float.parseFloat(valor.getText());
            label1.setText("FARENHEIT A FARENHEIT = "+texto+numero+" FARENHEIT");
            }
            if(opcion3.equals("CELSIUS")&&opcion4.equals("FARENHEIT")){
            numero=Float.parseFloat(valor.getText());
            resultado=(float)((numero*1.8)+32);
            label1.setText("CELSIUS A FARENHEIT = "+texto+resultado+" FARENHEIT");
            }
            if(opcion3.equals("FARENHEIT")&&opcion4.equals("CELSIUS")){
            numero=Float.parseFloat(valor.getText());
            resultado=(float)((numero-32)/1.8);
            label1.setText("FARENHEIT A CELSIUS = "+texto+resultado+" CELSIUS");
            }
        }
        
        if(checkBox3.isSelected()){
            if(opcion5.equals("METROS")&&opcion6.equals("METROS")){
            numero=Float.parseFloat(valor.getText());
            label1.setText("METROS A METROS = "+texto+numero+" METROS");
            }
            if(opcion5.equals("CENTIMETROS")&&opcion6.equals("CENTIMETROS")){
            numero=Float.parseFloat(valor.getText());
            label1.setText("CENTIMETROS A CENTIMETROS = "+texto+numero+" CENTIMETROS");
            }
            if(opcion5.equals("METROS")&&opcion6.equals("CENTIMETROS")){
            numero=Float.parseFloat(valor.getText());
            resultado=(numero*100);
            label1.setText("METROS A CENTIMETROS = "+texto+resultado+" CENTIMETROS");
            }
            if(opcion5.equals("CENTIMETROS")&&opcion6.equals("METROS")){
            numero=Float.parseFloat(valor.getText());
            resultado=(numero/100);
            label1.setText("CENTIMETROS A METROS = "+texto+resultado+" METROS");
            }
        }
    }
}
