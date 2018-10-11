/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author sc364347
 */
public class PanierTest {
    
    Panier pvide,p1,p2,pplein;
    Orange o1,o2,o3;
    
    public PanierTest(){
    }
    @BeforeClass
    public static void setUpClass()  {
       
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pvide = new Panier (4);
       p1 = new Panier (4);
       p2 = new Panier (4);
       pplein = new Panier (4);
       o1 =  new Orange (1.5, "Espagne");
       o2 =  new Orange (2.5, "Espagne");
       o3 =  new Orange (1.5, "Italie");
       p1.putOrange(o1);
       p2.putOrange(o1);
       pplein.putOrange(o1);
       pplein.putOrange(o1);
       pplein.putOrange(o2);
       pplein.putOrange(o3);
       
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        boolean expResult = true;
        boolean result = pplein.estPlein();
        assertEquals(expResult, result);
    }


    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        double expResult = 1.5;
        double result = p1.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getSize method, of class Panier.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        int expResult = 1;
        int result = p1.getSize();
        assertEquals(expResult, result);
 
    }


    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        boolean expResult = true;
        boolean result = pvide.estVide();
        assertEquals(expResult, result);
    }

    /**
     * Test of Equals method, of class Panier.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        boolean expResult = true;
        boolean result = p1.Equals(p2);
        assertEquals(expResult, result);

    }

    /**
     * Test of boycotte method, of class Panier.
     */
  
    /**
     * Test of getListe method, of class Panier.
     */
    @Test
    public void testGetListe() {
        System.out.println("getListe");
        ArrayList<Orange> expResult = new ArrayList<Orange>();
        ArrayList<Orange> result = pvide.getListe();
        assertEquals(true, result.equals(expResult));
    }
    
    @Test 
    public void testPrixPanierA2Orange(){
        Orange omock1=mock (Orange.class);
        Orange omock2=mock (Orange.class);
        when ( omock1.getPrix()).thenReturn (1.0);
        when ( omock2.getPrix()).thenReturn (2.0);
        pvide.putOrange(omock1);
        pvide.putOrange(omock2);
        assertTrue (pvide.getPrix()==3.0);
        verify(omock1,times(1)).getPrix();
    }
    
}
