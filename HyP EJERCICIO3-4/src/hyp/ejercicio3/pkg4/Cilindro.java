
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Cilindro implements tridimensionales{
    double radio,altura,area,volumen;
    @Override
    public void obtenerArea(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cilindro");
        System.out.println("Valor de radio = ");
        radio=entrada.nextDouble();
        System.out.println("Valor de alturar = ");
        altura=entrada.nextDouble();
        area=((2*3.1416)*radio*altura)+((2*3.1416)+radio*radio);
        System.out.print("El area del Cilindro es "+area);
    }
    @Override
    public void obtenerVolumen(){
        volumen=(3.1416*(radio*radio))*altura;
        System.out.println("El volumen del Cilindro es "+volumen);
    }
}
