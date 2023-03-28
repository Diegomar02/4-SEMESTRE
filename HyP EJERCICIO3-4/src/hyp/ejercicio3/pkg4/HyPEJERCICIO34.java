
package hyp.ejercicio3.pkg4;

import java.util.Scanner;

public class HyPEJERCICIO34 {

    public static void main(String[] args) {
        int opcion,figura;
        Scanner entrada=new Scanner(System.in);
        bidimensionales Cuadrado,Rectangulo,Triangulo,Pentagono,Circulo,Trapecio;                
        tridimensionales Cilindro,Cono,Piramide,Esfera,Cubo,Prisma;
        System.out.println("Figura: 1.Bidimensional o 2.Tridimensional");
        opcion=entrada.nextByte();
        if(opcion==1){
            System.out.println("1. Cuadrado, 2. Rectagulo, 3. Triangulo, 4. Pentagono, 5. Circulo, 6. Trapecio");
            figura=entrada.nextByte();
            switch(figura){
                case 1:
                    Cuadrado=new Cuadrado();
                    Cuadrado.obtenerArea();
                    break;
                case 2:
                    Rectangulo=new Rectangulo();
                    Rectangulo.obtenerArea();
                    break;
                case 3:
                    Triangulo=new Triangulo();
                    Triangulo.obtenerArea();
                    break;
                case 4:
                    Pentagono=new Pentagono();
                    Pentagono.obtenerArea();
                    break;
                case 5:
                    Circulo=new Circulo();
                    Circulo.obtenerArea();
                    break;
                case 6:
                    Trapecio=new Trapecio();
                    Trapecio.obtenerArea();
                    break;    
            }
        }
        if(opcion==2){
            System.out.println("1. Cilindro, 2. Cono, 3. Piramide, 4. Esfera, 5. Cubo, 6. Prisma");
            figura=entrada.nextByte();
            switch(figura){
                case 1:
                    Cilindro=new Cilindro();
                    Cilindro.obtenerArea();
                    Cilindro.obtenerVolumen();
                    break;
                case 2:
                    Cono=new Cono();
                    Cono.obtenerArea();
                    Cono.obtenerVolumen();
                    break;
                case 3:
                    Piramide=new Piramide();
                    Piramide.obtenerArea();
                    Piramide.obtenerVolumen();
                    break;
                case 4:
                    Esfera=new Esfera();
                    Esfera.obtenerArea();
                    Esfera.obtenerVolumen();
                    break;
                case 5:
                    Cubo=new Cubo();
                    Cubo.obtenerArea();
                    Cubo.obtenerVolumen();
                    break;
                case 6:
                    Prisma=new Prisma();
                    Prisma.obtenerArea();
                    Prisma.obtenerVolumen();
                    break;
            }
        }
    }   
}
