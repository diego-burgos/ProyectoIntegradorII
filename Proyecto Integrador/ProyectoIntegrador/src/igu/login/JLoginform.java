package igu.login;

import Entidades.*;
import igu.menu.JMenuForm;
import implement.conf.accesos.TrabajadorDAO;
import implement.conf.accesos.TrabajadorDaoImpl;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import mantenimiento.Formularios.MenuForm;
import mantenimiento.Mpersona;


public class JLoginform extends javax.swing.JFrame {

    public JLoginform() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLb_usuario = new javax.swing.JLabel();
        jLbPassword = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jPsw_Pasword = new javax.swing.JPasswordField();
        JBt_Ingresar = new javax.swing.JButton();
        jBt_Salir = new javax.swing.JButton();
        jLb_Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBounds(new java.awt.Rectangle(15, 15, 0, 0));
        setForeground(new java.awt.Color(51, 51, 255));
        setPreferredSize(new java.awt.Dimension(390, 360));
        setShape(getShape());

        jLb_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLb_usuario.setText("Usuario: ");

        jLbPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLbPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPassword.setText("Contraseña: ");

        JBt_Ingresar.setText("Ingresar");
        JBt_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBt_IngresarActionPerformed(evt);
            }
        });

        jBt_Salir.setText("Salir");
        jBt_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_SalirActionPerformed(evt);
            }
        });

        jLb_Titulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLb_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_Titulo.setText("Ingresar al Sistema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLb_usuario)
                .addGap(18, 18, 18)
                .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLbPassword)
                .addGap(10, 10, 10)
                .addComponent(jPsw_Pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(JBt_Ingresar)
                .addGap(18, 18, 18)
                .addComponent(jBt_Salir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLb_usuario))
                    .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLbPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPsw_Pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBt_Ingresar)
                    .addComponent(jBt_Salir)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBt_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBt_IngresarActionPerformed
        
   
        
        TrabajadorDAO  trabajadorDao = new TrabajadorDaoImpl();
        if(trabajadorDao.AutenticarTrabajador(jTxtUsuario.getText(), jPsw_Pasword.getText()).equals("SI")){
            this.hide();
            //hace referencia al menu con datos de la base de datos
            JMenuForm mf = new JMenuForm();            
            mf.setVisible(true);
            
            //hace referencia al menu con datos dinamicos            
            //MenuForm mf = new MenuForm();
            //mf.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null,"Usuario y/o clave incorrecto!!","Error",JOptionPane.INFORMATION_MESSAGE);
            jTxtUsuario.setText("");
            jPsw_Pasword.setText("");
        }
        
    }//GEN-LAST:event_JBt_IngresarActionPerformed

    private void jBt_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_SalirActionPerformed
        
        System.exit(0);
       
    }//GEN-LAST:event_jBt_SalirActionPerformed

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JLoginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLoginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLoginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLoginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLoginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBt_Ingresar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBt_Salir;
    private javax.swing.JLabel jLbPassword;
    private javax.swing.JLabel jLb_Titulo;
    private javax.swing.JLabel jLb_usuario;
    private javax.swing.JPasswordField jPsw_Pasword;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
