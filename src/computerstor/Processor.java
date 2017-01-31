/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerstor;

/**
 *
 * @author beso__000
 */
public class Processor {
    
    //fields
     private String manufacturer;
     private double clockspeed;  
     private double cost;

     
     /**
     *Create Processor
     * @param manufacturer
     * @param clockspeed
     * @param cost
     */
     
    public Processor(String manufacturer, double clockspeed, double cost) {
        this.manufacturer = manufacturer;
        this.clockspeed = clockspeed;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        this.clockspeed = clockspeed;
    }

    @Override
    public String toString() {
        return "Processor{" + "manufacturer=" + manufacturer + ", clockspeed=" + clockspeed + ", cost=" + cost + '}';
    }
    
    

}
