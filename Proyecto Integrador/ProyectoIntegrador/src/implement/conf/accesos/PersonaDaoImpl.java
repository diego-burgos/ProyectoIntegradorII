package implement.conf.accesos;

import Entidades.Persona;
import Conexion.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl implements PersonaDAO{
    
        Statement stmt=null;
        ResultSet rset=null;
        Conexion cx = new Conexion(); 
    
    public int idNuevoPersonas(){
        int sid=-1;
        String sql = " select max(id_persona)+1 from Persona ";        
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
        
    public List<Persona> listarPersonas(){
        
        String sql = " select * from Persona";
        List<Persona> lp = new ArrayList<Persona>();
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            while(rset.next()){                
                        Persona p= new Persona();
                        p.setS_id(Integer.parseInt(rset.getString(1)));
                        p.setS_nombres(rset.getString(2));
                        p.setS_ap_paterno(rset.getString(3));
                        p.setS_ap_materno(rset.getString(4));
                        p.setS_documento(rset.getString(5));
                        p.setS_sexo(rset.getString(6));
                        lp.add(p);
            }
            cx.connect().close();
            stmt.close();
        }catch(SQLException  ex){
            System.out.println("Captura Error: "+ex.getMessage());
        }catch(Exception  e){
            System.out.println("Captura Error: "+e.getMessage());
        }
        return lp;
    }
    
    public Persona buscarPersona(String sdocumento){
     
        String sql = " select * from Persona where documento = '"+sdocumento+"'";        
        Persona p= new Persona();
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            if(rset.next()){ 
                //id_persona, nombres, ap_paterno, ap_materno, documento, sexo
                        p= new Persona();
                        p.setS_id(Integer.parseInt(rset.getString(1)));
                        p.setS_nombres(rset.getString(2));
                        p.setS_ap_paterno(rset.getString(3));
                        p.setS_ap_materno(rset.getString(4));
                        p.setS_documento(rset.getString(5));
                        p.setS_sexo(rset.getString(6));
                        //lp.add(p);
            }else{
                        p.setS_nombres("NoEncontrado");
            }
            cx.connect().close();
            stmt.close();
        }catch(SQLException  ex){
            System.out.println("Captura Error: "+ex.getMessage());
        }catch(Exception  e){
            System.out.println("Captura Error: "+e.getMessage());
        }
        return p;
    }
    
    public void  registrarPersona(Persona p){
           
        String sql = " insert into Persona "+
                     " (id_persona, nombres, ap_paterno, ap_materno, documento, sexo) "+
                     " values ('"+p.getS_id()+"','"+p.getS_nombres()+"','"+p.getS_ap_paterno()+"','"+p.getS_ap_materno()+"','"+p.getS_documento()+"','"+p.getS_sexo()+"' )";
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
    
    public void  eliminarPersona(Persona p){
        String sql = " delete from Persona "+                     
                     " where id_persona ='"+p.getS_id()+"' ";
        System.out.println(sql);
        try{
            stmt = cx.connect().createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Se elimino un registro");
            cx.connect().close();
            stmt.close();
        }catch(SQLException e){
            System.out.println("Captura Error: "+e.getMessage());
        }
        
    }
    
    public void  actualizaPersona(Persona p){
        String sql = " update Persona "+
                     " set nombres ='"+p.getS_nombres()+"', sexo='"+p.getS_sexo()+"', ap_paterno='"+p.getS_ap_paterno()+"' , ap_materno='"+p.getS_ap_materno()+"', documento='"+p.getS_documento()+"'  "+
                     " where id_persona ='"+p.getS_id()+"' ";
        System.out.println(sql);
        try{
            //stmt = cx.connect().createStatement();
            //stmt.executeUpdate(sql);
            System.out.println("Se actualizo un registro");
            cx.connect().close();
            stmt.close();
        }catch(SQLException e){
            System.out.println("Captura Error: "+e.getMessage());
        }
    }
    
    public static void main(String args[]) {
     PersonaDaoImpl pdi= new PersonaDaoImpl();
     System.out.print(pdi.buscarPersona("4567890155555").getS_nombres());
     /*for(Persona p : pdi.buscarPersona("45678901")){
         System.out.println(p.getS_nombres());
     }
     */
    }
}

