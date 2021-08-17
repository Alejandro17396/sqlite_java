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
public class Senjutsu {
    private String name;
    private int level;
    private int exp;
    private long totalExp;
    private long  force;
    private long chakra;
    private long agi;

    @Override
    public String toString() {
        return "Senjutsu{" + "name=" + name + ", level=" + level + ", exp=" + exp + ", totalExp=" + totalExp + ", force=" + force + ", chakra=" + chakra + ", agi=" + agi + '}';
    }

    public static Senjutsu factoryMethod(String s){
        String [] fragments=s.split("\t");
        int level=Integer.parseInt(fragments[1]);
        
        if(level>100){
            String name=fragments[0];
            int exp=Integer.parseInt(fragments[2]);
            long totalExp=Long.parseLong(fragments[3]);
            return new Senjutsu(name,level,exp,totalExp);
        }else{
            String name=fragments[1];
            int exp=Integer.parseInt(fragments[2]);
            long totalExp=Long.parseLong(fragments[3]);
            return new Senjutsu(name,level,exp,totalExp);
        }

    }
    
    public Senjutsu(String name, int level, int exp, long totalExp) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.totalExp = totalExp;
    }

    public Senjutsu(String name, int level, int exp, long totalExp, long force, long chakra, long agi) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.totalExp = totalExp;
        this.force = force;
        this.chakra = chakra;
        this.agi = agi;
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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
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
    
    
    
}
