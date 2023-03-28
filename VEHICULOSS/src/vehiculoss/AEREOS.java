
package vehiculoss;

public class AEREOS extends VEHICULOS {
    
    int n_motores;
    
    public void DESPEJAR(){
        System.out.println("DESPEJAR");
    }
    public void ATERRIZAR(){
        System.out.println("ATERRIZAR");
    }
    public void TURBULENCIA(){
        System.out.println("TURBULENCIA");
    }

    public AEREOS(int n_motores, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(color, matricula, marca, modelo, anio_elab);
        this.n_motores = n_motores;
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
