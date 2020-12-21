package implement.conf.accesos;

import Entidades.Trabajador;

public interface TrabajadorDAO {
    
  public String AutenticarTrabajador(String s_usuario, String s_pasword);
  public String RegistrarTrabajador(Trabajador trabajador);
    
}
