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
public class BananeTest {
    
    public BananeTest() {
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
     * Test of getPrix method, of class Banane.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Banane instance = new Banane (2.1,"Allemagne");
        double expResult = 2.1;
        double result = instance.getPrix();
        assertEquals(expResult, result,0.0);

    }

    /**
     * Test of getOrigine method, of class Banane.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Banane instance = new Banane (2.1,"Allemagne");
        String expResult = "Allemagne";
        String result = instance.getOrigine();
        assertEquals(expResult, result);

    }

    /**
     * Test of Equals method, of class Banane.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        Banane o = new Banane (2.1f,"Allemagne");
        Banane instance = new Banane (2.1f,"Allemagne");
        boolean expResult = true;
        boolean result = instance.Equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Banane.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Banane instance = new Banane (2.1,"Allemagne");
        String expResult = "Prix : 2.1\n origine : Allemagne \n";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
