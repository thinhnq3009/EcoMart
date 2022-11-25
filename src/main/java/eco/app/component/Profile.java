/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package eco.app.component;

import eco.app.helper.SaveData;

/**
 *
 * @author Lenovo
 */
public class Profile extends javax.swing.JPanel {

    
    
    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        lblNameShop.setText(SaveData.NAME_SHOP);
        lblNameShop.setForeground(SaveData.TEXT);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblNameShop = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 0, 0));
        setMaximumSize(new java.awt.Dimension(205, 70));
        setMinimumSize(new java.awt.Dimension(205, 70));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(205, 70));
        setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eco/app/icon/mini-logo-v5.png"))); // NOI18N
        add(jLabel2, java.awt.BorderLayout.LINE_START);

        lblNameShop.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 24)); // NOI18N
        lblNameShop.setForeground(new java.awt.Color(207, 245, 231));
        lblNameShop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNameShop.setText("Name");
        lblNameShop.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        add(lblNameShop, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNameShop;
    // End of variables declaration//GEN-END:variables
}
