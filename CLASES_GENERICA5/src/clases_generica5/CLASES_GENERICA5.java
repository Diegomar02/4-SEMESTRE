
package clases_generica5;

import java.util.ArrayList;
import java.util.ListIterator;
import static java.util.Spliterators.iterator;


public class CLASES_GENERICA5 {

    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();
        array.add("Triangulo");
        array.add("cuadrado");
        array.add("pentagono");
        array.add("hexagono");
        
        System.out.println("array = "+array);
        System.out.println("array.size() = "+array.size());
        System.out.println("array.empty() = "+array.isEmpty());

        array.clear();
        
        System.out.println("array.clear()...");
        System.out.println("array.size() = "+array.size());
        System.out.println("array.empty() = "+array.isEmpty());
        
        ArrayList<BEBIDA>arr=new ArrayList<BEBIDA>();
        arr.add(new BEBIDA("Coca Cola",9));
        arr.add(new BEBIDA("Pepsi",10));
        
        System.out.println("Nombre = "+arr.get(0).nombre);
        System.out.println("Precio = "+arr.get(0).precio);
        System.out.println("Nombre = "+arr.get(1).nombre);
        System.out.println("Precio = "+arr.get(1).precio);
        
        ArrayList<Integer> arrayI=new ArrayList<Integer>();
        arrayI.add(1);
        arrayI.add(2);
        arrayI.add(3);
        
        ArrayList<Float> arrayF=new ArrayList<Float>();
        arrayF.add(1.1f);
        arrayF.add(2.2f);
        arrayF.add(3.3f);
        
        Integer i;
        
        ListIterator<Integer> iterator=arrayI.listIterator();
        while(iterator.hasNext()){
            i=iterator.next();
            System.out.println(i.toString());
        }
        
    }
    
}
