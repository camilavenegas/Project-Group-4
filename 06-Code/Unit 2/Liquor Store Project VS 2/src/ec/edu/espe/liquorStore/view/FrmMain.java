/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.view;

import ec.edu.espe.liquorStore.controller.BeverageController;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmNewUser
     */
    public FrmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuLiquorStore = new javax.swing.JMenu();
        btnExit = new javax.swing.JMenuItem();
        menuExploreStore = new javax.swing.JMenu();
        itmStartOrder = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itmAddBeverage = new javax.swing.JMenuItem();
        itmAddCustomer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/liquorStore/icons/bendito.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/liquorStore/icons/fondo open.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 842, -1));

        menuLiquorStore.setText("Liquor Store");

        btnExit.setText("Exit                        ");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        menuLiquorStore.add(btnExit);

        jMenuBar1.add(menuLiquorStore);

        menuExploreStore.setText("Explore Store");

        itmStartOrder.setText("Start Order");
        itmStartOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itmStartOrderMouseClicked(evt);
            }
        });
        itmStartOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmStartOrderActionPerformed(evt);
            }
        });
        menuExploreStore.add(itmStartOrder);

        jMenuBar1.add(menuExploreStore);

        jMenu3.setText("Admin");

        itmAddBeverage.setText("Add Beverage");
        itmAddBeverage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itmAddBeverageMouseClicked(evt);
            }
        });
        itmAddBeverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAddBeverageActionPerformed(evt);
            }
        });
        jMenu3.add(itmAddBeverage);

        itmAddCustomer.setText("Add Customer");
        itmAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAddCustomerActionPerformed(evt);
            }
        });
        jMenu3.add(itmAddCustomer);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAddBeverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAddBeverageActionPerformed
        // TODO add your handling code here:
        BeverageController beverageController = new BeverageController();
        beverageController.init();
    }//GEN-LAST:event_itmAddBeverageActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void itmStartOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmStartOrderMouseClicked
        // TODO add your handling code here:
        FrmLoginUser login = new FrmLoginUser();
        login.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_itmStartOrderMouseClicked

    private void itmStartOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmStartOrderActionPerformed
        // TODO add your handling code here:
        FrmLoginUser login = new FrmLoginUser();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmStartOrderActionPerformed

    private void itmAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAddCustomerActionPerformed
        // TODO add your handling code here:
        FrmNewUser newUser = new FrmNewUser();
        newUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmAddCustomerActionPerformed

    private void itmAddBeverageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmAddBeverageMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_itmAddBeverageMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem itmAddBeverage;
    private javax.swing.JMenuItem itmAddCustomer;
    private javax.swing.JMenuItem itmStartOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuExploreStore;
    private javax.swing.JMenu menuLiquorStore;
    // End of variables declaration//GEN-END:variables
}