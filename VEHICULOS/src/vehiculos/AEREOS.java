
package VEHICULOS;

public class AEREOS extends VEHICULOS {
    
    int num_motores;
    
    public void DESPEJAR(){
        System.out.println("Despejar");

    }
    
    public void ATERRIZAR(){
        System.out.println("Aterriza");
    }
    
    public void TURBULENCIA(){
        System.out.println("Turbulencia");

    }
    
    public AEREOS(int num_motores){
        this.num_motores=num_motores;
    }

    public AEREOS(int num_motores, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(color, matricula, marca, modelo, anio_elab);
        this.num_motores = num_motores;
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
        System.out.println("Desplazar");

    }
    
}
