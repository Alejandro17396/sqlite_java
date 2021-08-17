/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.Model;

/**
 *
 * @author Todomelocomo
 */
public class SweaponPanel extends javax.swing.JPanel {

    /**
     * Creates new form SweaponPanel
     */
    Model m;
    public SweaponPanel(Model m) {
        initComponents();
        this.m=m;
        iniciarVista();
    }

    private void setComboBox(){
      /* jComboBox1.addItem("Blade");
        jComboBox1.addItem("Mirror");
        jComboBox1.addItem("Fan");
        jComboBox1.addItem("Gourd");
       /* jComboBox1.addItem("Quality 1");
        jComboBox1.addItem("Quality 2");
        jComboBox1.addItem("Quality 3");
        jComboBox1.addItem("Quality 4");
        jComboBox1.addItem("Quality 5");
        jComboBox1.addItem("Quality 6");
        jComboBox1.addItem("Quality 7");
        jComboBox1.addItem("Quality 8");
        jComboBox1.addItem("Quality 9");
        jComboBox1.addItem("Quality 10");
        jComboBox1.addItem("Quality 11");*/
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    private BladePanel p1;
    private MirrorPanel p2;
    private FanPanel p3;
    private GourdPanel p4;
    private void iniciarVista() {
        p1=new BladePanel(m.getSweapons());
        jTabbedPane1.addTab("Blade", p1);
        p2=new MirrorPanel(m.getSweapons());
        jTabbedPane1.addTab("Mirror", p2);
        p3=new FanPanel(m.getSweapons());
        jTabbedPane1.addTab("Fan", p3);
        p4=new GourdPanel(m.getSweapons());
        jTabbedPane1.addTab("Gourd", p4);
    }
}