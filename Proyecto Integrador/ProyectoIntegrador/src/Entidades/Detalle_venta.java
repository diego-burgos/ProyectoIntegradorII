package Entidades;

public class Detalle_venta {
    
    private String id_dv;
    private double cantidad_dv;
    private String id_producto_dv;
    private String nombre_producto_dv;
    private double precio_unitario_dv;
    private double subtotal_dv;
    private double id_venta_dv;

    public String getId_dv() {
        return id_dv;
    }

    public void setId_dv(String id_dv) {
        this.id_dv = id_dv;
    }

    public double getCantidad_dv() {
        return cantidad_dv;
    }

    public void setCantidad_dv(double cantidad_dv) {
        this.cantidad_dv = cantidad_dv;
    }

    public String getId_producto_dv() {
        return id_producto_dv;
    }

    public void setId_producto_dv(String id_producto_dv) {
        this.id_producto_dv = id_producto_dv;
    }

    public String getNombre_producto_dv() {
        return nombre_producto_dv;
    }

    public void setNombre_producto_dv(String nombre_producto_dv) {
        this.nombre_producto_dv = nombre_producto_dv;
    }

    public double getPrecio_unitario_dv() {
        return precio_unitario_dv;
    }

    public void setPrecio_unitario_dv(double precio_unitario_dv) {
        this.precio_unitario_dv = precio_unitario_dv;
    }

    public double getSubtotal_dv() {
        return subtotal_dv;
    }

    public void setSubtotal_dv(double subtotal_dv) {
        this.subtotal_dv = subtotal_dv;
    }

    public double getId_venta_dv() {
        return id_venta_dv;
    }

    public void setId_venta_dv(double id_venta_dv) {
        this.id_venta_dv = id_venta_dv;
    }
    
    
}
