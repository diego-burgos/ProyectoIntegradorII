package implement.clientes;

import Entidades.Clientes;
import Conexion.Conexion;
import java.sql.*;
import java.util.*;


public class ClientesDaoImpl implements ClientesDAO{
    Conexion cx= new Conexion();
    Statement stmt= null;
    ResultSet rset= null;
            
    
    public Clientes buscarClienteCodigo(String s_documento){
         
        String sql;
               sql= " select p.id_persona, p.nombres, p.ap_paterno, p.ap_materno, p.documento, c.id_cliente   from personas p, clientes c "+
                    " where p.id_persona = c.id_persona_f "+
                    " and   p.documento  ='"+s_documento+"' ";

        Clientes p= new Clientes();
        try{
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            if(rset.next()){ 
                //id_persona, nombres, ap_paterno, ap_materno, documento, sexo
                        p= new Clientes();
                        p.setS_id(Integer.parseInt(rset.getString(1)));
                        p.setS_nombres(rset.getString(2));
                        p.setS_ap_paterno(rset.getString(3));
                        p.setS_ap_materno(rset.getString(4));
                        p.setS_documento(rset.getString(5));
                        p.setS_id_cliente(rset.getString(6));
                        
            }else{
                        p.setS_nombres("NO-ENCONTRADO");
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
    
}
