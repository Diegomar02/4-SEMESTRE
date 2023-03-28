
package ig_flowlayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
                
public class VentanaFlowLayout extends Frame{
    private Button btn1,btn2,btn3,btn4;
    public VentanaFlowLayout(){
        super("Ventana usando FlowLayout");
        setLayout(new FlowLayout());
        btn1=new Button("Boton 1");
        add(btn1);
        btn2=new Button("Boton 2");
        add(btn2);
        btn3=new Button("Boton 3");
        add(btn3);
        btn4=new Button("Boton 4");
        add(btn4);
        setSize(300,300);
        setVisible(true);
    }
}
