package implement.ventas;

import Entidades.*;
import java.util.List;

public interface VentasDAO {
    
    public void reporteVentaCliente(String id_cliente);
    public void registrarVenta(Ventas v, List<Detalle_venta> lista );
    
}
