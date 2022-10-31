/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shubh's PC
 */
public class hosp extends javax.swing.JPanel {

    /**
     * Creates new form hosp
     */
     Connection con ;
     PreparedStatement ps;
     ResultSet rs;
    public hosp() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jn = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        jar = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        jct = new javax.swing.JTextField();
        jcrt = new javax.swing.JButton();
        jdlt = new javax.swing.JButton();
        jupd = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(186, 79, 84));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Area", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Hospital Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Area:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("City:");

        jcrt.setText("Create");
        jcrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcrtActionPerformed(evt);
            }
        });

        jdlt.setText("Delete");
        jdlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdltActionPerformed(evt);
            }
        });

        jupd.setText("Update");
        jupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jn)
                    .addComponent(jar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jct, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jcrt)
                        .addGap(41, 41, 41)
                        .addComponent(jdlt)
                        .addGap(28, 28, 28)
                        .addComponent(jupd)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcrt)
                    .addComponent(jdlt)
                    .addComponent(jupd))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String tn = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tar = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tct = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
     
        jn.setText(tn);
        jar.setText(tar);
        jct.setText(tct);
       

    }//GEN-LAST:event_jTable1MousePressed

    private void jcrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcrtActionPerformed
        // TODO add your handling code here:

        String n = jn.getText();
        String ar = jar.getText();
        String ct  = jct.getText();
     

        if (n.isBlank()|| ar.isBlank()|| ct.isBlank() )
        {
            JOptionPane.showMessageDialog(this,
                "Please enter all fields ",
                " Try again",
                JOptionPane.ERROR_MESSAGE);

        }
        else
        {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed","root","root");

                String qry ="Insert into hospital_directory (hospitalName,AreaName,city) value(?,?,?)";
                ps =con.prepareStatement(qry);
                ps.setString(1, n);
                ps.setString(2, ar);
                ps.setString(3, ct);
               
                ps.execute();

               

                JOptionPane.showMessageDialog(null, "Saved" );
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (SQLException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jcrtActionPerformed

    private void jdltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdltActionPerformed
        // TODO add your handling code here:
        int Row = jTable1.getSelectedRow();

        if (Row <0)

        {
            JOptionPane.showMessageDialog(this,
                "No Row is selected! Please select one Row!!",
                "select Row",

                JOptionPane.ERROR_MESSAGE);

        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(Row);

            String n = jn.getText();
           

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed","root","root");

                String qry ="delete from hospital_directory where hospitalName=?";
                ps =con.prepareStatement(qry);
                ps.setString(1, n);
                ps.executeUpdate();

               

                JOptionPane.showMessageDialog(null, "Deleted !!" );
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (SQLException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jdltActionPerformed

    private void jupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdActionPerformed
        // TODO add your handling code here:

        int Row = jTable1.getSelectedRow();

        if (jTable1.getSelectedRowCount()>0)
        {

            String n = jn.getText();
            String ar = jar.getText();
            String ct  = jct.getText();
           

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed","root","root");

                String qry ="Update hospital_directory set AreaName=?,city=? where hospitalName=?";
                ps =con.prepareStatement(qry);
                ps.setString(1, ar);
                ps.setString(2, ct);
                ps.setString(3, n);
             
                ps.execute();

                JOptionPane.showMessageDialog(null, "Information is updated!!!" );
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (SQLException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jupdActionPerformed
    
    public void gethos()
    {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed","root","root");
                       
               
                
                String qry ="Select * from hospital_directory";
                ps =con.prepareStatement(qry);
                rs = ps.executeQuery();                             
                while (rs.next())
                {
                    String n=rs.getString(1);
                    String ar=rs.getString(2);
                      String ct = rs.getString(3);
                   
                    
                    String tbdata[]={n,ar,ct};
                    DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
                    
                    model.addRow(tbdata);
                   
                }
                
              
                   
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jar;
    private javax.swing.JButton jcrt;
    private javax.swing.JTextField jct;
    private javax.swing.JButton jdlt;
    private javax.swing.JTextField jn;
    private javax.swing.JButton jupd;
    // End of variables declaration//GEN-END:variables
}