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
 * @author sc364347
 */
public class OrangeTest {
    
    public OrangeTest() {
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

    /**
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange (2.1,"Allemagne");
        double expResult = 2.1;
        double result = instance.getPrix();
        assertEquals(expResult, result,0.0);

    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange (2.1,"Allemagne");
        String expResult = "Allemagne";
        String result = instance.getOrigine();
        assertEquals(expResult, result);

    }

    /**
     * Test of Equals method, of class Orange.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        Orange o = new Orange (2.1f,"Allemagne");
        Orange instance = new Orange (2.1f,"Allemagne");
        boolean expResult = true;
        boolean result = instance.Equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Orange.
     */
    
    
}
