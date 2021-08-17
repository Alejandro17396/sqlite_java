/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class RepositorioBond {
    private ArrayList <NinjaBond> data;

    public RepositorioBond(ArrayList<NinjaBond> data) {
        this.data = data;
    }

    public ArrayList <NinjaBond> getData() {
        return data;
    }

    public void setData(ArrayList <NinjaBond> data) {
        this.data = data;
    }

    public void filtrar(String name) {
       Iterator <NinjaBond> aux=data.iterator();
        
       while(aux.hasNext()){
           NinjaBond a=aux.next();
           if(!a.getNinjaBond().equals(name)){
             aux.remove();
           }
           
           
       }
    }

    public  ArrayList <String> getNames() {
         ArrayList <String> names= new ArrayList();
        for(NinjaBond n: data){
            if(!names.contains(n.getBondname())){
                names.add(n.getBondname());
            }   
        }
        
        return names;
    }

    public ArrayList <NinjaBond> getFiltred(String name) {
        ArrayList <NinjaBond> aux=new ArrayList();
        
        for(NinjaBond n:data){
            //System.out.println(n.getNinjaBond()+"--"+name);
            if(name.equals(n.getBondname())){
      
                aux.add(n);
            }
        }
        return aux;
    }

    public String obtenerBonus(String string) {
       for(NinjaBond n: data){
           if(string.equals(n.getBondname())){
               return n.getTipoBonus();
           }  
       }
       return "Unknown";
    }

    public String obtenerBonus2(String name) {
        for(NinjaBond n: data){
           if(name.equals(n.getNinjaBond())){
               return ""+n.getBonus();
           }  
       }
       return "Unknown";
    }

    public NinjaBond getBond(int level, String bondname) {
        ArrayList <NinjaBond> aux= new ArrayList();
        for(NinjaBond n:data){
            if(n.getBondname().equals(bondname) && n.getLevel()==(level+1)){
              return n;
            }
        }
        return null;
    }

  

    public NinjaBond getDiference(NinjaBond start, NinjaBond end, String name) {
        /*ArrayList <NinjaBond> sublist=new ArrayList();
        
        for(NinjaBond n:data){
            if(n.getBondname().equals(name)){
                sublist.add(n);
            }
        }
        
        int start1=start.getLevel();
        int end1=end.getLevel();
        NinjaBond aux=sublist.get(start1-1);
        for(int i=start1+1;i<end1;i++){
           aux.setsta
        }*/
        NinjaBond aux=new NinjaBond();
        aux.setBondname(start.getBondname());
        aux.setLevel(end.getLevel());
        aux.setStats(end.getStats()-start.getStats());
        aux.setTipoBonus(end.getTipoBonus());
        return aux;
        
    }

    public NinjaBond getBond2(String name) {
        for(NinjaBond n:data){
            if(n.getNinjaBond().equals(name)){
               return n; 
            }
        }
        return null;
    }
    
    
}
