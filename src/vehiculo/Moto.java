/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

//palabra clave extends
    //HEREDAR 
 // vehiculo es el padre 
public class Moto extends Vehiculo{

    public Moto(String hp, int ruedas, String modelo, String color, String marca, int capacidad, int fecha) {
        super(hp, ruedas, modelo, color, marca, capacidad, fecha);
    }
    
    
    public void frenar (){
        System.out.println("La moto freno");
    }
     public void choca (){
        System.out.println("la moto va  a mucha velocidad y choco");
        
    }
      public void mantenimiento (){
        System.out.println("La moto tiene mantenimiento");
       
    }
        public void acelero (){
        System.out.println("La moto acelero");
       
    }
        
}
