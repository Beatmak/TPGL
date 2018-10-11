/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ufrsciencestech.panier;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author sc364347
 */
public class Panier extends Observable {
    private ArrayList<Orange> liste;
    private int max;
    
    public Panier(int m){
        this.max=m;
        this.liste= new ArrayList<Orange>();
    }
    
    public boolean estPlein(){
        if(getListe().size()==max){
            return true;
        }
        return false;
    }
    
    public Orange getOrange(int i){
        return liste.get(i);
    }
    
    public void putOrange(Orange o){
        
     if(o!=null)
     {
        getListe().add(o);
        setChanged();
        notifyObservers();
     }
      
    }
    
    public double getPrix(){
        double p=0;
        for(int i=0 ; i<getListe().size(); i++){
            p+=getListe().get(i).getPrix();
        }
        return p;

    }
    
    public int getSize(){
        return getListe().size();
    }
    
    public void retire(){
        getListe().remove(getListe().size()-1);
        setChanged();
        notifyObservers();
    }
    
    public boolean estVide(){
        return getListe().isEmpty();
    }
    
    public boolean Equals(Panier p){
        if(p.getSize()!=getListe().size()){
            return false;
        }
        for(int i=0 ; i<getListe().size(); i++){
            if(!liste.get(i).Equals(p.getOrange(i))){
                return false;
            }
        }
        return true;
    }
    
    public void boycotte(String str){
        for(int i=0 ; i<getListe().size(); i++){
            if(getListe().get(i).getOrigine().equals(str)){
                getListe().remove(i);
            }
        }
    }
    
    public String toString(){
        String str="";
        for(int i=0 ; i<getListe().size(); i++ ){
            str+=getListe().get(i);
        }
        return str;
    }

    /**
     * @return the liste
     */
    public ArrayList<Orange> getListe() {
        return liste;
    }
}
