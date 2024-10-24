/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car_sales;
import java.sql.*;

import java.awt.Color;
import java.beans.Statement;

/**
 *
 * @author adria
 */
public class Register_Page extends javax.swing.JFrame {

    /**
     * Creates new form Register_page
     */
    public Register_Page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

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

        Register_MainMenu.setBackground(new java.awt.Color(153, 153, 255));
        Register_MainMenu.setText("Main Menu");
        Register_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_MainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Register_MainMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RegisterUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                            .addComponent(RegisterEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                                        .addComponent(RegisterShowPass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RegisterPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 172, Short.MAX_VALUE))))
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
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
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
       
        String query = "INSERT INTO users (id,username,email,password,adm,guest) VALUES (?,?,?,?,?,?);";
        
        Connection c = null;
        
        java.sql.Statement stmt = null;
        
      try {
          
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:Car_Sale_DB.db");
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * FROM users;" );
      
        int ok = 1;
        while(rs.next() && ok == 1){
         
            String uname = rs.getString("username");
            String emaill  = rs.getString("email");
            
            if(usernameSS.equals(uname)){
                System.out.println("Username folosit");
                ok = 0;
            }
            else if(emailSS.equals(emaill)){
                System.out.println("email folosit");
                ok = 0;
            }
            
        }
        
        rs.close();
        stmt.close();
        
        if(ok == 1){
        
            PreparedStatement preparedStatement = c.prepareStatement(query);
            preparedStatement.setString(2, usernameSS);
            preparedStatement.setString(3, emailSS);
            preparedStatement.setString(4, passwordSS);
            preparedStatement.setInt(5, 0);
            preparedStatement.setInt(6,0);

            preparedStatement.executeUpdate();

            preparedStatement.close();

            
        }
        c.close();
      } 
      catch ( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
      }
      
 
    }//GEN-LAST:event_RegisterButtonActionPerformed

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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
