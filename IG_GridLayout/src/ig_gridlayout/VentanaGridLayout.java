
package ig_gridlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class VentanaGridLayout extends Frame{
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    public VentanaGridLayout(){
        super("Ventana usando BorderLayout");
        setLayout(new GridLayout(3,3));
        btn1=new Button("Button 1");
        btn2=new Button("Button 2");
        btn3=new Button("Button 3");
        btn4=new Button("Button 4");
        btn5=new Button("Button 5");
        btn6=new Button("Button 6");
        btn7=new Button("Button 7");
        btn8=new Button("Button 8");
        btn9=new Button("Button 9");
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        setSize(300,300);
        setVisible(true);
    }
}
