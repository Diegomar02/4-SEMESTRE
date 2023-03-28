
package vehiculoss;


public abstract class VEHICULOS implements TRANSPORTE{
    String color,matricula,marca,modelo;
    int anio_elab;
    
    VEHICULOS(){}
    
    public VEHICULOS(String color,String matricula,String marca,String modelo,int anio_elab){
        this.color=color;
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.anio_elab=anio_elab;
    }
    
    public VEHICULOS(String color,String modelo){
        this.color=color;
        this.modelo=modelo;
        
    }
    
    @Override
    public abstract void ACELERAR();
    @Override
    public abstract void FRENAR();
    @Override
    public abstract void DESPLAZAR();
    
}
