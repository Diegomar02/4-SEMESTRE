
package excepcionf;

public class Main {
  
    public static void f1()throws Exception {
        System.out.println("Excepcion originada en f1()");
        throw new Exception("Throw de f1()");       
    }
    public static void f2()throws Throwable{
        try{
            f1();
        }catch(Exception e){
            System.err.println("Dentro de f2(), "+"e.printStackTrace(System.err)");
            e.printStackTrace(System.err);
            throw e;
        }
    }
    public static void main(String[]args){
        try{
            f2();
        }catch(Throwable err){
            System.err.println("Catch de main, "+"err.printStackTrace();");
            err.printStackTrace();
            System.err.println("err.getLocalizedMessage():"+err.getLocalizedMessage());
            System.err.println("err.getMessage():"+err.getMessage()+"...");
            System.err.println("err.toString():"+err.toString()+"..,");
        }
    }
    
}

