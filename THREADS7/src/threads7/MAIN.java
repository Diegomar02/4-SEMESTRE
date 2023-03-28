
package threads7;


public class MAIN {

   
    public static void main(String[] args) {
        CUSTOM thread1=new CUSTOM("uno");
        CUSTOM thread2=new CUSTOM("dos");
        try{
            Thread.sleep(1000);
            System.out.println("Supendiendo hilo uno");
            thread1.newSuspend();
            Thread.sleep(1000);
            System.out.println("Resumiento hilo dos");
            thread1.newResume();
        }catch(InterruptedException e){}
        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){}
    }
    
}
