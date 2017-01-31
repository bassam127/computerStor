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
public class Computer {
    //fields
    private Processor theProcessor;
   private HardDisk theHardDisk;
    private Display theDisplay;
   private double cost;
   private String mani;

   
   /**
    * Constructor for fields
    * @param mani
    * @param theProcessor
    * @param theHardDisk
    * @param theDisplay
    * @param cost 
    */
   
    public Computer(String mani,Processor theProcessor, HardDisk theHardDisk, Display theDisplay, double cost) {
        this.theProcessor = theProcessor;
        this.theHardDisk = theHardDisk;
        this.theDisplay = theDisplay;
        this.cost = cost;
        this.mani=mani;
    }

    public String getMani() {
        return mani;
    }

    public void setMani(String mani) {
        this.mani = mani;
    }

    
    
    
    public Processor getTheProcessor() {
        return theProcessor;
    }

    public void setTheProcessor(Processor theProcessor) {
        this.theProcessor = theProcessor;
    }

    public HardDisk getTheHardDisk() {
        return theHardDisk;
    }

    public void setTheHardDisk(HardDisk theHardDisk) {
        this.theHardDisk = theHardDisk;
    }

    public Display getTheDisplay() {
        return theDisplay;
    }

    public void setTheDisplay(Display theDisplay) {
        this.theDisplay = theDisplay;
    }
/**
 * 
 * @return cost
 */
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
   
  
   
    /**
     * This method to print the cost for all computer parts /Processor cost,theHardDisk cost,Display cost
     */
    public void printComputerSummary() {
    
        System.out.println(" Processor "+this.theProcessor.getCost()+" HardDisk "+this.theHardDisk.getCost()+" Display "+this.theDisplay.getCost()+" Cost "+this.cost);
    }

 
    @Override
    public String toString() {
        return "Computer="+this.mani+"\n" + theProcessor + ",\n" + theHardDisk + ",\n" + theDisplay + ", \ncost=" + cost;
    }   
   
       /*
    // this method prints the total cost for all computers
    */
      public double  getTotalPrice()
      {
           return this.theDisplay.getCost()+this.theHardDisk.getCost()+this.theProcessor.getCost();
      }
}
