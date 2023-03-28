
package graficos_1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Graficos_1 {

    public static void main(String[] args) {
        JFrame jf=new JFrame("Juego...");
        jf.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
                
            }
        });
        jf.setResizable(false);
        CLienzo demo1=new CLienzo();
        jf.getContentPane().add(demo1);
        jf.pack();
        jf.setResizable(true);
        
    }
    
}
