/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author sc364347
 */
public class Orange {
    private double prix;
    private String origine;
    
    public Orange(double p,String str){
        if(p<0){
            p=-p;
        }
        this.prix=p;
        this.origine=str;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @return the origine
     */
    public String getOrigine() {
        return origine;
    }
    
    public  boolean Equals(Orange o){
       if( o.getPrix()==this.prix && o.getOrigine().equals(this.origine)){
           return true;
       }
       return false;
    }
    
    @Override
    public String toString(){
        String str="Prix : "+prix+"\n origine : "+origine+" \n";
        return str;
        
    }
    
    
}
