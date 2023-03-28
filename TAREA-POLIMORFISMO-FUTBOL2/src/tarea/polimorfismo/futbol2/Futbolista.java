
package tarea.polimorfismo.futbol2;

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
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }
    @Override
    public void concentrarse(){
        System.out.println("Concentrarse");
    }
    @Override
    public void viajar(){
        System.out.println("Viajar");
    }
    @Override
    public void entrenar(){
        System.out.println("Realiza un entrenamiento");
    }
    @Override
    public void jugarPartido(){
        System.out.println("Juega un partido");
    }
}
