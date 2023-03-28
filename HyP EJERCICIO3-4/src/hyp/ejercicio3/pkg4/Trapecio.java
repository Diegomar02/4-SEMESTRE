
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Trapecio implements bidimensionales{
    @Override
    public void obtenerArea(){
        double baseMayor,baseMenor,altura,area;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Trapecio");
        System.out.println("Valor de la Base Mayor = ");
        baseMayor=entrada.nextDouble();
        System.out.println("Valor de la Base Menor = ");
        baseMenor=entrada.nextDouble();
        System.out.println("Valor de la Altura= ");
        altura=entrada.nextDouble();
        area=((baseMayor*baseMenor)/2)*altura;
        System.out.print("El area del Trapecio es "+area);
    }
}
