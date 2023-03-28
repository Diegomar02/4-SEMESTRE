
package clase_generica1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CLASE_GENERICA1 {

    public static void main(String[] args) {
        Integer[]entero={1,67,34,77};
        PAIR<Integer>mm=ArrayAlg.minmax(entero);
        System.out.println("Min = "+mm.getFirst());
        System.out.println("Max = "+mm.getSecond());
        GregorianCalendar[]birthdays={
            new GregorianCalendar(1906,Calendar.DECEMBER,9),
            new GregorianCalendar(1815,Calendar.DECEMBER,10),
            new GregorianCalendar(1903,Calendar.DECEMBER,3),
            new GregorianCalendar(1910,Calendar.JUNE,22),
        };
        PAIR<GregorianCalendar>mm2=ArrayAlg.minmax(birthdays);
        System.out.println("min = "+mm2.getFirst().getTime());
        System.out.println("max = "+mm2.getSecond().getTime());
    }   
}

class ArrayAlg{
        public static <T extends Comparable> PAIR <T>
            minmax(T[]a){
            if(a==null||a.length==0) return null;
            T min=a[0];
            T max=a[0];
            for(int i=1;i<a.length;i++){
                if(min.compareTo(a[i])>0)min=a[i];
                if(max.compareTo(a[i])<0)min=a[i];
            }
            return new PAIR<T>(min,max);
        }
    }