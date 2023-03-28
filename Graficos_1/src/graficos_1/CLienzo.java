
package graficos_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CLienzo extends JComponent{
    private final static int ANCHO=512;
    private final static int ALTO=384;
    private final static int DIAMETRO=20;
    
    public CLienzo(){
        setPreferredSize(new Dimension(ANCHO,ALTO));
        
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0,0,ANCHO,ALTO);
        g.setColor(Color.RED);
        g.fillRect(10,10,ANCHO,ALTO);
        g.setColor(Color.BLACK);
        g.drawString("HOLA", 20, 20);
        g.setColor(new Color(100,0,0,100));
        g.drawRect(30,40,100,200);
        
    }
    
}
