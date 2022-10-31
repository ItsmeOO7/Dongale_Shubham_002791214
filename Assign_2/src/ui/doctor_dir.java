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
public class doctor_dir extends javax.swing.JPanel {

    /**
     * Creates new form doctor_dir
     */
    Connection con ;
     PreparedStatement ps;
     ResultSet rs;
     
    public doctor_dir() {
        initComponents();
    }
     
    
     public void adddoc()
    {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed","root","root");
                       
               
                
                String qry ="Select * from doctor_directory";
                ps =con.prepareStatement(qry);
                rs = ps.executeQuery();                             
                while (rs.next())
                {
                    String dcid=rs.getString(1);
                    String pass=rs.getString(6);
                      String n = rs.getString(2);
                     String sp =rs.getString(3);
                     String dg = rs.getString(4);
                     String hn=rs.getString(5);
                    
                    String tbdata[]={dcid,pass,n,sp,dg,hn};
                    DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
                    
                    model.addRow(tbdata);
                   
                }
                
              
                   
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        jdc = new javax.swing.JTextField();
        jps = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        jn = new javax.swing.JTextField();
        jsp = new javax.swing.JTextField();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        jdg = new javax.swing.JTextField();
        jhn = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        jcrt = new javax.swing.JButton();
        jdlt = new javax.swing.JButton();
        jupd = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(186, 79, 84));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docid", "Password", "Name", "Speciality", "Degree", "Hospital Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jLabel3.setText("Doctor Id:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Name: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Speciality:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Qualification:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Hospital Name:");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jn)
                            .addComponent(jps)
                            .addComponent(jdc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jhn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jdg)
                            .addComponent(jsp))))
                .addGap(149, 149, 149))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jcrt)
                        .addGap(40, 40, 40)
                        .addComponent(jdlt)
                        .addGap(32, 32, 32)
                        .addComponent(jupd)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jdg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcrt)
                    .addComponent(jdlt)
                    .addComponent(jupd))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String tid = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tpass = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tn = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tsp = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tdg = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String thn = model.getValueAt(jTable1.getSelectedRow(), 5).toString();
        
        
        jdc.setText(tid);
        jps.setText(tpass);
        jn.setText(tn);
        jsp.setText(tsp);
        jdg.setText(tdg);
        jhn.setText(thn);
       
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jcrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcrtActionPerformed
        // TODO add your handling code here:

        String id = jdc.getText();
        String Pass = jps.getText();
        String Name  = jn.getText();
        String sp =jsp.getText();
        String deg = jdg.getText();
        String hn = jhn.getText();
       

        if (id.isBlank()|| Pass.isBlank()|| Pass.isBlank()|| Name.isBlank() || sp.isBlank()|| deg.isBlank()|| hn.isBlank() )
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

                String qry ="Insert into doctor_directory (docid,Name,speciality,degree,hospitalName,password) value(?,?,?,?,?,?)";
                ps =con.prepareStatement(qry);
                ps.setString(1, id);
                ps.setString(2, Name);
                ps.setString(3, sp);
                ps.setString(4, deg);
                ps.setString(5,hn );
                ps.setString(6, Pass);
                ps.execute();

                String qry1 ="Insert into person_directory (name,pass) value(?,?)";
                ps =con.prepareStatement(qry1);
                ps.setString(1, Name);
                ps.setString(2, Pass);
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

            String id = jdc.getText();
            String nm = jn.getText();

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed","root","root");

                String qry ="delete from doctor_directory where docid=?";
                ps =con.prepareStatement(qry);
                ps.setString(1, id);
                ps.executeUpdate();
                
                String qry1 ="delete from person_directory where name=?";
                ps =con.prepareStatement(qry1);
                ps.setString(1, nm);
                 ps.execute();

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

            String id = jdc.getText();
        String Pass = jps.getText();
        String Name  = jn.getText();
        String sp =jsp.getText();
        String deg = jdg.getText();
        String hn = jhn.getText();

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed","root","root");

                String qry ="Update doctor_directory set name=?,speciality=?,degree=?,hospitalName=?,password=? where docid=?";
                ps =con.prepareStatement(qry);
                 ps.setString(1, id);
                ps.setString(2, Name);
                ps.setString(3, sp);
                ps.setString(4, deg);
                ps.setString(5, hn);
                ps.setString(6,Pass);
                ps.setString(7, id);
              
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jcrt;
    private javax.swing.JTextField jdc;
    private javax.swing.JTextField jdg;
    private javax.swing.JButton jdlt;
    private javax.swing.JTextField jhn;
    private javax.swing.JTextField jn;
    private javax.swing.JTextField jps;
    private javax.swing.JTextField jsp;
    private javax.swing.JButton jupd;
    // End of variables declaration//GEN-END:variables
}