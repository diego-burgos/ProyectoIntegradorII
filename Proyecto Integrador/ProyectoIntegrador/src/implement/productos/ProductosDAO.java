package implement.productos;

import Entidades.Productos;
import java.util.*;

public interface ProductosDAO {
    
    public List<Productos> listarProductos();
    //public List<PoliticasPrecio> listarPrecioProductos();
    public Productos buscarProductosNombre(String nombre);
    public void Registrar(Productos p);
    
}
