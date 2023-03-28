
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Pentagono implements bidimensionales{
    @Override
    public void obtenerArea(){
        double lado,apotema,area,perimetro;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Pentagono");
        System.out.println("Valor de los lados = ");
        lado=entrada.nextDouble();
        System.out.println("Valor del apotema = ");
        apotema=entrada.nextDouble();
        perimetro=lado*5;
        area=(perimetro*apotema)/2;
        System.out.print("El area del Pentagono es "+area);
    }
}
