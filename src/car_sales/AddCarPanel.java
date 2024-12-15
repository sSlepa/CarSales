/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package car_sales;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author adria
 */
public class AddCarPanel extends javax.swing.JPanel {

    private int size;
    
    public AddCarPanel(int size) {
        this.size = size;
        initComponents();
        jLabelCarNum.setText("Cars : " + size);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextAddName = new javax.swing.JTextField();
        jTextAddModel = new javax.swing.JTextField();
        jTextAddTrans = new javax.swing.JTextField();
        jTextAddPrice = new javax.swing.JTextField();
        jTextAddKm = new javax.swing.JTextField();
        jTextAddPower = new javax.swing.JTextField();
        jTextAddYear = new javax.swing.JTextField();
        jTextAddFuel = new javax.swing.JTextField();
        jTextAddColor = new javax.swing.JTextField();
        jButtonAddCar = new javax.swing.JButton();
        jButtonAddImages = new javax.swing.JButton();
        jButtonMakeDir = new javax.swing.JButton();
        jTextAddEngine = new javax.swing.JTextField();
        jLabelCarNum = new javax.swing.JLabel();

        jTextField10.setText("transmission");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jTextAddName.setText("name");
        jTextAddName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddNameFocusLost(evt);
            }
        });

        jTextAddModel.setText("model");
        jTextAddModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddModelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddModelFocusLost(evt);
            }
        });

        jTextAddTrans.setText("transmission");
        jTextAddTrans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddTransFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddTransFocusLost(evt);
            }
        });

        jTextAddPrice.setText("price");
        jTextAddPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddPriceFocusLost(evt);
            }
        });

        jTextAddKm.setText("kilometers");
        jTextAddKm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddKmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddKmFocusLost(evt);
            }
        });

        jTextAddPower.setText("power");
        jTextAddPower.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddPowerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddPowerFocusLost(evt);
            }
        });

        jTextAddYear.setText("year");
        jTextAddYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddYearFocusLost(evt);
            }
        });

        jTextAddFuel.setText("fuel");
        jTextAddFuel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddFuelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddFuelFocusLost(evt);
            }
        });
        jTextAddFuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAddFuelActionPerformed(evt);
            }
        });

        jTextAddColor.setText("color");
        jTextAddColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddColorFocusLost(evt);
            }
        });

        jButtonAddCar.setText("Add Car");
        jButtonAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCarActionPerformed(evt);
            }
        });

        jButtonAddImages.setText("add images");
        jButtonAddImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddImagesActionPerformed(evt);
            }
        });

        jButtonMakeDir.setText("Make dir");
        jButtonMakeDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeDirActionPerformed(evt);
            }
        });

        jTextAddEngine.setText("engine");
        jTextAddEngine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAddEngineFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAddEngineFocusLost(evt);
            }
        });

        jLabelCarNum.setText("Cars");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jButtonAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabelCarNum))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonMakeDir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextAddPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jTextAddModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jTextAddName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jTextAddKm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jTextAddTrans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextAddColor)
                            .addComponent(jTextAddYear)
                            .addComponent(jTextAddFuel)
                            .addComponent(jTextAddPower)
                            .addComponent(jButtonAddImages, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAddEngine, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextAddName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextAddModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextAddPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextAddFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextAddYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextAddPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextAddKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAddEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAddTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMakeDir)
                    .addComponent(jButtonAddImages))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCarNum))
                .addContainerGap(229, Short.MAX_VALUE))
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

    private void jTextAddFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAddFuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAddFuelActionPerformed

    private void jButtonAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCarActionPerformed
            String name,model,price,km,trans,fuel,year,power,engine,color,imagesPath;
            name = jTextAddName.getText();
            model = jTextAddModel.getText();
            price = jTextAddPrice.getText();
            km = jTextAddKm.getText();
            trans = jTextAddTrans.getText();
            fuel = jTextAddFuel.getText();
            year = jTextAddYear.getText();
            power = jTextAddPower.getText();
            color = jTextAddColor.getText();
            engine = jTextAddEngine.getText();
            imagesPath = FolderSelector.folderPath;
            
            String query = "INSERT INTO cars (id,name,model,price,km,transmission,fuel,year,power,engine,color,imagess) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
           
            Connection c = null;

            java.sql.Statement stmt = null;
            
            if (!name.equals("name") && !model.equals("model") && !price.equals("price") && 
                !km.equals("km") && !trans.equals("trans") && !fuel.equals("fuel") && !year.equals("year") && 
                !power.equals("power") && !color.equals("color") && !engine.equals("engine")) {
                try {

                    Class.forName("org.sqlite.JDBC");
                    c = DriverManager.getConnection("jdbc:sqlite:Car_Sale_DB.db");
                    //System.out.println("Register reusit.");

                    PreparedStatement preparedStatement = c.prepareStatement(query);
                    preparedStatement.setString(2, name);
                    preparedStatement.setString(3, model);
                    preparedStatement.setString(4, price);
                    preparedStatement.setString(5, km);
                    preparedStatement.setString(6, trans);
                    preparedStatement.setString(7, fuel);
                    preparedStatement.setString(8, year);
                    preparedStatement.setString(9, power);
                    preparedStatement.setString(10,engine);
                    preparedStatement.setString(11, color);
                    preparedStatement.setString(12, imagesPath);

                    preparedStatement.executeUpdate();

                    preparedStatement.close();

                }
                catch(Exception e){
                    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                    System.exit(0);
                }

                JOptionPane.showMessageDialog(
                     null,
                     "Masina adaugata cu succes!",
                     "Succes",
                     JOptionPane.INFORMATION_MESSAGE
             );
                size++;
                jLabelCarNum.setText("Cars : " + size);
            }
            else{
                JOptionPane.showMessageDialog(
                     null,
                     "Eroare adaugare masina!",
                     "Fail",
                     JOptionPane.INFORMATION_MESSAGE
             );
            }
        
            
    }//GEN-LAST:event_jButtonAddCarActionPerformed

    private void jTextAddNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddNameFocusGained
        /// curata casuta din username
        if(jTextAddName.getText().trim().toLowerCase().equals("name")){
            jTextAddName.setText("");
            jTextAddName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddNameFocusGained

    private void jTextAddNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddNameFocusLost
        /// scriem username la loc
        if(jTextAddName.getText().trim().toLowerCase().equals("name")
            || jTextAddName.getText().trim().toLowerCase().equals("")){
            jTextAddName.setText("name");
            jTextAddName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddNameFocusLost

    private void jTextAddModelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddModelFocusGained
        if(jTextAddModel.getText().trim().toLowerCase().equals("model")){
            jTextAddModel.setText("");
            jTextAddModel.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddModelFocusGained

    private void jTextAddModelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddModelFocusLost
        if(jTextAddModel.getText().trim().toLowerCase().equals("model")
            || jTextAddModel.getText().trim().toLowerCase().equals("")){
            jTextAddModel.setText("model");
            jTextAddModel.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddModelFocusLost

    private void jTextAddPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddPriceFocusGained
        if(jTextAddPrice.getText().trim().toLowerCase().equals("price")){
            jTextAddPrice.setText("");
            jTextAddPrice.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddPriceFocusGained

    private void jTextAddPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddPriceFocusLost
       if(jTextAddPrice.getText().trim().toLowerCase().equals("price")
            || jTextAddPrice.getText().trim().toLowerCase().equals("")){
            jTextAddPrice.setText("price");
            jTextAddPrice.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddPriceFocusLost

    private void jTextAddKmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddKmFocusGained
        if(jTextAddKm.getText().trim().toLowerCase().equals("kilometers")){
            jTextAddKm.setText("");
            jTextAddKm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddKmFocusGained

    private void jTextAddKmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddKmFocusLost
        if(jTextAddKm.getText().trim().toLowerCase().equals("kilometers")
            || jTextAddKm.getText().trim().toLowerCase().equals("")){
            jTextAddKm.setText("kilometers");
            jTextAddKm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddKmFocusLost

    private void jTextAddTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddTransFocusGained
        if(jTextAddTrans.getText().trim().toLowerCase().equals("transmission")){
            jTextAddTrans.setText("");
            jTextAddTrans.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddTransFocusGained

    private void jTextAddTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddTransFocusLost
        if(jTextAddTrans.getText().trim().toLowerCase().equals("transmission")
            || jTextAddTrans.getText().trim().toLowerCase().equals("")){
            jTextAddTrans.setText("transmission");
            jTextAddTrans.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddTransFocusLost

    private void jTextAddFuelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddFuelFocusGained
        if(jTextAddFuel.getText().trim().toLowerCase().equals("fuel")){
            jTextAddFuel.setText("");
            jTextAddFuel.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddFuelFocusGained

    private void jTextAddFuelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddFuelFocusLost
        if(jTextAddFuel.getText().trim().toLowerCase().equals("fuel")
            || jTextAddFuel.getText().trim().toLowerCase().equals("")){
            jTextAddFuel.setText("fuel");
            jTextAddFuel.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddFuelFocusLost

    private void jTextAddYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddYearFocusGained
        if(jTextAddYear.getText().trim().toLowerCase().equals("year")){
            jTextAddYear.setText("");
            jTextAddYear.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddYearFocusGained

    private void jTextAddYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddYearFocusLost
        if(jTextAddYear.getText().trim().toLowerCase().equals("year")
            || jTextAddYear.getText().trim().toLowerCase().equals("")){
            jTextAddYear.setText("year");
            jTextAddYear.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddYearFocusLost

    private void jTextAddPowerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddPowerFocusGained
        if(jTextAddPower.getText().trim().toLowerCase().equals("power")){
            jTextAddPower.setText("");
            jTextAddPower.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddPowerFocusGained

    private void jTextAddPowerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddPowerFocusLost
        if(jTextAddPower.getText().trim().toLowerCase().equals("power")
            || jTextAddPower.getText().trim().toLowerCase().equals("")){
            jTextAddPower.setText("power");
            jTextAddPower.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddPowerFocusLost

    private void jTextAddColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddColorFocusGained
        if(jTextAddColor.getText().trim().toLowerCase().equals("color")){
            jTextAddColor.setText("");
            jTextAddColor.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddColorFocusGained

    private void jTextAddColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddColorFocusLost
        if(jTextAddColor.getText().trim().toLowerCase().equals("color")
            || jTextAddColor.getText().trim().toLowerCase().equals("")){
            jTextAddColor.setText("color");
            jTextAddColor.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddColorFocusLost

    private void jButtonAddImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddImagesActionPerformed
        FolderSelector fs = new FolderSelector();
    }//GEN-LAST:event_jButtonAddImagesActionPerformed

    private void jButtonMakeDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakeDirActionPerformed
        String path = "C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini";
        
        File currentDir = new File(path);

        // Obține lista de fișiere și directoare
        File[] files = currentDir.listFiles();

        // Verifică dacă directorul conține fișiere
        
        int dirCount = 0;
        for (File file : files) {
            if (file.isDirectory()) {
                    dirCount++;
                }
            }
       String folderName = "Car_" + Integer.toString(dirCount + 1);
       
       File folder = new File(path + File.separator + folderName);
       folder.mkdir();
       
    }//GEN-LAST:event_jButtonMakeDirActionPerformed

    private void jTextAddEngineFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddEngineFocusGained
        if(jTextAddEngine.getText().trim().toLowerCase().equals("engine")){
            jTextAddEngine.setText("");
            jTextAddEngine.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddEngineFocusGained

    private void jTextAddEngineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAddEngineFocusLost
        if(jTextAddEngine.getText().trim().toLowerCase().equals("engine")
            || jTextAddEngine.getText().trim().toLowerCase().equals("")){
            jTextAddEngine.setText("engine");
            jTextAddEngine.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextAddEngineFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCar;
    private javax.swing.JButton jButtonAddImages;
    private javax.swing.JButton jButtonMakeDir;
    private javax.swing.JLabel jLabelCarNum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAddColor;
    private javax.swing.JTextField jTextAddEngine;
    private javax.swing.JTextField jTextAddFuel;
    private javax.swing.JTextField jTextAddKm;
    private javax.swing.JTextField jTextAddModel;
    private javax.swing.JTextField jTextAddName;
    private javax.swing.JTextField jTextAddPower;
    private javax.swing.JTextField jTextAddPrice;
    private javax.swing.JTextField jTextAddTrans;
    private javax.swing.JTextField jTextAddYear;
    private javax.swing.JTextField jTextField10;
    // End of variables declaration//GEN-END:variables

    private String toString(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
