/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package eco.app.panel;

import eco.app.entity.Order;
import eco.app.entity.Product.BillItem;
import eco.app.entity.Voucher;
import eco.app.helper.Convertor;
import eco.app.helper.SaveData;
import eco.app.helper.ShareData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class BillPanel extends javax.swing.JPanel {

    private List<BillItem> billItems = new ArrayList<>();
    private Order order;
    private Voucher voucher;

    public BillPanel() {
        initComponents();

        setBackground(SaveData.BG_HEADER);
    }

    public BillPanel(List<BillItem> billItems, Order order) {
        this.billItems = billItems;
        this.order = order;
        initComponents();
    }

    public void reload() {

        int tempTotal = 0;

        if (order == null) {
            // MessageHelper.showMessage(this, "Order is null");
            return;
        } else {
            int  idCustomer = order.getCustomerId();
            lblOrder.setText(order.getId() + "");
            lblIdCustomer.setText(idCustomer  == 0 ? "Undefined" : idCustomer + "");
            lblIdEmployee.setText(order.getEmployeeId() + "");
            lblDateTime.setText(Convertor.dateTimeToString(order.getTimeCreate()));




        }

        if (billItems.isEmpty()) {
            // MessageHelper.showMessage(this, "The bill without card missing products");
            return;
        } else {

            DefaultTableModel model = (DefaultTableModel) tblBillItem.getModel();

            model.setRowCount(0);

            for (BillItem item : billItems) {

                int price = item.getProduct().getPrice();
                int quantity = item.getQuantity();
                int total = price * quantity;
                tempTotal += total;

                model.addRow(new Object[] {
                        item.getProduct().getName(),
                        Convertor.formatCurrency(price),
                        quantity,
                        Convertor.formatCurrency(total) + " VND"
                });

            }
        }

        lblTempTotal.setText(Convertor.formatCurrency(tempTotal) + " VND");

        insertVoucher(tempTotal);

    }

    private void insertVoucher(int tempTotal) {
        if (voucher == null) {
            lblCodeVoucher.setText("No voucher");
            lblDiscount.setText("0 VND");
            lblTotal.setText(lblTempTotal.getText());
        } else {
            lblCodeVoucher.setText(voucher.getCode());

            int discount = (int) voucher.getDiscount(tempTotal);
            lblDiscount.setText(Convertor.formatCurrency(discount) + " VND");
            lblTotal.setText(Convertor.formatCurrency(tempTotal - discount) + " VND");
        }
    }

    public List<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(List<BillItem> billItems) {
        this.billItems = billItems;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblDateTime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblOrder = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblIdCustomer = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblIdEmployee = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBillItem = new eco.app.myswing.TableCustom();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblTempTotal = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblCodeVoucher = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 0));
        setMaximumSize(new java.awt.Dimension(406, 32767));

        jPanel2.setBackground(SaveData.BG_CONTENT);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(SaveData.NAME_SHOP);
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Address: 137 Nguyen Thi Thap, Lien Chieu, Da Nang");

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phone number: 0383914506");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout(15, 0));

        lblDateTime.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateTime.setText("12/12/2022 12:39");
        lblDateTime.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 2));
        jPanel3.add(lblDateTime, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Date");
        jPanel3.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout(15, 0));

        lblOrder.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblOrder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrder.setText("2322");
        lblOrder.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 2));
        jPanel4.add(lblOrder, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("Order");
        jPanel4.add(jLabel7, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout(15, 0));

        lblIdCustomer.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblIdCustomer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdCustomer.setText("12312312");
        lblIdCustomer.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 2));
        jPanel5.add(lblIdCustomer, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("Customer");
        jPanel5.add(jLabel9, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout(15, 0));

        lblIdEmployee.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblIdEmployee.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEmployee.setText(ShareData.USER_LOGIN.getId() + "");
        lblIdEmployee.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 2));
        jPanel6.add(lblIdEmployee, java.awt.BorderLayout.CENTER);

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel11.setText("Seller");
        jPanel6.add(jLabel11, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel6);

        jPanel7.setOpaque(false);

        tblBillItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBillItem);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("Temporary total");
        jPanel9.add(jLabel12, java.awt.BorderLayout.LINE_START);

        lblTempTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTempTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTempTotal.setText("100.500 VND");
        jPanel9.add(lblTempTotal, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel9);

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setText("Voucher");
        jPanel10.add(jLabel14, java.awt.BorderLayout.LINE_START);

        lblCodeVoucher.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCodeVoucher.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodeVoucher.setText("SELL50%");
        jPanel10.add(lblCodeVoucher, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setText("Discount");
        jPanel11.add(jLabel16, java.awt.BorderLayout.LINE_START);

        lblDiscount.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDiscount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDiscount.setText("-10.500 VND");
        jPanel11.add(lblDiscount, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel11);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setText("Total");
        jPanel12.add(jLabel18, java.awt.BorderLayout.LINE_START);

        lblTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("100.500 VND");
        jPanel12.add(lblTotal, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel12);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCodeVoucher;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblIdCustomer;
    private javax.swing.JLabel lblIdEmployee;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblTempTotal;
    private javax.swing.JLabel lblTotal;
    private eco.app.myswing.TableCustom tblBillItem;
    // End of variables declaration//GEN-END:variables
}
