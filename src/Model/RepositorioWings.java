/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Todomelocomo
 */
public class RepositorioWings {
    private ArrayList <Wings> data=new ArrayList();

    public RepositorioWings(ArrayList <Wings> data) {
    this.data=data;
    }

    public ArrayList <Wings> getData() {
        return data;
    }

    public void setData(ArrayList <Wings> data) {
        this.data = data;
    }
    
    public int getLevel(String text) {
        
        for(Wings s: data){
            if(s.getName().equals(text)){
                return s.getLevel();
            }
        }
        return 0;
    }

    public Wings getConcretWing(String text) {
        for(Wings s: data){
            if(s.getName().equals(text)){
                return s;
            }
        }
        return null;
    }
    
}
