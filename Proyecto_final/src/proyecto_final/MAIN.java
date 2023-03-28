
package proyecto_final;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.Scanner;


public class MAIN extends NIVEL1 {
    int opcion;
    public MAIN(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Presione 1 para comenzar: ");
        opcion=entrada.nextInt();
        if(opcion==1){
            NIVEL1();
        }
    }

    public static void main(String[] args){
        new MAIN();
        
    }
}
