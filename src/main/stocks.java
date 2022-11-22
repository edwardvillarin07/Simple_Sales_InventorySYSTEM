/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Server
 */
public class stocks extends javax.swing.JFrame {

    /**
     * Creates new form stocks
     */
    public stocks() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        CustomersTable = new javax.swing.JTable();
        Date2 = new com.toedter.calendar.JDateChooser();
        Date1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("MENU");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 20));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 30.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 31.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        kButton3.setBackground(new java.awt.Color(255, 204, 204));
        kButton3.setForeground(new java.awt.Color(0, 0, 0));
        kButton3.setText("Add Products");
        kButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton3.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton3.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverColor(new java.awt.Color(255, 204, 204));
        kButton3.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        kButton3.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        kButton3.setkPressedColor(new java.awt.Color(255, 204, 204));
        kButton3.setkSelectedColor(new java.awt.Color(255, 204, 204));
        kButton3.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 40));

        kButton4.setBackground(new java.awt.Color(255, 255, 255));
        kButton4.setForeground(new java.awt.Color(0, 0, 0));
        kButton4.setText("Expenses");
        kButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton4.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton4.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        kButton4.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        kButton4.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton4.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 110, 40));

        kButton1.setBackground(new java.awt.Color(255, 255, 255));
        kButton1.setForeground(new java.awt.Color(0, 0, 0));
        kButton1.setText("View Sales");
        kButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton1.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 40));

        kButton7.setBackground(new java.awt.Color(255, 204, 204));
        kButton7.setForeground(new java.awt.Color(0, 0, 0));
        kButton7.setText("View Stocks");
        kButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton7.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton7.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton7.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        kButton7.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        kButton7.setkPressedColor(new java.awt.Color(255, 204, 204));
        kButton7.setkSelectedColor(new java.awt.Color(255, 204, 204));
        kButton7.setkStartColor(new java.awt.Color(255, 204, 204));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, 40));

        kButton5.setBackground(new java.awt.Color(255, 255, 255));
        kButton5.setForeground(new java.awt.Color(0, 0, 0));
        kButton5.setText("View Suppliers");
        kButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton5.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton5.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton5.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        kButton5.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        kButton5.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton5.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton5.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 12 (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 390));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("MENU");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 20));

        CustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        CustomersTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        CustomersTable.setAutoscrolls(false);
        CustomersTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CustomersTable.setRowHeight(25);
        CustomersTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        CustomersTable.setSurrendersFocusOnKeystroke(true);
        CustomersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CustomersTableMousePressed(evt);
            }
        });
        jScrollPane19.setViewportView(CustomersTable);

        jPanel1.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 600, 240));

        Date2.setDateFormatString("yyyy-MM-dd");
        Date2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(Date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 180, 40));

        Date1.setDateFormatString("yyyy-MM-dd");
        Date1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 180, 40));

        jLabel2.setText("To : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel3.setText("From : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        kButton2.setText("Submit");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(0, 204, 102));
        kButton2.setkEndColor(new java.awt.Color(0, 204, 102));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 204, 102));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 204, 102));
        kButton2.setkPressedColor(new java.awt.Color(0, 204, 102));
        kButton2.setkSelectedColor(new java.awt.Color(0, 204, 102));
        kButton2.setkStartColor(new java.awt.Color(0, 204, 102));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 110, 40));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setText("LIST OF STOCKS");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 180, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel21MousePressed

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel22MousePressed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        java.sql.Date Date = new java.sql.Date(Date1.getDate().getTime());
        java.sql.Date Date1 = new java.sql.Date(Date2.getDate().getTime());
        if (Date2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Date is required!");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
                String sql = "SELECT * FROM `products` WHERE Date BETWEEN '" + Date + "' AND '" + Date1 + "'";
                PreparedStatement pstm = con.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();

                CustomersTable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    private void CustomersTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersTableMousePressed

    }//GEN-LAST:event_CustomersTableMousePressed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        new expenses().setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        new addproducts().setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        new sales().setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        new stocks().setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton7ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        new suppliers().setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomersTable;
    private com.toedter.calendar.JDateChooser Date1;
    private com.toedter.calendar.JDateChooser Date2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane19;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton7;
    // End of variables declaration//GEN-END:variables
}