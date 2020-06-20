/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;


/**
 *
 * @author hp
 */
public class Beverage {
    
     private String type;
     private double size;
     private String brand;
     private double price;
     private int code;

    public Beverage(String type, double size, String brand, double price, int code) {
        this.type = type;
        this.size = size;
        this.brand = brand;
        this.price = price;
        this.code = code;
    }
    public Beverage(){
        this.type = "";
        this.brand = "";
        this.size = 0;
        this.code = 0;
        this.price = 0;
    }
   

    @Override
    public String toString() {
        return "Beverage{" + "type=" + type + ", size=" + size + ", brand=" + brand + ", price=" + price + ", CODE=" + code + '}';
    }

    /*public int choose(){
        Collection<Beverage> beverages=new ArrayList<>();
         return 0;
    
    }*/
     
     
    
}
