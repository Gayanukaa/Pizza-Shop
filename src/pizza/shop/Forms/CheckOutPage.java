/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizza.shop.Forms;

import java.awt.Color;
import javax.swing.BorderFactory;
import pizza.shop.Classes.GoldCustomers;
import pizza.shop.Classes.NormalCustomer;

/**
 *
 * @author gayanukaamarasuriya
 */
public class CheckOutPage extends javax.swing.JFrame {

    /**
     * Creates new form CheckOutPage
     */
    int positionX = 0, positionY = 0;
    
    private NormalCustomer normalCustomer;
    private GoldCustomers goldCustomer;
    String customerType;
    
    CheckOutPage(NormalCustomer normalCustomer) {
        initComponents();
        this.normalCustomer = normalCustomer;
        customerType = "N";
        
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,1));
    }

    CheckOutPage(GoldCustomers goldcustomer) {
        initComponents();
        this.goldCustomer = goldcustomer;
        customerType = "G";    
    
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,1));
    }

    public CheckOutPage() {
        initComponents();
        
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pickupButton = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        deliveryButton = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        MenuBar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(211, 211, 211));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Mshtakan", 1, 42)); // NOI18N
        jLabel1.setText("Check Out Counter");

        pickupButton.setBackground(new java.awt.Color(255, 204, 0));
        pickupButton.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        pickupButton.setText("PickUp");
        pickupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupButtonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        deliveryButton.setBackground(new java.awt.Color(255, 204, 0));
        deliveryButton.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        deliveryButton.setText("Delivery");
        deliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 102));
        jButton3.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jButton3.setText("Continue");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 102));
        jButton4.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jButton4.setText("Show Pizza Count");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 102));
        jButton5.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jButton5.setText("END");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        MenuBar.setBackground(new java.awt.Color(153, 153, 153));
        MenuBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuBarMouseDragged(evt);
            }
        });
        MenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuBarMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Mshtakan", 1, 14)); // NOI18N
        jLabel4.setText("Payment Screen");

        jButton13.setBackground(new java.awt.Color(255, 51, 0));
        jButton13.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("X");
        jButton13.setMaximumSize(new java.awt.Dimension(29, 30));
        jButton13.setMinimumSize(new java.awt.Dimension(29, 29));
        jButton13.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(153, 204, 255));
        jButton14.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton14.setText("-");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createSequentialGroup()
                        .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10))
                    .addGroup(MenuBarLayout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(198, 198, 198))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(deliveryButton)
                        .addGap(105, 105, 105)
                        .addComponent(pickupButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryButton)
                    .addComponent(pickupButton))
                .addGap(30, 30, 30)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void MenuBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMouseDragged
        // JFrame MouseMotionListner -> MouseDragged
        //set JFrame Location
        setLocation(evt.getXOnScreen() -positionX, evt.getYOnScreen() -positionY);
    }//GEN-LAST:event_MenuBarMouseDragged

    private void MenuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_MenuBarMousePressed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void deliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryButtonActionPerformed
        pickupButton.setSelected(!deliveryButton.isSelected());
    }//GEN-LAST:event_deliveryButtonActionPerformed

    private void pickupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupButtonActionPerformed
        deliveryButton.setSelected(!pickupButton.isSelected());
    }//GEN-LAST:event_pickupButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckOutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckOutPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuBar;
    private javax.swing.JRadioButton deliveryButton;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton pickupButton;
    // End of variables declaration//GEN-END:variables
}
