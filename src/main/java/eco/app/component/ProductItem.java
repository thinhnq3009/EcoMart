/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package eco.app.component;

import eco.app.helper.SaveData;
import java.awt.BorderLayout;

/**
 *
 * @author Lenovo
 */
public class ProductItem extends javax.swing.JPanel {

    /**
     * Creates new form Product
     */
    public ProductItem() {
        initComponents();
        this.add(pnPlus, BorderLayout.EAST);
        setBackground(SaveData.PRODUCT_ITEM);
        btnPlus.setRound(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPlus = new javax.swing.JPanel();
        textFieldCustom1 = new eco.app.swing.TextFieldCustom();
        btnPlus = new eco.app.swing.ButtonRandius();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        pnPlus.setOpaque(false);

        textFieldCustom1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldCustom1.setText("1");
        textFieldCustom1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textFieldCustom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldCustom1MouseClicked(evt);
            }
        });
        textFieldCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustom1ActionPerformed(evt);
            }
        });

        btnPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eco/app/icon/plus.png"))); // NOI18N
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPlusLayout = new javax.swing.GroupLayout(pnPlus);
        pnPlus.setLayout(pnPlusLayout);
        pnPlusLayout.setHorizontalGroup(
            pnPlusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPlusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPlusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnPlusLayout.setVerticalGroup(
            pnPlusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPlusLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textFieldCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Product Item");

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel3.setText("Brand: Pessi");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel4.setText("Descriptions");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jLabel6.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel6.setText("Discount: 5%");
        jPanel2.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel7.setText("Quantity: 999");
        jPanel2.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel8.setText("Price: 34.499 VND");
        jPanel2.add(jLabel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eco/app/icon/temp-product-item.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(jLabel1, java.awt.BorderLayout.LINE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom1ActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlusActionPerformed

    private void textFieldCustom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldCustom1MouseClicked
        textFieldCustom1.selectAll();
    }//GEN-LAST:event_textFieldCustom1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private eco.app.swing.ButtonRandius btnPlus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnPlus;
    private eco.app.swing.TextFieldCustom textFieldCustom1;
    // End of variables declaration//GEN-END:variables
}
