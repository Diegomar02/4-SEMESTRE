
package vehiculoss;


public class N_MILITAR extends NAUTICOS implements BELICOS{

    public N_MILITAR(float ESLARO, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(ESLARO, color, matricula, marca, modelo, anio_elab);
    }
    
    @Override
    public void DISPARAR() {
        System.out.println("Disparar");
    }

    @Override
    public void RECARGAR() {
        System.out.println("Recargar");
    }

    @Override
    public void APUNTAR() {
        System.out.println("Apuntar");
    }
    
}
