/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import utilitary.Register_Verify;
import utilitary.EmailSender;
import java.sql.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

///345454545
public class Register_Page extends javax.swing.JFrame {

    public static String hashPassword(String password) {
        try {
            // Alegem algoritmul de hash (SHA-256)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Convertim parola într-un array de bytes
            byte[] hashedBytes = digest.digest(password.getBytes());

            // Convertim rezultatul într-un string hexazecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b); // Extragem valoarea hexazecimală
                if (hex.length() == 1) {
                    hexString.append('0'); // Adaugam un '0' pentru valori mai mici de 16
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } 
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error: Algoritm de hash necunoscut!", e);
        }
    }
    public Register_Page() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RegisterUsername = new javax.swing.JTextField();
        RegisterEmail = new javax.swing.JTextField();
        RegisterButton = new javax.swing.JButton();
        RegisterShowPass = new javax.swing.JCheckBox();
        RegisterPassword = new javax.swing.JPasswordField();
        Register_MainMenu = new javax.swing.JButton();
        jLabelRegisterFailed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Visitor TT1 BRK", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("REGISTER");

        RegisterUsername.setText("username");
        RegisterUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegisterUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegisterUsernameFocusLost(evt);
            }
        });
        RegisterUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUsernameActionPerformed(evt);
            }
        });

        RegisterEmail.setText("email");
        RegisterEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegisterEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegisterEmailFocusLost(evt);
            }
        });
        RegisterEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterEmailActionPerformed(evt);
            }
        });

        RegisterButton.setBackground(new java.awt.Color(153, 153, 255));
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        RegisterShowPass.setText("Show Password");
        RegisterShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterShowPassActionPerformed(evt);
            }
        });

        RegisterPassword.setText("password");
        RegisterPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegisterPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegisterPasswordFocusLost(evt);
            }
        });
        RegisterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterPasswordActionPerformed(evt);
            }
        });

        Register_MainMenu.setBackground(new java.awt.Color(153, 153, 255));
        Register_MainMenu.setText("Main Menu");
        Register_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_MainMenuActionPerformed(evt);
            }
        });

        jLabelRegisterFailed.setVisible(false);
        jLabelRegisterFailed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRegisterFailed.setForeground(new java.awt.Color(255, 0, 0));
        jLabelRegisterFailed.setText("Register failed!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RegisterUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                            .addComponent(RegisterEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                                        .addComponent(RegisterShowPass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RegisterPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 200, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelRegisterFailed)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Register_MainMenu)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(RegisterShowPass)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRegisterFailed, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(Register_MainMenu)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterUsernameActionPerformed

    private void RegisterEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterEmailActionPerformed

    private void RegisterUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterUsernameFocusGained
        if(RegisterUsername.getText().trim().equals("username")){
            RegisterUsername.setText("");
            RegisterUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_RegisterUsernameFocusGained

    private void RegisterUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterUsernameFocusLost
       if(RegisterUsername.getText().trim().equals("username")
            || RegisterUsername.getText().trim().equals("")){
            RegisterUsername.setText("username");
            RegisterUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_RegisterUsernameFocusLost

    private void RegisterPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterPasswordFocusGained
        /// curata casuta din password
        String password = String.valueOf(RegisterPassword.getPassword());
        if(password.trim().toLowerCase().equals("password")){
            RegisterPassword.setText("");
            RegisterPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_RegisterPasswordFocusGained

    private void RegisterPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterPasswordFocusLost
        String password = String.valueOf(RegisterPassword.getPassword());
        if(password.trim().toLowerCase().equals("password")
            || password.trim().toLowerCase().equals("")){
            RegisterPassword.setText("password");
            RegisterPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_RegisterPasswordFocusLost

    private void RegisterEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterEmailFocusGained
       if(RegisterEmail.getText().trim().equals("email")){
            RegisterEmail.setText("");
            RegisterEmail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_RegisterEmailFocusGained

    private void RegisterEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterEmailFocusLost
        if(RegisterEmail.getText().trim().equals("email")
            || RegisterEmail.getText().trim().equals("")){
            RegisterEmail.setText("email");
            RegisterEmail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_RegisterEmailFocusLost

    private void RegisterShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterShowPassActionPerformed
        if(RegisterShowPass.isSelected()){
            RegisterPassword.setEchoChar((char)0);
        }
        else{
            RegisterPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_RegisterShowPassActionPerformed

    private void Register_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_MainMenuActionPerformed
        Home_Page Home_Page = new Home_Page();
        Home_Page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Register_MainMenuActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        String usernameSS = RegisterUsername.getText(); 
        String emailSS = RegisterEmail.getText();
        String passwordSS = String.valueOf(RegisterPassword.getPassword());
        
        if(!usernameSS.equals("username") && !emailSS.equals("email") && !passwordSS.equals("password")){
            
            passwordSS = hashPassword(passwordSS);
            
            String query = "INSERT INTO users (id,username,email,password,adm,guest) VALUES (?,?,?,?,?,?);";

            Connection c = null;

            java.sql.Statement stmt = null;
            
            String url = "jdbc:mysql://localhost:3306/proiect_cars";
            String userr = "root";
            //<editor-fold defaultstate="collapsed" desc="Nu deschide">
            String passwords = "smecher12@";
            //</editor-fold>

            try {

            c = DriverManager.getConnection(url, userr, passwords);

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM users;" );

            int ok = 1;
            int idd = 1;
            while(rs.next() && ok == 1){
                
                String uname = rs.getString("username");
                String emaill  = rs.getString("email");
                idd = rs.getInt("id");
                
                //System.out.print(idd);
                //System.out.println(uname);
                

                if(usernameSS.equals(uname)){
                    JOptionPane.showMessageDialog(
                        null,
                        "Username folosit",
                        "Eroare",
                        JOptionPane.ERROR_MESSAGE
                    );
                    ok = 0;
                }
                else if(emailSS.equals(emaill)){
                    JOptionPane.showMessageDialog(
                        null,
                        "Email folosit",
                        "Eroare",
                        JOptionPane.ERROR_MESSAGE
                    );
                    ok = 0;
                }

            }
            
            rs.close();
            stmt.close();

            if(ok == 1){
                
                String codeSS = EmailSender.sendVerificationEmail(emailSS,1);
                
                Register_Verify verify = new Register_Verify(codeSS,usernameSS,emailSS,passwordSS);
                verify.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                verify.setVisible(true);

            }
                        
            c.close();
          } 
          catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
          }
        }
        else{
            
                Timer timer = new Timer(5000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jLabelRegisterFailed.setVisible(false);
                   
                }
                });
                timer.setRepeats(false);
                timer.start();
                jLabelRegisterFailed.setVisible(true);
            }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void RegisterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField RegisterEmail;
    private javax.swing.JPasswordField RegisterPassword;
    private javax.swing.JCheckBox RegisterShowPass;
    private javax.swing.JTextField RegisterUsername;
    private javax.swing.JButton Register_MainMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelRegisterFailed;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
