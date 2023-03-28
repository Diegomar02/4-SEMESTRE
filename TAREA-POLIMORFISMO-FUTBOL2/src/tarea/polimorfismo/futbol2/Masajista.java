
package tarea.polimorfismo.futbol2;

public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;
    
    public Masajista(int id,String nombre,String apellidos,int edad,String titulacion,int aniosExperiencia){
        super(id,nombre,apellidos,edad);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }
    public String getTitulacion(){
        return titulacion;
    }
    public int getExperiencia(){
        return aniosExperiencia;
    }
    
    @Override
    public void entrenar(){
        System.out.println("Da asistencia en el entrenamiento");
    }
    public void darMasaje(){
        System.out.println("Da un masaje");
    }
    
    
}
