package Entidades;

public class Ventas {
    
    private String id_venta;
    private String serie_venta;
    private String numero_venta;
    private double total_venta;
    private double subtotal_venta;
    private double igv_venta;
    private String fecha_venta;
    private String estado;
    private String id_cliente_f;
    //private Detalle_venta dv;

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public String getSerie_venta() {
        return serie_venta;
    }

    public void setSerie_venta(String serie_venta) {
        this.serie_venta = serie_venta;
    }

    public String getNumero_venta() {
        return numero_venta;
    }

    public void setNumero_venta(String numero_venta) {
        this.numero_venta = numero_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public double getSubtotal_venta() {
        return subtotal_venta;
    }

    public void setSubtotal_venta(double subtotal_venta) {
        this.subtotal_venta = subtotal_venta;
    }

    public double getIgv_venta() {
        return igv_venta;
    }

    public void setIgv_venta(double igv_venta) {
        this.igv_venta = igv_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId_cliente_f() {
        return id_cliente_f;
    }

    public void setId_cliente_f(String id_cliente_f) {
        this.id_cliente_f = id_cliente_f;
    }

    public void setid_cliente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
