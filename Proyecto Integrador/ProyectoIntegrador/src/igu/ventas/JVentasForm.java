
package igu.ventas;

import Entidades.Clientes;
import Entidades.Productos;
import Entidades.Detalle_venta;
import Entidades.Ventas;
import implement.clientes.ClientesDAO;
import implement.clientes.ClientesDaoImpl;
import implement.productos.ProductosDAO;
import implement.productos.ProductosDaoImpl;
import implement.ventas.VentasDAO;
import implement.ventas.VentasDaoImpl;
import java.util.ArrayList;
import java.util.List;


public class JVentasForm extends javax.swing.JFrame {
    
    public List<Productos> lpv = new ArrayList<Productos>();
    public List<Detalle_venta> lpd = new ArrayList<Detalle_venta>();

    public JVentasForm() {
        initComponents();
        listaProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductosVenta = new javax.swing.JTable();
        jComboBoxProductos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jTextFieldBuscarCliente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabelDatosCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTotalVenta = new javax.swing.JTextField();
        jLabelTotalVenta = new javax.swing.JLabel();
        jButtonConfirmarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cant", "Descripcion", "Precio Unitario", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProductosVenta);

        jComboBoxProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductosActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto");

        jLabel2.setText("Cantidad");

        jTextFieldCantidad.setText("1");

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jButtonBuscarCliente.setText("Buscar");
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jLabelDatosCliente.setText("Ingrese cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("COMPROBANTE DE VENTA");

        jLabelTotalVenta.setText("Total:");

        jButtonConfirmarVenta.setText("Confirmar Venta");
        jButtonConfirmarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarCliente))
                    .addComponent(jLabelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCantidad)
                    .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButtonEnviar)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConfirmarVenta)
                    .addComponent(jTextFieldTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButtonEnviar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBuscarCliente)
                            .addComponent(jButtonBuscarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDatosCliente)
                        .addGap(24, 24, 24)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfirmarVenta)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed

        Clientes c;
        ClientesDAO clientesDAO= new ClientesDaoImpl();
        c = clientesDAO.buscarClienteCodigo(jTextFieldBuscarCliente.getText());
        jLabelDatosCliente.setText(c.getS_nombres()+" "+c.getS_ap_paterno()+" "+c.getS_ap_materno());
        
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        
        Productos pv= new Productos();
        Detalle_venta dv = new Detalle_venta();
                
        dv.setCantidad_dv(Double.parseDouble(jTextFieldCantidad.getText()));
        System.out.print(jComboBoxProductos.getSelectedItem().toString());
        ProductosDAO productosDAO= new ProductosDaoImpl();                
        for(Productos p : productosDAO.listarProductos()){
            if((p.getNombre_producto()+" - "+p.getPrecio_producto()).equals(jComboBoxProductos.getSelectedItem().toString())){
                pv=p;
                break;
            }
        }
        dv.setNombre_producto_dv(jComboBoxProductos.getSelectedItem().toString());
        dv.setPrecio_unitario_dv(pv.getPrecio_producto());
        dv.setSubtotal_dv(  dv.getCantidad_dv()*dv.getPrecio_unitario_dv()   );
        lpd.add(dv);
        reporteProductosVenta();
        
        double suma=0;
        for(Detalle_venta ds : lpd){
            suma=suma+ds.getSubtotal_dv();
        }
        jTextFieldTotalVenta.setText(suma+"");
        
        
        
        
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jComboBoxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProductosActionPerformed

    private void jButtonConfirmarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarVentaActionPerformed
        
        
/*        for(Detalle_venta dd :lpd){
            System.out.println("imprimeindo    "+dd.getCantidad_dv());
        }        
*/
        VentasDAO vdao = new VentasDaoImpl();
        Ventas vta=new Ventas();
        vta.setId_venta("1");
        vta.setTotal_venta(Double.parseDouble(jTextFieldTotalVenta.getText()));
        vta.setid_cliente("");
        //vdao.registrarVenta(v, lpd);        
        
    }//GEN-LAST:event_jButtonConfirmarVentaActionPerformed

    public void listaProductos(){
        
        ProductosDAO productosDAO= new ProductosDaoImpl();        
        jComboBoxProductos.removeAllItems();
        for(Productos p : productosDAO.listarProductos()){
            jComboBoxProductos.addItem(p.getNombre_producto()+" - "+p.getPrecio_producto());
        }
        
        for(Productos p : productosDAO.listarProductos()){
            jComboBoxProductos.addItem(p.getNombre_producto()+" - "+p.getPrecio_producto());
        }        
        
    }
    
    public void reporteProductosVenta(){      
        
        String matriz[][]= new String[lpd.size()][4];
        int i=0;
        for(Detalle_venta per :lpd){
            matriz[i][0]=per.getCantidad_dv()+"";
            matriz[i][1]=per.getNombre_producto_dv();
            matriz[i][2]=per.getPrecio_unitario_dv()+"";
            matriz[i][3]=per.getSubtotal_dv()+"";
            i++;
        }
        
        jTableProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Cantidad", "Productos", "Precio Unitario", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(jTableProductosVenta);
        
    }

    

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
            java.util.logging.Logger.getLogger(JVentasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JVentasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JVentasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JVentasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JVentasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonConfirmarVenta;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JComboBox<String> jComboBoxProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDatosCliente;
    private javax.swing.JLabel jLabelTotalVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductosVenta;
    private javax.swing.JTextField jTextFieldBuscarCliente;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldTotalVenta;
    // End of variables declaration//GEN-END:variables
}
