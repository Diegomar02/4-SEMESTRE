
package threads5;

class CUSTOM extends Thread{
    SHARED shared;
    public CUSTOM(SHARED shared,String string){
        super(string);
        this.shared=shared;
        start();
    }
    public void run(){
        System.out.println("Quiero leer...");
        System.out.println("Lectura lista, el resultado es "+shared.getResult());
    }
    
}
