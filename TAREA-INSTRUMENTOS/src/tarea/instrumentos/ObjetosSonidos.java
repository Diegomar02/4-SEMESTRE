
package tarea.instrumentos;


public class ObjetosSonidos implements AdicionalSonido{
    
    @Override
    public void prendidoSonido() {
        System.out.println("Prendido: "+tipoSonido());
        
    }
    @Override
    public void apagarSonido() {
        System.out.println("Apagar: "+tipoSonido());
    }

    @Override
    public String tipoSonido() {
        return "Objetos de sonido";
    }
}
