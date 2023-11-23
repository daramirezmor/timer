/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timer;

/**
 *
 * @author ESTUDIANTE
 */
public class horas extends Thread{
    
        static int flak;
        
        public horas (int flak){
            this.flak = flak;          
        }
       
        @Override
        public void run(){
            int hor = 0;
            while (true){                
                System.out.println("Cambio efectuado " + flak);            
                if (flak == 1){                 
                    hor += 1;
                    Timer.sethora(hor);
                    System.out.println("Incremento min....");
                    flak = 0;
                }                
            }           
        }
}
