
package excepcion5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXCEPCION5_MAIN {
    
    public static int leer(){
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String cadena="";
        try{
            cadena=br . readLine();
            return Integer.parseInt(cadena);
        }catch (IOException e){        
        }
        System.out.println("...");
        return 0;
    }

    public static void main(String[] args) {
        int n=0;
        System.out.println("Deme un numero entre 1 y 20");
        try{
            n=leer();
        }catch(NumberFormatException e){
        }
        int i=1;
        while(i<=n){
            System.out.println("2^"+i+" = "+Math.pow(2,i));
            i++;
        }
        
    }
    
}
