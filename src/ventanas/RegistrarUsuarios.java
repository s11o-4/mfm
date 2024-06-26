package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author ruben
 */
public class RegistrarUsuarios extends javax.swing.JFrame {
     
    String user;
    /**
     * Creates new form RegistrarUsuarios
     */
    public RegistrarUsuarios() {
        initComponents();
        user = Login.email;
        
        setTitle("Registrar Nuevo Usuario - Sesion de " + user);
        
        setSize(630,350);
        setResizable(false);
        setLocationRelativeTo(null);
        
        //Metodo para evitar que se cierre la interfaz cuando cierras
        //esta pestaña
        
        //Metodo que nos permite que el programa finalice cuando la interfaz
        //se cierre
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    //Fondo de la interfaz //
        //netbeans guarda tus imagenes dentro de una carpeta src
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper2.png");
        //La clase Icon te permite acomodar o ajustar la imagen en la interfaz.
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(
                jLabel_Wallpeper.getWidth(), 
                jLabel_Wallpeper.getHeight(), Image.SCALE_DEFAULT));
           
        jLabel_Wallpeper.setIcon(icono);

        //este metodo es para asegurar los 
        //cambios
        this.repaint();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txt_password2 = new javax.swing.JPasswordField();
        Registrar = new javax.swing.JButton();
        cmb_niveles = new javax.swing.JComboBox<>();
        jLabel_Wallpeper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(185, 234, 252));
        txt_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(19, 99, 252));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("em@il");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Permisos de:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txt_mail.setBackground(new java.awt.Color(185, 234, 252));
        txt_mail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(19, 99, 252));
        txt_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_telefono.setBackground(new java.awt.Color(185, 234, 252));
        txt_telefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(19, 99, 252));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        txt_username.setBackground(new java.awt.Color(185, 234, 252));
        txt_username.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_username.setForeground(new java.awt.Color(19, 99, 252));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        txt_password.setBackground(new java.awt.Color(185, 234, 252));
        txt_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(19, 99, 169));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 210, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirmar Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 180, -1));

        txt_password2.setBackground(new java.awt.Color(185, 234, 252));
        txt_password2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_password2.setForeground(new java.awt.Color(19, 99, 169));
        txt_password2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        Registrar.setBackground(new java.awt.Color(185, 234, 252));
        Registrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Registrar.setForeground(new java.awt.Color(0, 0, 0));
        Registrar.setText("Registrar Usuario");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 230, 40));

        cmb_niveles.setBackground(new java.awt.Color(102, 102, 102));
        cmb_niveles.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmb_niveles.setForeground(new java.awt.Color(255, 255, 255));
        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contaduria", "Vendedor", " " }));
        cmb_niveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nivelesActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel_Wallpeper.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Wallpeper.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_Wallpeper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
       
        //validacion es la variable bandera
        int permisos_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, pass2, permisos_string = null;
        
        mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        pass = txt_password.getText().trim();
        pass2 = txt_password2.getText().trim();
        nombre = txt_nombre.getText().trim();
        telefono = txt_telefono.getText().trim();
        //truco para no iniciar desde 0
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;
        
        if(mail.equals("")){
            txt_mail.setBackground(Color.red);
            validacion++;
        }
        
        if(username.equals("")){
            txt_username.setBackground(Color.red);
            validacion++;
        }
        
        if(pass2.equals("")){
            txt_password2.setBackground(Color.red);
            validacion++;
        }
        
        if(pass.equals("")){
            txt_password.setBackground(Color.red);
            validacion++;
        }
        
       
        
        if(nombre.equals("")){
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        
        if(telefono.equals("")){
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
        
        
        
        if(permisos_cmb == 1){
            
            permisos_string = "admin";
            
        } else if(permisos_cmb == 2){
            permisos_string = "admin";
            
        } else if(permisos_cmb == 3){
            permisos_string = "admin";
            
        }
        
        try{
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    //Se colocan comillas simples uando deseas comparar
                    //datos de una variable externa
                "select username from Users where username = '" + username + "'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_username.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                //metodo para cerrar la conexion con la base de datos
                cn.close();
                
            } else {
                
                if(!pass.equals(pass2)){
                 txt_password.setBackground(Color.red);
                 validacion++;
                 txt_password2.setBackground(Color.red);
                 JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                 txt_password.setText("");
                 txt_password2.setText("");
           
        } else {
                //cerrar la conexion
                cn.close();
                
                if(validacion  == 0){
                   
                    try{
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement(
                            "insert into Users values (?,?,?,?,?,?)");
                        
                        pst2.setString(1, mail);
                        pst2.setString(2, pass);
                        pst2.setString(3, permisos_string);
                        pst2.setString(4, username);
                        pst2.setString(5, telefono);
                        pst2.setInt(6, 1);
                        
                        pst2.executeUpdate();
                        cn2.close();
                        
                        Limpiar();
                        
                        txt_mail.setBackground(Color.GREEN);
                        txt_username.setBackground(Color.GREEN);
                        txt_password.setBackground(Color.GREEN);
                        txt_telefono.setBackground(Color.GREEN);
                        txt_password2.setBackground(Color.GREEN);
                        txt_nombre.setBackground(Color.GREEN);
                        
                        JOptionPane.showMessageDialog(null, "Registro Exitoso");
                        //Metodo que hace que la interfaz se cierre al registrar un nuevo
                        //usuario y ayuda a liberar recursos. solo ocurre cuando presionas el boton
                        this.dispose();
                        
                        
                    }catch(SQLException e){
                        System.err.println("Error en registrar usuario");
                        JOptionPane.showMessageDialog(null, "Error al registrar, comuniquese con el administrador");
                    }
                
                } else {
                     JOptionPane.showMessageDialog(null, "Debes llenar todos los campos ");
                     
                }
              
                }
                
            }
        }catch(SQLException e){
            System.err.println("Error en validar nombre de usuario." + e);
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario "
                    + " \n favor de comunicarse con el administrador");
        }
        
        
    }//GEN-LAST:event_RegistrarActionPerformed

    private void cmb_nivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_nivelesActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        //</editor-fold>

        /* Create and display the form */
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Wallpeper;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password2;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
  
    public void Limpiar(){
        
        txt_mail.setText("");
        txt_nombre.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");
        //Restaurar un JComboBox
        cmb_niveles.setSelectedIndex(0);
        
    }



}

