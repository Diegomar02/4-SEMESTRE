
package clinea;

public class CLinea extends MAIN{
    double x,y;
    
    public CLinea(double x,double y){
        this.x=x;
        this.y=y;
    } 
    
    void CLinea(double x,double y){
        this.x=x;
        this.y=y;
    }
            
    void CLinea(){
        x=0;
        y=0;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void derecha(){
        CLinea(x,y);
        x=x+1;
        
    }
    public void izquierda(){
        CLinea(x,y);
        x=x-1;
        
    }
    public void arriba(){
        CLinea(x,y);
        y=y+1;
    }
    public void abajo(){
        CLinea(x,y);
        y=y-1; 
    }
    public void mostrar(){
    }
}

