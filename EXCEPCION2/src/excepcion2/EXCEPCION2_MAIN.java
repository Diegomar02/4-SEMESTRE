
package excepcion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXCEPCION2_MAIN {
    
    public static int leer()throws Exception{
        InputStreamReader isr=
                new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String cadena="";
        int n=0;
        try{
            cadena=br. readLine();
            n=Integer.parseInt(cadena);
        }
        catch(IOException e){
         
        }
        catch(NumberFormatException e){
            System.out.println("(1)¿Tecleo solo enter?");
            throw new Exception("Error...");
            
        }
        return n;
    }

    public static void main(String[] args) {
        int n=0;
        System.out.println("Deme un numero entre 1 y 20");
        try{
            n=leer();
        }catch(Exception e){
            System.out.println("(2)Tecleó una letra o un numero real?");
            System.out.println(""+e);
        }
        int i=1;
        while(i<=n){
            System.out.println("2^"+i+" = "+Math.pow(2,i));
            i++;
        } 
    }
}
