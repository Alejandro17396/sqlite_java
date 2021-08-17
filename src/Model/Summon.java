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
public class Summon implements Comparable <Summon>{
    private String name;
    private int level;
    private long force;
    private long chakra;
    private long speed;
    private long power;
    private double exp;
    private int boostExp;
    private int RefineBonus;
    private double silverCost;

    public Summon(String name, int level, long force, long chakra, long speed, long power, 
            double exp, int boostExp, int RefineBonus, double silverCost) {
        this.name = name;
        this.level = level;
        this.force = force;
        this.chakra = chakra;
        this.speed = speed;
        this.power = power;
        this.exp = exp;
        this.boostExp = boostExp;
        this.RefineBonus = RefineBonus;
        this.silverCost = silverCost;
    }

    public Summon(int level, long force, long chakra, long speed, long power, double exp, int boostExp, int RefineBonus, double silverCost) {
        this.level = level;
        this.force = force;
        this.chakra = chakra;
        this.speed = speed;
        this.power = power;
        this.exp = exp;
        this.boostExp = boostExp;
        this.RefineBonus = RefineBonus;
        this.silverCost = silverCost;
    }

    public static Summon factoryMethod(String s,String name){
        String [] fragments = s.split("\t");
        
         String name1=name.replaceAll(".txt", "-"+fragments[0]);
         int level=Integer.parseInt(fragments[0]);
         long force=Long.parseLong(fragments[1]);
         long chakra=Long.parseLong(fragments[1]);;
         long speed=Long.parseLong(fragments[1]);;
         long power=Long.parseLong(fragments[2]);;
         double exp=Double.parseDouble(fragments[3]);;
         int boostExp=Integer.parseInt(fragments[4]);;
         int RefineBonus=Integer.parseInt(fragments[5].replaceAll("%",""));
         double silverCost=Double.parseDouble(fragments[6]);
        
        return new Summon(name1,level,force,chakra,speed,power,exp,boostExp,RefineBonus,silverCost);
    }

    public Summon() {
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

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public int getBoostExp() {
        return boostExp;
    }

    public void setBoostExp(int boostExp) {
        this.boostExp = boostExp;
    }

    public int getRefineBonus() {
        return RefineBonus;
    }

    public void setRefineBonus(int RefineBonus) {
        this.RefineBonus = RefineBonus;
    }

    public double getSilverCost() {
        return silverCost;
    }

    public void setSilverCost(double silverCost) {
        this.silverCost = silverCost;
    }

    @Override
    public String toString() {
        return "Summon{" + "name=" + name + ", level=" + level + ", force=" + force + ", chakra=" + chakra + ", speed=" + speed + ", power=" + power + ", exp=" + exp + ", boostExp=" + boostExp + ", RefineBonus=" + RefineBonus + ", silverCost=" + silverCost + '}';
    }


    @Override
    public int compareTo(Summon t) {
       if(this.getForce()>t.getForce()){
           return 1;
       }else if(this.getForce()==t.getForce()){
           return 0;
       }
       return -1;
    }
    
    
    
}
