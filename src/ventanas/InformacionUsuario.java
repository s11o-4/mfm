package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author ruben
 */
public class InformacionUsuario extends javax.swing.JFrame {

    String user = "", user_update = "";

    //Cree una variable de tipo entero en donde voy a almacenar 
    //mi variable estatica ID_USER de mi clase GestionarUsuarios para no tener que instanciar 
    //siempre la clase
    int ID_USER = GestionarUsuarios.ID_USER;

    int ID = 1;

    public InformacionUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        user = Login.email;
        user_update = GestionarUsuarios.user_update;

        setSize(630, 450);
        setResizable(false);
        setTitle("Informacion del usuario " + user);

        //Metodo para evitar que cuando cierres esta interfaz se termine de ejecutar
        //todo
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper2.png");

        //Se crea un objeto de la clase icon ya que si tu quieres poner un objeto de la 
        //clase ImageIcon no te lo va a permitir
        Icon fondo = new ImageIcon(wallpaper.getImage().getScaledInstance(
                JLabel_Wallpaper.getWidth(),
                JLabel_Wallpaper.getHeight(),
                Image.SCALE_DEFAULT));

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Creo un objeto de mi clase Icon porque es el que me permite meterlo a mi jLabel, ademas de que me permite
        //modificar y obtener las medidas de mi JLabel.
        JLabel_Wallpaper.setIcon(fondo);
        this.repaint();

        JLabel_Titulo.setText("Informacion del usuario " + user_update);

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from Users where username = '" + user_update + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //A una base de datos tamboen le puedes solicitar datos de tipo entero
                ID = rs.getInt("id_usuario");
                //Las columnas en una tabla van del 1 al n
                txt_mail.setText(rs.getString(3));
                txt_nombre.setText(rs.getString(2));
                txt_telefono.setText(rs.getString(4));
                txt_username.setText(rs.getString(5));
                cmb_niveles.setSelectedItem(rs.getString(7));
                cmb_estatus.setSelectedItem(rs.getString(8));

            }
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontro al usuario comuniquese con el administrador");
            System.err.println("Error al mostrar los datos del empleado ");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel_Titulo = new javax.swing.JLabel();
        JLabel_nombre = new javax.swing.JLabel();
        JLabel_nombre1 = new javax.swing.JLabel();
        JLabel_nombre2 = new javax.swing.JLabel();
        JLabel_nombre3 = new javax.swing.JLabel();
        JLabel_nombre4 = new javax.swing.JLabel();
        JLabel_nombre5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        cmb_niveles = new javax.swing.JComboBox<>();
        cmb_estatus = new javax.swing.JComboBox<>();
        jButton_Actualizar = new javax.swing.JButton();
        JButton_RestaurarPassword = new javax.swing.JButton();
        JButton_EliminarUsuario = new javax.swing.JButton();
        JLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel_Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_Titulo.setText("Informacion del Usuario");
        getContentPane().add(JLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        JLabel_nombre.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_nombre.setText("Nombre");
        getContentPane().add(JLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        JLabel_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_nombre1.setText("em@il");
        getContentPane().add(JLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        JLabel_nombre2.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_nombre2.setText("Telefono");
        getContentPane().add(JLabel_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        JLabel_nombre3.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_nombre3.setText("Permisos de");
        getContentPane().add(JLabel_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        JLabel_nombre4.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_nombre4.setText("User_name");
        getContentPane().add(JLabel_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        JLabel_nombre5.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_nombre5.setText("Estatus");
        getContentPane().add(JLabel_nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(185, 234, 252));
        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(19, 99, 169));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 30));

        txt_mail.setBackground(new java.awt.Color(185, 234, 252));
        txt_mail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(19, 99, 169));
        txt_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 30));

        txt_telefono.setBackground(new java.awt.Color(185, 234, 252));
        txt_telefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(19, 99, 169));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 30));

        txt_username.setBackground(new java.awt.Color(185, 234, 252));
        txt_username.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_username.setForeground(new java.awt.Color(19, 99, 169));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, 30));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contador", "Vendedor", " " }));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 40));

        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", " " }));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 120, 40));

        jButton_Actualizar.setBackground(new java.awt.Color(185, 234, 252));
        jButton_Actualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Actualizar.setText("Actualizar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 240, 40));

        JButton_RestaurarPassword.setBackground(new java.awt.Color(185, 234, 252));
        JButton_RestaurarPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButton_RestaurarPassword.setForeground(new java.awt.Color(0, 0, 0));
        JButton_RestaurarPassword.setText("Restaurar Password");
        JButton_RestaurarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_RestaurarPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(JButton_RestaurarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 240, 40));

        JButton_EliminarUsuario.setBackground(new java.awt.Color(185, 234, 252));
        JButton_EliminarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButton_EliminarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        JButton_EliminarUsuario.setText("Eliminar Usuario");
        JButton_EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton_EliminarUsuario(evt);
            }
        });
        getContentPane().add(JButton_EliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 240, 40));
        getContentPane().add(JLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("UPDATE Users set username = ?, email = ?, telephonenumber = ?, "
                    + "permissions = ? where id_user = '" + ID + "'");

            pst.setString(1, txt_nombre.getText().trim());
            pst.setString(2, txt_mail.getText().trim());
            pst.setString(3, txt_telefono.getText().trim());
            pst.setString(4, (String) cmb_niveles.getSelectedItem());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos actualizados con exito");

            bandera3 = false;

            this.dispose();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error al actualizar los datos ");
            System.err.println("Error al actualizar los datos ");

        }


    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void JButton_RestaurarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_RestaurarPasswordActionPerformed

        Password puente0 = new Password();
        puente0.setVisible(true);
    }//GEN-LAST:event_JButton_RestaurarPasswordActionPerformed

    private void Jbutton_EliminarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton_EliminarUsuario
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("DELETE FROM Users WHERE "
                    + "id_user = '"+ ID +"'");

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario eliminado con exito");

            bandera3 = false;

            this.dispose();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el usuario");
            System.err.println("Error al eliminar el usuario datos ");

        }
    }//GEN-LAST:event_Jbutton_EliminarUsuario

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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_EliminarUsuario;
    private javax.swing.JButton JButton_RestaurarPassword;
    private javax.swing.JLabel JLabel_Titulo;
    private javax.swing.JLabel JLabel_Wallpaper;
    private javax.swing.JLabel JLabel_nombre;
    private javax.swing.JLabel JLabel_nombre1;
    private javax.swing.JLabel JLabel_nombre2;
    private javax.swing.JLabel JLabel_nombre3;
    private javax.swing.JLabel JLabel_nombre4;
    private javax.swing.JLabel JLabel_nombre5;
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    //Variable bandera para mi password
    static boolean bandera2 = false;

    //variable bandera para la interfaz gestionar usuarios
    static boolean bandera3 = true;

}
