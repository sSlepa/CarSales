/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Utilitary;
import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Register_Verify extends javax.swing.JFrame {
    
    private static String codde;
    private static String username;
    private static String email;
    private static String pass;
 
    public Register_Verify(String codeSS,String username,String email,String pass) {
        this.codde = codeSS;
        this.username = username;
        this.email = email;
        this.pass = pass;
        
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VerifyInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CancelVerifyRegister = new javax.swing.JButton();
        OkVerifyRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        VerifyInput.setFont(new java.awt.Font("Visitor TT1 BRK", 0, 18)); // NOI18N
        VerifyInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VerifyInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyInputActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Visitor TT1 BRK", 1, 24)); // NOI18N
        jLabel1.setText("Verify CODE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Visitor TT1 BRK", 1, 12)); // NOI18N
        jLabel2.setText("Check your email inbox");

        CancelVerifyRegister.setFocusPainted(false);      // Elimină border-ul de focus
        CancelVerifyRegister.setBorderPainted(false);
        CancelVerifyRegister.setFont(new java.awt.Font("Visitor TT1 BRK", 0, 14)); // NOI18N
        CancelVerifyRegister.setText("Cancel");
        CancelVerifyRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelVerifyRegisterActionPerformed(evt);
            }
        });

        OkVerifyRegister.setFocusPainted(false);      // Elimină border-ul de focus
        OkVerifyRegister.setBorderPainted(false);
        OkVerifyRegister.setFont(new java.awt.Font("Visitor TT1 BRK", 0, 14)); // NOI18N
        OkVerifyRegister.setText("OK");
        OkVerifyRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkVerifyRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(CancelVerifyRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OkVerifyRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(VerifyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerifyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelVerifyRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkVerifyRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VerifyInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerifyInputActionPerformed

    private void CancelVerifyRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelVerifyRegisterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CancelVerifyRegisterActionPerformed

    private void OkVerifyRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkVerifyRegisterActionPerformed
        // TODO add your handling code here:
       if(VerifyInput.getText().equals(codde)){
           
           String query = "INSERT INTO users (id,username,email,password,adm,guest,profilepic) VALUES (?,?,?,?,?,?,?);";
           
           Connection c = null;
           
           String url = "jdbc:mysql://localhost:3306/proiect_cars";
           String userr = "root";
           //<editor-fold defaultstate="collapsed" desc="Nu deschide">
           String passwords = "smecher12@";
           //</editor-fold>

           java.sql.Statement stmt = null;
           
           try {

                c = DriverManager.getConnection(url, userr, passwords);
                System.out.println("Register reusit.");

                PreparedStatement preparedStatement = c.prepareStatement(query);
                preparedStatement.setString(2, username);
                preparedStatement.setString(3, email);
                preparedStatement.setString(4, pass);
                preparedStatement.setInt(5, 0);
                preparedStatement.setInt(6,0);
                preparedStatement.setString(7,"C:\\Users\\adria\\Documents\\NetBeansProjects\\Car_Sales\\src\\car_sales\\imagini\\useracc.png");

                preparedStatement.executeUpdate();

                preparedStatement.close();
            
           }catch(Exception e){
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
           }
           
           JOptionPane.showMessageDialog(
                null,
                "Contul a fost activat!",
                "Succes",
                JOptionPane.INFORMATION_MESSAGE
            );
           
           this.dispose();
           
           
       }
       else{
           JOptionPane.showMessageDialog(
                null,
                "Codul este incorect!",
                "Eroare",
                JOptionPane.ERROR_MESSAGE
        );
       }
    }//GEN-LAST:event_OkVerifyRegisterActionPerformed
    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Verify(codde,username,email,pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelVerifyRegister;
    private javax.swing.JButton OkVerifyRegister;
    private javax.swing.JTextField VerifyInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
