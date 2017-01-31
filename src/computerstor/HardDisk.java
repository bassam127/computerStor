/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computerstor;

/**This class implements  
 *
 * @author beso__000
 */

public class HardDisk {
    //fields 
    private double cost;
    private String manufacturer;
    private int size;
    private String type;

    public HardDisk(double cost, String manufacturer, int size, String type) {
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.size = size;
        this.type = type;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HardDisk{" + "cost=" + cost + ", manufacturer=" + manufacturer + ", size=" + size + ", type=" + type + '}';
    }

    
    
    
    
}
