/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lm917123
 */
public class JusTest {
    
    public JusTest() {
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

    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Jus instance = new Jus (2.1,"Allemagne");
        double expResult = 2.1;
        double result = instance.getPrix();
        assertEquals(expResult, result,0.0);

    }

    /**
     * Test of getOrigine method, of class Jus.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Jus instance = new Jus (2.1,"Allemagne");
        String expResult = "Allemagne";
        String result = instance.getOrigine();
        assertEquals(expResult, result);

    }

    /**
     * Test of Equals method, of class Jus.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        Jus o = new Jus (2.1f,"Allemagne");
        Jus instance = new Jus (2.1f,"Allemagne");
        boolean expResult = true;
        boolean result = instance.Equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Jus.
     */

}
