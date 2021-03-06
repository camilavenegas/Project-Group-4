/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.guiproject.view;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class DataCards extends javax.swing.JFrame {

    /**
     * Creates new form Card
     */
    private final String ruta = System.getProperties().getProperty("user.dir");

    public DataCards() {
        initComponents();
        System.out.println("Velastegui Alex --> 25 Project Refactoring GUI");
        setIconImage(new ImageIcon(getClass().getResource("/ec/edu./espe/guiproject/images/liquorStorepng.png")).getImage());

        File archivo = null;
        FileReader FileR = null;
        BufferedReader BufferedR = null;

        String cardsJson = "";
        ArrayList<Card> cards = new ArrayList<>();
        Gson gson = new Gson();
        try {
            archivo = new File(ruta + "//Cards.json");
            FileR = new FileReader(archivo);
            BufferedR = new BufferedReader(FileR);
            String line;

            DefaultComboBoxModel cardList = new DefaultComboBoxModel();
            while ((line = BufferedR.readLine()) != null) {

                cardsJson = cardsJson + line;
            }
            java.lang.reflect.Type cardsType = new TypeToken<ArrayList<Card>>() {
            }.getType();
            cards = gson.fromJson(cardsJson, cardsType);

            for (Card card : cards) {
                cardList.addElement(card.getDescription());
            }
            cmbCard.setModel((ComboBoxModel<String>) cardList);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");

        } finally {
            try {
                if (null != FileR) {
                    FileR.close();
                }
            } catch (IOException e2) {

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlCardInput = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwordCardId = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        passwordCode = new javax.swing.JPasswordField();
        cmbCard = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("CARD");

        jLabel2.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel2.setText("Liquor Store");

        jLabel3.setText("User :");

        txtUser.setToolTipText("Enter your User Name, Please don't special characters");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        jLabel4.setText("Code :");

        jLabel5.setText("Type :");

        jLabel6.setText("Date of expiration :");

        jLabel7.setText("Card ID :");

        passwordCardId.setToolTipText("Enter yout correct ID, please only numbers");
        passwordCardId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCardIdActionPerformed(evt);
            }
        });
        passwordCardId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordCardIdKeyTyped(evt);
            }
        });

        jDateChooser1.setToolTipText(" Put your card expiration date");
        jDateChooser1.setDateFormatString("dd, MMMMMM, yyyy");

        passwordCode.setToolTipText("Enter your Code, please only numbers");
        passwordCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCodeActionPerformed(evt);
            }
        });
        passwordCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordCodeKeyTyped(evt);
            }
        });

        cmbCard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCardInputLayout = new javax.swing.GroupLayout(pnlCardInput);
        pnlCardInput.setLayout(pnlCardInputLayout);
        pnlCardInputLayout.setHorizontalGroup(
            pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardInputLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordCardId, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbCard, javax.swing.GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE)
                        .addComponent(passwordCode, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlCardInputLayout.setVerticalGroup(
            pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardInputLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordCardId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnlCardInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setForeground(new java.awt.Color(240, 0, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(33, 33, 33))
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/guiproject/images/IconCard.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnlCardInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(pnlCardInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtUserActionPerformed

    private void passwordCardIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCardIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordCardIdActionPerformed

    private void passwordCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordCodeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        File topics;
        FileWriter file; //    = new FileWriter("Customer.json"))
        PrintWriter line;

        JsonObject object = new JsonObject();
        JsonArray list = new JsonArray();
        topics = new File("Customer.json");

        if (!topics.exists()) {
            try {
                topics.createNewFile();

                object.addProperty("User", txtUser.getText());
                object.addProperty("Password", passwordCardId.getText());
                object.addProperty("Code", passwordCode.getText());
                file = new FileWriter(topics, true);
                line = new PrintWriter(file);
                line.println("\n");
                list.add(object);
                file.write(list.toString());
                file.flush();
                System.exit(0);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                topics.createNewFile();

                object.addProperty("User", txtUser.getText());
                object.addProperty("Password", passwordCardId.getText());
                object.addProperty("Code", passwordCode.getText());
                file = new FileWriter(topics, true);
                line = new PrintWriter(file);
                line.println("\n");
                list.add(object);
                file.write(list.toString());
                file.flush();
                System.exit(0);

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void passwordCardIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordCardIdKeyTyped
        // TODO add your handling code here:
        char letter = evt.getKeyChar();

        if (Character.isLetter(letter)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Please only numbers!!!");

        }
        if (passwordCardId.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordCardIdKeyTyped

    private void passwordCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordCodeKeyTyped
        // TODO add your handling code here:
        char letter = evt.getKeyChar();

        if (Character.isLetter(letter)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Please only numbers!!!");

        }
        if (passwordCode.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordCodeKeyTyped

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:
        char letter = evt.getKeyChar();

        if (Character.isDigit(letter)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Please not numbers!!!");

        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void cmbCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCardActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbCardActionPerformed

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
            java.util.logging.Logger.getLogger(DataCards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataCards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataCards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataCards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataCards().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCard;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passwordCardId;
    private javax.swing.JPasswordField passwordCode;
    private javax.swing.JPanel pnlCardInput;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
