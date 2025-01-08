package car_sales;

import Utilitary.AddCarPanel;
import com.sun.jdi.connect.spi.Connection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import static java.lang.Math.min;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Main_Board extends javax.swing.JFrame {

    private static User user;
    private static List<Car> vect;
    private int pagenr = 0;
    private int pagemax = 0;
    static int del = 0;
   
    public Main_Board(User user,List<Car> anterior){
        this.user = user;
        this.vect = anterior;
        if(anterior.size() % 5 != 0)
            this.pagemax = anterior.size() / 5 + 1;
        else
            this.pagemax = anterior.size() / 5;
             
        initComponents();
        load_page();
        usr_page();
        
    }
    private void showCarDetails(Car car) {
        
        jButtonBack.setVisible(false);
        jButtonNext.setVisible(false);
        jLabelPageNumber.setVisible(false);
      
        MainPanel.removeAll();
        
        carDetailPanel carDetailPanel = new carDetailPanel(car);
        
        MainPanel.add(carDetailPanel);


        MainPanel.revalidate();
        MainPanel.repaint();
        

    }
    
    public void setLabelIcon(ImageIcon carImageIcon){
        jLabelUserPhoto.setIcon(carImageIcon);
        jLabelUserPhoto.setHorizontalAlignment(JLabel.CENTER); // Centrare pe orizontală
        jLabelUserPhoto.setVerticalAlignment(JLabel.CENTER);   // Centrare pe verticală
    }
    
    public void usr_page(){
       
        BufferedImage image = null;
        Main_Board mainboard = this;
        
        try {
            image = ImageIO.read(new File(user.getProfilePic()));
        } 
        catch (IOException ex) {
            Logger.getLogger(Main_Board.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (image != null) {
            Image scaledImage = image.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            ImageIcon carImageIcon = new ImageIcon(scaledImage);
            
            jLabelUserPhoto.setIcon(carImageIcon);
            jLabelUserPhoto.setHorizontalAlignment(JLabel.CENTER); // Centrare pe orizontală
            jLabelUserPhoto.setVerticalAlignment(JLabel.CENTER);   // Centrare pe verticală
        }
        jLabelUserPhoto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1 && user.isGuest() == false) { 
                    UserPage usrpage = new UserPage(user,mainboard);
                    MainPanel.removeAll();
                    MainPanel.add(usrpage);
                    MainPanel.revalidate();
                    MainPanel.repaint();
                    jButtonBack.setVisible(false);
                    jButtonNext.setVisible(false);
                    jLabelPageNumber.setVisible(false);
                    
                }
            }
        });
        
    }
    public void load_page(){
        
        MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.Y_AXIS));
        
        for(int i = 5 * pagenr ; i < min(5 * (pagenr + 1) ,vect.size()); i++){
            //System.out.println(pagenr);
            
            JPanel carPanel = new JPanel();
            carPanel.setLayout(new BorderLayout());
            carPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
            carPanel.setPreferredSize(new Dimension(800, 120));

            
            JLabel carImage = new JLabel();
            carImage.setPreferredSize(new Dimension(280, 150));
            carImage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
            
            if (!vect.get(i).getImages().isEmpty()) {
                BufferedImage originalImage = vect.get(i).getImages().get(0); 
                Image scaledImage = originalImage.getScaledInstance(280, 150, Image.SCALE_SMOOTH);
                ImageIcon carImageIcon = new ImageIcon(scaledImage);

                carImage.setIcon(carImageIcon);
                carImage.setHorizontalAlignment(JLabel.CENTER); 
                carImage.setVerticalAlignment(JLabel.CENTER);   
            }

            
            JLabel carDetails = new JLabel("<html><b>&nbsp;&nbsp;&nbsp;&nbsp;" + vect.get(i).getName() + " " + vect.get(i).getModel() + "</b><br><br>"
                    + "&nbsp;&nbsp;&nbsp;&nbsp;Pret: " + vect.get(i).getPrice() + "<br><br>"
                    + "&nbsp;&nbsp;&nbsp;&nbsp;Km: " + vect.get(i).getKilometers() + "");
            
            carDetails.setFont(new Font("Arial", Font.PLAIN, 18));
            
            carDetails.setVerticalAlignment(SwingConstants.CENTER);
            
            JPanel deletePanel = null;
            JButton deleteButton = null;

            if (del == 1) {
                deletePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
                deletePanel.setPreferredSize(new Dimension(100, 120)); // Dimensiune fixă

                deleteButton = new JButton("Delete");
                deleteButton.setBackground(Color.RED);
                deleteButton.setForeground(Color.WHITE);

                final int carIndex = i;
                deleteButton.addActionListener(e -> {
                    int response = JOptionPane.showConfirmDialog(
                        MainPanel,
                        "Esti sigur ca vrei sa stergi aceasta mașina",
                        "Confirmare stergere",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (response == JOptionPane.YES_OPTION) {
                        /// Sterg din DB;
                        
                        java.sql.Connection c = null;
                        String url = "jdbc:mysql://localhost:3306/proiect_cars";
                        String userr = "root";
                        //<editor-fold defaultstate="collapsed" desc="Nu deschide">
                        String passwords = "smecher12@";
                        //</editor-fold>
                        try{
                            c = DriverManager.getConnection(url, userr, passwords);

                            java.sql.PreparedStatement stmt = c.prepareStatement("DELETE FROM cars WHERE id = ?");
                            
                            stmt.setString(1, vect.get(carIndex).getId());
                            
                            System.out.println(vect.get(carIndex).getId());
                            
                            //System.exit(0);
                            
                            stmt.execute();
                            
                            stmt.close();
                            c.close();
                        }
                        catch(Exception ee){
                            System.err.println( ee.getClass().getName() + ": " + ee.getMessage() );
                            System.exit(0);
                        }
                        
                        vect.remove(carIndex);
                        
                        if(vect.size() % 5 != 0)
                            this.pagemax = vect.size() / 5 + 1;
                        else
                            this.pagemax = vect.size() / 5;
                        
                        
                        MainPanel.remove(carPanel); 
                        MainPanel.revalidate(); 
                        MainPanel.repaint(); 
                    }
                });

                deletePanel.add(deleteButton);
            }

            
            carPanel.add(carImage, BorderLayout.WEST);  
            carPanel.add(carDetails, BorderLayout.CENTER); 

            if (del == 1 && deletePanel != null) {
                carPanel.add(deletePanel, BorderLayout.EAST); 
            }

            if (del == 0) {
                final int xx = i;
                carPanel.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        // Când se face click pe panou, se deschide un nou JPanel cu informații extinse
                        showCarDetails(vect.get(xx));
                    }
                });
            }

            
            MainPanel.add(carPanel);
        }

 
        MainPanel.revalidate();
        MainPanel.repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Register_MainMenu = new javax.swing.JButton();
        Register_MainMenu1 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MainPanel = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        jButtonContact = new javax.swing.JButton();
        jButtonAddCar = new javax.swing.JButton();
        jButtonDelCar = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        Main_Button_LogOut1 = new javax.swing.JButton();
        jLabelUserPhoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabelPageNumber = new javax.swing.JLabel();

        Register_MainMenu.setBackground(new java.awt.Color(153, 153, 255));
        Register_MainMenu.setText("Main Menu");
        Register_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_MainMenuActionPerformed(evt);
            }
        });

        Register_MainMenu1.setBackground(new java.awt.Color(153, 153, 255));
        Register_MainMenu1.setText("Main Menu");
        Register_MainMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_MainMenu1ActionPerformed(evt);
            }
        });

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1180, 640));

        jButtonContact.setFocusPainted(false);
        jButtonContact.setBorderPainted(false);
        jButtonContact.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonContact.setText("Contact");
        jButtonContact.setBorderPainted(false);
        jButtonContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonContactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonContactMouseExited(evt);
            }
        });
        jButtonContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContactActionPerformed(evt);
            }
        });

        if(user.isAdmin() == false){
            jButtonAddCar.setVisible(false);
        }
        jButtonAddCar.setText("Add Car");
        jButtonAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCarActionPerformed(evt);
            }
        });

        if(user.isAdmin() == false){
            jButtonDelCar.setVisible(false);
        }
        jButtonDelCar.setText("Del Car");
        jButtonDelCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDelCarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDelCarMouseExited(evt);
            }
        });
        jButtonDelCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelCarActionPerformed(evt);
            }
        });

        jButtonHome.setFocusPainted(false);      // Elimină border-ul de focus
        jButtonHome.setBorderPainted(false);
        jButtonHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonHome.setText("Home");
        jButtonHome.setBorderPainted(false);
        jButtonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonHomeMouseExited(evt);
            }
        });
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        Main_Button_LogOut1.setBackground(new java.awt.Color(242, 242, 242));
        Main_Button_LogOut1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Main_Button_LogOut1.setText("Log out");
        Main_Button_LogOut1.setBorderPainted(false);
        Main_Button_LogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Main_Button_LogOut1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Main_Button_LogOut1MouseExited(evt);
            }
        });
        Main_Button_LogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Button_LogOut1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACCOUNT");

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonDelCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonContact, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jButtonAddCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Main_Button_LogOut1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUserPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePanelLayout.createSequentialGroup()
                .addComponent(jLabelUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(130, 130, 130)
                .addComponent(jButtonAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelCar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonContact, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(Main_Button_LogOut1))
        );

        getContentPane().add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 670));

        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 130, 30));

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 130, 30));

        jLabelPageNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPageNumber.setText("Page : " + 1);
        getContentPane().add(jLabelPageNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 80, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Register_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_MainMenuActionPerformed
        Home_Page Home_Page = new Home_Page();
        Home_Page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Register_MainMenuActionPerformed

    private void Register_MainMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_MainMenu1ActionPerformed
        Home_Page Home_Page = new Home_Page();
        Home_Page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Register_MainMenu1ActionPerformed

    private void jButtonAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCarActionPerformed
        MainPanel.removeAll();
        AddCarPanel addcar = new AddCarPanel(vect.size());
        MainPanel.add(addcar);
        jButtonBack.setVisible(false);
        jButtonNext.setVisible(false);
        jLabelPageNumber.setVisible(false);
        MainPanel.revalidate();
        MainPanel.repaint();
    }//GEN-LAST:event_jButtonAddCarActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        MainPanel.setVisible(true);
        MainPanel.removeAll();
        jButtonBack.setVisible(true);
        jButtonNext.setVisible(true);
        jLabelPageNumber.setVisible(true);
        jLabelPageNumber.setText("Page : " + (pagenr + 1));
        del = 0;
        load_page();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHomeMouseEntered
        // TODO add your handling code here:
        jButtonHome.setBackground(Color.gray);
    }//GEN-LAST:event_jButtonHomeMouseEntered

    private void jButtonHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHomeMouseExited
        // TODO add your handling code here;
        jButtonHome.setBackground(new java.awt.Color(242, 242, 242));
    }//GEN-LAST:event_jButtonHomeMouseExited

    private void jButtonContactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonContactMouseEntered
        jButtonContact.setBackground(Color.gray);
    }//GEN-LAST:event_jButtonContactMouseEntered

    private void jButtonContactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonContactMouseExited
        jButtonContact.setBackground(new java.awt.Color(242, 242, 242));
    }//GEN-LAST:event_jButtonContactMouseExited

    private void jButtonContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContactActionPerformed
        MainPanel.removeAll();
        jButtonBack.setVisible(false);
        jButtonNext.setVisible(false);
        jLabelPageNumber.setVisible(false);
        
        // Crearea unui JPanel pentru conținut
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(new Color(245, 245, 245));

        // Adăugarea unui border la contentPanel
        Border border = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(70, 130, 180), 2),
                "Informatii de Contact",
                javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                new Color(70, 130, 180)
        );
        contentPanel.setBorder(border);

        // Crearea unui JLabel pentru imagine (poza/logo)
        

        // Crearea unui JLabel pentru informațiile de contact
        JLabel contactLabel = new JLabel("<html>"
                + "<h1 style='text-align: center; color: #2E86C1;'>Contact Parc Auto</h1>"
                + "<p style='text-align: center; font-size: 14px;'>Telefon: <b>+40 751 452 483</b></p>"
                + "<p style='text-align: center; font-size: 14px;'>Email: <b>carnenebuna@gmail.com</b></p>"
                + "<p style='text-align: center; font-size: 14px;'>Adresa: <b>Str. Auto nr. 10, Bucuresti</b></p>"
                + "</html>");
        contactLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPanel.add(contactLabel, BorderLayout.CENTER);

        // Crearea unui JPanel pentru footer
        JPanel footerPanel = new JPanel();
        footerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        footerPanel.setBackground(new Color(220, 220, 220));
        JLabel footerLabel = new JLabel("© 2024 SSW. Toate drepturile rezervate.");
        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        footerPanel.add(footerLabel);

        
        MainPanel.add(contentPanel, BorderLayout.CENTER);
        MainPanel.add(footerPanel, BorderLayout.SOUTH);
        MainPanel.repaint();
        MainPanel.revalidate();
        
    }//GEN-LAST:event_jButtonContactActionPerformed

    private void jButtonDelCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelCarActionPerformed
        MainPanel.setVisible(true);
        MainPanel.removeAll();
        jButtonBack.setVisible(true);
        jButtonNext.setVisible(true);
        jLabelPageNumber.setVisible(true);
        jLabelPageNumber.setText("Page : " + (pagenr + 1));
        del = 1;
        load_page();
    }//GEN-LAST:event_jButtonDelCarActionPerformed

    private void Main_Button_LogOut1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_Button_LogOut1MouseEntered
       Main_Button_LogOut1.setBackground(Color.gray);
    }//GEN-LAST:event_Main_Button_LogOut1MouseEntered

    private void Main_Button_LogOut1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_Button_LogOut1MouseExited
        Main_Button_LogOut1.setBackground(new java.awt.Color(242, 242, 242));
    }//GEN-LAST:event_Main_Button_LogOut1MouseExited

    private void Main_Button_LogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Button_LogOut1ActionPerformed
        Home_Page Home_Page = new Home_Page();
        Home_Page.setVisible(true);
        user = null;
        this.dispose();
    }//GEN-LAST:event_Main_Button_LogOut1ActionPerformed

    private void jButtonDelCarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDelCarMouseEntered
        jButtonDelCar.setBackground(Color.gray);
    }//GEN-LAST:event_jButtonDelCarMouseEntered

    private void jButtonDelCarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDelCarMouseExited
        jButtonDelCar.setBackground(new java.awt.Color(242, 242, 242));
    }//GEN-LAST:event_jButtonDelCarMouseExited

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        if(pagenr + 1 < pagemax){
            pagenr++;
            MainPanel.removeAll();
            jLabelPageNumber.setText("<html><b>" + "Page : " + "<html><b>" + (pagenr + 1));
            load_page();
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        if(pagenr - 1 >= 0){
            pagenr--;
            MainPanel.removeAll();
            jLabelPageNumber.setText("<html><b>" + "Page : " + "<html><b>" + (pagenr + 1));
            load_page();
        }
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Board(user,vect).setVisible(true);
            }
        });
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Main_Button_LogOut1;
    private javax.swing.JButton Register_MainMenu;
    private javax.swing.JButton Register_MainMenu1;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton jButtonAddCar;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonContact;
    private javax.swing.JButton jButtonDelCar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPageNumber;
    private javax.swing.JLabel jLabelUserPhoto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
