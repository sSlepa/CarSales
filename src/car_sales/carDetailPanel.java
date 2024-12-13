package car_sales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
        customizeLabels();
    }
    
    void customizeLabels(){
            
        jLabelName.setText(car.getName());
        jLabelName.setFont(new Font("Serif", Font.PLAIN, 38));
        jLabelModel.setText(car.getModel());
        jLabelModel.setFont(new Font("Serif", Font.PLAIN, 28));
        jLabelPrice.setText("$ " + car.getPrice());
        jLabelPrice.setFont(new Font("Serif", Font.PLAIN, 48));
        jPanelInformation.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        /// Engine
        try {
            Image image = ImageIO.read(new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini\\engine-icon.jpg"));
            Image scaledImage = image.getScaledInstance(35, 35, Image.SCALE_SMOOTH); // Scalare
            ImageIcon carImageIcon = new ImageIcon(scaledImage);
            jLabelEngineIcon.setIcon(carImageIcon);
        } catch (IOException ex) {
            Logger.getLogger(carDetailPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelEngineIcon.setText("Engine");
        jLabelEngineIcon.setFont(new Font("Serif", Font.PLAIN, 18));
        jLabelEngine.setText(car.getEngine());
        jLabelEngine.setFont(new Font("Serif", Font.PLAIN, 18));
        
       
        /// Fuel
        try {
            Image image = ImageIO.read(new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini\\fuel-icon-png.jpg"));
            Image scaledImage = image.getScaledInstance(35, 35, Image.SCALE_SMOOTH); // Scalare
            ImageIcon carImageIcon = new ImageIcon(scaledImage);
            jLabelFuelIcon.setIcon(carImageIcon);
        } catch (IOException ex) {
            Logger.getLogger(carDetailPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelFuelIcon.setText("Fuel");
        jLabelFuelIcon.setFont(new Font("Serif", Font.PLAIN, 18));
        jLabelFuel.setText(car.getFuelType());
        jLabelFuel.setFont(new Font("Serif", Font.PLAIN, 18));
        
        /// Power
        try {
            Image image = ImageIO.read(new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini\\power.png"));
            Image scaledImage = image.getScaledInstance(31, 31, Image.SCALE_SMOOTH); // Scalare
            ImageIcon carImageIcon = new ImageIcon(scaledImage);
            jLabelPowerIcon.setIcon(carImageIcon);
        } catch (IOException ex) {
            Logger.getLogger(carDetailPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelPowerIcon.setText("Power");
        jLabelPowerIcon.setFont(new Font("Serif", Font.PLAIN, 18));
        jLabelPower.setText(car.getPower());
        jLabelPower.setFont(new Font("Serif", Font.PLAIN, 18));
        
        ///Km
        try {
            Image image = ImageIO.read(new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini\\mileage.jpg"));
            Image scaledImage = image.getScaledInstance(35, 35, Image.SCALE_SMOOTH); // Scalare
            ImageIcon carImageIcon = new ImageIcon(scaledImage);
            jLabelKmIcon.setIcon(carImageIcon);
        } catch (IOException ex) {
            Logger.getLogger(carDetailPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelKmIcon.setText("Mileage");
        jLabelKmIcon.setFont(new Font("Serif", Font.PLAIN, 18));
        jLabelKm.setText(car.getKilometers());
        jLabelKm.setFont(new Font("Serif", Font.PLAIN, 18));
        
        ///Transmission
        try {
            Image image = ImageIO.read(new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini\\trans.png"));
            Image scaledImage = image.getScaledInstance(35, 35, Image.SCALE_SMOOTH); // Scalare
            ImageIcon carImageIcon = new ImageIcon(scaledImage);
            jLabelTransmissionIcon.setIcon(carImageIcon);
        } catch (IOException ex) {
            Logger.getLogger(carDetailPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelTransmissionIcon.setText("Transmission");
        jLabelTransmissionIcon.setFont(new Font("Serif", Font.PLAIN, 18));
        jLabelTransmission.setText(car.getTransmission());
        jLabelTransmission.setFont(new Font("Serif", Font.PLAIN, 18));
        
        ///Date
        try {
            Image image = ImageIO.read(new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini\\calendar.png"));
            Image scaledImage = image.getScaledInstance(35, 35, Image.SCALE_SMOOTH); // Scalare
            ImageIcon carImageIcon = new ImageIcon(scaledImage);
            jLabelDateIcon.setIcon(carImageIcon);
        } catch (IOException ex) {
            Logger.getLogger(carDetailPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelDateIcon.setText("Date");
        jLabelDateIcon.setFont(new Font("Serif", Font.PLAIN, 18));
        jLabelDate.setText(car.getYear());
        jLabelDate.setFont(new Font("Serif", Font.PLAIN, 18));
        
    }
    
    void loadPhoto(int currentPhoto){
         // Prima imagine
        Image scaledImage = car.getImages().get(currentPhoto).getScaledInstance(573, 312, Image.SCALE_SMOOTH); // Scalare
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
        jLabelName = new javax.swing.JLabel();
        jLabelModel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPrice = new javax.swing.JLabel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelEngineIcon = new javax.swing.JLabel();
        jLabelEngine = new javax.swing.JLabel();
        jLabelFuelIcon = new javax.swing.JLabel();
        jLabelFuel = new javax.swing.JLabel();
        jLabelPower = new javax.swing.JLabel();
        jLabelPowerIcon = new javax.swing.JLabel();
        jLabelKmIcon = new javax.swing.JLabel();
        jLabelKm = new javax.swing.JLabel();
        jLabelTransmissionIcon = new javax.swing.JLabel();
        jLabelTransmission = new javax.swing.JLabel();
        jLabelDateIcon = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();

        jButtonChangeRight.setFocusPainted(false);      // Elimină border-ul de focus
        jButtonChangeRight.setBorderPainted(false);
        jButtonChangeRight.setText("Next");
        jButtonChangeRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeRightActionPerformed(evt);
            }
        });

        jButtonChangeLeft.setFocusPainted(false);      // Elimină border-ul de focus
        jButtonChangeLeft.setBorderPainted(false);
        jButtonChangeLeft.setText("Back");
        jButtonChangeLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeLeftActionPerformed(evt);
            }
        });

        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        jLabelName.setText("Name");

        jLabelModel.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabelModel.setText("Model");

        jLabelPrice.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelPrice.setText("Price");

        jLabelEngineIcon.setText("EngineIcon");

        jLabelEngine.setText("Engine");

        jLabelFuelIcon.setText("Fuelicon");

        jLabelFuel.setText("Fuel");

        jLabelPower.setText("Power");

        jLabelPowerIcon.setText("PowerIcon");

        jLabelKmIcon.setText("KmIcon");

        jLabelKm.setText("Km");

        jLabelTransmissionIcon.setText("TransIcon");

        jLabelTransmission.setText("Trans");

        jLabelDateIcon.setText("DateIcon");

        jLabelDate.setText("Date");

        javax.swing.GroupLayout jPanelInformationLayout = new javax.swing.GroupLayout(jPanelInformation);
        jPanelInformation.setLayout(jPanelInformationLayout);
        jPanelInformationLayout.setHorizontalGroup(
            jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformationLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformationLayout.createSequentialGroup()
                        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEngineIcon)
                            .addGroup(jPanelInformationLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFuelIcon)
                            .addGroup(jPanelInformationLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPowerIcon)
                            .addGroup(jPanelInformationLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelPower, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelInformationLayout.createSequentialGroup()
                        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKmIcon)
                            .addGroup(jPanelInformationLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelKm, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTransmissionIcon)
                            .addGroup(jPanelInformationLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDateIcon)
                            .addGroup(jPanelInformationLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanelInformationLayout.setVerticalGroup(
            jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformationLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInformationLayout.createSequentialGroup()
                        .addComponent(jLabelEngineIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInformationLayout.createSequentialGroup()
                        .addComponent(jLabelFuelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInformationLayout.createSequentialGroup()
                        .addComponent(jLabelPowerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPower, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInformationLayout.createSequentialGroup()
                        .addComponent(jLabelKmIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelKm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInformationLayout.createSequentialGroup()
                        .addComponent(jLabelTransmissionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInformationLayout.createSequentialGroup()
                        .addComponent(jLabelDateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelInformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonChangeLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonChangeRight))
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabelModel)
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChangeRight)
                    .addComponent(jButtonChangeLeft))
                .addGap(56, 317, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDateIcon;
    private javax.swing.JLabel jLabelEngine;
    private javax.swing.JLabel jLabelEngineIcon;
    private javax.swing.JLabel jLabelFuel;
    private javax.swing.JLabel jLabelFuelIcon;
    private javax.swing.JLabel jLabelKm;
    private javax.swing.JLabel jLabelKmIcon;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelPower;
    private javax.swing.JLabel jLabelPowerIcon;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelTransmission;
    private javax.swing.JLabel jLabelTransmissionIcon;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
