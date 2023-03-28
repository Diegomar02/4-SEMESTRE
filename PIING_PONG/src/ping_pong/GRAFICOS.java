
package ping_pong;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class GRAFICOS {
    public static void main(String [] args) throws Exception{
        JFrame jf=new JFrame("Ping pong");
        jf.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        jf.setResizable(false);
        PING_PONG demo1=new PING_PONG();
        jf.getContentPane().add(demo1);
        jf.pack();
        jf.setVisible(true);
        demo1.cicloPrincipalJuego();
    }
}

