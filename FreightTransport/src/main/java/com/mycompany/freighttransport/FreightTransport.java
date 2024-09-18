//Karen Marcela Bayona 
// Código= 192215
package com.mycompany.freighttransport;

import com.mycompany.freighttransport.packages.CantPackages;
import com.mycompany.freighttransport.vehicle.Driver;
import com.mycompany.freighttransport.vehicle.Vehicle;

public class FreightTransport {

    public static void main(String[] args) {
        //Conductor
        Driver drive1= new Driver("Manuel","137664327",47);
        Driver drive2= new Driver("Daniel","137664787",20);
        Driver drive3= new Driver();
        
        
        //Registrar vehiculo
        
        Vehicle vehicle1= new Vehicle("Camioneta", 3000,"KJ123",drive1);
        Vehicle vehicle2= new Vehicle("Carro", 3500,"KJT23",drive2);
        Vehicle vehicle3= new Vehicle("Camión", 4000,"KJK23",drive3);
        
        
        drive1.setName("Mauricio");
        drive2.setAge(25);
        System.out.println("Datos del conductor 1: "+drive1.toString());
        System.out.println("Datos del conductor 1: "+drive2.toString());
        vehicle2.setKmTours(1000);
        vehicle1.setVehicleType("Motocarga");
        System.out.println("Datos del vehiculo 1: "+vehicle1.toString());
        
    }
}
