/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Server
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form loginn
     */
    public login() {
        initComponents();
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        username = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel65 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        kGradientPanel1.setBackground(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkEndColor(new java.awt.Color(84, 149, 246));
        kGradientPanel1.setkStartColor(new java.awt.Color(84, 149, 246));
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User name :");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        kButton1.setForeground(new java.awt.Color(153, 153, 153));
        kButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton1.setkAllowGradient(false);
        kButton1.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 20));

        kButton2.setForeground(new java.awt.Color(153, 153, 153));
        kButton2.setText("Login");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton2.setkAllowGradient(false);
        kButton2.setkBackGroundColor(new java.awt.Color(69, 241, 159));
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        kButton3.setForeground(new java.awt.Color(153, 153, 153));
        kButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton3.setkAllowGradient(false);
        kButton3.setkBackGroundColor(new java.awt.Color(69, 241, 159));
        kGradientPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 10, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sign in into your account.");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LOGIN");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        kGradientPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, -1, -1));

        jTextField3.setBackground(new java.awt.Color(84, 149, 246));
        jTextField3.setBorder(null);
        kGradientPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 250, 30));

        jTextField4.setBackground(new java.awt.Color(84, 149, 246));
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 250, 30));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 250, 10));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 80));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (2).png"))); // NOI18N
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (2).png"))); // NOI18N
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (2).png"))); // NOI18N
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (2).png"))); // NOI18N
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (2).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Mask group (1).png"))); // NOI18N
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Mask group (2).png"))); // NOI18N
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Mask group (4).png"))); // NOI18N
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 60, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (2).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (1).png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Ellipse 5.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/c2.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/C2 (2).png"))); // NOI18N
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        kGradientPanel2.setBackground(new java.awt.Color(204, 255, 204));
        kGradientPanel2.setkEndColor(new java.awt.Color(84, 149, 246));
        kGradientPanel2.setkStartColor(new java.awt.Color(84, 149, 246));
        kGradientPanel2.setName(""); // NOI18N
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(84, 149, 246));
        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        kGradientPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 250, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 250, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 250, 10));

        kButton4.setForeground(new java.awt.Color(153, 153, 153));
        kButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton4.setkAllowGradient(false);
        kButton4.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        kButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kButton4MousePressed(evt);
            }
        });
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 20));

        kButton5.setForeground(new java.awt.Color(153, 153, 153));
        kButton5.setText("Login");
        kButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton5.setkAllowGradient(false);
        kButton5.setkBackGroundColor(new java.awt.Color(69, 241, 159));
        kButton5.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton5.setkHoverColor(new java.awt.Color(69, 241, 159));
        kButton5.setkHoverEndColor(new java.awt.Color(0, 255, 102));
        kButton5.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        kButton5.setkHoverStartColor(new java.awt.Color(69, 241, 159));
        kButton5.setkPressedColor(new java.awt.Color(69, 241, 159));
        kButton5.setkSelectedColor(new java.awt.Color(51, 255, 153));
        kButton5.setName(""); // NOI18N
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        kButton6.setForeground(new java.awt.Color(153, 153, 153));
        kButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton6.setkAllowGradient(false);
        kButton6.setkBackGroundColor(new java.awt.Color(69, 241, 159));
        kButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kButton6MousePressed(evt);
            }
        });
        kGradientPanel2.add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 10, 20));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Sign in into your account.");
        kGradientPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("LOGIN");
        kGradientPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        password.setBackground(new java.awt.Color(84, 149, 246));
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        kGradientPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 250, 30));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("User name :");
        kGradientPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        kGradientPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 150, 10));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Password :");
        kGradientPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(84, 149, 246));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.setToolTipText("");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 340, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 0, 550, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton4MousePressed
        System.exit(0);
    }//GEN-LAST:event_kButton4MousePressed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        if (username.getText().equals("admin") || password.getPassword().equals("0147")) {
            new dashboard().setVisible(true);
            dispose();
        } else if (username.getText().equals("cashier") || password.getPassword().equals("0258")) {
            new cashier_dash().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton6MousePressed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_kButton6MousePressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            password.setEchoChar((char) 0); //password = JPasswordField
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
         if (username.getText().equals("admin") || password.getPassword().equals("0147")) {
            new dashboard().setVisible(true);
            dispose();
        } else if (username.getText().equals("cashier") || password.getPassword().equals("0258")) {
            new cashier_dash().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
    private static class ResultSet {

        public ResultSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}