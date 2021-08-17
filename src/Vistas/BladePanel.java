/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.Level;
import Model.RepositorioSweapons;
import Model.Sweapon;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Todomelocomo
 */
public class BladePanel extends javax.swing.JPanel {

    /**
     * Creates new form BladePanel
     */
    private RepositorioSweapons m;
    public BladePanel(ArrayList <Sweapon> data) {
        initComponents();
        m= new RepositorioSweapons(data);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Quality1Button = new javax.swing.JButton();
        Quality2Button = new javax.swing.JButton();
        Quality3Button = new javax.swing.JButton();
        Quality4Button = new javax.swing.JButton();
        Quality5Button = new javax.swing.JButton();
        Quality6Button = new javax.swing.JButton();
        Quality7Button = new javax.swing.JButton();
        Quality8Button = new javax.swing.JButton();
        Quality9Button = new javax.swing.JButton();
        Quality10Button = new javax.swing.JButton();
        Quality11Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        stat1Label = new javax.swing.JLabel();
        bonusLabel = new javax.swing.JLabel();
        stat2Label = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        talismanLabel = new javax.swing.JLabel();
        artifactsCoreLabel = new javax.swing.JLabel();
        lostJadesLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        initialLabel = new javax.swing.JLabel();
        finalLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        Quality1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality1.png"))); // NOI18N
        Quality1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality1ButtonActionPerformed(evt);
            }
        });
        add(Quality1Button);
        Quality1Button.setBounds(50, 20, 56, 51);

        Quality2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality2.png"))); // NOI18N
        Quality2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality2ButtonActionPerformed(evt);
            }
        });
        add(Quality2Button);
        Quality2Button.setBounds(130, 20, 56, 51);

        Quality3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality3.png"))); // NOI18N
        Quality3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality3ButtonActionPerformed(evt);
            }
        });
        add(Quality3Button);
        Quality3Button.setBounds(50, 90, 56, 51);

        Quality4Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality4.png"))); // NOI18N
        Quality4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality4ButtonActionPerformed(evt);
            }
        });
        add(Quality4Button);
        Quality4Button.setBounds(130, 90, 56, 51);

        Quality5Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality5.png"))); // NOI18N
        Quality5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality5ButtonActionPerformed(evt);
            }
        });
        add(Quality5Button);
        Quality5Button.setBounds(50, 160, 56, 51);

        Quality6Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality6.png"))); // NOI18N
        Quality6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality6ButtonActionPerformed(evt);
            }
        });
        add(Quality6Button);
        Quality6Button.setBounds(130, 160, 56, 51);

        Quality7Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality7.png"))); // NOI18N
        Quality7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality7ButtonActionPerformed(evt);
            }
        });
        add(Quality7Button);
        Quality7Button.setBounds(50, 230, 56, 51);

        Quality8Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality8.png"))); // NOI18N
        Quality8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality8ButtonActionPerformed(evt);
            }
        });
        add(Quality8Button);
        Quality8Button.setBounds(130, 230, 56, 51);

        Quality9Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality9.png"))); // NOI18N
        Quality9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality9ButtonActionPerformed(evt);
            }
        });
        add(Quality9Button);
        Quality9Button.setBounds(50, 290, 56, 51);

        Quality10Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality10.png"))); // NOI18N
        Quality10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality10ButtonActionPerformed(evt);
            }
        });
        add(Quality10Button);
        Quality10Button.setBounds(130, 290, 56, 51);

        Quality11Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Blade/Quality11.png"))); // NOI18N
        Quality11Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quality11ButtonActionPerformed(evt);
            }
        });
        add(Quality11Button);
        Quality11Button.setBounds(90, 360, 56, 51);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setModel(marco);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(260, 20, 364, 402);

        stat1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(stat1Label);
        stat1Label.setBounds(10, 510, 229, 130);

        bonusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(bonusLabel);
        bonusLabel.setBounds(570, 510, 262, 133);

        stat2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(stat2Label);
        stat2Label.setBounds(270, 510, 252, 133);

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });
        add(calculateButton);
        calculateButton.setBounds(880, 580, 108, 43);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Items/Sweapon_talisman.PNG"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(720, 180, 52, 53);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Items/Artifacts_Core.PNG"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(720, 350, 52, 53);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Items/Lost_jades.PNG"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(720, 260, 52, 52);

        talismanLabel.setText("0");
        add(talismanLabel);
        talismanLabel.setBounds(810, 200, 46, 10);

        artifactsCoreLabel.setText("0");
        add(artifactsCoreLabel);
        artifactsCoreLabel.setBounds(810, 380, 46, 10);

        lostJadesLabel.setText("0");
        add(lostJadesLabel);
        lostJadesLabel.setBounds(810, 290, 46, 10);

        jLabel7.setText("Total cost to upgrade");
        add(jLabel7);
        jLabel7.setBounds(810, 20, 182, 14);

        initialLabel.setText("From :");
        add(initialLabel);
        initialLabel.setBounds(720, 60, 270, 14);

        finalLabel.setText("To :");
        add(finalLabel);
        finalLabel.setBounds(720, 110, 280, 14);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("To");
        add(jLabel4);
        jLabel4.setBounds(310, 480, 160, 14);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("From");
        add(jLabel5);
        jLabel5.setBounds(70, 480, 100, 14);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Extra");
        add(jLabel6);
        jLabel6.setBounds(670, 480, 60, 14);
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        Sweapon s=m.calculateCost(start,end);
        initialLabel.setText("From : "+start.getQuality()+" Level : "+start.getLevel());
        finalLabel.setText("To :      "+end.getQuality()+" Level : "+end.getLevel());
        talismanLabel.setText(""+s.getEnhanceCost());
        lostJadesLabel.setText(""+s.getLostJades());
        artifactsCoreLabel.setText(""+s.getArtifactsCore());
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        
        if(jTable1.getSelectedRow()==-1){
            return;
        }
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int fila=jTable1.getSelectedRow();
        String quality=(String)modelo.getValueAt(fila, 0);
        String level=(String)modelo.getValueAt(fila, 1);
        String botones []={"From weapon","To weapon"};
        int i=JOptionPane.showOptionDialog(null, "Add weapon to ", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        Sweapon aux=m.foundElement(quality,"force",Integer.parseInt(level));
        if(aux==null){
            return;
        }
        if(start==null && i==0 ){
            start= aux;
            stat1Label.setText(createLabelText(start));
            stat1Label.setHorizontalAlignment(SwingConstants.CENTER);
        }else if(end==null && i==1 && comparar(aux,start )){
            end= aux;
            stat2Label.setText(createLabelText(end));
            stat2Label.setHorizontalAlignment(SwingConstants.CENTER);
        }else if(start!=null && (i==0 && comparar(end,aux)) ){
            start= aux;
            stat1Label.setText(createLabelText(start));
            stat1Label.setHorizontalAlignment(SwingConstants.CENTER);
        }else if(end!=null && (i==1 &&comparar(aux,start))){
            end= aux;
            stat2Label.setText(createLabelText(end));
            stat2Label.setHorizontalAlignment(SwingConstants.CENTER);
        }
        if(start!=null && end!=null){
            String bonusText="";
            bonusText+="Extra force stats : "+(end.getStats()-start.getStats())+"<br>";
            bonusText+=m.getBonus(start,end,"force");
            bonusLabel.setText("<html>"+bonusText);

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void Quality11ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality11ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality11");
    }//GEN-LAST:event_Quality11ButtonActionPerformed

    private void Quality10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality10ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality10");
    }//GEN-LAST:event_Quality10ButtonActionPerformed

    private void Quality9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality9ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality9");
    }//GEN-LAST:event_Quality9ButtonActionPerformed

    private void Quality8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality8ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality8");
    }//GEN-LAST:event_Quality8ButtonActionPerformed

    private void Quality7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality7ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality7");
    }//GEN-LAST:event_Quality7ButtonActionPerformed

    private void Quality6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality6ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality6");
    }//GEN-LAST:event_Quality6ButtonActionPerformed

    private void Quality5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality5ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality5");
    }//GEN-LAST:event_Quality5ButtonActionPerformed

    private void Quality4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality4ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality4");
    }//GEN-LAST:event_Quality4ButtonActionPerformed

    private void Quality3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality3ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality3");
    }//GEN-LAST:event_Quality3ButtonActionPerformed

    private void Quality2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality2ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality2");
    }//GEN-LAST:event_Quality2ButtonActionPerformed

    private void Quality1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quality1ButtonActionPerformed
        // TODO add your handling code here:
        setTable("Quality1");
    }//GEN-LAST:event_Quality1ButtonActionPerformed
   
    Sweapon start=null;
    Sweapon end=null;    private boolean comparar(Sweapon actual, Sweapon nuevo) {
        if(actual ==null || nuevo==null){
            return false;
        }
       if(CompararQuality(actual.getQuality(),nuevo.getQuality())==1){
           return true;
       }else if(CompararQuality(actual.getQuality(),nuevo.getQuality())==0){
                if(actual.getLevel()> nuevo.getLevel()){
                   return true;
                }else if (actual.getLevel()==nuevo.getLevel()){
                    return true;
                }
                
       }
       return false;
    }
    private int CompararQuality(String quality, String quality0) {
        int ac=Integer.parseInt(quality.replaceAll("Quality",""));
        int nu=Integer.parseInt(quality0.replaceAll("Quality",""));
        
        if(ac>nu){
            return 1;
        }else if (ac==nu){
            return 0;
        }
        return -1;
    }
    
    private String createLabelText(Sweapon start) {
        String text="";
        text+=start.getQuality()+"<br>";
        text+="Level : "+start.getLevel()+"<br>";
        text+="Force : "+start.getStats()+"<br>";
        text+="EnhaceCost : "+start.getEnhanceCost()+"<br>";
        if(start.getLostJades()>0)
        text+="Lost Jades: "+start.getLostJades()+"<br>";
        if(start.getArtifactsCore()>0)
        text+="Artifacts Core : "+start.getArtifactsCore()+"<br>";
        if(!start.getBonus().equals("no"))
        text+="Bonus : "+start.getBonus();
        
        
        return "<html>"+text;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Quality10Button;
    private javax.swing.JButton Quality11Button;
    private javax.swing.JButton Quality1Button;
    private javax.swing.JButton Quality2Button;
    private javax.swing.JButton Quality3Button;
    private javax.swing.JButton Quality4Button;
    private javax.swing.JButton Quality5Button;
    private javax.swing.JButton Quality6Button;
    private javax.swing.JButton Quality7Button;
    private javax.swing.JButton Quality8Button;
    private javax.swing.JButton Quality9Button;
    private javax.swing.JLabel artifactsCoreLabel;
    private javax.swing.JLabel bonusLabel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel finalLabel;
    private javax.swing.JLabel initialLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lostJadesLabel;
    private javax.swing.JLabel stat1Label;
    private javax.swing.JLabel stat2Label;
    private javax.swing.JLabel talismanLabel;
    // End of variables declaration//GEN-END:variables
    private void iniciar() {
        setTable("Quality11");
        String text1="";
        text1+="Quality 0"+"<br>";
        text1+="Level 0"+"<br>";
        text1+="Force 0"+"<br>";
        text1+="EnhaceCost 0"+"<br>";
        text1+="Lost Jades 0"+"<br>";
        text1+="Artifacts Core 0"+"<br>";
        stat1Label.setText("<html>"+text1);
        stat2Label.setText("<html>"+text1);
        bonusLabel.setText("Extra force stats: 0");
        
        
    }
    
    DefaultTableModel marco = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
    private void setTable(String Quality) {
        String [][] table=createTable(Quality);
        String [] titulos= new String []{
          "Quality","Level" 
        };
           marco.setNumRows(0);
           marco.setColumnCount(0);
        for(String s :titulos){
            /*if(marco.getColumnCount()==titulos.length){
              continue;  
            }*/
              marco.addColumn(s);
        }
        for(String [] s : table){
            marco.addRow(s);
        }
    }
    
    ArrayList <Sweapon> aux=new ArrayList();
    private String [][] createTable(String Quality){
       String matriz[][]=new String[m.getData().size()][2];
        aux.clear();
        aux=m.getDataFiltred(Quality,"force");
        for(int i=0;i<aux.size();i++){
            
            matriz[i][0]=aux.get(i).getQuality();
            matriz[i][1]=""+aux.get(i).getLevel();
        }
        return matriz;
    }

    

    

    

    

}