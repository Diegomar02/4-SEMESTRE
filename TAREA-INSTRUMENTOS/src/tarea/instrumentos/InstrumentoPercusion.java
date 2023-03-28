
package tarea.instrumentos;

public class InstrumentoPercusion implements InstrumentoMusical{
    
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
        return "Instrumento de percusión";
    }
 
}
