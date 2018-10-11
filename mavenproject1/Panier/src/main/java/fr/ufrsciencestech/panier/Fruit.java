/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author hc047736
 */
public abstract class Fruit {
    
    String nom;
    double prix;
    String origine;
    
    public Fruit(String n, double p,String o)
    {
        if(p>=0)
        {
            this.nom = n;
            this.prix = p;
            this.origine = o;
            
        }
        else
        {
            this.nom = n;
            this.prix = -p;
            this.origine = o;
            
        }
        
      
        
    }
    
    public double getPrix(){return prix;};
    public String getOrigine(){return origine;};

        public  boolean Equals(Fruit f){
       if( f.getPrix()==this.prix && f.getOrigine().equals(this.origine)){
           return true;
       }
       return false;
    }
    
    
    public String toString(){
        String str="Nom : "+nom+"\n Prix : "+prix+"\n origine : "+origine+" \n \n";
        return str;
        
    }
}
