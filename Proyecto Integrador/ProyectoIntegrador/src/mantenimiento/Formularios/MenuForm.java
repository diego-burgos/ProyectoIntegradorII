package mantenimiento.Formularios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;


public class MenuForm extends JFrame {
  
     met_sistema captura = new  met_sistema();
     JButton bt_buscar =new JButton ("Buscar * Codigo");
     JButton bt_buscar1 =new JButton ("Buscar * Autor");
     JButton bt_buscar2 =new JButton ("Buscar * Genero");
     JButton bt_buscar3 =new JButton ("Buscar * Edicion");
     JLabel lb_code=new JLabel("Codigo");
     JLabel lb_autor=new JLabel("Autor");
     JLabel lb_genero=new JLabel("Nombre ");
     JLabel lb_edicion=new JLabel("Edicion");
     JLabel lb_precio=new JLabel("Precio");
     
     JTextField txt_code=new JTextField();
     JTextField txt_autor=new JTextField();
     JTextField txt_genero=new JTextField();
     JTextField txt_edicion=new JTextField();
     JTextField txt_precio=new JTextField();
     
     JTextField jt_busca = new JTextField ();
     JTextField jt_buscs = new JTextField ();
     JTextField jt_buscd = new JTextField ();
     JTextField jt_buscf = new JTextField ();
     
     JMenuItem menumantbuscar = new JMenuItem() ; 
     
     JPanel pn1=new JPanel(new GridLayout(1,2) );
     
           
     
     public MenuForm() {
                
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenu menumant = new JMenu();
        JMenu menureporte = new JMenu() ;
        JMenuItem menureportevisualizar = new JMenuItem();
        JMenuItem menuFileExit = new JMenuItem();
        JMenuItem menumantingresar = new JMenuItem("") ; 
        JMenuItem menumanteliminar = new JMenuItem() ; 
        JMenuItem menureporteautor = new JMenuItem() ; 
        JMenuItem menureportegenero = new JMenuItem() ; 
        JMenuItem menureporteedicion = new JMenuItem() ; 
        JMenuItem menureportegeneral = new JMenuItem() ; 
        
        
        
        
        menuFile.setText("File");
        menuFile.setIcon( new ImageIcon("img/file.jpg")  );
        
        menuFileExit.setText("Exit");
        menureporte.setText("Reporte");
        menureportegeneral.setText(" General");
        menureporteautor.setText(" Por Autor");
        menureportegenero.setText(" Por Genero");
        menureporteedicion.setText(" Por Edicion");        
        
        menumant.setText("Mantenimiento");
        menumantingresar.setText("Ingresar Libro");
        menumantbuscar.setText("Buscar Libro");       
        menumanteliminar.setText("Eliminar Libro");
       

        menuFileExit.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                MenuForm.this.windowClosed();
                }
            }
        ); 
        
        menureportegeneral.addActionListener
	 (
            new ActionListener() { 
                public void actionPerformed(ActionEvent e) {
                	
                	
                String columnas[] = {"Codigo","autor","edicion ","genero","precio"};
                	
 				Object filas[][] = new Object[captura.lis_lib.size()][5];
 				               
                	Vector nuevoVector = captura.lis_lib;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                       
                       datos v = (datos)captura.lis_lib.get(i);
                	
                	
                		filas[i][0] = v.codigo;
                		filas[i][1] = v.autor;
                		filas[i][2] = v.edicion;
                		filas[i][3] = v.genero;
                		filas[i][4] = v.precio;
                		
                	}
                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de Libros",JOptionPane.QUESTION_MESSAGE);
                
                    
                }
            }
        ); 

	menureporteautor.addActionListener
	 (
            new ActionListener() {     
                public void actionPerformed(ActionEvent e) {
                	
                	
                String columnas[] = {" ****** Autor ***** "," nombre de libro"};
                	
 				Object filas[][] = new Object[captura.lis_lib.size()][2];
 				               
                	Vector nuevoVector = captura.lis_lib;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                       datos v = (datos)captura.lis_lib.get(i);              	          	
                	
                		filas[i][0] = v.autor; 
                		filas[i][1] = v.genero; 
                	               	
                		
                	}
                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de Libros",JOptionPane.PLAIN_MESSAGE);
                
                    
                }
            }
        ); 

menureportegenero.addActionListener
	 (
            new ActionListener() {     
                public void actionPerformed(ActionEvent e) {
                	
                	
                String columnas[] = {" ****** Genero ***** ","autor"};
                	
 				Object filas[][] = new Object[captura.lis_lib.size()][2];
 				               
                	Vector nuevoVector = captura.lis_lib;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                                      		
                		datos v = (datos)captura.lis_lib.get(i);               	
                	;
                		filas[i][0] = v.genero;
                		filas[i][1] = v.autor;
                	}                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de Libros",JOptionPane.PLAIN_MESSAGE);
                
                    
                }
            }
        ); 
        
        menureporteedicion.addActionListener
	 (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	
                	
                String columnas[] = {" ****** Edici�n ***** ","nombre del libro"};
                	
 				Object filas[][] = new Object[captura.lis_lib.size()][2];
 				               
                	Vector nuevoVector = captura.lis_lib;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                                      		
                		datos v = (datos)captura.lis_lib.get(i);
                		
                	
                		filas[i][0] = v.edicion;
                		filas[i][1] = v.genero;
                	
                		
                	}
                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de Libros",JOptionPane.PLAIN_MESSAGE);
                
                    
                }
            }
        ); 

        
        
        
        menumantingresar.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                              
                JPanel pn1=new JPanel(new GridLayout(1,2) );
                pn1.add(lb_code);
                pn1.add(txt_code);
                                 
                JPanel pn2=new JPanel(new GridLayout(1,2));
                pn2.add(lb_autor);
                pn2.add(txt_autor);
                
                JPanel pn3=new JPanel(new GridLayout(1,2));
                pn3.add(lb_genero);
                pn3.add(txt_genero);
                
                JPanel pn4=new JPanel(new GridLayout(1,2));
                pn4.add(lb_edicion);
                pn4.add(txt_edicion);
                
                JPanel pn5=new JPanel(new GridLayout(1,2));
                pn5.add(lb_precio);
                pn5.add(txt_precio);
                
                                          
            Object msg []={pn1,pn2,pn3,pn4,pn5};
                
                
      if(JOptionPane.showOptionDialog(null,msg,"ingresar libro",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null)==JOptionPane.OK_OPTION){
      
      	
	      	datos v =new datos();      	
	      	v.autor=txt_autor.getText();
	      	v.codigo=txt_code.getText();
	      	v.genero=txt_genero.getText();
	      	v.edicion=txt_edicion.getText();
     	  	v.precio = txt_precio.getText();
     	  	captura.ingresa(v); 	
    	    	
		
		JOptionPane.showMessageDialog(null,"Se Agrego Libro Con Exito !!","Ingreso de Libros",JOptionPane.INFORMATION_MESSAGE);
		
		          }      	
                   
                }
            }
        ); 
        
        
        
        
        
        menumantbuscar.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                
                                 
                	JLabel lb_busca1 =new JLabel("Busca por Codigo");
                	JLabel lb_busca2=new JLabel("Busca por Autor");
                	
                	
                	JPanel pn1 = new JPanel (new GridLayout(1,3));
                	pn1.add(lb_busca1);
                	pn1.add(jt_busca);
                	pn1.add(bt_buscar);
                	
                	
                	JPanel pn2 = new JPanel (new GridLayout(1,3));
                	pn2.add(lb_busca2);
                	pn2.add(jt_buscs);
                	pn2.add(bt_buscar1);
                	
                	
                	
                
                    JPanel pn5 = new JPanel();
                    
                    JPanel pn_busqueda = new JPanel(new GridLayout(5,2));
                    pn_busqueda.add(new JLabel("Codigo"));
                    pn_busqueda.add(txt_code);
                    
                    pn_busqueda.add(new JLabel("Autor"));
                    pn_busqueda.add(txt_autor);
                    
                    pn_busqueda.add(new JLabel("Nombre Libro"));
                    pn_busqueda.add(txt_genero);
                    
                    pn_busqueda.add(new JLabel("Edicion"));
                    pn_busqueda.add(txt_edicion);
                    
                    pn_busqueda.add(new JLabel("Precio"));
                    pn_busqueda.add(txt_precio);
                    
                    Object msg []={pn1,pn2,pn5,pn_busqueda};
                    
                    JOptionPane.showMessageDialog(null,msg,"BUSQUEDA",JOptionPane.PLAIN_MESSAGE);
                    
                    
                }
            }
        ); 
        
        bt_buscar.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                datos z= captura.buscod(jt_busca.getText());     
                System.out.print(z.codigo+" "+z.genero) ;
                
                txt_autor.setText(z.autor);
                txt_code.setText(z.codigo);
                txt_edicion.setText(z.edicion);
                txt_genero.setText(z.genero);
                txt_precio.setText(z.precio);
                
                                
                }
            }
        ); 
        bt_buscar1.addActionListener
        (
           new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    
                
                datos z= captura.buscautor(jt_buscs.getText());     
                System.out.print(z.autor+" "+z.genero) ;
                
                txt_autor.setText(z.autor);
                txt_code.setText(z.codigo);
                txt_edicion.setText(z.edicion);
                txt_genero.setText(z.genero);
                txt_precio.setText(z.precio);
                
                                
                }
            }
        );        
           
        
        menuFile.add(menuFileExit);
        
        
        menumant.add(menumantingresar);
        menumant.add(menumantbuscar);        
        menumant.add(menumanteliminar);
        
        
        menureporte.add(menureportegeneral);
        menureporte.add(menureporteautor);
        menureporte.add(menureportegenero);
        menureporte.add(menureporteedicion);
        menureporte.add(menureporte);       
      
        menuBar.add(menuFile);
        menuBar.add(menumant); 
        menuBar.add(menureporte);
           
        
           
        setTitle("EXPOSICION POO");
        setJMenuBar(menuBar);
        setSize(new Dimension(600, 500));
           
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    MenuForm.this.windowClosed();
                }
            }
        );  
    }
     
    
    protected void windowClosed() {
        
        System.exit(0);
    }
}
