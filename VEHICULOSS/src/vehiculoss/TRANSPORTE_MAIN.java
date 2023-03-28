
package vehiculoss;

public class TRANSPORTE_MAIN {

    public static void main(String[] args) {
        //AEREO, TERRESTRE, NAUTICO, HIDROAVION, ANFIBIO, A-MILITAR, T-MILITAR, N-MILITAR
        
        AEREOS aereos=new AEREOS(2,"Verde","AD237983","BOING","USADO",1989);
        TERRESTRE terrestre=new TERRESTRE(4,"Gris","AWS738947","Camioneta","Nueva",2020);
        NAUTICOS nautico=new NAUTICOS(2,"Azul","DMW7438947398","Boingtue","Usado",2000);
        HIDROAVION hidroavion=new HIDROAVION(2,"Naranja","TPQA32847","Boing","Nuevo",2010);
        ANFIBIO anfibio=new ANFIBIO(4,"Rojo","AC1234","Apache","Ala",1999);
        A_MILITAR a_militar=new A_MILITAR(2,"Amarillo","QUFF329","Twqyuei","yuiw",1934);
        T_MILITAR t_militar=new T_MILITAR(4,"Ambar","UGDFRu98372","Thufebchj","buert",1999);
        N_MILITAR n_militar=new N_MILITAR(2,"Violeta","QUVCR278","Hoaejw0","ewbdu",2003);
        
        aereos.DESPLAZAR();
        aereos.TURBULENCIA();
        
        terrestre.derrapar();
        terrestre.DESPLAZAR();
        
        nautico.NAUFRAGAR();
        nautico.FRENAR();
        
        hidroavion.DESPLAZAR();
        hidroavion.HUNDIR();
        
        anfibio.RECARGAR();
        anfibio.FLOTAR();
        
        a_militar.DISPARAR();
        a_militar.RECARGAR();
        
        t_militar.APUNTAR();
        t_militar.RECARGAR();
        
        n_militar.DISPARAR();
        n_militar.RECARGAR();
        
        System.out.println("color = "+anfibio.color);
        anfibio.color = "Morado";
        System.out.println("color = "+anfibio.color);

        
    }
    
}
