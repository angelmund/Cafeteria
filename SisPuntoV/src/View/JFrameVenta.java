/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author algel
 */
public class JFrameVenta extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenu
     */
    
    public static DefaultTableModel modelo2;
    
    public JFrameVenta() {
        initComponents();
        this.setSize(new Dimension(600,430)); //tamano
        //evitar que modifiquen el tamano
        this.setResizable(false);
        this.setLocale(null);
        //centrar el frame
        this.setLocationRelativeTo(null);
        //Titulo
        this.setTitle("Cafetería");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IconCaf.png"));
        this.setIconImage(icon);
        
        modelo2=new DefaultTableModel();
        modelo2.addColumn("Producto");
        modelo2.addColumn("Tamaño");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio Unitario");
        modelo2.addColumn("Monto Total");
        tableVentas.setModel(modelo2);
        
    }
    
    public static String getID(){
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_FrameMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Tamaño", "Precio", "Cantidad"
            }
        ));
        tableVentas.setEnabled(false);
        jScrollPane1.setViewportView(tableVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 480, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Detalles de la Venta");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 190, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Capuchino.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jButton_FrameMenu.setBackground(new java.awt.Color(51, 0, 0));
        jButton_FrameMenu.setForeground(new java.awt.Color(51, 0, 0));
        jButton_FrameMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Regresar.png"))); // NOI18N
        jButton_FrameMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_FrameMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FrameMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_FrameMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 90, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Regresar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Americano.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 60, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frappe.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fon1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_FrameMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FrameMenuActionPerformed
        //anda a llamar el Frame menuPrincipal 
        menuPrincipal interMenu = new  menuPrincipal(); //se agrega un nuevo objeto
        interMenu.setVisible(true); //hace que sea visible el frame que se llama 
        this.dispose(); //se elimina este frame al regresar al anterior 

    }//GEN-LAST:event_jButton_FrameMenuActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_FrameMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVentas;
    // End of variables declaration//GEN-END:variables
}
