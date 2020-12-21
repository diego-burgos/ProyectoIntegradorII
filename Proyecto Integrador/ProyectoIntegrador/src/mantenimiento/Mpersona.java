package mantenimiento;
import Entidades.Persona;
import Conexion.Conexion;
import java.sql.*;
import java.util.*;

public class Mpersona{         
        
        Statement stmt=null;
        ResultSet rset=null;
        Conexion cx = new Conexion();        
        

             




        
        
    public void registrarPersona(Persona p){        
        int a=0;
        String sql = " INSERT INTO personas( id, nombres, sexo) "+
                     " VALUES('"+p.getS_id()+"','"+p.getS_nombres()+"','"+p.getS_sexo()+"') ";
            try {
                stmt= cx.connect().createStatement();
                a=stmt.executeUpdate(sql);
                stmt.close();
                cx.connect().close();
                System.out.println("consulta:"+sql);
                System.out.println("Se registro satisfactoriamente");
            } catch (SQLException ex) {
                System.out.print("Capturar error: "+ex.getMessage());
            }
    }    
    
    public List<Persona> listarPersonas(){
        String sql = " select * from personas";
        List<Persona> lp = new ArrayList<Persona>();
        try{            
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            while(rset.next()){                
                        Persona p= new Persona();
                        p.setS_id(Integer.parseInt(rset.getString(1)));
                        p.setS_nombres(rset.getString(2));
                        p.setS_sexo(rset.getString(3));
                        lp.add(p);
            }
        }catch(SQLException  ex){
            System.out.println("Captura Error: "+ex.getMessage());
        }catch(Exception  e){
            System.out.println("Captura Error: "+e.getMessage());
        }
        return lp;
    }
            
    public void eliminarRegistro(String pid){
        String sql = " delete from personas where id ='"+pid+"' ";
        try{
            stmt = cx.connect().createStatement();
            stmt.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println("Captura Error: "+e.getMessage());
        }
    }    
    
    public void actualizarRegistro(Persona pa){
        String sql = " update personas "+
                     " set nombres ='"+pa.getS_nombres()+"', sexo='"+pa.getS_sexo()+"' "+
                     " where id='"+pa.getS_id()+"' ";
        try{
            stmt = cx.connect().createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Se actualizo un registro");
        }catch(SQLException e){
            System.out.println("Captura Error: "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Mpersona mp= new Mpersona();
        Persona p1= new Persona();
        p1.setS_id(2);
        p1.setS_nombres("L. Maryori");
        p1.setS_sexo("F");
        //mp.registrarPersona(p1);
        //mp.listarPersonas();
        //mp.actualizarRegistro(p1);
        mp.listarPersonas();
        //System.out.print(mp.listarPersonas().size());
        for(Persona r : mp.listarPersonas()){
            
            System.out.print(r.getS_id());
            System.out.print(r.getS_nombres());
            System.out.println(r.getS_sexo());
        }
    }

  
}
