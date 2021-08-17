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
public class Potency {
    private String name;
    private int lv;
    private long attack;
    private long strategyDefense;
    private long physicalDefense;
    private long speed;
    private long health;
    private long exp;

    public Potency(String name, int lv, long attack, long strategyDefense, long physicalDefense, long speed, long health, long exp) {
        this.name = name;
        this.lv = lv;
        this.attack = attack;
        this.strategyDefense = strategyDefense;
        this.physicalDefense = physicalDefense;
        this.speed = speed;
        this.health = health;
        this.exp = exp;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public long getAttack() {
        return attack;
    }

    public void setAttack(long attack) {
        this.attack = attack;
    }

    public long getStrategyDefense() {
        return strategyDefense;
    }

    public void setStrategyDefense(long strategyDefense) {
        this.strategyDefense = strategyDefense;
    }

    public long getPhysicalDefense() {
        return physicalDefense;
    }

    public void setPhysicalDefense(long physicalDefense) {
        this.physicalDefense = physicalDefense;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }
        
     public static Potency factoryMethod(String s){
        String [] fragments=s.split("\t");
        String name=fragments[0];
        int level=Integer.parseInt(fragments[1]);
        long attack=Long.parseLong(fragments[2]);
        long strategyDefense=Long.parseLong(fragments[3]);
        long physicalDefense=Long.parseLong(fragments[4]);
        long speed=Long.parseLong(fragments[5]);
        long health=Long.parseLong(fragments[6]);
        long exp=Long.parseLong(fragments[7]);
        return new Potency(name,level,attack,strategyDefense,physicalDefense,speed,health,exp);
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Potency{" + "name=" + name + ", lv=" + lv + ", attack=" + attack + ", strategyDefense=" + strategyDefense + ", physicalDefense=" + physicalDefense + ", speed=" + speed + ", health=" + health + ", exp=" + exp + '}';
    }

    public String asPlainTableRow() {
        return name+"\t"+lv+"\t"+attack+"\t"+strategyDefense+"\t"+physicalDefense+"\t"+speed+"\t"+health+"\t"+exp;
    }
    
    
    
}
