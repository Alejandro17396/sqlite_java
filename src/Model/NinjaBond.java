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
public class NinjaBond {
    private String Bondname;
    private int level;
    private int stats;
    private int exp;
    private String ninjaBond;
    private long hp;
    private long assaulterAttack;
    private long speed;
    private long attack;
    private long defense;
    private long bonus;
    private String tipoBonus;

    @Override
    public String toString() {
        return "NinjaBond{" + "Bondname=" + Bondname + ", level=" + level + ", stats=" + stats + ", exp=" + exp + ", ninjaBond=" + ninjaBond + 
                ", hp=" + hp + ", assaulterAttack=" + assaulterAttack + ", speed=" + speed + ", attack=" + attack + ", defense=" + defense + 
                ", bonus=" + bonus + ", tipoBonus=" + tipoBonus + '}';
    }

    public NinjaBond() {
    }

    public String getTipoBonus() {
        return tipoBonus;
    }

    public void setTipoBonus(String tipoBonus) {
        this.tipoBonus = tipoBonus;
    }

    

    public NinjaBond(String Bondname, int level, int stats, int exp, String ninjaBond,
            long hp, long assaulterAttack, long speed, long attack, long defense, 
            long bonus) {
        this.Bondname = Bondname;
        this.level = level;
        this.stats = stats;
        this.exp = exp;
        this.ninjaBond = ninjaBond;
        this.hp = hp;
        this.assaulterAttack = assaulterAttack;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.bonus = bonus;
      
    }
    public NinjaBond(String Bondname, int level, int stats, int exp, String ninjaBond,
            long hp, long assaulterAttack, long speed, long attack, long defense, 
            long bonus,String tipoBonus) {
        this.Bondname = Bondname;
        this.level = level;
        this.stats = stats;
        this.exp = exp;
        this.ninjaBond = ninjaBond;
        this.hp = hp;
        this.assaulterAttack = assaulterAttack;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.bonus = bonus;
        this.tipoBonus=tipoBonus;
      
    }


    public String getBondname() {
        return Bondname;
    }

    public void setBondname(String Bondname) {
        this.Bondname = Bondname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getNinjaBond() {
        return ninjaBond;
    }

    /* @Override
    public String toString() {
    return "Bond{" + "name=" + name + ", hp=" + hp + ", assaulterAttack=" + assaulterAttack + ", speed=" + speed + ", attack=" + attack + ", defense=" + defense + ", bonus=" + bonus + '}';
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }*/
    public void setNinjaBond(String ninjaBond) {
        this.ninjaBond = ninjaBond;
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public long getAssaulterAttack() {
        return assaulterAttack;
    }

    public void setAssaulterAttack(long assaulterAttack) {
        this.assaulterAttack = assaulterAttack;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getAttack() {
        return attack;
    }

    public void setAttack(long attack) {
        this.attack = attack;
    }

    public long getDefense() {
        return defense;
    }

    public void setDefense(long defense) {
        this.defense = defense;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

  
    
    
    
}
