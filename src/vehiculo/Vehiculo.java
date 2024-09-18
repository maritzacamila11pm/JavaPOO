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
    
    //este es un constructor
    public Vehiculo(String hp, int ruedas, String modelo, String color , String marca , int capacidad , int fecha )
    
    {
        this.hp = hp;
        this.ruedas = ruedas;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
        this.fecha = fecha ;
        
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
    //forma 1
    public void informacion () {
        System.out.println("el vehiculo tiene de hp " + hp + " tiene "+ ruedas + " ruedas " + " es de  " + modelo + " y marca " + marca + " de color " +color + " con una capacidad de "+ capacidad + "en la fecha "+ fecha );
    }
    //forma 2
    public void caracteristicas (){
        System.out.println("HP: " + hp);
        System.out.println("posee: " + ruedas + " ruedas" );
        System.out.println("modelo: " + modelo);
        System.out.println("color: " + color);
        System.out.println("marca: " + marca );
        System.out.println("capacidad: " + capacidad);
        System.out.println("fecha: " + fecha );
        

    }
    
}
