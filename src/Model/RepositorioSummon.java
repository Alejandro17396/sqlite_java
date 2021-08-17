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
public class RepositorioSummon {
    private ArrayList <Summon> data=new ArrayList();

    public RepositorioSummon(ArrayList<Summon> data) {
        this.data = data;
    }

    public ArrayList <Summon> getData() {
        return data;
    }

    public void setData(ArrayList <Summon> data) {
        this.data = data;
    }

    public int getIndex(String text) {
        int i=0;
        for(Summon s: data){
            if(s.getName().equals(text)){
                return i;
            }
            i++;
        }
        return 0;
    }

    public Summon getSummon(int start) {
        
        return data.get(start);
    }
}
