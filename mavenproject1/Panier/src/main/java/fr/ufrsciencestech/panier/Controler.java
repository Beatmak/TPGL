/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sc364347
 */
public class Controler implements ActionListener{
    private Panier p;
    private VueGswing vue;
    private VueAWT vue2;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b=new JButton();
        Button b1=new Button();
        try{
           b=(JButton)e.getSource(); 
           if(b.equals(vue.getjButton2())){
            int nb=vue.getIndex();
            if(nb==0){
              p.putOrange(new Orange(1,"France"));  
            }
            if(nb==4){
                p.putOrange(new Banane(4545,"Algérie"));  
            }
            
        }
        if(b.equals(vue.getjButton3())){
            p.retire();
        }
        }catch(Exception e1){}
        try{
           b1=(Button)e.getSource();
            if(b1.equals(vue2.getButton1())){
            p.putOrange(new Orange(1,"A mort le MVC"));
        }
        if(b1.equals(vue2.getButton2())){
            p.retire();
        }
        }catch(Exception e2){}
        
        
        
       
    }

    /**
     * @param p the p to set
     */
    public void setP(Panier p) {
        this.p = p;
    }

    /**
     * @param vue the vue to set
     */
    public void setVue(VueGswing vue) {
        this.vue = vue;
    }

    /**
     * @param vue2 the vue2 to set
     */
    public void setVue2(VueAWT vue2) {
        this.vue2 = vue2;
    }
    
    
    
}
