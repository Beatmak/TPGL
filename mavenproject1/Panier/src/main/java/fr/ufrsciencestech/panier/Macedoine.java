/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author hc047736
 */
public class Macedoine extends Fruit{
    
     public ArrayList<Fruit> listeFruit;
     
     public Macedoine(double p , String origine)
     {
         super("La macedoine",p,origine);
     }
     
     
     /*
     public void ajouteFruit(Fruit f){
        
     if(f!=null)
     {
        getListe().add(o);
        setChanged();
        notifyObservers();
     }*/
    
}
