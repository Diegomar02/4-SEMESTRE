
package clase_generica6;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CLASE_GENERICA6 {

    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.add("Puerta");
        v.add("Ventana");
        v.add("Silla");
        v.add("Mesa");
        imprimeV(v);
        if(v.contains("Silla")){
            System.out.println("Contiene silla");
        }
        List vl=v.subList(0,2);
        imprimeL(vl);
    }
    public static void imprimeL(List<String>vl){
        String txt;
        Iterator<String>iterator=vl.iterator();
        while(iterator.hasNext()){
            txt=iterator.next();
            System.out.println(txt.toString());
        }
        System.out.println("........");
    }
    public static void imprimeV(Vector<String>v){
        Enumeration<String>en=v.elements();
        String txt;
        while(en.hasMoreElements()){
            txt=en.nextElement();
            System.out.println(txt);
        }
        System.out.println("......");
    }
    
    
    
    
    
    
    
    
    
    
    
}
