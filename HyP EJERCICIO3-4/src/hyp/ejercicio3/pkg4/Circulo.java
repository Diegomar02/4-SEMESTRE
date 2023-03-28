
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Circulo implements bidimensionales{
    @Override
    public void obtenerArea(){
        double radio,area;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Circulo");
        System.out.println("Valor del radio = ");
        radio=entrada.nextDouble();
        area=3.1416*(radio*radio);
        System.out.print("El area del Circulo es "+area);
    }
}
