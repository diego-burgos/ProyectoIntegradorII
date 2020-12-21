package implement.productos;

import Entidades.Productos;
import Conexion.Conexion;
import java.sql.*;
import java.time.Clock;
import java.util.*;

public class ProductosDaoImpl implements ProductosDAO{
    
        Conexion cx= new Conexion();
        Statement stmt=null;
        ResultSet rset=null;
    /*  
    public List<PoliticasPrecio> listarPrecioProductos(){
            id_producto 1
            preciouni   7
            tipocliente A
            estado  1
            
            select * from cliente a, politicas_precio b
    }
    */
    public List<Productos> listarProductos(){
           
        String sql = " select * from Productos ";
               sql = 
        " select  "+
        " a.id_producto, a.nombre_producto,a.precio_producto, 	a.stock, a.tipo_producto, a.id_categoria, a.controla_stock "+
        " from Productos a, Categoria b  "+
        " where a.id_categoria = b.idCategoria  ";
                
            
        List<Productos> lc = new ArrayList<Productos>();
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            while(rset.next()){ 
                        Productos c= new Productos();
                        c.setId_producto(rset.getString(1));
                        c.setNombre_producto(rset.getString(2));
                        c.setPrecio_producto(rset.getDouble(3));
                        c.setStock(rset.getDouble(4));
                        c.setTipo_producto(rset.getString(5));
                        c.setId_categoria(rset.getInt(6));                        
                        c.setControla_stock(rset.getString(7));
                        c.setNombre_categoria(rset.getString(8));
                        lc.add(c);
            }
            cx.connect().close();
            stmt.close();
        }catch(SQLException  ex){
            System.out.println("Captura Error: "+ex.getMessage());
        }catch(Exception  e){
            System.out.println("Captura Error: "+e.getMessage());
        }
        return lc;
       }
    public void Registrar(Productos p){
       
        String sql = " insert into productos "+                
                     " ( id_producto, nombre_producto, precio_producto, stock, tipo_producto, id_categoria, controla_stock ) "+
                     " values ('"+p.getId_producto()+"','"+p.getNombre_producto()+"','"+p.getPrecio_producto()+"','"+p.getStock()+"','"+p.getTipo_producto()+"','"+p.getId_categoria()+"','"+p.getControla_stock()+"')";
        System.out.println(sql);
        try{
            stmt = cx.connect().createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Se inserto  un registro");
            cx.connect().close();
            stmt.close();
        }catch(SQLException e){
            System.out.println("Captura Error: "+e.getMessage());
        }
       
    }
    
    public Productos buscarProductosNombre(String nombre){
          String  sql = 
        " select  "+
        " a.id_producto, a.nombre_producto,a.precio_producto, 	a.stock, a.tipo_producto, a.id_categoria, a.controla_stock, b.nombre_categoria  "+
        " from productos a, categorias b  "+
        " where a.id_categoria = b.id_categoria  and a.nombre_producto = '"+nombre+"' ";
        Productos c= new Productos();
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            if(rset.next()){ 
                        
                        c.setId_producto(rset.getString(1));
                        c.setNombre_producto(rset.getString(2));
                        c.setPrecio_producto(rset.getDouble(3));
                        c.setStock(rset.getDouble(4));
                        c.setTipo_producto(rset.getString(5));
                        
                        c.setId_categoria(rset.getInt(6));                        
                        c.setControla_stock(rset.getString(7));
                        c.setNombre_categoria(rset.getString(8));
                        
            }
            cx.connect().close();
            stmt.close();
        }catch(SQLException  ex){
            System.out.println("Captura Error: "+ex.getMessage());
        }catch(Exception  e){
            System.out.println("Captura Error: "+e.getMessage());
        }
        return c;
    }
    
    public static void main(String args[]) {
        ProductosDaoImpl pdi= new ProductosDaoImpl();
                for( Productos p : pdi.listarProductos()){
                System.out.println(p.getNombre_producto());
                }
    }
    
}
