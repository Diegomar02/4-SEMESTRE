
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Esfera implements tridimensionales{
    double radio,area,volumen;
    @Override
    public void obtenerArea(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Esfera");
        System.out.println("Valor de radio = ");
        radio=entrada.nextDouble();
        area=(4*3.1416)*(radio*radio);
        System.out.print("El area del Cilindro es "+area);
    }
    @Override
    public void obtenerVolumen(){
        volumen=(4/3)*3.1416*(radio*radio*radio);
        System.out.println("El volumen del Cilindro es "+volumen);
    }
}
