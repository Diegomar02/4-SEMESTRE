
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class Cono implements tridimensionales{
    double radio,generatriz,altura,Base,Curva,area,volumen;
    @Override
    public void obtenerArea(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cono");
        System.out.println("Valor de radio = ");
        radio=entrada.nextDouble();
        System.out.println("Valor de generatriz= ");
        generatriz=entrada.nextDouble();
        System.out.println("Valor de Altura= ");
        altura=entrada.nextDouble();
        Base=3.1416*(radio*radio);
        Curva=3.1416*radio*generatriz;
        area=Base+Curva;
        System.out.print("El area del Cono es "+area);
    }
    @Override
    public void obtenerVolumen(){
        volumen=3.1416*(radio*radio)*altura;
        System.out.println("El volumen del Cono es "+volumen);
    }
}