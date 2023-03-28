/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads5;


class SHARED {
    synchronized void doWork(String string){
        System.out.println("Iniciando "+string);
        try{
            Thread.sleep((long)(Math.random()*5000));
            
        }catch(InterruptedException e){}
            System.out.println("Terminando "+string);
        
    }
    
}
