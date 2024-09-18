
package com.mycompany.freighttransport.vehicle;


public class Driver {
    private String name;
    private String id;
    private int age;

    public Driver(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Driver() {
        this.name="";
        this.id="";
        this.age=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
    }
    
    
    
    
}
