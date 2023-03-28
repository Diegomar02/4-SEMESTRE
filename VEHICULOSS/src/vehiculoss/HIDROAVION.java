
package vehiculoss;

public class HIDROAVION extends AEREOS implements FLOTADORES{

    public HIDROAVION(int n_motores, String color, String matricula, String marca, String modelo, int anio_elab) {
        super(n_motores, color, matricula, marca, modelo, anio_elab);
    }
    

    
    @Override
    public void FLOTAR() {
        System.out.println("");
        
    }

    @Override
    public void HUNDIR() {
        
    }
    
}
