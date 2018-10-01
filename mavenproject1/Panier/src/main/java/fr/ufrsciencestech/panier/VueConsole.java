/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author sc364347
 */
public class VueConsole implements Observer{
    
    @Override
    public void update(Observable o, Object arg) {
        Panier p=(Panier)o;
        System.out.println(("Nombre d'orange"+((Integer)p.getSize()).toString()));
    }
    
}
