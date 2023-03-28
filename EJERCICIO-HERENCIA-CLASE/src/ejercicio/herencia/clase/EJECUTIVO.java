
package ejercicio.herencia.clase;

public class EJECUTIVO extends EMPLEADO{
    int presupuesto;
    EJECUTIVO(){
        super();
    }
    EJECUTIVO(String n,int s){
        super(n,s);
    }    
    void asignarPresupuesto(int p){
        presupuesto=p;
    }
    public String toString(){
        String s=super.toString();
        s=s+"Presupuesto: "+presupuesto;
        return s;
    }
}
