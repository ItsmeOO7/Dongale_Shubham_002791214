/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author Shubh's PC
 */
public class bg extends javax.swing.JPanel {
 
    private int  round =15;
    public bg() {
        initComponents();
        setOpaque(false);
        setBackground(new Color (186,79,84));
        setForeground(new Color(74,31,61));
    }

     public void paint(Graphics grphcs)
     {
         Graphics2D g2 =(Graphics2D)grphcs.create();
         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         int width = getWidth();
         int width1 = 150;
         int height = getHeight();
         //int header = 80;
         g2.setColor(getBackground());
         g2.fillRect(0,0, width, height);
         Area area =new Area(new Rectangle(0,0, width1, height));
         g2.setColor(getForeground());
         g2.fill(area);
         g2.dispose();
         super.paint(grphcs);
         
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
