
package EJERCICIO3EX1;

public class CElectrodomesticos {
    
    int estado1,estado2;
    String nombre,familia;
    double ancho,largo,alto;
    
    public CElectrodomesticos(int estado1,int estado2,String nombre,double ancho,double largo,double alto){
        this.estado1=estado1;
        this.estado2=estado2;
        this.nombre=nombre;
        this.ancho=ancho;
        this.largo=largo;
        this.alto=alto;
    }

    
    public void encender(){
        if (estado1==1){
            System.out.printf(nombre+" encendido");
        }
    }
    public void apagar(){
        if(estado1==2){
            System.out.printf(nombre+" apagado");
        }
    }
    public void conectado(){
        if(estado2==1){
            System.out.printf(nombre+" conectado");
        }
    }
    public void desconectado(){
        if(estado2==2){
            System.out.printf(nombre+" desconectado");
        }
        
    }
    
    public String getFamilia(){
        return familia;
    }
    public void setFamilia(String familia){
        this.familia=familia;
    }
    
}
