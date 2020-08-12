package ventanas;

import javax.swing.*;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruben
 */
public class GestionarUsuarios extends javax.swing.JFrame {

    String user;
    public static String user_update = "";
    public static int ID_USER;
    
    //CLase DefaultTableModel!
    //Objeto de mi clase Table Model para poder modificarla
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form GestionarUsuarios
     */
    public GestionarUsuarios() {
        
        initComponents();
        user = Login.user;

        setSize(630, 330);
        setTitle("Usuarios registrados - Sesion de " + user);
        setResizable(false);
        setLocationRelativeTo(null);

        //metodo que evita que finalice el programa cuando cerremos esta interfaz
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Fondo de la interfaz //
        //netbeans guarda tus imagenes dentro de una carpeta src
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper2.png");
        //La clase Icon te permite acomodar o ajustar la imagen en la interfaz.
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(JLabel_Wallpaper.getWidth(), JLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));

        JLabel_Wallpaper.setIcon(icono);

        //este metodo es para asegurar los 
        //cambios
        this.repaint();

        try {
            
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_usuario, nombre_usuario, username, tipo_nivel, estatus from usuarios ");

            ResultSet rs = pst.executeQuery();
             
            
            //Inicialixo mi tabla e indico que va a ser un nuevo objeto
            //de mi tabla table
            
            JTable_usuarios = new JTable(model);
           
          
           
            
            //Metodo para que dentro de mi jscrollpane este mi tabla usuarios
            
           jScrollPane1.setViewportView(JTable_usuarios);

            model.addColumn(" ID ");
            model.addColumn("Nombre");
            model.addColumn("Username");
            model.addColumn("EStatus");

            while (rs.next()) {
                //Es un vector de tipo object
                //ES un tipo de objeto comodin que se usa en tablas
                Object[] fila = new Object[5];

                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                
                //Metodo para agreafar una fila, ya que mi objeto de tipo object
                //es solo un vector
                
                model.addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {
            //Mensaje de error
          System.err.println("Error al llenar tabla");
          JOptionPane.showMessageDialog(null, "Hubo un problema al generar la tabla"
                  + "comuniquese con el administrador ");
          
        }
        
        JTable_usuarios.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                int fila_point = JTable_usuarios.rowAtPoint(e.getPoint());
                //Recuerda que el conteo de las columnas va desde el 0 hasta el numero de 
                //columnas que tengas.
                int columna_point = 2;
                int columna_id = 0;
                
                //No pueden existir filas que sean menores a 0 por eso es que se coloca el -1
                if(fila_point > -1){
                    
                    //Aqui tienes que usar casting ya que es un objeto de tipo valla la rebundancia de tipo
                    //object
                    //NO es necesiario utiliza rl pareso ya que es un objeto que es fijo
                    
                    user_update = (String)model.getValueAt(fila_point, columna_point);
                    ID_USER = (int)model.getValueAt(fila_point, columna_id);
                    dispose();
                    InformacionUsuario informacion_usuario = new InformacionUsuario();
                    informacion_usuario.setVisible(true);
                    
                    
                }
            }
        });
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_usuarios = new javax.swing.JTable();
        JLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios Registrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        JTable_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTable_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 630, 180));
        getContentPane().add(JLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Wallpaper;
    private javax.swing.JTable JTable_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
      
  

}