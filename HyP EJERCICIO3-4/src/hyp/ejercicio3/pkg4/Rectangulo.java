
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Rectangulo implements bidimensionales{
    @Override
    public void obtenerArea(){
        double base,altura,area;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Rectangulo");
        System.out.println("Valor de Base = ");
        base=entrada.nextDouble();
        System.out.println("Valor de altura = ");
        altura=entrada.nextDouble();
        area=base*altura;
        System.out.print("El area del Rectangulo es "+area);
    }
}
