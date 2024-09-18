/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

//MI OBJETO VEHICULO
public class Vehiculo {
     
    //CARACTERISTICAS Y/O ATRIBUTOS = VARIABLES 
    
    private String hp;
    private int ruedas;
    private String modelo;
    private String marca ;
    private String color;
    private int capacidad;
    private int fecha;
    private boolean encendido;
    
    //como crear un constructor y para que sirve 
    //el constructor inializa
    //tiene el mismo nombre que mi clase 
    
    
    public Vehiculo(){
        this.hp = "100";
        this.ruedas = 4;
        this.modelo = "Uracan";
        this.marca = "Toyota";
        this.color = "Negro";
        this.capacidad = 5;
        this.fecha = 21/12/24 ;
        this.encendido = true;
    }
    
    public void transportar (){
        System.out.println("El vehiculo esta en transporte. ");
    //este es un metodo 
    }
    public void encender () {
        System.out.println("Vehiculo encendido ");
        this.encendido = true;
    //este es un metodo
    }
    
}
