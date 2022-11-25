/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package eco.app.panel;

import eco.app.component.Container;
import eco.app.component.Header;
import eco.app.component.Menu;
import eco.app.event.MenuEvent;
import eco.app.swing.MenuItem;
import eco.app.swing.model.MenuModel;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author Lenovo
 */
public class EmployeePanel extends javax.swing.JPanel {

    private MigLayout layout;
    private Header header;
    private Menu menu;
    private Container container;
    private Animator animator;
    private boolean close = false;
    private final int W_CLOSE = 61;
    private final int W_OPEN = 205;

    private MenuItem customersItem = new MenuItem(new MenuModel("Customers", "customer.png"));
    private MenuItem productsItem = new MenuItem(new MenuModel("Products", "product.png"));
    private MenuItem orderItem = new MenuItem(new MenuModel("Order", "order.png"));
    private MenuItem inforItem = new MenuItem(new MenuModel("Infor", "infor.png"));

    public EmployeePanel() {
        initComponents();
        init();

    }

    private void init() {

        // Khởi tạo các phần của app
        menu = new Menu();
        header = new Header();
        container = new Container();

        // Khởi tạo layout
        layout = new MigLayout("fill,", "0[]0[fill]0", "0[]0[]0");
        this.setLayout(layout);
        this.add(menu, "w 205!,h 100%, spany 2");
        this.add(header, "w 100%,h 60!, wrap");
        this.add(container, "w 100%, h 100%");

        // Tạo animator
        initAnimator();

        // Thêm menu con
        menu.addMenuItem(customersItem);
        menu.addMenuItem(productsItem);
        menu.addMenuItem(orderItem);
        menu.addMenuItem(inforItem);

        // Tạo sự kiện cho menu con
        initMenuItemEvent();

    }

    public void initMenuItemEvent() {

        productsItem.addEvent(new MenuEvent() {
            @Override
            public void menuClick() {
                container.changeComponent(new ProductPanel());
            }

        });
        
        customersItem.addEvent(new MenuEvent() {
            @Override
            public void menuClick() {
                container.changeComponent(new CustomerPanel());
            }
        });
        
        orderItem.addEvent(new MenuEvent() {
            @Override
            public void menuClick() {
                container.changeComponent(new OrderPanel());
            }
        });
        

    }

    private void initAnimator() {

        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {

                // Độ rộng Menu
                int w;

                // Tính độ rộng menu
                if (!close) {
                    w = (int) (205 - ((W_OPEN - W_CLOSE) * fraction));
                } else {
                    w = (int) (W_CLOSE + ((W_OPEN - W_CLOSE) * fraction));
                }

                layout.setComponentConstraints(menu, "w " + w + "!,h 100%, spany 2");
                revalidate();
                repaint();
            }

            @Override
            public void end() {
                close = !close;
            }

        };

        animator = new Animator(200, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);

        header.getBtnShow().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                animator.start();
            }

        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}