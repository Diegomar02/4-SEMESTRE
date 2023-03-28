
package pelota;

import java.awt.Color;

public class PELOTA {

    Color color;

    void fisica(float dt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public class pelota {
    public float x,y;
    private float vx,vy;
    public Color color;
    public static int npelota=0;
    public int idpelota;
    
    
    pelota(){
        idpelota=npelota++;
        Color []colors = {new Color(100,0,0,100),
            new Color(0,100,59,100),Color.CYAN,Color.GRAY,Color.PINK,
            Color.GREEN,Color.ORANGE,Color.RED,Color.YELLOW,Color.LIGHT_GRAY};
        x=(float)Math.random()*CTES.ANCHO;
        y=(float)Math.random()*CTES.ALTO;
        vx=((float)Math.random()*1000)-500;
        vy=((float)Math.random()*1000)-500;
        color = colors[(int)(Math.random()*10)];
    }

    public pelota(float x, float y, float vx, float vy, Color color) {
        idpelota=npelota++;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.color = color;
    }
    public void fisica(float dt){
        x+= vx*dt;
        y+= vy*dt;
        if(vx <0&&x<=0||vx>0&&x +CTES.DIAMETRO >= CTES.ANCHO){
            vx =-vx;
        }
        if( vy <0 && y<0 || vy >0 && y+CTES.DIAMETRO >=CTES.ALTO){
            vy = -vy;
        }
    }
    
}
}
