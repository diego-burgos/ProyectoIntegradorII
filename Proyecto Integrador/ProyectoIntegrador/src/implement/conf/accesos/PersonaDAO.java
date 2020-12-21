package implement.conf.accesos;

import Entidades.Persona;
import java.util.List;

public interface PersonaDAO {

    public List<Persona> listarPersonas();
    public int idNuevoPersonas();
    public Persona buscarPersona(String sdocumento);
    public void  actualizaPersona(Persona p);
    public void  registrarPersona(Persona p);
    public void  eliminarPersona(Persona p);
    
}
