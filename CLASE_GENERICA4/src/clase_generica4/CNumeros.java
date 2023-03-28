
package clase_generica4;

public class CNumeros<T extends Number> {
    public CNumeros(){n1=null;n2=null;}
    public CNumeros(T n1, T n2){this.n1=n1;this.n2=n2;}
    public T getN1(){return n1;}
    public T getN2(){return n2;}
    public T getRes(){return res;}
    public void setRes(T valor){res=valor;}
    public void setN1(T valor){n1=valor;}
    public void setN2(T valor){n1=valor;}
    private T n1;
    private T n2;
    private T res;
    
    
}
