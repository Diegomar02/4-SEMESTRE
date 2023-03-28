
package vehiculoss;


public class A_MILITAR extends AEREOS implements BELICOS{

    public A_MILITAR(int n_motores, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(n_motores, color, matricula, marca, modelo, anio_elab);
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
