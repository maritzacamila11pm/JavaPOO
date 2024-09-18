/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;


public class Auto extends Vehiculo {
    
    private int numero_puertas;
    
    
    public Auto(String hp, int ruedas, String modelo, String color, String marca, int capacidad, int fecha, int numero_puertas) {
        super(hp, ruedas, modelo, color, marca, capacidad, fecha);
        this.numero_puertas = numero_puertas ;
        
       // System.out.println("Puertas: " + numero_puertas);
    }
    @Override
    public void caracteristicas (){
    super.caracteristicas();
    System.out.println("Puertas: " + numero_puertas);
    }
    
    }
        
    
    
    
    

