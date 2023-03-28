
package tarea.polimorfismo.futbol2;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    public SeleccionFutbol(){
    }
    
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
    
    
    public void concentrarse(){
        System.out.println("Concentrarse");
    }
    public void viajar(){
        System.out.println("Viajar");
    }
    public void entrenar(){
        System.out.println("Entrenar");
    }
    public void jugarPartido(){
        System.out.println("Asiste al partido");
    }
    
}
