
package pelota;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class GRAFICOS{
    public static void main(String [] args) throws Exception{
        JFrame jf= new JFrame("Juego...");
        jf.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        jf.setResizable(false);
        CLIENZO demo1 = new CLIENZO();
        jf.getContentPane().add(demo1);
        jf.pack();;
        jf.setVisible(true);
        demo1.cicloPrincipalJuego();
    }
}

    
