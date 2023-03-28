
package tarea.polimorfirmos.futbol1;

public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(int id,String nombre,String apellidos,int edad,int dorsal,String demarcacion){
        super(id,nombre,apellidos,edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }
    public int getDorsal(){
        return dorsal;
    }
    public String getDemarcacion(){
        return demarcacion;
    }
    @Override
    public void entrenamiento(){
        System.out.println("Realiza un entrenamiento");
    }
    @Override
    public void partidoFutbol(){
        System.out.println("Juega un partido");
    }
    public void entrevista(){
        System.out.println("Da una entrevista");
        
    }
    
}
