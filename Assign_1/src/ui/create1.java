/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Saveinfo;
import model.datainfo;

/**
 *
 * @author Shubh's PC
 */
public class create1 extends javax.swing.JPanel {

    /**
     * Creates new form create1
     */
    datainfo dinfo;
    public create1(datainfo dinfo) {
        initComponents();
        this.dinfo = dinfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        JName = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        JEmpid = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        JAge = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        Jmalerad = new javax.swing.JRadioButton();
        Jfemalerad = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        JStd = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        JLevel = new javax.swing.JTextField();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        JTinfo = new javax.swing.JTextField();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        JPose = new javax.swing.JTextField();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        JConinfo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JUpload = new javax.swing.JButton();
        javax.swing.JButton JClr = new javax.swing.JButton();
        javax.swing.JButton JSub = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 541));

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Information ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name :");

        JName.setBackground(new java.awt.Color(255, 255, 255));
        JName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Employee ID :");

        JEmpid.setBackground(new java.awt.Color(255, 255, 255));
        JEmpid.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age :");

        JAge.setBackground(new java.awt.Color(255, 255, 255));
        JAge.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender :");

        Jmalerad.setText("Male");

        Jfemalerad.setText("Female");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Start Date :");

        JStd.setBackground(new java.awt.Color(255, 255, 255));
        JStd.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Level :");

        JLevel.setBackground(new java.awt.Color(255, 255, 255));
        JLevel.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText(" Team Info :");

        JTinfo.setBackground(new java.awt.Color(255, 255, 255));
        JTinfo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Postion Tittle :");

        JPose.setBackground(new java.awt.Color(255, 255, 255));
        JPose.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Contact Info :");

        JConinfo.setBackground(new java.awt.Color(255, 255, 255));
        JConinfo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText(" ");
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Uploaded Photo"));

        JUpload.setText("Upload");
        JUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUploadActionPerformed(evt);
            }
        });

        JClr.setBackground(new java.awt.Color(204, 204, 204));
        JClr.setForeground(new java.awt.Color(0, 0, 0));
        JClr.setText("Clear");
        JClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClrActionPerformed(evt);
            }
        });

        JSub.setBackground(new java.awt.Color(204, 204, 204));
        JSub.setForeground(new java.awt.Color(0, 0, 0));
        JSub.setText("Submit");
        JSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSubActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JEmpid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JAge, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Jmalerad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Jfemalerad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JStd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JTinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JPose, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JConinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JUpload, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JClr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JSub, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JUpload))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(JSub, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JClr, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JAge, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(Jmalerad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jfemalerad))
                            .addComponent(JStd, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPose, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JConinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jmalerad)
                    .addComponent(Jfemalerad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JStd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JConinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JUpload))
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSub)
                    .addComponent(JClr))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClrActionPerformed
        // TODO add your handling code here:
        JName.setText("");
        JEmpid.setText("");
        JAge.setText("");
        Jmalerad.setSelected(false);
        Jfemalerad.setSelected(false);
        JStd.setText("");
        JLevel.setText("");
        JTinfo.setText("");
        JPose.setText("");
        JConinfo.setText("");
    }//GEN-LAST:event_JClrActionPerformed

    private void JSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSubActionPerformed
        // TODO add your handling code here:

        String name =JName.getText();
        String empid = JEmpid.getText();
        String age = JAge.getText();
        String gender ="";
        String date = JStd.getText();
        String level = JLevel.getText();
        String Tinfo = JTinfo.getText();
        String poseinfo = JPose.getText();
        String Contact = JConinfo.getText();

        if (Jmalerad.isSelected())
        {
            gender ="male";
        }
        if (Jmalerad.isSelected())
        {
            gender ="Female";
        }

        if( name.isEmpty() || empid.isEmpty() || age.isEmpty() || gender.isBlank() || date.isEmpty() || date.isEmpty() || level.isEmpty() || Tinfo.isEmpty() || poseinfo.isEmpty() || Contact.isEmpty()  )
        {
            JOptionPane.showMessageDialog(this,
                "Please enter all fields ",
                " Try again",
                JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Saveinfo sv = dinfo.add();

            sv.setName(name);
            sv.setEmpid(empid);
            sv.setAge(age);
            sv.setGender(gender);
            sv.setDate(date);
            sv.setLevel(level);
            sv.setTinfo(Tinfo);
            sv.setPoseinfo(poseinfo);
            sv.setContact(Contact);

            JOptionPane.showMessageDialog(this, "Employee Information is saved !!!");

        }

        JName.setText("");
        JEmpid.setText("");
        JAge.setText("");
        Jmalerad.setSelected(false);
        Jfemalerad.setSelected(false);
        JStd.setText("");
        JLevel.setText("");
        JTinfo.setText("");
        JPose.setText("");
        JConinfo.setText("");

    }//GEN-LAST:event_JSubActionPerformed

    private void JUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUploadActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        jLabel10.setText(filename);
    }//GEN-LAST:event_JUploadActionPerformed
     String filename = null; 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAge;
    private javax.swing.JTextField JConinfo;
    private javax.swing.JTextField JEmpid;
    private javax.swing.JTextField JLevel;
    private javax.swing.JTextField JName;
    private javax.swing.JTextField JPose;
    private javax.swing.JTextField JStd;
    private javax.swing.JTextField JTinfo;
    private javax.swing.JButton JUpload;
    private javax.swing.JRadioButton Jfemalerad;
    private javax.swing.JRadioButton Jmalerad;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables
}