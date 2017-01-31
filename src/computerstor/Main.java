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
public class Main {
    public static void main(String args[] )
    {
     
    Computer c =new Computer("Acer",new Processor("",1000,1),new HardDisk(1,"",2,""), new Display(1,"","",55), 1);
   Computer c1 =new Computer("hp",new Processor("",22,2),new HardDisk(2,"",2222,""), new Display(2,"","",55), 2);
    Computer c2 =new Computer("toshiba",new Processor("",22,3),new HardDisk(3,"",2222,""), new Display(3,"","",55), 3);
    Computer c3 =new Computer("msi",new Processor("",22,4),new HardDisk(4,"",2222,""), new Display(4,"","",55), 4);
    Computer c4 =new Computer("dell",new Processor("",22,5),new HardDisk(5,"",2222,""), new Display(5,"","",55), 5);
   Computer c5 =new Computer("asus",new Processor("",22,6),new HardDisk(6,"",2222,""), new Display(6,"","",55), 6);
//  c.printComputerSummary();
    ComputerStor cs=new ComputerStor();
   
    cs.addComputer(c);
    
   cs.addComputer(c1);
    cs.addComputer(c2);
   cs.addComputer(c3);
  cs.addComputer(c4);
   cs.addComputer(c5);
// System.out.println(cs.mosxpensive().getMani());
 //   Computer c6 =new Computer("nnnnnn",new Processor("",22,100000),new HardDisk(6,"",2222,""), new Display(6,"","",55), 222);
  //    cs.addComputer(c6);
   //   cs.removeComputer(6);
    System.out.println(cs.findMostExpensiveComputerV1());
    
 //   cs.prints(c);
  // cs.removeComputer(0);
 //   cs.prints(c);
 //System.out.println(c.getTotalPrice());
     
    
    
    
    }
}
