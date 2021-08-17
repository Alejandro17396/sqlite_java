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
public class Wings {
    private String name;
    private int level;
    private long exp;
    private long totalExp;
    private long force;
    private long chakra;
    private long agi;
    private long power;
    private int increase;
    private String damageRate;
    private String avoidInjury;

    public Wings(String name, int level, long exp, long totalExp, long force, 
            long chakra, long agi, long power, int increase, String damageRate, 
            String avoidInjury) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.totalExp = totalExp;
        this.force = force;
        this.chakra = chakra;
        this.agi = agi;
        this.power = power;
        this.increase = increase;
        this.damageRate = damageRate;
        this.avoidInjury = avoidInjury;
    }

    public Wings() {
    }
    
    
    public static Wings factoryMethod(String s){
        String [] fragments=s.split("\t");
        
        String name=fragments[0];
        int level=Integer.parseInt(fragments[0]);
        long exp=Long.parseLong(fragments[1]);
        long totalExp=Long.parseLong(fragments[2]);
        long force=Long.parseLong(fragments[3]);
        long chakra=Long.parseLong(fragments[3]);
        long agi=Long.parseLong(fragments[3]);
        long power=Long.parseLong(fragments[5]);
        int increase=Integer.parseInt(fragments[4]);
        String damageRate=fragments[6];
        String avoidInjury=fragments[6];
        return new Wings(name,level,exp,totalExp,force,chakra,agi,power,increase,damageRate,avoidInjury);
        
    }

    @Override
    public String toString() {
        return "Wings{" + "name=" + name + ", level=" + level + ", exp=" + exp + ", totalExp=" + totalExp + ", force=" + force + ", chakra=" + chakra + ", agi=" + agi + ", power=" + power + ", increase=" + increase + ", damageRate=" + damageRate + ", avoidInjury=" + avoidInjury + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    public long getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(long totalExp) {
        this.totalExp = totalExp;
    }

    public long getForce() {
        return force;
    }

    public void setForce(long force) {
        this.force = force;
    }

    public long getChakra() {
        return chakra;
    }

    public void setChakra(long chakra) {
        this.chakra = chakra;
    }

    public long getAgi() {
        return agi;
    }

    public void setAgi(long agi) {
        this.agi = agi;
    }

    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    public int getIncrease() {
        return increase;
    }

    public void setIncrease(int increase) {
        this.increase = increase;
    }

    public String getDamageRate() {
        return damageRate;
    }

    public void setDamageRate(String damageRate) {
        this.damageRate = damageRate;
    }

    public String getAvoidInjury() {
        return avoidInjury;
    }

    public void setAvoidInjury(String avoidInjury) {
        this.avoidInjury = avoidInjury;
    }
    
    
    
}
