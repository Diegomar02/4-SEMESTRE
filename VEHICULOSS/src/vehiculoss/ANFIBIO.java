
package vehiculoss;

public class ANFIBIO extends TERRESTRE implements FLOTADORES,BELICOS{

    public ANFIBIO(int numero_llantas, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(numero_llantas, color, matricula, marca, modelo, anio_elab);
    }
    
    @Override
    public void FLOTAR() {
        System.out.println("FLOTAR");
        
    }

    @Override
    public void HUNDIR() {
        System.out.println("HUNDIR");
    }

    @Override
    public void DISPARAR() {
        System.out.println("DISPARAR");
    }

    @Override
    public void RECARGAR() {
        System.out.println("RECARGAR");
    }

    @Override
    public void APUNTAR() {
        System.out.println("APUNTAR");
    }
    
}
