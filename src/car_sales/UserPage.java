package car_sales;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;

public class UserPage extends javax.swing.JPanel {
    
    User user;
    Main_Board mainboard;

    public UserPage(User user,Main_Board mainboard) {
        
        this.user = user;
        this.mainboard = mainboard;
        initComponents();
        
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(user.getProfilePic()));
        } catch (IOException ex) {
            Logger.getLogger(Main_Board.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (image != null) {
            Image scaledImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH); // Scalare
            ImageIcon carImageIcon = new ImageIcon(scaledImage);
            
            jLabelUserPhoto.setIcon(carImageIcon);
            jLabelUserPhoto.setHorizontalAlignment(JLabel.CENTER); // Centrare pe orizontală
            jLabelUserPhoto.setVerticalAlignment(JLabel.CENTER);   // Centrare pe verticală
        }
        jLabelName.setText("Username: " + user.getUsername());
        jLabelName.setFont(new Font("Serif", Font.PLAIN, 32));
        jLabelName.setForeground(Color.white);
        jLabelEmail.setText("Email: " + user.getEmail());
        jLabelEmail.setFont(new Font("Serif", Font.PLAIN, 32));
        jLabelEmail.setForeground(Color.white);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUserPage = new javax.swing.JPanel();
        jLabelUserPhoto = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jButtonChangeAvatar = new javax.swing.JButton();

        jPanelUserPage.setBackground(new java.awt.Color(102, 102, 102));

        jLabelUserPhoto.setBackground(new java.awt.Color(0, 102, 204));

        jLabelName.setText("Name");

        jLabelEmail.setText("Email");

        jButtonChangeAvatar.setText("Change Avatar");
        jButtonChangeAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeAvatarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUserPageLayout = new javax.swing.GroupLayout(jPanelUserPage);
        jPanelUserPage.setLayout(jPanelUserPageLayout);
        jPanelUserPageLayout.setHorizontalGroup(
            jPanelUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserPageLayout.createSequentialGroup()
                .addGroup(jPanelUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUserPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelUserPageLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButtonChangeAvatar)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanelUserPageLayout.setVerticalGroup(
            jPanelUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserPageLayout.createSequentialGroup()
                .addGroup(jPanelUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUserPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUserPageLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonChangeAvatar)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUserPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUserPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private static String getFileExtension(File file) {
        String name = file.getName();
        int lastIndex = name.lastIndexOf('.');
        return (lastIndex == -1) ? "" : name.substring(lastIndex);
     }
    private void jButtonChangeAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeAvatarActionPerformed
        
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\adria\\Desktop");
        
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter(
                "Fișiere imagine (PNG)", "png");
        fileChooser.setFileFilter(imageFilter);
        
        int result = fileChooser.showOpenDialog(null);
        
        Connection c = null;

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            
            BufferedImage image = null;
            try {
                image = ImageIO.read(new File(selectedFile.getAbsolutePath()));
            } catch (IOException ex) {
                Logger.getLogger(Main_Board.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (image != null) {
                Image scaledImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                ImageIcon carImageIcon = new ImageIcon(scaledImage);

                jLabelUserPhoto.setIcon(carImageIcon);
                jLabelUserPhoto.setHorizontalAlignment(JLabel.CENTER); // Centrare pe orizontală
                jLabelUserPhoto.setVerticalAlignment(JLabel.CENTER);   // Centrare pe verticală
            }
            
            System.out.println("Fișier selectat: " + selectedFile.getAbsolutePath());

            File destinationDirectory = new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\profilepics");
            if(!destinationDirectory.exists()){
                destinationDirectory.mkdirs();
            }

            
            String newFileName = user.getUsername() + getFileExtension(selectedFile);
            
            File destinationFile = new File(destinationDirectory, newFileName);
            try {
                
                Files.move(selectedFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Fisierul a fost mutat si redenumit cu succes: " + destinationFile.getAbsolutePath());
            } 
            catch (IOException e) {
                System.err.println("Eroare la mutarea fisierului: " + e.getMessage());
            }
            
            String username = user.getUsername();
            String newImagePath = destinationFile.getAbsolutePath();
            
            user.setProfilePic(destinationFile.getAbsolutePath());
                try {
                image = ImageIO.read(new File(user.getProfilePic()));
            } catch (IOException ex) {
                Logger.getLogger(Main_Board.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (image != null) {
                Image scaledImage = image.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
                ImageIcon carImageIcon = new ImageIcon(scaledImage);

                mainboard.setLabelIcon(carImageIcon);
                
            }            
            
            try{
                
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:Car_Sale_DB.db");
                
                java.sql.PreparedStatement stmt = c.prepareStatement("UPDATE users SET profilepic = ? WHERE username = ?");
                
                stmt.setString(1, newImagePath);
                stmt.setString(2, username);
                int val = stmt.executeUpdate();
                
                System.out.println(val);
                
                stmt.close();
                c.close();
                
            }
            catch(Exception e){
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
        } 
        else {
            System.out.println("Selectarea a fost anulata.");
        }
    }//GEN-LAST:event_jButtonChangeAvatarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeAvatar;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUserPhoto;
    private javax.swing.JPanel jPanelUserPage;
    // End of variables declaration//GEN-END:variables
}
