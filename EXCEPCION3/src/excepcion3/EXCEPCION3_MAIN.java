
package excepcion3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EXCEPCION3_MAIN {

    public static int leer()throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String cadena="";
        try{
            cadena=br. readLine();
            return Integer.parseInt(cadena);
        }
        finally{
            System.out.println("Entro a finally");
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        int n=0;
        System.out.println("Deme un numero entre 1 y 20");
        try{
            n=leer();
        }catch(NumberFormatException e){
            System.out.println("(2)Tecleó una letra o un numero real?");
            System.out.println(""+e.getMessage());
        }
        int i=1;
        while(i<=n){
            System.out.println("2^"+i+" = "+Math.pow(2,i));
            i++;
        } 
    }
    
}
