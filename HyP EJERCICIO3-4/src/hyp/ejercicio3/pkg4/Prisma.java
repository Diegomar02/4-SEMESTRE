
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Prisma implements tridimensionales{
    double base,altura,largo,area,volumen;
    @Override
    public void obtenerArea(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cono");
        System.out.println("Valor de Base = ");
        base=entrada.nextDouble();
        System.out.println("Valor de Altura= ");
        altura=entrada.nextDouble();
        System.out.println("Valor de Altura= ");
        altura=entrada.nextDouble();
        System.out.println("Valor de largo= ");
        largo=entrada.nextDouble();
        area=2*(base*altura)/2;
        System.out.print("El area del Cilindro es "+area);
    }
    @Override
    public void obtenerVolumen(){
        volumen=(base*altura)/2*(largo);
        System.out.println("El volumen del Cilindro es "+volumen);
    }
}
