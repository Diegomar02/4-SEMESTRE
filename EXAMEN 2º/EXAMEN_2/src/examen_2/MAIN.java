
package examen_2;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class MAIN {
    public static void main(String[] args)throws Exception{
        JFrame jf= new JFrame("RECICLAJE ");
        jf.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        jf.setResizable(false);
        BOTES demo1=new BOTES();
        jf.getContentPane().add(demo1);
        jf.pack();
        jf.setVisible(true);
        demo1.cicloPrincipalJuego();
    }
}

