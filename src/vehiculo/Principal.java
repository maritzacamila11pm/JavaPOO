/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;
//Autor: Maritza Camila Pongo Mamani 

public class Principal {
    
    public static void main (String[]args){
        
        //instanciar = invocar = llamar a un objeto
        //esta funcion solo remplza los datos 
        Moto moto = new Moto("1700", 4 ,"toyota","toyota","negro", 5 , 2026);
        moto.encender();
        moto.transportar();
        moto.frenar();
        moto.choca();
        moto.mantenimiento();
        moto.acelero();
         moto.informacion();
        moto.caracteristicas();
        
        Moto moto1 = new Moto("1500", 2 ,"Pulsar","Toyota","Blanco", 4 , 2028);
        moto1.caracteristicas();
        
        //MI FORMA
        Auto moto2 = new Auto("1900", 4 ,"Toyota1","Toyotab","Amarillo", 5 , 2029,4);
       moto2.caracteristicas();
       
       //FORMA DEL PROFE
       
       Auto autito = new Auto("1900", 2 ,"Toyota1","Toyotab","Amarillo", 4 , 2030,4);
       autito.caracteristicas();
       
    }
    
    
}
