package forms;
import forms.Main_Board;
import forms.Register_Page;
import models.User;
import models.Car;
import utilitary.RecoverPassword;
import java.sql.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author adria
 */
public class Login_Page extends javax.swing.JFrame {

    private static List<Car> ls;
    public Login_Page(List<Car> a) {
        
        this.ls = a;
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel_Login_Text = new javax.swing.JLabel();
        JText_Username = new javax.swing.JTextField();
        jPassCheckBox = new javax.swing.JCheckBox();
        jButton_login = new javax.swing.JButton();
        jButtonForgotPassword = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        Login_MainMenu = new javax.swing.JButton();
        jLabelLoginFailed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Logo.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_Logo.setOpaque(true);

        jLabel_Login_Text.setFont(new java.awt.Font("Visitor TT1 BRK", 1, 55)); // NOI18N
        jLabel_Login_Text.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_Login_Text.setText("Login");

        JText_Username.setText("username or email");
        JText_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JText_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JText_UsernameFocusLost(evt);
            }
        });
        JText_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JText_UsernameActionPerformed(evt);
            }
        });

        jPassCheckBox.setText("Show Password");
        jPassCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassCheckBoxActionPerformed(evt);
            }
        });

        jButton_login.setFocusPainted(false);
        jButton_login.setBorderPainted(false);
        jButton_login.setBackground(new java.awt.Color(153, 153, 255));
        jButton_login.setText("Login");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jButtonForgotPassword.setText("Forgot Password");
        jButtonForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotPasswordActionPerformed(evt);
            }
        });

        jPassword.setText("password");
        jPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFocusLost(evt);
            }
        });
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        Login_MainMenu.setFocusPainted(false);
        Login_MainMenu.setBorderPainted(false);
        Login_MainMenu.setBackground(new java.awt.Color(153, 153, 255));
        Login_MainMenu.setText("Main Menu");
        Login_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_MainMenuActionPerformed(evt);
            }
        });

        jLabelLoginFailed.setVisible(false);
        jLabelLoginFailed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLoginFailed.setForeground(new java.awt.Color(255, 0, 0));
        jLabelLoginFailed.setText("Login failed !");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Login_MainMenu))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPassCheckBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                        .addComponent(jButtonForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel_Login_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JText_Username)
                                    .addComponent(jPassword)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelLoginFailed)))
                        .addGap(0, 154, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel_Login_Text)
                .addGap(26, 26, 26)
                .addComponent(JText_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassCheckBox)
                    .addComponent(jButtonForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLoginFailed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(Login_MainMenu)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_MainMenuActionPerformed
        Home_Page Home_Page = new Home_Page();
        Home_Page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Login_MainMenuActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
        String password = String.valueOf(jPassword.getPassword());
        if(password.trim().toLowerCase().equals("password")
            || password.trim().toLowerCase().equals("")){
            jPassword.setText("password");
            jPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jPasswordFocusLost

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained

        /// curata casuta din password
        String password = String.valueOf(jPassword.getPassword());
        if(password.trim().toLowerCase().equals("password")){
            jPassword.setText("");
            jPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jPasswordFocusGained
    
    /**
     * Buton ce creeaza login-ul pe aplicatie
     * @param evt 
     */
    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        String checker = JText_Username.getText();
        String password = String.valueOf(jPassword.getPassword());

        Connection c = null;
        
        String url = "jdbc:mysql://localhost:3306/proiect_cars";
        String userr = "root";
        //<editor-fold defaultstate="collapsed" desc="Nu deschide">
        String passwords = "smecher12@";
        //</editor-fold>

        try{
            c = DriverManager.getConnection(url, userr, passwords);

            java.sql.PreparedStatement stmt = c.prepareStatement("SELECT * FROM users WHERE (username = ? AND password = ?) OR (email = ? AND password = ?);");
            
            password = Register_Page.hashPassword(password);
            
            stmt.setString(1, checker);
            stmt.setString(2, password);
            stmt.setString(3, checker);
            stmt.setString(4, password);
          
            java.sql.ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                //System.out.println("Login");
                
                String username = rs.getString("username");
                String email = rs.getString("email");
                password = rs.getString("password");
                
                //System.out.println(password);
                boolean isAdmin = rs.getBoolean("adm");
                boolean isGuest = rs.getBoolean("guest");
                String profilepic = rs.getString("profilepic");

                // Cream un nou obiect User folosind constructorul
                User user = new User(username, email, password, isAdmin, isGuest,profilepic);
                
                Main_Board main_board = new Main_Board(user,ls);
                main_board.setVisible(true);
                this.dispose();

            }
            else{
                System.out.println("Fail log");
               
                Timer timer = new Timer(5000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jLabelLoginFailed.setVisible(false);
                   
                }
                });
                timer.setRepeats(false);
                timer.start();
                jLabelLoginFailed.setVisible(true);
             
            }
            
            rs.close();
            stmt.close();
            c.close();
        }
        catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jPassCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassCheckBoxActionPerformed
        if(jPassCheckBox.isSelected()){
            jPassword.setEchoChar((char)0);
        }
        else{
            jPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jPassCheckBoxActionPerformed

    private void JText_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JText_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JText_UsernameActionPerformed

    private void JText_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JText_UsernameFocusLost

        /// scriem username la loc
        if(JText_Username.getText().trim().toLowerCase().equals("username or email")
            || JText_Username.getText().trim().toLowerCase().equals("")){
            JText_Username.setText("username or email");
            JText_Username.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_JText_UsernameFocusLost

    private void JText_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JText_UsernameFocusGained
        /// curata casuta din username
        if(JText_Username.getText().trim().toLowerCase().equals("username or email")){
            JText_Username.setText("");
            JText_Username.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_JText_UsernameFocusGained

    private void jButtonForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotPasswordActionPerformed
        RecoverPassword recover = new RecoverPassword();
        recover.setVisible(true);
        recover.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonForgotPasswordActionPerformed
        
    
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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page(ls).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JText_Username;
    private javax.swing.JButton Login_MainMenu;
    private javax.swing.JButton jButtonForgotPassword;
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabelLoginFailed;
    private javax.swing.JLabel jLabel_Login_Text;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jPassCheckBox;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}
