
package tarea.polimorfirmos.futbol1;

public abstract class SeleccionFutbol {
    
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    public SeleccionFutbol(int id,String nombre,String apellidos,int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public void viajar(){
        System.out.println("Viajar");
    }
    public void concentrarse(){
        System.out.println("Concentrarse");
    }
    public abstract void entrenamiento();
    
    public void partidoFutbol(){
        System.out.println("Asiste al Partido de futbol");
    }
}