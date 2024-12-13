package car_sales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class carDetailPanel extends javax.swing.JPanel {
    
    private int currentPhoto = 0;
    private Car car;
    
    public carDetailPanel(Car car){
        initComponents();
        this.car = car;
        
        loadPhoto(currentPhoto);
        
    }
    
    void loadPhoto(int currentPhoto){
         // Prima imagine
        
         
        Image scaledImage = car.getImages().get(currentPhoto).getScaledInstance(575, 300, Image.SCALE_SMOOTH); // Scalare
        ImageIcon carImageIcon = new ImageIcon(scaledImage);

        jLabelPhoto.setIcon(carImageIcon);
        jLabelPhoto.setHorizontalAlignment(JLabel.CENTER); // Centrare pe orizontală
        jLabelPhoto.setVerticalAlignment(JLabel.CENTER);   // Centrare pe verticală
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPhoto = new javax.swing.JLabel();
        jButtonChangeRight = new javax.swing.JButton();
        jButtonChangeLeft = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButtonChangeRight.setText("Next");
        jButtonChangeRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeRightActionPerformed(evt);
            }
        });

        jButtonChangeLeft.setText("Back");
        jButtonChangeLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeLeftActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonChangeLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonChangeRight))
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChangeRight)
                    .addComponent(jButtonChangeLeft))
                .addGap(0, 239, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangeRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeRightActionPerformed
        if(currentPhoto + 1 < car.getImages().size()){
            currentPhoto++;
            loadPhoto(currentPhoto);
        }
        else{
            currentPhoto = 0;
            loadPhoto(currentPhoto);
        }
    }//GEN-LAST:event_jButtonChangeRightActionPerformed

    private void jButtonChangeLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeLeftActionPerformed
        if(currentPhoto - 1 >= 0){
            currentPhoto--;
            loadPhoto(currentPhoto);
        }
        else{
            currentPhoto = car.getImages().size() - 1;
            loadPhoto(currentPhoto);
        }
    }//GEN-LAST:event_jButtonChangeLeftActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeLeft;
    private javax.swing.JButton jButtonChangeRight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPhoto;
    // End of variables declaration//GEN-END:variables
}
