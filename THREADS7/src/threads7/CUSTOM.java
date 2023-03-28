
package threads7;

class CUSTOM extends Thread{
    volatile boolean goFlag=true;
    CUSTOM(String name){
        super(name);
        start();
    }
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+"aqui...");
                Thread.sleep(500);
                synchronized(this){
                    while(!goFlag){
                        wait();
                    }
                }
            }
        }catch(InterruptedException e){
            
        }
    }
    public void newSuspend(){
        goFlag=false;
    }
    synchronized public void newResume(){
        goFlag=true;
        notify();
    }
}
