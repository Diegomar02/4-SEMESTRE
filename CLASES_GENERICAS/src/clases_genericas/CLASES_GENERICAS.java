
package clases_genericas;

public class CLASES_GENERICAS {

    public static void main(String[] args) {
        PAIR<String>mm=new PAIR<String>("uno","dos");
        System.out.println("min = "+mm.getFirst());
        System.out.println("max = "+mm.getSecond());
        
        String[]words=
        {"mary","algo","a","pequeño","lampara"};
        PAIR<String>mn=ArrayAlg.minmax(words);
        System.out.println("min = "+mn.getFirst());
        System.out.println("max = "+mn.getSecond());
        
        String middle=ArrayAlg.<String>getMiddle(words);
        System.out.println("middle: "+middle);
        
        
    }
    class ArrayAlg{
        public static PAIR<String>minmax(String[]a){
            if (a==null||a.length==0)return null;
            String min=a[0];
            String max=a[0];
            for(int i=1;i<a.length;i++){
                if(min.compareTo(a[i])>0)min=a[i];
                if(max.compareTo(a[i])<0)max=a[i];
            }
            return new PAIR<String>(min,max);
        }
        public static <T>T getMiddle(T[]a){
            return (a[a.length/2]);
        }
    }
}
    

