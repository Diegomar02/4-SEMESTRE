
package VEHICULOS;

/**
 *
 * @author diegomarquezgomez
 */
public class TERRESTRE extends VEHICULOS{
    
    int numero_llantas;
    
    public void DERRAPAR(){
        System.out.println("Todos los vehiculos terrestres derrapan");
    }

    public TERRESTRE(int numero_llantas, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(color, matricula, marca, modelo, anio_elab);
        this.numero_llantas = numero_llantas;
    }

    
        
    @Override
    public void ACELERAR() {
        System.out.println("Todos aceleran");

    }

    @Override
    public void FRENAR() {
        System.out.println("Todos Frenan");
    }

    @Override
    public void DESPLAZAR() {
        System.out.println("Todos desplazan");
    }
    
    
}
