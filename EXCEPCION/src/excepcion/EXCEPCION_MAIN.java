
package excepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXCEPCION_MAIN {
    public static void main(String[] args) {
        InputStreamReader isr=
                new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String cadena="";
        int n=0;
        System.out.print("Dame un numero entero entre 1 y 20");
        try{
            /*cadena=br.readLine();
            n=Integer.parseInt(cadena);
            }catch(IOException e){
            System.out.println("Error...");
            }catch(NumberFormatException en){
            System.out.println("Error..."+en.getMessage);
            }
                 */   
            cadena=br.readLine();
            n=Integer.parseInt(cadena);
        }catch(Exception e){
            if(e instanceof IOException){
                System.out.println("Error...");
            }else if(e instanceof NumberFormatException)
                System.out.println("Error: "+e.getMessage());
        }
        int i=1;
        while(i<=n){
            System.out.println("2^"+i+"="+Math.pow(2,i));
            i++;
        }
    } 
}
