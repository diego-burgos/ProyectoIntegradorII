package implement.ventas;

import Entidades.Detalle_venta;
import Entidades.Ventas;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class VentasDaoImpl implements VentasDAO {
    
        Conexion cx= new Conexion();
        Statement stmt=null;
        ResultSet rset=null;
        
        Conexion cx1= new Conexion();
        Statement stmt1=null;
        ResultSet rset1=null;
    
    public void registrarVenta(Ventas v, List<Detalle_venta> lista ){
        
        if(v!=null && lista!=null ){
        
            for(Detalle_venta dvItem : lista){
                 String sql_detalle = " insert into detalle_venta "+                
                             " ( id_detalle, cantidad, id_producto, precio_unitario, subtotal, id_venta_f) "+
                             " values ('"+dvItem.getId_dv()+"','"+dvItem.getCantidad_dv()+"','"+dvItem.getId_producto_dv()+"','"+dvItem.getPrecio_unitario_dv()+"','"+dvItem.getSubtotal_dv()+"','"+dvItem.getId_venta_dv()+"')";
                System.out.println(sql_detalle);
                try{
                    stmt1 = cx1.connect().createStatement();
                    stmt1.executeUpdate(sql_detalle);
                    System.out.println("Se inserto  un registro");
                    cx1.connect().close();
                    stmt1.close();
                }catch(SQLException e){
                    System.out.println("Captura Error: "+e.getMessage());
                }
            }
        
                String sql = " insert into ventas "+                
                             " ( id_venta,serie, numero, total, subtotal, igv,fecha,estado) "+
                             " values ('"+v.getId_venta()+"','"+v.getSerie_venta()+"','"+v.getNumero_venta()+"','"+v.getTotal_venta()+"','"+v.getSubtotal_venta()+"','"+v.getIgv_venta()+"','"+v.getFecha_venta()+"','"+v.getEstado()+"')";
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
    }
    
        public void reporteVentaCliente(String id_cliente){
        
    }
}
