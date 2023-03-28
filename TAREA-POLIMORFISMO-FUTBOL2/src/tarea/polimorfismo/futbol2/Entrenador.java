
package tarea.polimorfismo.futbol2;

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
    public void entrenar(){
        System.out.println("Dirige una entrenamiento");
    }
    @Override
    public void jugarPartido(){
        System.out.println("Dirige una partido");
    }
    public void planificarEntrenamiento(){
        System.out.println("Planificar un entreamiento");
    }
}
