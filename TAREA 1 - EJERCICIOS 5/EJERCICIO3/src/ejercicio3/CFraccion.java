
package ejercicio3;

public class CFraccion {
    public int numerador, denominador;
    public static int objetos;
    
    CFraccion(){
        numerador=denominador=1;
        objetos++;
    }
    CFraccion(int n){
        numerador=n;
        denominador=1;
        objetos++;
    }
    CFraccion(int n,int d){
        numerador=n;
        denominador=d;
        objetos++;
    }
    
    CFraccion suma(int n,int d){
        CFraccion r=new CFraccion();
        r.denominador=this.denominador*d;
        r.numerador=(this.numerador*d)+(n*this.denominador);
        return r;
    }
    CFraccion suma(CFraccion f){
        CFraccion r=new CFraccion();
        r.denominador=this.denominador*f.denominador;
        r.numerador=(this.numerador*f.denominador)+(f.numerador*this.denominador);
        return r;
    }
    public static CFraccion suma(CFraccion f1,CFraccion f2){
        CFraccion r=new CFraccion();
        r.denominador=f1.denominador*f2.denominador;
        r.numerador=(f1.numerador*f2.denominador)+(f2.numerador*f1.denominador);
        return r;
    }
    static void imprimirObjetos(){
        System.out.println("Objetos creados: "+objetos);
    }
    
    
    
}
