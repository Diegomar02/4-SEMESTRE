
package clase_generica1;

public class PAIR <T>{
    private T first;
    private T second;
    public PAIR(){first=null;second=null;}
    public PAIR(T first,T second){
        this.first=first;this.second=second;}
    public T getFirst(){return first;}
    public T getSecond(){return second;}
    public void setFirst(T newValue){first=newValue;}
    public void setSecond(T newValue){second=newValue;} 
}

