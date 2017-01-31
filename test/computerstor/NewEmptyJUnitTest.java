/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerstor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author beso__000
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void checkIfFindWorks() {
        ComputerStor c = new ComputerStor();
        Processor p = new Processor("fff", 0, 0);
        Display d = new Display(0, "dd", "ss", 0);
        HardDisk h = new HardDisk(0, "dd", 0, "ddd");
        Computer c1 = new Computer("hp", p, h, d, 1);
        c.addComputer(c1);

        Processor p1 = new Processor("fff", 0, 55.00);
        Display d1 = new Display(0, "dd", "ss", 0);
        HardDisk h1 = new HardDisk(0, "dd", 0, "ddd");
        Computer c2 = new Computer("acer", p, h, d, 0);
        c.addComputer(c2);
       Assert.assertEquals(c2, c.findMostExpensiveComputerV4());
        

    }

}
