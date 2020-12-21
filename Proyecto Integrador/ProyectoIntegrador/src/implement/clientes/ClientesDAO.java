package implement.clientes;

import Entidades.Clientes;

public interface ClientesDAO {
    
    public Clientes buscarClienteCodigo(String s_documento);
    
}
