
package tarea.polimorfirmos.futbol1;

public class Entrenador extends SeleccionFutbol{
    private int idFederacion;
    public Entrenador(int id,String nombre,String apellidos,int edad,int idFederacion){
        super(id,nombre,apellidos,edad);
        this.idFederacion=idFederacion;
    }
    public int getIdFederacion(){
        return idFederacion;
    }
    @Override
    public void entrenamiento(){
        System.out.println("Dirige un entrenamiento");
    }
    @Override
    public void partidoFutbol(){
        System.out.println("Dirige un partido");
    }
    public void planificarEntrenamiento(){
        System.out.println("Planifica un entrenamiento");
        
    }
    
}
