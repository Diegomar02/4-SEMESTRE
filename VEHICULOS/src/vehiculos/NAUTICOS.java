
package VEHICULOS;

public class NAUTICOS extends VEHICULOS{
    
    float ESLORA;
    
    public void HUNDIR(){
        System.out.println("HUNDIR");
    }
    public void NAUFRAGAR(){
        System.out.println("NAUFRAGAAR");
    }
    public void ARRASTRE(){
        System.out.println("Arrastre");
    }

    public NAUTICOS(float ESLORA, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(color, matricula, marca, modelo, anio_elab);
        this.ESLORA = ESLORA;
    }
    
    @Override
    public void ACELERAR() {
        System.out.println("Acelerar");
    }

    @Override
    public void FRENAR() {
        System.out.println("Frenar");
    }

    @Override
    public void DESPLAZAR() {
        System.out.println("Desplzar");
    }
    
}
