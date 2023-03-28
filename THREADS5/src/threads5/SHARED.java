
package threads5;


class SHARED {
    int data=0;
    synchronized void doWork(){
        System.out.println("Escribiendo...");
        try{
            Thread.sleep(2000);
            System.out.println("5...");
            Thread.sleep(2000);
            System.out.println("4...");
            Thread.sleep(2000);
            System.out.println("3...");
            Thread.sleep(2000);
            System.out.println("2...");
            Thread.sleep(2000);
            System.out.println("1...");
        }catch (InterruptedException e){
            System.out.println("Error");
        }
        data=1;
        notify();
    }
    synchronized int getResult(){
        System.out.println("Esperando Escritura...");
        try{
            wait();
            
        }catch (InterruptedException e){
            System.out.println("Escritura lista...");
            
        }
        return data;
    }
    
}
