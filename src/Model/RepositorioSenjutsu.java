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
public class RepositorioSenjutsu {
    private ArrayList <Senjutsu> data=new ArrayList();

    public RepositorioSenjutsu(ArrayList <Senjutsu> data ) {
        this.data=data;
    }

    public ArrayList <Senjutsu> getData() {
        return data;
    }

    public void setData(ArrayList <Senjutsu> data) {
        this.data = data;
    }

    public int getLevel(String text) {
        int i=0;
        for(Senjutsu s: data){
           
            if(s.getName().equals(text)){
                return i;
            }
            i++;
        }
        return 0;
    }
     
     
}
