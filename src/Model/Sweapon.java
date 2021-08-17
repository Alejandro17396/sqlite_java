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
public class Sweapon implements Comparable <Sweapon>{
    
    private String Quality;
    private int level;
    private long stats;
    private int EnhanceCost;
    private int lostJades;
    private int artifactsCore;
    private String Bonus;
    private String clase;

    public Sweapon(String Quality, int level, long stats, int EnhanceCost, 
            int lostJades, int artifactsCore, String Bonus, String clase) {
        this.Quality = Quality;
        this.level = level;
        this.stats = stats;
        this.EnhanceCost = EnhanceCost;
        this.lostJades = lostJades;
        this.artifactsCore = artifactsCore;
        this.Bonus = Bonus;
        this.clase = clase;
    }

    public Sweapon() {
    }
    
    public Sweapon(String Quality, int level, long stats, int EnhanceCost, int lostJades, int artifactsCore, String Bonus) {
        this.Quality = Quality;
        this.level = level;
        this.stats = stats;
        this.EnhanceCost = EnhanceCost;
        this.lostJades = lostJades;
        this.artifactsCore = artifactsCore;
        this.Bonus = Bonus;
    }

    
    
    
    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    public String getQuality() {
        return Quality;
    }

    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getStats() {
        return stats;
    }

    public void setStats(long stats) {
        this.stats = stats;
    }

    public int getEnhanceCost() {
        return EnhanceCost;
    }

    public void setEnhanceCost(int EnhanceCost) {
        this.EnhanceCost = EnhanceCost;
    }

    public int getLostJades() {
        return lostJades;
    }

    public void setLostJades(int lostJades) {
        this.lostJades = lostJades;
    }

    public int getArtifactsCore() {
        return artifactsCore;
    }

    public void setArtifactsCore(int artifactsCore) {
        this.artifactsCore = artifactsCore;
    }

    public String getBonus() {
        return Bonus;
    }

    public void setBonus(String Bonus) {
        this.Bonus = Bonus;
    }

    @Override
    public String toString() {
        return "Sweapon{" + "Quality=" + Quality + ", level=" + level + ", stats=" + stats + ", EnhanceCost=" + EnhanceCost + ", lostJades=" + lostJades + ", artifactsCore=" + artifactsCore + ", Bonus=" + Bonus + ", clase=" + clase + '}';
    }

   
 @Override
    public int compareTo(Sweapon t) {
       int este=Integer.parseInt(this.getQuality().replaceAll("Quality", ""));
        int otro=Integer.parseInt(t.getQuality().replaceAll("Quality", ""));
        if(este>otro){
            return 1;
        }else if(este==otro)  {
            return 0;
        }
        return -1;
    }
   
    
    

    
    
}
