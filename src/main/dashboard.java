/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Server
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###");

        try {
            //Kani na code para display ni sa total kong pila ka bouk ang Amortize
            //Registering the Driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //Getting the connection
            String mysqlUrl = "jdbc:mysql://localhost:3306/inventory";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
            //   LActivity.setText("Connected to Database.....\n ");
            //Creating the Statement object
            Statement stmt = con.createStatement();
            //Query to get the number of rows in a table
            String query = "select ifnull(sum(Amount),0) from sales where Date = curdate();";
            //Executing the query
            ResultSet rs = stmt.executeQuery(query);

            //Retrieving the result
            rs.next();
            int count = rs.getInt(1);
            //NEVER QUIT & KEEP LEARNING
            DailyIncome.setText(" " + commaFormat.format(count));
            //this is to get total
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }

        //this is for monthly income
        try {
            //Kani na code para display ni sa total kong pila ka bouk ang Amortize
            //Registering the Driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //Getting the connection
            String mysqlUrl = "jdbc:mysql://localhost:3306/inventory";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
            //   LActivity.setText("Connected to Database.....\n ");
            //Creating the Statement object
            Statement stmt = con.createStatement();
            //Query to get the number of rows in a table
            String query = "select ifnull(sum(Amount),0) from sales where month(Date);";
            //Executing the query
            ResultSet rs = stmt.executeQuery(query);

            //Retrieving the result
            rs.next();
            int count = rs.getInt(1);
            //NEVER QUIT & KEEP LEARNING
            jLabel17.setText(" " + commaFormat.format(count));
            //this is to get total
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }

        //this is for daily net income
        try {
            //Kani na code para display ni sa total kong pila ka bouk ang Amortize
            //Registering the Driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //Getting the connection
            String mysqlUrl = "jdbc:mysql://localhost:3306/inventory";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
            //   LActivity.setText("Connected to Database.....\n ");
            //Creating the Statement object
            Statement stmt = con.createStatement();
            //Query to get the number of rows in a table
            String query = "select ifnull(sum(NetAmount),0) from sales where Date = curdate();";
            //Executing the query
            ResultSet rs = stmt.executeQuery(query);

            //Retrieving the result
            rs.next();
            int count = rs.getInt(1);
            //NEVER QUIT & KEEP LEARNING
            DailyNetIncome.setText(" " + commaFormat.format(count));
            //this is to get total
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        //this is for Net monthly income
        try {
            //Kani na code para display ni sa total kong pila ka bouk ang Amortize
            //Registering the Driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //Getting the connection
            String mysqlUrl = "jdbc:mysql://localhost:3306/inventory";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
            //   LActivity.setText("Connected to Database.....\n ");
            //Creating the Statement object
            Statement stmt = con.createStatement();
            //Query to get the number of rows in a table
            String query = "select ifnull(sum(NetAmount),0) from sales where month(Date);";
            //Executing the query
            ResultSet rs = stmt.executeQuery(query);

            //Retrieving the result
            rs.next();
            int count = rs.getInt(1);
            //NEVER QUIT & KEEP LEARNING
            MonthlyNetIncome.setText(" " + commaFormat.format(count));
            //this is to get total
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        //this code is for to display all sales
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
            String sql = "SELECT * FROM `sales`";
            //  SupplierList.setForeground(Color.black);
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            SalesList.setModel(DbUtils.resultSetToTableModel(rs));
            try {
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        JOptionPane.showMessageDialog(null,"Collecting the all sales...","Please wait... ", JOptionPane.INFORMATION_MESSAGE);

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
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        DailyNetIncome = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DailyIncome = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        MonthlyNetIncome = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        SalesList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("Monthly Net Income");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 110, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("MENU");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 20));

        DailyNetIncome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DailyNetIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DailyNetIncome.setText("0");
        jPanel1.add(DailyNetIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 120, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 50, 120, -1));

        DailyIncome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DailyIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DailyIncome.setText("0");
        DailyIncome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(DailyIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 70, 110, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 13.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 50, 120, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("0");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 70, 120, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 13.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 50, 120, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 19 (1).png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 130, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 19 (1).png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 120, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 19 (1).png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, 30));

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

        MonthlyNetIncome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MonthlyNetIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MonthlyNetIncome.setText("0");
        jPanel1.add(MonthlyNetIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 120, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 140, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rectangle 19 (1).png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 110, -1, 30));

        jLabel28.setText("Monthly Income");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 100, 20));

        jLabel29.setText("Daily net income");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 110, 20));

        jLabel30.setText("Daily income");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, 20));

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
        kButton4.setText("View Expenses");
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
        kButton1.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        kButton1.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 40));

        kButton7.setBackground(new java.awt.Color(255, 255, 255));
        kButton7.setForeground(new java.awt.Color(0, 0, 0));
        kButton7.setText("View Stocks");
        kButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton7.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton7.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton7.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        kButton7.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        kButton7.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton7.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton7.setkStartColor(new java.awt.Color(255, 255, 255));
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

        SalesList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        SalesList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        SalesList.setAutoscrolls(false);
        SalesList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalesList.setRowHeight(25);
        SalesList.setSelectionBackground(new java.awt.Color(255, 51, 51));
        SalesList.setSurrendersFocusOnKeystroke(true);
        SalesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalesListMousePressed(evt);
            }
        });
        jScrollPane19.setViewportView(SalesList);

        jPanel1.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 610, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel21MousePressed

    private void SalesListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesListMousePressed

    }//GEN-LAST:event_SalesListMousePressed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        new addproducts().setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        new expenses().setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        new sales().setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DailyIncome;
    private javax.swing.JLabel DailyNetIncome;
    private javax.swing.JLabel MonthlyNetIncome;
    private javax.swing.JTable SalesList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane19;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton7;
    // End of variables declaration//GEN-END:variables
}
