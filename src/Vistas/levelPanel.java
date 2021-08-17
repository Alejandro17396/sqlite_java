/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.Level;
import Model.Model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Todomelocomo
 */
public class levelPanel extends javax.swing.JPanel {

    /**
     * Creates new form Level_Panel
     */
    Model m;
    public levelPanel(Model m) {
        initComponents();
        this.m=m;
        setLevels();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        startLevelTextField = new javax.swing.JTextField();
        endLevel = new javax.swing.JLabel();
        endLevelTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        yellowScrollLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        purpleScrollLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        greenScrollLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        initialExpTextField = new javax.swing.JTextField();
        totalExpLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        redScrollLabel = new javax.swing.JLabel();

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
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
        Table.setModel(marco);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel1.setText("Start level");

        startLevelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startLevelTextFieldActionPerformed(evt);
            }
        });

        endLevel.setText("End  level");

        endLevelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endLevelTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Special EXP Scroll.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");

        yellowScrollLabel.setText("Epic EXP Scrolls : 0");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/PurpleScroll.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");

        purpleScrollLabel.setText("Advanced EXP Scrolls : 0");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/BlueScroll.PNG"))); // NOI18N
        jLabel6.setText("jLabel6");

        greenScrollLabel.setText("Large EXP Scrolls : 0");

        jLabel8.setText("Ninja initial exp");

        initialExpTextField.setText("0");
        initialExpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialExpTextFieldActionPerformed(evt);
            }
        });

        totalExpLabel.setText("Total Exp needed ");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/yellowScroll.PNG"))); // NOI18N
        jLabel10.setText("jLabel2");

        redScrollLabel.setText("Red EXP Scrolls : 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(endLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(yellowScrollLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(purpleScrollLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(greenScrollLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(redScrollLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(initialExpTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                .addComponent(endLevelTextField, javax.swing.GroupLayout.Alignment.LEADING))))))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalExpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(initialExpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(totalExpLabel)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greenScrollLabel))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purpleScrollLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(yellowScrollLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(redScrollLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents
    private  int start=-1;
    private  int end=-1;
    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int filas []=Table.getSelectedRows();
        /*if(filas.length==1 && startLevelTextField.getText().isEmpty()){
            String aux=Table.get
        }else{
            static int
        }*/
        //String aux= Table.getR
        //System.out.println(Table.getSelectedRow());
        DefaultTableModel modelo = (DefaultTableModel) Table.getModel();
        int fila=Table.getSelectedRow();
        
        if(fila>-1 && startLevelTextField.getText().isEmpty()){
            startLevelTextField.setText((String)modelo.getValueAt(fila, 0));
            start=Table.getSelectedRow();
        }else{
            String temp=(String)modelo.getValueAt(fila, 0);
           if(Table.getSelectedRow()> end && Table.getSelectedRow()>start){
          // endLevelTextField.setText(temp);
           endLevelTextField.setText(temp);
           end=Table.getSelectedRow();
           }else{
              //startLevelTextField.setText((String)modelo.getValueAt(fila, 1));
              startLevelTextField.setText((String)modelo.getValueAt(fila, 0));
                start=Table.getSelectedRow(); 
           }
            
        }
        
               // for(Object o:v){
                   // String aux[]=(String [])v.get(filas[0]);
                   // System.out.println(aux);
                //}
                //v.get(filas[0]);
                
       /* System.out.println(modelo.getValueAt(filas[0], 0));
        System.out.println(modelo.getValueAt(filas[0], 1));
        System.out.println(modelo.getValueAt(filas[0], 2));
        System.out.println(modelo.getValueAt(filas[0], 3));*/
        
    }//GEN-LAST:event_TableMouseClicked

    private void startLevelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startLevelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startLevelTextFieldActionPerformed

    private void endLevelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endLevelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endLevelTextFieldActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        
        if(startLevelTextField.getText().isEmpty() || endLevelTextField.getText().isEmpty()){
            
        }else{
            String start_=startLevelTextField.getText();
            String end_=endLevelTextField.getText();
            int start1=0;//=Integer.parseInt(startLevelTextField.getText());
            int end1=0;//=Integer.parseInt(endLevelTextField.getText());
            try{
                int initialExp=Integer.parseInt(initialExpTextField.getText());
            }catch(NumberFormatException e){
                System.out.println(e);
            }
            
            for(int i=0;i<m.getLvs().size();i++){
                if(m.getLvs().get(i).getName().equals(start_)){
                    if(i==0){
                        start1=i+1;
                    }else{
                        start1=i;
                    }
                   
                }
                if(m.getLvs().get(i).getName().equals(end_)){
                    end1=i;
                    System.out.println("Final encontrado en "+ i+ " e inicio en "+ start1);
                    break;
                }    
            }
            long totalExp=0;
            for(int i=start1-1;i<end1;i++){
                if(m.getLvs().get(i).getName().equals("R2-50") || m.getLvs().get(i).getName().equals("R1-50")|| m.getLvs().get(i).getName().equals("120") ){
                    continue;
                }
                if( (m.getLvs().get(i).getLv()>120 && m.getLvs().get(i).getLv()<=150)){
                    continue;
                }
                totalExp+=m.getLvs().get(i).getExp();
            }
            long greenScrolls=totalExp/20000;
            long purpleScrolls=totalExp/100000;
            long yellowScrolls=totalExp/500000;
            long redScrolls=totalExp/2000000;
            totalExpLabel.setText("Total Exp needed "+(totalExp));
            greenScrollLabel.setText("Large EXP Scrolls : "+(greenScrolls+1));
            purpleScrollLabel.setText("Advanced EXP Scrolls : "+(purpleScrolls+1));
            yellowScrollLabel.setText("Epic EXP Scrolls : "+(yellowScrolls+1));
            redScrollLabel.setText("Red EXP Scrolls : "+(redScrolls+1));
            
            
            
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void initialExpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialExpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialExpTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel endLevel;
    private javax.swing.JTextField endLevelTextField;
    private javax.swing.JLabel greenScrollLabel;
    private javax.swing.JTextField initialExpTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel purpleScrollLabel;
    private javax.swing.JLabel redScrollLabel;
    private javax.swing.JTextField startLevelTextField;
    private javax.swing.JLabel totalExpLabel;
    private javax.swing.JLabel yellowScrollLabel;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel marco = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
    private void setLevels() {
        String [][] table=createTable();
        String [] titulos= new String []{
          "Level","Level_Num","Exp","Total_Exp"  
        };
        
        for(String s :titulos){
              marco.addColumn(s);
        }
        for(String [] s : table){
            marco.addRow(s);
        }
    }
    private String [][] createTable(){
        String matriz[][]=new String[m.getLvs().size()][4];
       
        ArrayList <Level> aux=m.getLvs();
        for(int i=0;i<aux.size();i++){
            
            matriz[i][0]=aux.get(i).getName();
            matriz[i][1]=""+aux.get(i).getLv();
            matriz[i][2]=String.format("%.0f", aux.get(i).getExp());
            matriz[i][3]=String.format("%.0f", aux.get(i).getTotal_exp());
            
        }
        return matriz;
    }
  
}