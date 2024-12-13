/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car_sales;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author adria
 */
public class Home_Page extends javax.swing.JFrame {
    
    private static List<Car> vect;
    
    /**
     * Creates new form Home_page
     * 
    **/
    public List<Car> getList(){
        return vect;
    }
    public Home_Page() {
        
        initComponents();
        vect = new ArrayList<>();
        load_cars();
        
    }
    public void load_cars(){
        java.sql.Connection c = null;

        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Car_Sale_DB.db");

            java.sql.PreparedStatement stmt = c.prepareStatement("SELECT * FROM cars");
            
            java.sql.ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                
                String name = rs.getString("name");
                String model = rs.getString("model");
                String price = rs.getString("price");
                String kilometers = rs.getString("km");
                String transmission = rs.getString("transmission");
                String fuelType = rs.getString("fuel");
                String year = rs.getString("year");
                String power = rs.getString("power");
                String engine = rs.getString("engine");
                String color = rs.getString("color");
                String imagesPath = rs.getString("imagess");
                
                List<BufferedImage> images = new ArrayList<>();
                
                java.io.File folder = new File(imagesPath);
                if (folder.exists() && folder.isDirectory()) {
                    // Listați toate fișierele din folder
                    java.io.File[] files;
                    files = folder.listFiles(new FilenameFilter() {
                        @Override
                        public boolean accept(File dir, String name) {
                            // Filtrăm doar fișierele de tip imagine
                            return name.toLowerCase().endsWith(".jpg") ||
                                    name.toLowerCase().endsWith(".png") ||
                                    name.toLowerCase().endsWith(".jpeg");
                        }
                    });

                    if (files != null) {
                        for (File file : files) {
                            try {
                                // Încărcați imaginea în memorie
                                BufferedImage image = ImageIO.read(file);
                                if (image != null) {
                                    images.add(image); // Adăugați imaginea în listă
                                }
                            } catch (IOException e) {
                                System.err.println("Nu s-a putut încărca imaginea: " + file.getName());
                                e.printStackTrace();
                            }
                        }
                    }
                } 
                else {
                    System.err.println("Folderul specificat nu există sau nu este un director.");
                }

                
                //System.out.println("Număr de imagini încărcate: " + images.size());
                vect.add(new Car(name,model,price,kilometers,transmission,fuelType,year,power,engine,color,images));
                
            }
            rs.close();
            stmt.close();
            c.close();
        }
        catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GuestMode_HomeButton = new javax.swing.JButton();
        Register_HomeButton = new javax.swing.JButton();
        Login_HomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        GuestMode_HomeButton.setBackground(new java.awt.Color(153, 153, 153));
        GuestMode_HomeButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        GuestMode_HomeButton.setText("Guest Mode");
        GuestMode_HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestMode_HomeButtonActionPerformed(evt);
            }
        });

        Register_HomeButton.setFont(new java.awt.Font("Visitor TT1 BRK", 1, 18)); // NOI18N
        Register_HomeButton.setText("Register");
        Register_HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_HomeButtonActionPerformed(evt);
            }
        });

        Login_HomeButton.setFont(new java.awt.Font("Visitor TT1 BRK", 1, 18)); // NOI18N
        Login_HomeButton.setText("Log In");
        Login_HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_HomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GuestMode_HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register_HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login_HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(Login_HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Register_HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GuestMode_HomeButton)
                .addGap(199, 199, 199))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login_HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_HomeButtonActionPerformed
        Login_Page Login_Page = new Login_Page(this.getList());
        Login_Page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Login_HomeButtonActionPerformed

    private void GuestMode_HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuestMode_HomeButtonActionPerformed
        // TODO add your handling code here:
        User user = new User("Guest","","",false,true);
        Main_Board main_board = new Main_Board(user,this.getList());
        main_board.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GuestMode_HomeButtonActionPerformed

    private void Register_HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_HomeButtonActionPerformed
        Register_Page Register_Page = new Register_Page();
        Register_Page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Register_HomeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuestMode_HomeButton;
    private javax.swing.JButton Login_HomeButton;
    private javax.swing.JButton Register_HomeButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

