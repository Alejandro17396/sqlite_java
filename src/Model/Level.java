/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Todomelocomo
 */
public class Level {
    private int lv;
    private String name;
    private double exp;
    private double total_exp;

    public Level(String name ,int lv, double exp, double total_exp) {
        this.name=name;
        this.lv = lv;
        this.exp = exp;
        this.total_exp = total_exp;
    }

    public double getTotal_exp() {
        return total_exp;
    }

    public void setTotal_exp(double total_exp) {
        this.total_exp = total_exp;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }
    
    public static Level factoryMethod(String s){
        String [] frag=s.split("\t");
        
        int level=Integer.parseInt(frag[0]);
        if(level>= 200 && level<=250){
            String name="R1-"+(level-200);
            return new Level(name,Integer.parseInt(frag[0]),Double.parseDouble(frag[1]),Double.parseDouble(frag[2]));
        }else if(level>= 300 && level<=350){
            String name="R2-"+(level-300);
            return new Level(name,Integer.parseInt(frag[0]),Double.parseDouble(frag[1]),Double.parseDouble(frag[2]));
        }else if(level>= 400 && level<=450){
            String name="R3-"+(level-400);
            return new Level(name,Integer.parseInt(frag[0]),Double.parseDouble(frag[1]),Double.parseDouble(frag[2]));
        }else{
            String name=""+level;
            return new Level(name,Integer.parseInt(frag[0]),Double.parseDouble(frag[1]),Double.parseDouble(frag[2]));
        }
        
       
    }

    @Override
    public String toString() {
        return name+" "+lv+" "+exp+" "+total_exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
