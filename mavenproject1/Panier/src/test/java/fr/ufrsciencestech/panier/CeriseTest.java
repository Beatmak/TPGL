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
 * @author hc047736
 */
public class CeriseTest {
    
public CeriseTest() {
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
     * Test of getPrix method, of class Cerise.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Cerise instance = new Cerise (2.1,"Allemagne");
        double expResult = 2.1;
        double result = instance.getPrix();
        assertEquals(expResult, result,0.0);

    }

    /**
     * Test of getOrigine method, of class Cerise.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Cerise instance = new Cerise (2.1,"Allemagne");
        String expResult = "Allemagne";
        String result = instance.getOrigine();
        assertEquals(expResult, result);

    }

    /**
     * Test of Equals method, of class Cerise.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        Cerise o = new Cerise (2.1f,"Allemagne");
        Cerise instance = new Cerise (2.1f,"Allemagne");
        boolean expResult = true;
        boolean result = instance.Equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Cerise.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cerise instance = new Cerise (2.1,"Allemagne");
        String expResult = "Prix : 2.1\n origine : Allemagne \n";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
