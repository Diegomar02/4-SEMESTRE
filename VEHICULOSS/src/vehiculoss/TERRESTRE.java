
package vehiculoss;

public class TERRESTRE extends VEHICULOS{
    
    int numero_llantas;
    
    public void derrapar(){
        System.out.println("DERRAPA");
    }
    public TERRESTRE(int numero_llantas, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(color, matricula, marca, modelo, anio_elab);
        this.numero_llantas = numero_llantas;
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
