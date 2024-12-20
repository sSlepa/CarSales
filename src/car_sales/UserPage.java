package car_sales;

import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class UserPage extends javax.swing.JPanel {

    public UserPage(User user) {
        initComponents();
        
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini\\useracc.png"));
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
        jLabelName.setText(user.getUsername());
        jLabelName.setFont(new Font("Serif", Font.PLAIN, 38));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUserPage = new javax.swing.JPanel();
        jLabelUserPhoto = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();

        jPanelUserPage.setBackground(new java.awt.Color(0, 204, 255));

        jLabelUserPhoto.setBackground(new java.awt.Color(0, 102, 204));
        jLabelUserPhoto.setText("poza");

        jLabelName.setText("Name");

        javax.swing.GroupLayout jPanelUserPageLayout = new javax.swing.GroupLayout(jPanelUserPage);
        jPanelUserPage.setLayout(jPanelUserPageLayout);
        jPanelUserPageLayout.setHorizontalGroup(
            jPanelUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserPageLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );
        jPanelUserPageLayout.setVerticalGroup(
            jPanelUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserPageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(405, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUserPhoto;
    private javax.swing.JPanel jPanelUserPage;
    // End of variables declaration//GEN-END:variables
}
