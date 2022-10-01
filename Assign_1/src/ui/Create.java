/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
public class Create extends javax.swing.JFrame {

    /**
     * Creates new form Create
     */
    datainfo dinfo;
    public Create(datainfo dinfo) {
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

        javax.swing.JDesktopPane jDesktopPane1 = new javax.swing.JDesktopPane();
        javax.swing.JButton JBack = new javax.swing.JButton();
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
        javax.swing.JButton JUpload = new javax.swing.JButton();
        javax.swing.JButton JSub = new javax.swing.JButton();
        javax.swing.JButton JClr = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Information ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setToolTipText("");
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 400));

        JBack.setBackground(new java.awt.Color(204, 204, 204));
        JBack.setForeground(new java.awt.Color(0, 0, 0));
        JBack.setText("Back");
        JBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBackActionPerformed(evt);
            }
        });

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
        JEmpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEmpidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age :");

        JAge.setBackground(new java.awt.Color(255, 255, 255));
        JAge.setForeground(new java.awt.Color(0, 0, 0));
        JAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAgeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender :");

        Jmalerad.setText("Male");
        Jmalerad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmaleradActionPerformed(evt);
            }
        });

        Jfemalerad.setText("Female");
        Jfemalerad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfemaleradActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Start Date :");

        JStd.setBackground(new java.awt.Color(255, 255, 255));
        JStd.setForeground(new java.awt.Color(0, 0, 0));
        JStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JStdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Level :");

        JLevel.setBackground(new java.awt.Color(255, 255, 255));
        JLevel.setForeground(new java.awt.Color(0, 0, 0));
        JLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLevelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Team Info :");

        JTinfo.setBackground(new java.awt.Color(255, 255, 255));
        JTinfo.setForeground(new java.awt.Color(0, 0, 0));
        JTinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTinfoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Postion Tittle :");

        JPose.setBackground(new java.awt.Color(255, 255, 255));
        JPose.setForeground(new java.awt.Color(0, 0, 0));
        JPose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPoseActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Contact Info :");

        JConinfo.setBackground(new java.awt.Color(255, 255, 255));
        JConinfo.setForeground(new java.awt.Color(0, 0, 0));
        JConinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JConinfoActionPerformed(evt);
            }
        });

        JUpload.setText("Upload");
        JUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUploadActionPerformed(evt);
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

        JClr.setBackground(new java.awt.Color(204, 204, 204));
        JClr.setForeground(new java.awt.Color(0, 0, 0));
        JClr.setText("Clear");
        JClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClrActionPerformed(evt);
            }
        });

        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Uploaded Photo"));

        jDesktopPane1.setLayer(JBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
        jDesktopPane1.setLayer(JUpload, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JSub, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JClr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JSub, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JEmpid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(Jmalerad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jfemalerad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JStd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLevel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTinfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPose)
                            .addComponent(JConinfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(JClr, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(JBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jmalerad)
                        .addComponent(Jfemalerad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JStd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JConinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBack)
                    .addComponent(JSub)
                    .addComponent(JClr))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBackActionPerformed
        // TODO add your handling code here:
        
        MainJFrame obj = new MainJFrame();
        
        obj.show();
        
        dispose();
    }//GEN-LAST:event_JBackActionPerformed

    private void JEmpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEmpidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JEmpidActionPerformed

    private void JAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JAgeActionPerformed

    private void JStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JStdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JStdActionPerformed

    private void JLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JLevelActionPerformed

    private void JTinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTinfoActionPerformed

    private void JPoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPoseActionPerformed

    private void JConinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JConinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JConinfoActionPerformed

    private void JUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUploadActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        jLabel12.setText(filename);
        
        
        
       
    }//GEN-LAST:event_JUploadActionPerformed

    private void JClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClrActionPerformed
        // TODO add your handling code here:
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

    private void JmaleradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmaleradActionPerformed
        // TODO add your handling code here:
        if (Jmalerad.isSelected())
        { 
               
               Jfemalerad.setSelected(false);
        }   
    }//GEN-LAST:event_JmaleradActionPerformed

    private void JfemaleradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfemaleradActionPerformed
        // TODO add your handling code here:
        if (Jfemalerad.isSelected())
        { 
               
               Jmalerad.setSelected(false);
        }  
    }//GEN-LAST:event_JfemaleradActionPerformed

    /**
     * @param args the command line arguments
     */
   
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
    private javax.swing.JRadioButton Jfemalerad;
    private javax.swing.JRadioButton Jmalerad;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}