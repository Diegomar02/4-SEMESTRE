
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Triangulo implements bidimensionales{
    @Override
    public void obtenerArea(){
        double base,altura,area;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Tringulo");
        System.out.println("Valor de Base = ");
        base=entrada.nextDouble();
        System.out.println("Valor de Altura = ");
        altura=entrada.nextDouble();
        area=base*altura/2;
        System.out.print("El area del Triangulo es "+area);
    }
}
