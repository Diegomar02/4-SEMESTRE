
package ig_borderlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
       
public class VentanaBorderLayout extends Frame{
    private Button btnNorte,btnSur,btnEste,btnOeste,btnCentro;
    public VentanaBorderLayout(){
        super("Ventana usando BorderLayout");
        setLayout(new FlowLayout());
        btnNorte=new Button("Buton norte");
        btnSur=new Button("Boton Sur");
        btnEste=new Button("Boton Este");
        btnOeste=new Button("Boton Este");
        btnCentro=new Button("Boton Este");
        add(btnNorte,BorderLayout.NORTH);
        add(btnSur,BorderLayout.SOUTH);
        add(btnEste,BorderLayout.EAST);
        add(btnOeste,BorderLayout.WEST);
        add(btnCentro,BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
    }
}
