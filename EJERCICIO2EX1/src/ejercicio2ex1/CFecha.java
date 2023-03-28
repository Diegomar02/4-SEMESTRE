
package ejercicio2ex1;

import java.util.Scanner;

public class CFecha extends MAIN{
    Scanner entrada=new Scanner(System.in);
    int dia,mes, año,opcion;
    
    public CFecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    void CFecha(int dia,int mes,int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    void CFecha(){
        dia=1;
        mes=1;
        año=1900;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAño(int año) {
        this.año = año;
    }
    
    public void leer(){
        System.out.printf("Ingrese el dia: ");
        dia=entrada.nextInt();
        System.out.printf("Ingrese el mes: ");
        mes=entrada.nextInt();
        System.out.printf("Ingrese el año: ");
        año=entrada.nextInt();
        CFecha fecha1=new CFecha(dia,mes,año);
        if(dia<=31&&mes<=12&&año>=1900&&año<=2050){
            System.out.printf("Año correcta");
        }else{
            System.out.printf("Año incorrecta");
        }     
    }
    
    public void bisiesto(){
        if((año%4==0)&&(año%100!=0)||(año%400==0)){
            System.out.printf("Año bisiesto");
        }else{
            System.out.printf("Año no bisiesto");
        }
    }
    
    public void diaMes(){
        if(mes==1){
            System.out.printf("31 dias");
        }
        if(mes==2){
            if((año%4==0)&&(año%100!=0||año%400==0)){
                System.out.printf("29 dias");
            }else{
                System.out.printf("28 dias");
            }
        }
        if(mes==3){
            System.out.printf("31 dias");
        }
        if(mes==4){
            System.out.printf("30 dias");
        }
        if(mes==5){
            System.out.printf("31 dias");
        }
        if(mes==6){
            System.out.printf("30 dias");
        }
        if(mes==7){
            System.out.printf("31 dias");
        }
        if(mes==9){
            System.out.printf("30 dias");
        }
        if(mes==10){
            System.out.printf("31 dias");
        }
        if(mes==11){
            System.out.printf("30 dias");
        }
        if(mes==12){
            System.out.printf("31 dias");
        }
        
    }
   
    public void validar(){
        if(dia<=31&&mes<=12&&año>=1900&&año<=2050){
            System.out.printf("Año validado");
        }else{
            System.out.printf("Año no validado");
            
        }
    }
    
    public void corta(){
        if(dia<10&&mes<10){
            System.out.printf("0"+dia+"-"+"0"+mes+"-"+año);
        }
        if(dia<10){
            System.out.printf("0"+dia+"-"+mes+"-"+año);
        }
        if(mes<10){
            System.out.printf(dia+"-0"+mes+"-"+año);
        }
    }
    
    public void diasTranscurridos(){
        System.out.printf("Ingrese el dia: ");
        dia=entrada.nextInt();
        System.out.printf("Ingrese el mes: ");
        mes=entrada.nextInt();
        System.out.printf("Ingrese el año: ");
        año=entrada.nextInt();
        if(dia<=31&&mes<=12&&año>=1900&&año<=2050){
            System.out.printf("Año correcta");
        }else{
            System.out.printf("Año incorrecta");
        }
        
        
        
        
    }
    
    public void diaSemana(){
        if(dia==1){
            System.out.printf("Domingo");
        }
        if(dia==2){
            System.out.printf("Lunes");
        }
        if(dia==3){
            System.out.printf("Martes");
        }
        if(dia==4){
            System.out.printf("Miercoles");
        }
        if(dia==5){
            System.out.printf("Jueves");
        }
        if(dia==6){
            System.out.printf("Viernes");
        }
        if(dia==7){
            System.out.printf("Sabado");
        }
    }
    
    public void larga(){
        
    }
    
    public void fechaTras(){
        
    }
    
    public void diasEntre(){
        
    }
    public void siguiente(){
        
    }
    
    public void anterior(){
        
    }
    
    public void copia(){
        
    }
    
    public void igualQue(){
        
    }
    
    public void menorQue(){
        
    }
    
    public void mayorQue(){
        
    }


}
    
   
