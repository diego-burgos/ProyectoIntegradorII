package igu.persona;

import Entidades.Persona;
import implement.conf.accesos.PersonaDAO;
import implement.conf.accesos.PersonaDaoImpl;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JPersonaForm extends javax.swing.JFrame {

    public JPersonaForm() {
        initComponents();
        reportePersonas();
        jButtonEliminar.setVisible(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    public void reportePersonas(){
        PersonaDAO personaDAO = new PersonaDaoImpl();
        String matriz[][]= new String[personaDAO.listarPersonas().size()][4];
        int i=0;
        for(Persona per :personaDAO.listarPersonas()){
            matriz[i][0]=per.getS_nombres();
            matriz[i][1]=per.getS_ap_paterno()+" "+per.getS_ap_materno();
            matriz[i][2]=per.getS_documento();
            matriz[i][3]=per.getS_sexo();
            i++;
        }
        
        jTablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            matriz,                
            new String [] {
                 "Nombres", "Apellidos", "Nro Documento", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(jTablePersonas);
    }
    
    public JPanel personas(){            
                
        jPanelPersona.setSize(new Dimension(1029, 552));
        jPanelPersona.add(jLabelTitulo);
        jPanelPersona.add(jTextFieldBuscar);
        jPanelPersona.add(jButtonBuscar);
        jPanelPersona.add(jPanelFormulario);
        jPanelPersona.add(jPanelReporte);
        
        return jPanelPersona;
    } 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPersona = new javax.swing.JPanel();
        jPanelFormulario = new javax.swing.JPanel();
        jLabelNombres = new javax.swing.JLabel();
        jLabelPaterno = new javax.swing.JLabel();
        jLabelMaterno = new javax.swing.JLabel();
        jLabelDocumento = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldPaterno = new javax.swing.JTextField();
        jTextFieldMaterno = new javax.swing.JTextField();
        jTextFieldDocumento = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jButtonEliminar = new javax.swing.JButton();
        jPanelReporte = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelNombres.setText("Nombres:");

        jLabelPaterno.setText("Ap. Paterno:");

        jLabelMaterno.setText("Ap. Materno:");

        jLabelDocumento.setText("Documento:");

        jLabelSexo.setText("Sexo:");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDocumento)
                            .addComponent(jLabelSexo))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDocumento)
                            .addComponent(jComboBoxSexo, 0, 109, Short.MAX_VALUE)))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                                .addComponent(jButtonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jButtonRegistrar))
                            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMaterno)
                                    .addComponent(jLabelPaterno)
                                    .addComponent(jLabelNombres))
                                .addGap(21, 21, 21)
                                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPaterno)
                                    .addComponent(jTextFieldMaterno))))))
                .addGap(29, 29, 29))
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombres)
                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPaterno)
                    .addComponent(jTextFieldPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaterno)
                    .addComponent(jTextFieldMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDocumento)
                    .addComponent(jTextFieldDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonEliminar)))
        );

        javax.swing.GroupLayout jPanelReporteLayout = new javax.swing.GroupLayout(jPanelReporte);
        jPanelReporte.setLayout(jPanelReporteLayout);
        jPanelReporteLayout.setHorizontalGroup(
            jPanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelReporteLayout.setVerticalGroup(
            jPanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "Nro Documento", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(jTablePersonas);

        jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelTitulo.setText("PERSONAS");

        jTextFieldBuscar.setToolTipText("ingrese");

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPersonaLayout = new javax.swing.GroupLayout(jPanelPersona);
        jPanelPersona.setLayout(jPanelPersonaLayout);
        jPanelPersonaLayout.setHorizontalGroup(
            jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPersonaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPersonaLayout.createSequentialGroup()
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPersonaLayout.createSequentialGroup()
                        .addGroup(jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPersonaLayout.createSequentialGroup()
                                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelPersonaLayout.setVerticalGroup(
            jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPersonaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
                
        PersonaDAO personaDAO = new PersonaDaoImpl();
        String documentoBusqueda=jTextFieldBuscar.getText();
               Persona pr = new Persona();               
               pr=personaDAO.buscarPersona(documentoBusqueda);
               if(pr.getS_nombres().equals("NoEncontrado")){
                   jButtonEliminar.setVisible(true);
                   jTextFieldNombres.setText(pr.getS_nombres());
                   jTextFieldPaterno.setText(pr.getS_ap_paterno());
                   jTextFieldMaterno.setText(pr.getS_ap_materno());
                   jTextFieldDocumento.setText(pr.getS_documento());
                   jComboBoxSexo.removeAllItems();
                   if(pr.getS_sexo().equals("M")){
                       jComboBoxSexo.addItem("Masculino");
                       jComboBoxSexo.addItem("Femenino");
                   }else{
                       jComboBoxSexo.addItem("Femenino");
                       jComboBoxSexo.addItem("Masculino");
                   }
                   jButtonRegistrar.setText("Actualizar");
                   jTablePersonas.setModel(new javax.swing.table.DefaultTableModel(
                           new Object [][] {
                               {pr.getS_nombres(),
                                   pr.getS_ap_paterno()+" "+pr.getS_ap_materno(),
                                   pr.getS_documento(),
                                   pr.getS_sexo()
                               }
                           },
                           new String [] {
                               "Nombres", "Apellidos", "Nro Documento", "Sexo"
                           }
                   ));
                   jScrollPane1.setViewportView(jTablePersonas);
               }
               else{
                   jTextFieldNombres.setText("");
                   jTextFieldPaterno.setText("");
                   jTextFieldMaterno.setText("");
                   jTextFieldDocumento.setText("");
                   //jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
                   jButtonRegistrar.setText("Registrar");
                   reportePersonas();
                   JOptionPane.showMessageDialog(null,"Persona no se encuentra registrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
               }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        PersonaDAO personaDAO = new PersonaDaoImpl();
        Persona pr= new Persona();
        String documentoBusqueda="";
        
        if(jButtonRegistrar.getText().equals("Actualizar")){
              documentoBusqueda  =jTextFieldBuscar.getText();
              pr=personaDAO.buscarPersona(documentoBusqueda);  
              pr.setS_nombres(jTextFieldNombres.getText());
              pr.setS_ap_paterno(jTextFieldPaterno.getText());
              pr.setS_ap_materno(jTextFieldMaterno.getText());
              pr.setS_documento(jTextFieldDocumento.getText());
              //personaDAO.actualizaPersona(pr);
              reportePersonas();
        }else{
           if(jButtonRegistrar.getText().equals("Registrar")){
              pr.setS_id(personaDAO.idNuevoPersonas());
              pr.setS_nombres(jTextFieldNombres.getText());
              pr.setS_ap_paterno(jTextFieldPaterno.getText());
              pr.setS_ap_materno(jTextFieldMaterno.getText());
              pr.setS_documento(jTextFieldDocumento.getText());
              pr.setS_sexo(jComboBoxSexo.getSelectedItem().toString());
              personaDAO.registrarPersona(pr);
              reportePersonas();
              
              jTextFieldNombres.setText("");
              jTextFieldPaterno.setText("");
              jTextFieldMaterno.setText("");
              jTextFieldDocumento.setText("");              
           }
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        PersonaDAO personaDAO = new PersonaDaoImpl();
        Persona pr= new Persona();
        String documentoBusqueda="";
        documentoBusqueda= jTextFieldBuscar.getText();
        pr=personaDAO.buscarPersona(documentoBusqueda);
        personaDAO.eliminarPersona(pr);
        
        reportePersonas();
        jTextFieldNombres.setText("");
        jTextFieldPaterno.setText("");
        jTextFieldMaterno.setText("");
        jTextFieldDocumento.setText(""); 
        jButtonEliminar.setVisible(false);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JPersonaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPersonaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPersonaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPersonaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPersonaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabelDocumento;
    private javax.swing.JLabel jLabelMaterno;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelPaterno;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelPersona;
    private javax.swing.JPanel jPanelReporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePersonas;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldDocumento;
    private javax.swing.JTextField jTextFieldMaterno;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldPaterno;
    // End of variables declaration//GEN-END:variables
}
