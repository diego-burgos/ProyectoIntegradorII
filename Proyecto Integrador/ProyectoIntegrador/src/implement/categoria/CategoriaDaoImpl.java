package implement.categoria;

import Entidades.Categoria;
import Conexion.Conexion;
import java.sql.*;
import java.util.*;

public class CategoriaDaoImpl implements CategoriaDAO{
    Conexion  cx= new Conexion();
    Statement stmt= null;
    ResultSet rset=null;
    
    public String    nombreCategoria(String idCategoria){
        return "";
    }
    
    public Categoria buscarCategoriaNombre(String nombre){
        String sql = " select * from Categoria where nombreCategoria='"+nombre+"' ";
        Categoria c= new Categoria();
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            if(rset.next()){
                        c= new Categoria();
                        c.setIdCategoria(rset.getInt(1));
                        c.setNombreCategoria(rset.getString(2));
                        c.setCodigoCategoria(rset.getString(3));                        
            } else{
                c.setNombreCategoria("NOENCONTRADO");
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
    
    public Categoria buscarCategoriaCodigo(String codigo){
        String sql = " select * from Categoria where codigoCategoria='"+codigo+"' ";
        Categoria c= new Categoria();
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            if(rset.next()){
                        c= new Categoria();
                        c.setIdCategoria(rset.getInt(1));
                        c.setNombreCategoria(rset.getString(2));
                        c.setCodigoCategoria(rset.getString(3));                        
            } else{
                c.setNombreCategoria("NOENCONTRADO");
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
    
    public List<Categoria> listarCategorias(){
        String sql = " select * from Categoria ";
        List<Categoria> lc = new ArrayList<Categoria>();
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            while(rset.next()){                
                        Categoria c= new Categoria();
                        c.setIdCategoria(rset.getInt(1));
                        c.setNombreCategoria(rset.getString(2));
                        c.setCodigoCategoria(rset.getString(3));
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
        
    public void registrarCategoria(Categoria c){
                  
        String sql = " insert into Categoria "+
                     " (idCategoria, nombreCategoria, codigoCategoria) "+
                     " values ('"+c.getIdCategoria()+"','"+c.getNombreCategoria()+"','"+c.getCodigoCategoria()+"')";
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
    
    public int idNuevoCategoria(){
        int sid=-1;
        String sql = " select max(idCategoria)+1 from Categoria ";
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            if(rset.next()){
                        sid=rset.getInt(1);
            }
            cx.connect().close();
            stmt.close();
        }catch(SQLException  ex){
            System.out.println("Captura Error: "+ex.getMessage());
        }catch(Exception  e){
            System.out.println("Captura Error: "+e.getMessage());
        }
        return sid;
    }
    
}
