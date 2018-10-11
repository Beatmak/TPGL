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
     public int nbFruit;
     
     public Macedoine(double p , String origine)
     {
         super("La macedoine",p,origine);
         nbFruit = 0;
     }
     
     
     
     public void ajouteFruit(Fruit f){
        
        if(f!=null)
        {
          listeFruit.add(f); 
          nbFruit = nbFruit + 1 ;
        }
        
       
     }
     
     public String toString()
     {
         String res="";
         
         if(nbFruit > 0)
         {
             
              for(int i = 0 ; i < nbFruit ; i++)
              {
                     res+= listeFruit.get(i).getNom()+" "; 
               }
                     
         }
            
              return res;
     }
     
     
     public boolean isSeedless()
     {
         boolean test = true;
         
         if(nbFruit > 0)
         {
             for (int i = 0 ; i < nbFruit ; i++)
             {
                 if ( listeFruit.get(i).getNom().equals("Orange") )
                 {
                     test = false;
                 }
                 
             }
             
         }
         
         return test;
              
         
     }
    
}
