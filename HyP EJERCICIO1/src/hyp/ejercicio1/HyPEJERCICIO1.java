
package hyp.ejercicio1;

import java.util.Scanner;

public class HyPEJERCICIO1 {

    public static void main(String[] args) {
       int opcion,deporte;
       Scanner entrada=new Scanner(System.in);
       boxeador_ BOXEADOR;
       judo_ JUDO;
       taekwondo_ TAEKWONDO;
       kickboxing_ KICKBOXING;
       futbol_ FUTBOL;
       basketball_ BASKETBALL;
       tenis_ TENIS;
       voleyball_ VOLEYBALL;
       System.out.println("De que deporte? 1. CONTACTO o 2. DE BALON");
       opcion=entrada.nextByte();
       if(opcion==1){
           System.out.println("1. BOXEADOR, 2. JUDO, 3. TAEKWONDO o 4. KICKBOXING");
           deporte=entrada.nextByte();
           switch(deporte){
               case 1:
                   BOXEADOR=new BOXEADOR();
                   System.out.println("\nUn practicante box puede o debe:");
                   BOXEADOR.boxear();
                   BOXEADOR.saltarCuerda();
                   BOXEADOR.correr();
                   BOXEADOR.ejercitarAbdomen();
                   BOXEADOR.ejercitarBrazo();
                   BOXEADOR.cantidadGolpes();
               case 2:
                   JUDO=new JUDO();
                   System.out.println("\nUn practicante box puede o debe:");
                   JUDO.derrives();
                   JUDO.palancas();
                   JUDO.estrangulaciones();
                   JUDO.correr();
                   JUDO.ejercitarAbdomen();
                   JUDO.ejercitarBrazo();
               case 3:
                   TAEKWONDO=new TAEKWONDO();
                   System.out.println("\nUn practicante taekwondo puede o debe:");
                   TAEKWONDO.patadasEmpeine();
                   TAEKWONDO.darGolpes();
                   TAEKWONDO.bloquearGolpe();
                   TAEKWONDO.bloquearBrazo();
               case 4:
                   KICKBOXING=new KICKBOXING();
                    System.out.println("\nUn practicante kickboxing puede o debe:");
                    KICKBOXING.darPatadas();
                    KICKBOXING.boxear();
                    KICKBOXING.correr();
                    KICKBOXING.ejercitarAbdomen();
                    KICKBOXING.ejercitarPiernas();
                    KICKBOXING.ejercitarBrazos();
            }
        }
        if(opcion==2){
            System.out.println("1. FUTBOL, 2. BASKETBALL, 3. TENIS o 4. VOLEYBALL");
            deporte=entrada.nextByte();
            switch(deporte){
                case 1:
                    FUTBOL=new FUTBOL();
                    System.out.println("\nUn practicante futbol puede o debe:");
                    FUTBOL.patearBalon();
                    FUTBOL.golpearBalon();
                    FUTBOL.correr();
                    FUTBOL.ejercitarPierna();
                    break;
                case 2:
                    BASKETBALL=new BASKETBALL();
                    System.out.println("\nUn practicante basketball puede o debe:");
                    BASKETBALL.botarBalon();
                    BASKETBALL.lanzarBalon();
                    BASKETBALL.correr();
                    BASKETBALL.saltarAlto();
                    BASKETBALL.ejercitarBrazo();
                    break;
                case 3:
                    TENIS=new TENIS();
                    System.out.println("\nUn practicante tenis puede o debe:");
                    TENIS.correr();
                    TENIS.golpearPelota();
                    TENIS.saquePelota();
                    TENIS.ejercitarBrazo();
                    break;
                case 4:
                    VOLEYBALL=new VOLEYBALL();
                    System.out.println("\nUn practicante voleyball puede o debe:");
                    VOLEYBALL.golpearBalon();
                    VOLEYBALL.correr();
                    VOLEYBALL.saltar();
                    break;
            }
        }
    }
}
