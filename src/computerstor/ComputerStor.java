/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerstor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/**
 *
 * @author beso__000
 */
public class ComputerStor {
    
    
    private static Computer  currentMostExpensive=null;
    
    private ArrayList<Computer> comp;
    
    
    public ComputerStor()
    {
        comp=new ArrayList<>();
    }
    
    /**
     * This method to add new computer to the ArrayList 
     * @param newComputer 
     * @return computer which i added
     */
    public boolean addComputer(Computer newComputer)
    { if(comp.size()==0)
          {currentMostExpensive=newComputer;}
        return comp.add(newComputer);
    }
    
/**
 * This method to remove computer 
 * @param index
 * @return boolean true if successful  or false  if not
 */
    public boolean removeComputer(int index)
    {
       int i=0;
        for(Computer c:comp)
        {
            
        if(i==index)
        {
        comp.remove(i);
        return true;
        }
        i++;
        }
    
return false;
    
}
    /**
     * this method to prints out all the details of each computer in store
     * @param newComputer 
     */
    
      public void prints(Computer newComputer)
    { 
       for(Computer c:comp)
       {
       System.out.println(c);
       
       }
    }
      
      /**
       * This method find the most expensive Computer and i save the the most expensive at currentMostExpensive
       * used by for loop
       * @return currentMostExpensive
       */
      
      public Computer findMostExpensiveComputerV1( )
      {
          
          
          for(int index=0 ;index<comp.size();index++)
          {
              if(comp.get(index).getTotalPrice()>currentMostExpensive.getTotalPrice())
              {
                   currentMostExpensive=comp.get(index);
              }
          }
           return currentMostExpensive;
      }
  
      /**
       * This method find the most expensive Computer and i save the the most expensive at currentMostExpensive
       * used by while loop 
       * @return currentMostExpensive
       */

      public Computer findMostExpensiveComputerV2( ) { 
 
          int index=0;
          
          while(index<comp.size())
          {
               if(comp.get(index).getTotalPrice()>currentMostExpensive.getTotalPrice())
             {
              currentMostExpensive=comp.get(index);
             }
               index++;
        }
      
     return currentMostExpensive;
     
}
      /**
       * This method find the most expensive Computer and i save the the most expensive at currentMostExpensive
       * used by for each
       * @return currentMostExpensive
       */
            public Computer findMostExpensiveComputerV3()
      {
    
          for(Computer c:comp)
          {
              if(c.getTotalPrice()>currentMostExpensive.getTotalPrice())
              {currentMostExpensive=c;}
          }
          
          return currentMostExpensive;
      }
            /**
       * This method find the most expensive Computer and i save the the most expensive at currentMostExpensive
       * used by ListIterator
       * @return currentMostExpensive
       */
            
 public Computer findMostExpensiveComputerV4( )
            {
                 ListIterator<Computer> litr = comp.listIterator();
                  while (litr.hasNext()) {
                      Computer c=litr.next();
                      double price=c.getTotalPrice();
                       if(price>currentMostExpensive.getTotalPrice())
                       {
                           currentMostExpensive=c;
                       }
                      
                  }
                
            
            
            return currentMostExpensive;
            
            }
      
}