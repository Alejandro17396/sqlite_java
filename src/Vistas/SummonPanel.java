/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import Model.RepositorioSummon;
import Model.Summon;
import Model.Wings;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Todomelocomo
 */
public class SummonPanel extends javax.swing.JPanel {

    /**
     * Creates new form SummonPanel
     */
    private RepositorioSummon m;
    public SummonPanel(ArrayList <Summon> data) {
        initComponents();
        m=new RepositorioSummon(data);
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
        x50Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        x50Label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        totalExpLabel = new javax.swing.JLabel();
        startLevelTextField = new javax.swing.JTextField();
        bonusStatsLabel = new javax.swing.JLabel();
        endLevel = new javax.swing.JLabel();
        statsLabel1 = new javax.swing.JLabel();
        endLevelTextField = new javax.swing.JTextField();
        x200Label = new javax.swing.JLabel();
        x500Label = new javax.swing.JLabel();
        x1000Label = new javax.swing.JLabel();
        x1000Label2 = new javax.swing.JLabel();
        x500Label3 = new javax.swing.JLabel();
        x200Label1 = new javax.swing.JLabel();
        statsLabel2 = new javax.swing.JLabel();
        x1Label = new javax.swing.JLabel();
        x50Label3 = new javax.swing.JLabel();

        setLayout(null);

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });
        add(calculateButton);
        calculateButton.setBounds(920, 590, 128, 41);

        x50Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Summon/x50.PNG"))); // NOI18N
        x50Label.setText("jLabel6");
        add(x50Label);
        x50Label.setBounds(30, 280, 71, 68);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(560, 20, 460, 390);

        x50Label1.setText("x50 Boost : 0");
        add(x50Label1);
        x50Label1.setBounds(120, 310, 150, 14);

        jLabel1.setText("Start level");
        add(jLabel1);
        jLabel1.setBounds(32, 33, 71, 31);

        totalExpLabel.setText("Total silver needed ");
        add(totalExpLabel);
        totalExpLabel.setBounds(33, 124, 262, 14);

        startLevelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startLevelTextFieldActionPerformed(evt);
            }
        });
        add(startLevelTextField);
        startLevelTextField.setBounds(158, 33, 137, 31);
        add(bonusStatsLabel);
        bonusStatsLabel.setBounds(730, 500, 147, 135);

        endLevel.setText("End  level");
        add(endLevel);
        endLevel.setBounds(32, 75, 71, 31);
        add(statsLabel1);
        statsLabel1.setBounds(380, 500, 147, 135);

        endLevelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endLevelTextFieldActionPerformed(evt);
            }
        });
        add(endLevelTextField);
        endLevelTextField.setBounds(158, 75, 136, 31);

        x200Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Summon/x200.PNG"))); // NOI18N
        x200Label.setText("jLabel6");
        add(x200Label);
        x200Label.setBounds(30, 370, 71, 68);

        x500Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Summon/x500.PNG"))); // NOI18N
        x500Label.setText("jLabel6");
        add(x500Label);
        x500Label.setBounds(30, 450, 71, 67);

        x1000Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Summon/x1000.PNG"))); // NOI18N
        x1000Label.setText("jLabel6");
        add(x1000Label);
        x1000Label.setBounds(30, 530, 71, 71);

        x1000Label2.setText("x1000 Boost  : 0");
        add(x1000Label2);
        x1000Label2.setBounds(120, 560, 170, 14);

        x500Label3.setText("x500 Boost : 0");
        add(x500Label3);
        x500Label3.setBounds(120, 480, 170, 14);

        x200Label1.setText("x200 Boost  : 0");
        add(x200Label1);
        x200Label1.setBounds(120, 390, 190, 14);
        add(statsLabel2);
        statsLabel2.setBounds(560, 500, 147, 135);

        x1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LevelPanel/Summon/x1.PNG"))); // NOI18N
        x1Label.setText("jLabel6");
        add(x1Label);
        x1Label.setBounds(30, 190, 71, 76);

        x50Label3.setText("x1 Boost : 0");
        add(x50Label3);
        x50Label3.setBounds(120, 220, 150, 14);
    }// </editor-fold>//GEN-END:initComponents
    int start=-1;
    int end=-1;
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        start=m.getIndex(startLevelTextField.getText());//;Integer.parseInt(startLevelTextField.getText());
        end=m.getIndex(endLevelTextField.getText());
        start1=m.getSummon(start);
        end1=m.getSummon(end);
        
   
            long totalExp=0;

            for(int i=start;i<end;i++){
                totalExp+=(long)m.getData().get(i).getExp();
            }
            long clicks=totalExp/144;
            long x50=clicks/50;
            long x200=clicks/200;
            long x500=clicks/500;
            long x1000=clicks/1000;
            System.out.println(clicks);
            totalExpLabel.setText("Totatl silver needed "+(clicks)*15000);
            x50Label3.setText("x1 Boost : "+clicks);
            x50Label1.setText("x50 Boost : "+x50+1);
            x200Label1.setText("x200 Boost : "+x200+1);
            x500Label3.setText("x500 Boost : "+x500+1);
            x1000Label2.setText("x1000 Boost : "+x1000+1);
        
        
    }//GEN-LAST:event_calculateButtonActionPerformed

    Summon start1;
    Summon end1;
    
    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

        DefaultTableModel modelo = (DefaultTableModel) Table.getModel();
        int fila=Table.getSelectedRow();
        Summon aux= m.getData().get(fila);

        if(start==-1 || fila<start){
            start1=aux;
            start=fila;
            startLevelTextField.setText(start1.getName());
            statsLabel1.setText("<html>"+setStatsLabel(aux));
        }else if(end==-1 || fila>end ){
            end1=aux;
            end=fila;
            endLevelTextField.setText(end1.getName());
            statsLabel2.setText("<html>"+setStatsLabel(aux));
        }else{
            start1=aux;
            start=fila;
            startLevelTextField.setText(start1.getName());
            statsLabel1.setText("<html>"+setStatsLabel(aux));
        }
        
        
        if(start!=-1 && end!=-1){
            
            bonusStatsLabel.setText("<html>"+createBonusLabel(start1,end1));
        }
        
    }//GEN-LAST:event_TableMouseClicked

    
    
    private String createBonusLabel(Summon start1, Summon end1) {
        
        Summon aux=new Summon();
        aux.setForce(end1.getForce()-start1.getForce());
        aux.setChakra(end1.getChakra()-start1.getChakra());
        aux.setSpeed(end1.getSpeed()-start1.getSpeed());
        aux.setPower(end1.getPower()-start1.getPower());
        aux.setRefineBonus(end1.getRefineBonus()-start1.getRefineBonus());
        System.out.println(aux.toString());
        
        String text="";
        text+="Force        : "+aux.getForce()+"<br>";
        text+="Chakra       : "+aux.getChakra()+"<br>";
        text+="Agi          : "+aux.getSpeed()+"<br>";
        text+="Power        : "+aux.getPower()+"<br>";
        text+="RefineBonus  : "+aux.getRefineBonus()+"<br>";
       
        return text; 
       
        
    }
    
     private String setStatsLabel(Summon aux) {
        String text="";
        text+="Level        : "+aux.getName()+"<br>";
        text+="Exp level    : "+aux.getExp()+"<br>";
        text+="Force        : "+aux.getForce()+"<br>";
        text+="Chakra       : "+aux.getChakra()+"<br>";
        text+="Power        : "+aux.getPower()+"<br>";
    
        return text;  
        
    }
    
    
    private void startLevelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startLevelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startLevelTextFieldActionPerformed

    private void endLevelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endLevelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endLevelTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JLabel bonusStatsLabel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel endLevel;
    private javax.swing.JTextField endLevelTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField startLevelTextField;
    private javax.swing.JLabel statsLabel1;
    private javax.swing.JLabel statsLabel2;
    private javax.swing.JLabel totalExpLabel;
    private javax.swing.JLabel x1000Label;
    private javax.swing.JLabel x1000Label2;
    private javax.swing.JLabel x1Label;
    private javax.swing.JLabel x200Label;
    private javax.swing.JLabel x200Label1;
    private javax.swing.JLabel x500Label;
    private javax.swing.JLabel x500Label3;
    private javax.swing.JLabel x50Label;
    private javax.swing.JLabel x50Label1;
    private javax.swing.JLabel x50Label3;
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
          "Level","Exp level","Silver cost"
        };
        
        for(String s :titulos){
              marco.addColumn(s);
        }
        for(String [] s : table){
            marco.addRow(s);
        }
    }
    private String [][] createTable(){
        String matriz[][]=new String[m.getData().size()][3];
       
        ArrayList <Summon> aux=m.getData();
        for(int i=0;i<aux.size();i++){
            matriz[i][0]=aux.get(i).getName();
            matriz[i][1]=String.format("%.0f", aux.get(i).getExp());
            matriz[i][2]=String.format("%.0f", aux.get(i).getSilverCost());
        }
        return matriz;
    }



}
