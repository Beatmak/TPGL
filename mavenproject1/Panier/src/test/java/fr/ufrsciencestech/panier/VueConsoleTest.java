/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
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
public class VueConsoleTest {
    
    Panier p;
    VueConsole vc;
    
    public VueConsoleTest() {
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
        vc = new VueConsole();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class VueConsole.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        VueConsole instance = new VueConsole();
        instance.update(p, vc);
    }
    
}
