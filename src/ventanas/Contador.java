/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.*;


import java.io.FileOutputStream;
import com.itextpdf.text.DocumentException;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class Contador extends javax.swing.JFrame {

    /**
     * Creates new form Contador
     */
    public Contador() {
        
        String user = Login.email;
        
        
        initComponents();
        setTitle("Contador");
        setLocationRelativeTo(null);
        
        JLabel_titulo.setText("Bienvenido " + user);
        //Fondo de la interfaz //
        //netbeans guarda tus imagenes dentro de una carpeta src
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper2.png");
        //La clase Icon te permite acomodar o ajustar la imagen en la interfaz.
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(JLabel_wallpaper.getWidth(), JLabel_wallpaper.getHeight(), Image.SCALE_DEFAULT));
           
        JLabel_wallpaper.setIcon(icono);

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

        JLabel_titulo = new javax.swing.JLabel();
        JButton_Contaduria1 = new javax.swing.JButton();
        JButton_Ventas1 = new javax.swing.JButton();
        PDF = new javax.swing.JButton();
        JButton_Recomendaciones1 = new javax.swing.JButton();
        JLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel_titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_titulo.setText("jLabel2");
        getContentPane().add(JLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        JButton_Contaduria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Contaduria.png"))); // NOI18N
        JButton_Contaduria1.setText("jButton1");
        JButton_Contaduria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Contaduria1ActionPerformed(evt);
            }
        });
        getContentPane().add(JButton_Contaduria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 100));

        JButton_Ventas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ventas.png"))); // NOI18N
        JButton_Ventas1.setText("jButton1");
        JButton_Ventas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Ventas1ActionPerformed(evt);
            }
        });
        getContentPane().add(JButton_Ventas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 120, 100));

        PDF.setBackground(new java.awt.Color(182, 31, 31));
        PDF.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        PDF.setForeground(new java.awt.Color(255, 255, 255));
        PDF.setText("PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });
        getContentPane().add(PDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 140, 100));

        JButton_Recomendaciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recomendaciones.png"))); // NOI18N
        JButton_Recomendaciones1.setText("jButton1");
        JButton_Recomendaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Recomendaciones1ActionPerformed(evt);
            }
        });
        getContentPane().add(JButton_Recomendaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 120, 100));
        getContentPane().add(JLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_Contaduria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Contaduria1ActionPerformed
              
         
          Administracion puente0 = new Administracion();
          puente0.setVisible(true);
          
          
    }//GEN-LAST:event_JButton_Contaduria1ActionPerformed

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
                   
        Document documento = new Document();
        
        try{
            
            //Aqui yo indico la direccion de mi usuario para posteriormente usarla y guardar mi
            //docuemento
            String ruta = System.getProperty("user.home");
            //Mi clase file output stream me permite indicar donde voy a querer que se guarde mi docuemnto
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte de Ventas"));
            
            
            PdfPTable tabla = new PdfPTable(7);
            
            tabla.addCell("Nombre Comprador");
            tabla.addCell("Telefono");
            tabla.addCell("Correo");
            tabla.addCell("Precio Vendido");
            tabla.addCell("Tipo de Amplificador");
            tabla.addCell("Watts");
            tabla.addCell("Fecha");
            
            documento.open();
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from ventas");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                do{
                tabla.addCell(rs.getString(1));
                tabla.addCell(rs.getString(2));
                tabla.addCell(rs.getString(3));
                tabla.addCell(rs.getString(4));
                tabla.addCell(rs.getString(5));
                tabla.addCell(rs.getString(6));
                tabla.addCell(rs.getString(7));
                } while(rs.next());
            
            }
            
            documento.add(tabla);
            JOptionPane.showMessageDialog(null, "Reporte creado con exito ");
                
        } catch(Exception e){
            
            System.out.println("Huboo un error al crear el pdf");
            JOptionPane.showMessageDialog(null, "Error al crear el pdf ", "", JOptionPane.WARNING_MESSAGE);
            
        }
        //Aqui podrias crear otro try catch para que no se tenga que esperar tu programa a que se realice 
        //todo el proceso y despues se cierre
        documento.close();
        
    }//GEN-LAST:event_PDFActionPerformed

    private void JButton_Ventas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Ventas1ActionPerformed
       Ventas puente0 = new Ventas();
        puente0.setVisible(true);
    }//GEN-LAST:event_JButton_Ventas1ActionPerformed

    private void JButton_Recomendaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Recomendaciones1ActionPerformed
        
        Recomendaciones puente0 = new Recomendaciones();
        puente0.setVisible(true);
        
    }//GEN-LAST:event_JButton_Recomendaciones1ActionPerformed

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
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Contaduria1;
    private javax.swing.JButton JButton_Recomendaciones1;
    private javax.swing.JButton JButton_Ventas1;
    private javax.swing.JLabel JLabel_titulo;
    private javax.swing.JLabel JLabel_wallpaper;
    private javax.swing.JButton PDF;
    // End of variables declaration//GEN-END:variables
}
