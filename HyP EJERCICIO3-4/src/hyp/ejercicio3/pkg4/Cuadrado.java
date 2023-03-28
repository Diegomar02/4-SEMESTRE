
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Cuadrado implements bidimensionales{
    @Override
    public void obtenerArea(){
        double valor,area;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cuadrado");
        System.out.println("Valor de los datos = ");
        valor=entrada.nextDouble();
        area=valor+valor+valor+valor;
        System.out.print("El area del cuadrado es "+area);
    }
}
