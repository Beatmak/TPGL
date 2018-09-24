/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ufrsciencestech.panier;
import java.util.ArrayList;

/**
 *
 * @author sc364347
 */
public class Panier {
    private ArrayList<Orange> liste;
    private int max;
    
    public Panier(int m){
        this.max=m;
        this.liste= new ArrayList<Orange>();
    }
    
    public boolean estPlein(){
        if(liste.size()==max){
            return true;
        }
        return false;
    }
    
    public Orange getOrange(int i){
        return liste.get(i);
    }
    
    public void putOrange(Orange o){
        liste.add(o);
    }
    
    public double getPrix(){
        double p=0;
        for(int i=0 ; i<liste.size(); i++){
            p+=liste.get(i).getPrix();
        }
        return p;

    }
    
    public int getSize(){
        return liste.size();
    }
    
    public void retire(){
        liste.remove(liste.size()-1);
    }
    
    public boolean estVide(){
        return liste.isEmpty();
    }
    
    public boolean Equals(Panier p){
        if(p.getSize()!=liste.size()){
            return false;
        }
        for(int i=0 ; i<liste.size(); i++){
            if(!liste.get(i).Equals(p.getOrange(i))){
                return false;
            }
        }
        return true;
    }
    
    public void boycotte(String str){
        for(int i=0 ; i<liste.size(); i++){
            if(liste.get(i).getOrigine().equals(str)){
                liste.remove(i);
            }
        }
    }
    
    public String toString(){
        String str="";
        for(int i=0 ; i<liste.size(); i++ ){
            str+=liste.get(i);
        }
        return str;
    }
}
