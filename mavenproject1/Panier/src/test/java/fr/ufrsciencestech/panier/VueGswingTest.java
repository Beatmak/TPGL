/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import javax.swing.JButton;
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
public class VueGswingTest {
    
    Panier p;
    VueGswing vg;
    
    public VueGswingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Panier(4);
        vg = new VueGswing();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class VueGswing.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        VueGswing instance = new VueGswing();
        instance.update(p, vg);
    }

    /**
     * Test of getjButton2 method, of class VueGswing.
     */
    @Test
    public void testGetjButton2() {
        System.out.println("getjButton2");
        VueGswing instance = new VueGswing();
        JButton expResult = instance.getjButton2();
        JButton result = instance.getjButton2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getjButton3 method, of class VueGswing.
     */
    @Test
    public void testGetjButton3() {
        System.out.println("getjButton3");
        VueGswing instance = new VueGswing();
        JButton expResult = instance.getjButton3();
        JButton result = instance.getjButton3();
        assertEquals(expResult, result);
    }

    /**
     * Test of addControler method, of class VueGswing.
     */
    @Test
    public void testAddControler() {
        System.out.println("addControler");
        Controler c = null;
        VueGswing instance = new VueGswing();
        instance.addControler(c);
    }
    
}
