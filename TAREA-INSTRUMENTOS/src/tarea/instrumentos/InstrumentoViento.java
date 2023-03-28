
package tarea.instrumentos;

public class InstrumentoViento implements InstrumentoMusical{

    @Override
    public void tocarInstrumento() {
        System.out.println("Tocando "+tipoInstrumento());
        
    }

    @Override
    public void afinarInstrumento() {
        System.out.println("Afinando "+tipoInstrumento());
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
    
   
}
