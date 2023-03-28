
package ejercicio4ex1;

public class APARATOS implements INTERFACE{

    @Override
    public void prendido() {
        System.out.println("Prendido "+nombre());
    }

    @Override
    public void apagado() {
        System.out.println("Apagado "+nombre());
    }
    @Override 
    public void conectado(){
        System.out.println("Conectado "+nombre());
    }
    @Override
    public void desconectado(){
        System.out.println("Desconecta "+nombre());
    }
    

    @Override
    public String nombre() {
        return "Nombre";
    }
    
    
}
