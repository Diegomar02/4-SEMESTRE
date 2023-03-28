
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Piramide implements tridimensionales{
    double baseCara,alturaCara,Laterales,Base,area,volumen;
    @Override
    public void obtenerArea(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Piramide");
        System.out.println("Valor de la Base de una cara = ");
        baseCara=entrada.nextDouble();
        System.out.println("Valor de la altura de una cara = ");
        alturaCara=entrada.nextDouble();
        Base=baseCara*baseCara;
        Laterales=(baseCara*alturaCara)/2;
        area=Laterales*4;
        System.out.print("El area del Cilindro es "+area);
    }
    @Override
    public void obtenerVolumen(){
        volumen=(Base*alturaCara)/3;
        System.out.println("El volumen del Piramide es "+volumen);
    }
}
