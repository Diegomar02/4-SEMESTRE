
package aeropuerto;

import javax.swing.JFrame;



public class torreDeControl {
    
    public static void main(String[] args){
        JFrame pista=new JFrame("Pista");
        pista.setBounds(0,0,1200,700);
        pista.setLayout(null);
        pista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new pistaAterrizaje(pista);
        pista.repaint();
        new aviones(pista);//generar aviones y movimiento
        
        
    }
    
}
