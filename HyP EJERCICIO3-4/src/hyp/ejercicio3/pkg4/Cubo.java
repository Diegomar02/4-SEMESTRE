
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Cubo implements tridimensionales{
    double lado,area,volumen;
    @Override
    public void obtenerArea(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cono");
        System.out.println("Valor de un lado = ");
        lado=entrada.nextDouble();
        area=6*(lado*lado);
    }
    @Override
    public void obtenerVolumen(){
        volumen=(lado*lado*lado);
        System.out.println("El volumen del Cilindro es "+volumen);
    }
}
