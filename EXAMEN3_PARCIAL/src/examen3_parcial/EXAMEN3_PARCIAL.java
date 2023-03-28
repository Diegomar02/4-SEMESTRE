
package examen3_parcial;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class EXAMEN3_PARCIAL extends JFrame{
    private JPanel Panel;
    private JTextField texto1,texto2;
    private JFileChooser seleccion=new JFileChooser();
    private String host="localhost";
    private String IP="3306";
    private String usuario="root";
    private String contraseña="2451192002";
    private String BasedeDatos="Examen3_final";
    private String formato="custom";
    Process proceso;
    ProcessBuilder contructorProceso;
    

    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable(){
           public void run(){
               try{
                   EXAMEN3_PARCIAL frame=new EXAMEN3_PARCIAL();
                   frame.setVisible(true);
                   
               }catch(Exception e){
                   e.printStackTrace();
               }
           }
           
       });
    }
    


    
}
