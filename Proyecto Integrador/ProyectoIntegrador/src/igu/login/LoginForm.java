package igu.login;

import java.awt.*;
import javax.swing.*;
import mantenimiento.Formularios.MenuForm;

public class LoginForm extends JFrame {
    Container c = getContentPane();
    private JPanel jP_PanelLogin;    
    private JButton jBt_Ingresar;
    private JButton jBt_Salir;
    private JLabel jLb_Usuario;
    private JLabel jLb_Contrasenia;
    private JTextField jTxtF_Usuario;
    private JPasswordField jPsTxtF_Pasword;
    
    public LoginForm(){
        initComponents();
    }
  
  private void initComponents() { 
      
        getContentPane().setBackground(Color.darkGray);
        jP_PanelLogin = new  javax.swing.JPanel(new GridLayout(3,3) );
        jBt_Ingresar = new javax.swing.JButton();        
        jBt_Salir    = new javax.swing.JButton();        
        jTxtF_Usuario = new javax.swing.JTextField();
        jPsTxtF_Pasword = new javax.swing.JPasswordField();       
        jLb_Contrasenia = new javax.swing.JLabel();                
        jLb_Usuario = new javax.swing.JLabel();  
                
        jLb_Usuario.setText("Usuario"); 
        //jLb_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User-Group-icon.png"))); 
        jLb_Contrasenia.setText("Contraseña");
        jBt_Ingresar.setText("Ingresar");
        jBt_Salir.setText("Salir");
                
        jP_PanelLogin.add(jLb_Usuario);
        jP_PanelLogin.add(jTxtF_Usuario);
        jP_PanelLogin.add(jLb_Contrasenia);        
        jP_PanelLogin.add(jPsTxtF_Pasword);                
        jP_PanelLogin.add(jBt_Ingresar);
        jP_PanelLogin.add(jBt_Salir);
                        
        setSize(new Dimension(350, 180)); //tamaño del jpanel
        setTitle("Login");
        setLocation(500, 200);        //ubicacion del ventana
        getContentPane().add(jP_PanelLogin);
        c.setVisible(true);
        
        jBt_Ingresar.addActionListener(this::jBt_IngresarActionPerformed);
        jBt_Salir.addActionListener(this::jBt_SalirActionPerformed);
  }

  public JPanel saludo(){
      JPanel jP_PanelPersona  = new  javax.swing.JPanel(new GridLayout(3,3));
      jP_PanelPersona.setSize(new Dimension(350, 180));
              
      jLb_Usuario.setText("EDER");
      jTxtF_Usuario.setText("peru");
      jP_PanelPersona.add(jLb_Usuario);
      jP_PanelPersona.add(jTxtF_Usuario);      
      System.out.print("holaaaa");      
      return jP_PanelPersona;
  }
  private void jBt_SalirActionPerformed(java.awt.event.ActionEvent evt) {
      System.exit(0);
  }
  
  private void jBt_IngresarActionPerformed(java.awt.event.ActionEvent evt) {
        if(jTxtF_Usuario.getText().equals("eder")&&jPsTxtF_Pasword.getText().equals("123")){
            System.out.println(jTxtF_Usuario.getText());
            System.out.println(jPsTxtF_Pasword.getText());
            this.hide();
            MenuForm mf = new MenuForm();
            mf.show(true);
        }else{
            JOptionPane.showMessageDialog(null,"Usuario y/o clave incorrecto!!","Error",JOptionPane.INFORMATION_MESSAGE);            
        }
    }
  
 public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
 }   
}
