
package tarea.instrumentos;

public class ObjetosSonido implements AdicionalSonido{
    
    @Override
    public void tocarSonido() {
        System.out.println("Tocando "+tipoSonido());
        
    }
    @Override
    public void afinarSonido() {
        System.out.println("Afinando "+tipoSonido());
    }

    @Override
    public String tipoSonido() {
        return "Instrumento de cuerda";
    }
}
