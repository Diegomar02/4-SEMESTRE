
package vehiculoss;

public class T_MILITAR extends TERRESTRE implements BELICOS{

    public T_MILITAR(int numero_llantas, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(numero_llantas, color, matricula, marca, modelo, anio_elab);
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
