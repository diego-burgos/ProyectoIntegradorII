package implement.categoria;

import Entidades.Categoria;
import java.util.List;

public interface CategoriaDAO {
    
    public List<Categoria> listarCategorias();
    public Categoria buscarCategoriaCodigo(String codigo);
    public Categoria buscarCategoriaNombre(String nombre);
    public String    nombreCategoria(String idCategoria);
    public void registrarCategoria(Categoria c);
    public int idNuevoCategoria();
    
}
