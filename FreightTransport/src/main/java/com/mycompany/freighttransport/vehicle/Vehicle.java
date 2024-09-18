
package com.mycompany.freighttransport.vehicle;

import com.mycompany.freighttransport.packages.CantPackages;
import java.util.ArrayList;


public class Vehicle {
    private String vehicleType; //tipo de vehiculo
    //private CantPackages loadingCapacity;
    private int kmTours;
    private String plate;
    private Driver drive;
    private ArrayList<Vehicle> listVehicles;
    
    public Vehicle(String vehicleType, int kmTours,String plate, Driver drive) {
        this.vehicleType = vehicleType;
        this.kmTours = kmTours;
       // this.loadingCapacity= new CantPackages();
        this.plate=plate;
        this.drive=drive;
        this.listVehicles=new ArrayList();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getKmTours() {
        return kmTours;
    }

    public void setKmTours(int kmTours) {
        this.kmTours = kmTours;
    }

    public String getPlate() {
        return plate;
    }

//    public void setPlate(String plate) {
//        this.plate = plate;
//    }

    public Driver getDrive() {
        return drive;
    }

    public void setDrive(Driver drive) {
        this.drive = drive;
    }

    public ArrayList<Vehicle> getListVehicles() {
        return listVehicles;
    }

    public void setListVehicles(ArrayList<Vehicle> listVehicles) {
        this.listVehicles = listVehicles;
    }

    
    public void registerVehicle(Vehicle vehicle){
        for(Vehicle car: listVehicles){
            car.registerVehicle(vehicle);
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleType=" + vehicleType + ", kmTours=" + kmTours + ", plate=" + plate + ", drive=" + drive + ", listVehicles=" + listVehicles + '}';
    }
    
    
}
