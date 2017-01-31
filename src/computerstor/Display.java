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
public class Display {
    //Fields
    private double cost;
    private String type;
    private String manufacturer;
    private double size;
/**
     * Create a Display 
     * @param cost
     * @param type
     * @param manufacturer
     * @param size
     */
    public Display(double cost, String type, String manufacturer, double size) {
        this.cost = cost;
        this.type = type;
        this.manufacturer = manufacturer;
        this.size=size;
    }
/**
     * Return the cost of the Display.
     * 
     * @return cost
     */
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    /** 
   *Return the Manufacture of the display 
   *
     * @return manufacturer Name 
   */

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    
   /*
    *Return the size of display
    * @return size
    */
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    /*
    *This method to display all information about display the cost and the type and manufactuer name and size
       */
    @Override
    public String toString() {
        return "Display{" + "cost=" + cost + ", type=" + type + ", manufacturer=" + manufacturer + ", size=" + size + '}';
    }

   

   
    
}
