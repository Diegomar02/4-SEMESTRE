
package tarea.instrumentos;

import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        InstrumentoMusical instrumentoViento;
        InstrumentoMusical instrumentoCuerda;
        InstrumentoMusical instrumentoPercusion;
        ObjetosSonidos objetosSonidos;
        System.out.println("Tipo de instrumento: 1. Viento  2. Viento  3. Percusión  4. Sonidos Adicionales");
        opcion=entrada.nextByte();
        switch(opcion){
            case 1:
                instrumentoViento=new InstrumentoViento();
                System.out.println("\nTipo de instrumento: "+instrumentoViento.tipoInstrumento());
                instrumentoViento.afinarInstrumento();
                instrumentoViento.tocarInstrumento();
                instrumentoViento=new Flauta();
                instrumentoViento.afinarInstrumento();
                instrumentoViento.tocarInstrumento();
                instrumentoViento=new Tuba();
                instrumentoViento.afinarInstrumento();
                instrumentoViento.tocarInstrumento();
                break;
            case 2:
                instrumentoCuerda=new InstrumentoCuerda();
                System.out.println("\nTipo de instrumento: "+instrumentoCuerda.tipoInstrumento());
                instrumentoCuerda.afinarInstrumento();
                instrumentoCuerda.tocarInstrumento();
                instrumentoCuerda=new Guitarra();
                instrumentoCuerda.afinarInstrumento();
                instrumentoCuerda.tocarInstrumento();
                instrumentoCuerda=new Violin();
                instrumentoCuerda.afinarInstrumento();
                instrumentoCuerda.tocarInstrumento();
                break;
            case 3:
                instrumentoPercusion=new InstrumentoPercusion();
                System.out.println("\nTipo de instrumento: "+instrumentoPercusion.tipoInstrumento());
                instrumentoPercusion.afinarInstrumento();
                instrumentoPercusion.tocarInstrumento();
                instrumentoPercusion=new Marimba();
                instrumentoPercusion.afinarInstrumento();
                instrumentoPercusion.tocarInstrumento();
                instrumentoPercusion=new Maracas();
                instrumentoPercusion.afinarInstrumento();
                instrumentoPercusion.tocarInstrumento();
                break;
            case 4:
                objetosSonidos=new ObjetosSonidos();
                System.out.println("\nTipo de instrumento: "+objetosSonidos.tipoSonido());
                objetosSonidos=new Carro();
                objetosSonidos.prendidoSonido();
                objetosSonidos.apagarSonido();
                objetosSonidos=new Alarma();
                objetosSonidos.prendidoSonido();
                objetosSonidos.apagarSonido();
                break;
        }
    }
}
