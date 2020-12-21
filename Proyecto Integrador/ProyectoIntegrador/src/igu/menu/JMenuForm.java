package igu.menu;

import igu.categoria.JCategoriaForm;
import igu.login.LoginForm;
import igu.persona.JPersonaForm;
import igu.productos.JProductosForm;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JMenuForm extends javax.swing.JFrame {
LoginForm lf= new LoginForm();

    public JMenuForm() {
        initComponents();
        jPanelPrincipal.hide();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuConfiguracion = new javax.swing.JMenu();
        jMenuItemRegTrabajador = new javax.swing.JMenuItem();
        jMenuVentas = new javax.swing.JMenu();
        jMenuItemRealizarVentas = new javax.swing.JMenuItem();
        jMenuItemRegistrarDepositos = new javax.swing.JMenuItem();
        jMenuProductos = new javax.swing.JMenu();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenuItemCategoria = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();
        jMenuItemReporteVentas = new javax.swing.JMenuItem();
        jMenuItemReporteProductos = new javax.swing.JMenuItem();
        jMenuItemReportePersonas = new javax.swing.JMenuItem();
        jMenuProveedores = new javax.swing.JMenu();
        jMenuItemRegistrarProveedores = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1029, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItemSalir.setLabel("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion.png"))); // NOI18N
        jMenuConfiguracion.setText("Configuracion");
        jMenuConfiguracion.setToolTipText("");
        jMenuConfiguracion.setAlignmentX(0.3F);
        jMenuConfiguracion.setAlignmentY(0.3F);

        jMenuItemRegTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenuItemRegTrabajador.setText("Registrar Persona");
        jMenuItemRegTrabajador.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuItemRegTrabajador.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenuItemRegTrabajadorMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenuItemRegTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegTrabajadorActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jMenuItemRegTrabajador);

        jMenuBar1.add(jMenuConfiguracion);

        jMenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        jMenuVentas.setText("Gestion Ventas");

        jMenuItemRealizarVentas.setText("Realizar Ventas");
        jMenuVentas.add(jMenuItemRealizarVentas);

        jMenuItemRegistrarDepositos.setText("Registrar Depositos");
        jMenuVentas.add(jMenuItemRegistrarDepositos);

        jMenuBar1.add(jMenuVentas);

        jMenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camara.png"))); // NOI18N
        jMenuProductos.setText("Gestionar Productos");

        jMenuItemProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Productos.png"))); // NOI18N
        jMenuItemProductos.setText("Registrar Producto");
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemProductos);

        jMenuItemCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N
        jMenuItemCategoria.setText("Registrar Categoria");
        jMenuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriaActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemCategoria);

        jMenuBar1.add(jMenuProductos);

        jMenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tiempo.png"))); // NOI18N
        jMenuReportes.setText("Reportes");

        jMenuItemReporteVentas.setText("Reporte de Ventas");
        jMenuReportes.add(jMenuItemReporteVentas);

        jMenuItemReporteProductos.setText("Reporte de Productos");
        jMenuReportes.add(jMenuItemReporteProductos);

        jMenuItemReportePersonas.setText("Reporte de Personas");
        jMenuReportes.add(jMenuItemReportePersonas);

        jMenuBar1.add(jMenuReportes);

        jMenuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jMenuProveedores.setText("Gestionar Proveedores");

        jMenuItemRegistrarProveedores.setText("Registrar Proveedores");
        jMenuProveedores.add(jMenuItemRegistrarProveedores);

        jMenuBar1.add(jMenuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegTrabajadorActionPerformed
       
        JPersonaForm jpf = new JPersonaForm();        
        jpf.setVisible(true);
        
        //jPanelPrincipal.add("",jpf);
        //jPanelPrincipal.setVisible(true);
                
    }//GEN-LAST:event_jMenuItemRegTrabajadorActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemRegTrabajadorMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenuItemRegTrabajadorMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRegTrabajadorMenuKeyPressed

    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
            JProductosForm jpf = new JProductosForm();
            jpf.setVisible(true);
    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    private void jMenuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriaActionPerformed

            JCategoriaForm jcf= new JCategoriaForm();
            jcf.setVisible(true);
    }//GEN-LAST:event_jMenuItemCategoriaActionPerformed

 
    
    
    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                new JMenuForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfiguracion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCategoria;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuItem jMenuItemRealizarVentas;
    private javax.swing.JMenuItem jMenuItemRegTrabajador;
    private javax.swing.JMenuItem jMenuItemRegistrarDepositos;
    private javax.swing.JMenuItem jMenuItemRegistrarProveedores;
    private javax.swing.JMenuItem jMenuItemReportePersonas;
    private javax.swing.JMenuItem jMenuItemReporteProductos;
    private javax.swing.JMenuItem jMenuItemReporteVentas;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JMenu jMenuProveedores;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JMenu jMenuVentas;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
