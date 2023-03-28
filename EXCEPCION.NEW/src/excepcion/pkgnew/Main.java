
package excepcion.pkgnew;

public class EXCEPCIONNEW extends Exception{
    String mensaje;
    public EXCEPCIONNEW(String causa){
        mensaje=causa;
    }
    @Override
    public String getMessage(){
        return mensaje;
    }
}

