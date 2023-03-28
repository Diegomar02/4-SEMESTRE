
package excepcion4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXCEPCION4_MAIN {
    
    public static int leer() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String cadena="";
        try{
            cadena=br.readLine();
            return Integer.parseInt(cadena);
        }catch (IOException e){
            
        }catch(NumberFormatException e){   
        }
         System.out.println("Entro a finally");
        return 0;
        
    }

    public static void main(String[] args) throws IOException {
        int n=0;
        System.out.println("Deme un numero entre 1 y 20");
        n=leer();
        int i=1;
        while(i<=n){
            System.out.println("2^"+i+" = "+Math.pow(2,i));
            i++;
        }
        
    }
    
}
