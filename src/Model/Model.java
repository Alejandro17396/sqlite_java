/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Todomelocomo
 */
public class Model {
    private ArrayList <Level> lvs;
    private ArrayList <Potency> potency;
    private ArrayList <Summon> summonLevels;
    private ArrayList <Senjutsu> senjutsuLevels;
    private ArrayList <Wings> wings;
    private ArrayList <NinjaBond> bonds;
    private ArrayList <Sweapon> sweapons;

    public ArrayList<Sweapon> getSweapons() {
        return sweapons;
    }

    public void setSweapons(ArrayList<Sweapon> sweapons) {
        this.sweapons = sweapons;
    }

   
    
    public Model() {
       lvs=new ArrayList();
       potency=new ArrayList();
       summonLevels=new ArrayList();
       senjutsuLevels=new ArrayList();
       wings=new ArrayList();
       bonds=new ArrayList();
       sweapons=new ArrayList();
    }

    public ArrayList <Level> getLvs() {
        return lvs;
    }

    
     public void importLevelsBBDD() throws IOException {
         String ruta1 = System.getProperty("user.dir")
                +File.separator
                +"BBDD"
                +File.separator
                +"Naruto.db";
    
        String ur1="jdbc:sqlite:"+ruta1;
        Connection conexion;
        try{
            conexion=DriverManager.getConnection(ur1);

            ResultSet resul=null;
            PreparedStatement st=conexion.prepareStatement("select * from Level");
            resul=st.executeQuery();

            while(resul.next()){
               // model.addRow(new Object[]{resul.getInt("Level_ID"),resul.getString("Level_Name")});
               lvs.add(new Level(resul.getString("Level_Name"),resul.getInt("Level_ID"),resul.getDouble("Exp"),resul.getDouble("Exp_total")));
            }
            conexion.close();

        }catch(Exception x){
            JOptionPane.showMessageDialog(null,x.getMessage().toString());
        }
      }
     public void importpotencyBBDD() throws IOException {
         String ruta1 = System.getProperty("user.dir")
                +File.separator
                +"BBDD"
                +File.separator
                +"Naruto.db";
    
        String ur1="jdbc:sqlite:"+ruta1;
        Connection conexion;
        try{
            conexion=DriverManager.getConnection(ur1);

            ResultSet resul=null;
            PreparedStatement st=conexion.prepareStatement("select * from potency");
            resul=st.executeQuery();

            while(resul.next()){
               // model.addRow(new Object[]{resul.getInt("Level_ID"),resul.getString("Level_Name")});
               potency.add(new Potency(resul.getString("Name"),resul.getInt("level"),
                       resul.getInt("attack"),resul.getInt("strategyDefense"),
                       resul.getInt("physicalDefense"),resul.getInt("attack"),
                       resul.getInt("health"),resul.getInt("exp")));
            }
            conexion.close();

        }catch(Exception x){
            JOptionPane.showMessageDialog(null,x.getMessage().toString());
        }
        
      }
     
        public void importsummonlevelsBBDD() throws IOException {
         String ruta1 = System.getProperty("user.dir")
                +File.separator
                +"BBDD"
                +File.separator
                +"Naruto.db";
    
        String ur1="jdbc:sqlite:"+ruta1;
        Connection conexion;
        try{
            conexion=DriverManager.getConnection(ur1);

            ResultSet resul=null;
            PreparedStatement st=conexion.prepareStatement("select * from summon");
            resul=st.executeQuery();

            while(resul.next()){
               // model.addRow(new Object[]{resul.getInt("Level_ID"),resul.getString("Level_Name")});
               summonLevels.add(new Summon(resul.getString("Name"),resul.getInt("level"),resul.getInt("force"),
                       resul.getInt("chakra"),resul.getInt("speed"),resul.getInt("power"),
                       resul.getDouble("exp"),resul.getInt("boostExp"),
                       resul.getInt("RefineBonus"),resul.getDouble("silverCost")));
            }
            conexion.close();

        }catch(Exception x){
            JOptionPane.showMessageDialog(null,x.getMessage().toString());
        }
        
      }
        
        public void importsenjutsuLevelsBBDD() throws IOException {
        String ruta1 = System.getProperty("user.dir")
                +File.separator
                +"BBDD"
                +File.separator
                +"Naruto.db";
    
        String ur1="jdbc:sqlite:"+ruta1;
        Connection conexion;
        try{
            conexion=DriverManager.getConnection(ur1);

            ResultSet resul=null;
            PreparedStatement st=conexion.prepareStatement("select * from senjutsu");
            resul=st.executeQuery();

            while(resul.next()){
               // model.addRow(new Object[]{resul.getInt("Level_ID"),resul.getString("Level_Name")});
               senjutsuLevels.add(new Senjutsu(resul.getString("Name"),resul.getInt("level"),
                       resul.getInt("exp"),resul.getInt("totalExp"),resul.getInt("force"),
                       resul.getInt("chakra"),resul.getLong("agi")));
            }
            
            conexion.close();

        }catch(Exception x){
            JOptionPane.showMessageDialog(null,x.getMessage().toString());
        }
        
      }
          
      public void importwingsBBDD() throws IOException {
         String ruta1 = System.getProperty("user.dir")
                +File.separator
                +"BBDD"
                +File.separator
                +"Naruto.db";
    
        String ur1="jdbc:sqlite:"+ruta1;
        Connection conexion;
        try{
            conexion=DriverManager.getConnection(ur1);

            ResultSet resul=null;
            PreparedStatement st=conexion.prepareStatement("select * from wings");
            resul=st.executeQuery();

            while(resul.next()){
               // model.addRow(new Object[]{resul.getInt("Level_ID"),resul.getString("Level_Name")});
               wings.add(new Wings(resul.getString("Name"),resul.getInt("level"),
                       resul.getInt("exp"),resul.getInt("totalExp"),resul.getInt("force"),
                       resul.getInt("chakra"),resul.getLong("agi"),resul.getLong("power"),
                       resul.getInt("increase"),resul.getString("damageRate"),
                       resul.getString("avoidInjury")));
            }
            
            conexion.close();

        }catch(Exception x){
            JOptionPane.showMessageDialog(null,x.getMessage().toString());
        }
        
      }
     
      public void importbondBBDD() throws IOException {
         String ruta1 = System.getProperty("user.dir")
                +File.separator
                +"BBDD"
                +File.separator
                +"Naruto.db";
    
        String ur1="jdbc:sqlite:"+ruta1;
        Connection conexion;
        try{
            conexion=DriverManager.getConnection(ur1);

            ResultSet resul=null;
            PreparedStatement st=conexion.prepareStatement("select * from bond");
            resul=st.executeQuery();

            while(resul.next()){
               // model.addRow(new Object[]{resul.getInt("Level_ID"),resul.getString("Level_Name")});
               bonds.add(new NinjaBond(resul.getString("Name"),resul.getInt("level"),
                       resul.getInt("stats"),resul.getInt("exp"),resul.getString("bond"),
                       resul.getLong("hp"),resul.getLong("assaulterAttack"),resul.getLong("speed"),
                       resul.getLong("attack"),resul.getLong("defense"),resul.getLong("bonus"),resul.getString("statbonus")));
            } 
            conexion.close();

        }catch(Exception x){
            JOptionPane.showMessageDialog(null,x.getMessage().toString());
        }
      }
      
     public void importSweaponsBBDD() throws IOException {
         String ruta1 = System.getProperty("user.dir")
                +File.separator
                +"BBDD"
                +File.separator
                +"Naruto.db";
    
        String ur1="jdbc:sqlite:"+ruta1;
        Connection conexion;
        try{
            conexion=DriverManager.getConnection(ur1);

            ResultSet resul=null;
            PreparedStatement st=conexion.prepareStatement("select * from Sweapon");
            resul=st.executeQuery();

            while(resul.next()){
               // model.addRow(new Object[]{resul.getInt("Level_ID"),resul.getString("Level_Name")});
               sweapons.add(new Sweapon(resul.getString("Quality"),resul.getInt("level"),
                       resul.getLong("stats"),resul.getInt("EnhanceCost"),resul.getInt("lostJades"),
                       resul.getInt("artifactsCore"),resul.getString("Bonus"),
                       resul.getString("class")));
            }
            
            conexion.close();

        }catch(Exception x){
            JOptionPane.showMessageDialog(null,x.getMessage().toString());
        }
        
      }
     
     
     public void mostrarSweapons(){
         
         for(Sweapon s: sweapons){
             System.out.println(s.toString());
         }
     }
      
      
      
      public void mostrarbonds(){
          for(NinjaBond b:bonds){
              System.out.println(b.toString());
          }
      }
     
      
      
      public void mostrarwings(){
          for(Wings w:wings){
              System.out.println(w.toString());
          }
      }
     
     public void mostrarSenjutsu(){
         for(Senjutsu s:senjutsuLevels){
             System.out.println(s.toString());
         }
     }

     public void mostrarPotency() {
       for(Potency p:potency){
           System.out.println(p.asPlainTableRow());
       }
    }
     
    public void mostrarLevels() {
       for(Level l:lvs){
           System.out.println(l.toString());
       }
    }
    
    

    public ArrayList <Potency> getPotency() {
        return potency;
    }

    public void setPotency(ArrayList <Potency> potency) {
        this.potency = potency;
    }

    public ArrayList <Summon> getSummonLevels() {
        return summonLevels;
    }

    public void setSummonLevels(ArrayList <Summon> summonLevels) {
        this.summonLevels = summonLevels;
    }

        
    
    public void showSummon(){
        
        for(Summon s: summonLevels){
            System.out.println(s.toString());
        }
    }

    public ArrayList <Senjutsu> getSenjutsuLevels() {
        return senjutsuLevels;
    }

    public void setSenjutsuLevels(ArrayList <Senjutsu> senjutsuLevels) {
        this.senjutsuLevels = senjutsuLevels;
    }

    public ArrayList <Wings> getWings() {
        return wings;
    }

    public void setWings(ArrayList <Wings> wings) {
        this.wings = wings;
    }

    public ArrayList <NinjaBond> getBonds() {
        return bonds;
    }

    public void setBonds(ArrayList <NinjaBond> bonds) {
        this.bonds = bonds;
    }

    
    
}
