
package vehiculoss;

public class NAUTICOS extends VEHICULOS{
    
    float ESLARO;
    
    public void HUNDIR(){
        System.out.println("HUNDIR");

    }
    public void NAUFRAGAR(){
        System.out.println("NAUFRAGAR");
    }

    public NAUTICOS(float ESLARO, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(color, matricula, marca, modelo, anio_elab);
        this.ESLARO = ESLARO;
    }
    
    
    @Override
    public void ACELERAR() {
        System.out.println("ACELERAR");
    }

    @Override
    public void FRENAR() {
        System.out.println("FRENAR");
    }

    @Override
    public void DESPLAZAR() {
        System.out.println("DESPLAZAR");
    }
    
}
