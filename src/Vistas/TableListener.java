/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JTable;

/**
 *
 * @author Alex
 */
public class TableListener {
    private javax.swing.JTable Table;
    private String bonus;
    private String bondname;

    public TableListener(JTable Table, String bonus, String bondname) {
        this.Table = Table;
        this.bonus = bonus;
        this.bondname = bondname;
    }
    public TableListener(JTable Table, String bonus) {
        this.Table = Table;
        this.bonus = bonus;
    }

    public javax.swing.JTable getTable() {
        return Table;
    }

    public void setTable(javax.swing.JTable Table) {
        this.Table = Table;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getBondname() {
        return bondname;
    }

    public void setBondname(String bondname) {
        this.bondname = bondname;
    }
    
    
}
