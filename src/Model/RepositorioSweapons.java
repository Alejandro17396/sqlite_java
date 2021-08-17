/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Todomelocomo
 */
public class RepositorioSweapons {
    private ArrayList <Sweapon> data=new ArrayList();

    public ArrayList <Sweapon> getData() {
        return data;
    }

    public void setData(ArrayList <Sweapon> data) {
        this.data = data;
    }

    public RepositorioSweapons(ArrayList<Sweapon> data) {
        this.data = data;
        Collections.sort(data);
    }

    public ArrayList <Sweapon> getDataFiltred(String Quality, String blade) {
        ArrayList <Sweapon> aux= new ArrayList();
        for(Sweapon s: data){
            if(s.getQuality().equals(Quality) && s.getClase().equals(blade)){
                
                aux.add(s);
            }
        }
        //Collections.sort(aux);
        
        return aux;
    }

    public Sweapon foundElement(String quality, String blade,int level) {
        for(Sweapon s : data){
             if(s.getQuality().equals(quality) && s.getClase().equals(blade) && s.getLevel()==level){
                return s;
            }
        }
        return null;
    }
    public String getBonus(Sweapon start,Sweapon end,String clase){
        
        String cadena="";
        int inicio=0,fin=0,i=0;
         for(Sweapon s:data){
                if(start.getQuality().equals(s.getQuality()) && start.getLevel()==s.getLevel() && s.getClase().equals(start.getClase())){
                    inicio=i;
                }
                
                if(end.getQuality().equals(s.getQuality()) && end.getLevel()==s.getLevel() && s.getClase().equals(end.getClase())){
                    fin=i;
                    break;   
                }
                i++;
            }
              int count=1;
              if(inicio==fin){
                  return "";
              }
         for(int j=inicio;j<=fin;j++){
             if((!data.get(j).getBonus().equals("no")) && data.get(j).getClase().equals(clase)){
                    cadena+="Bonus "+count+" : "+data.get(j).getBonus()+"<br>";
                    count++;
                    System.out.println("Entro");
             }
         }
            
        
        return cadena;
        
    }

    public Sweapon calculateCost(Sweapon start, Sweapon end) {
        int inicio=0,fin=0,i=0;
         for(Sweapon s:data){
                if(start.getQuality().equals(s.getQuality()) && start.getLevel()==s.getLevel() && s.getClase().equals(start.getClase())){
                    inicio=i;
                }
                
                if(end.getQuality().equals(s.getQuality()) && end.getLevel()==s.getLevel() && s.getClase().equals(end.getClase())){
                    fin=i;
                    break;   
                }
                i++;
            }
            Sweapon a= new Sweapon();
         for(int j=inicio;j<=fin;j++){
             if(data.get(j).getClase().equals(start.getClase())){
                 a.setEnhanceCost(a.getEnhanceCost()+data.get(j).getEnhanceCost());
                 a.setLostJades(a.getLostJades()+data.get(j).getLostJades());
                 a.setArtifactsCore(a.getArtifactsCore()+data.get(j).getArtifactsCore());    
             }
         }
         return a;
    }

    

    
    
    
}
