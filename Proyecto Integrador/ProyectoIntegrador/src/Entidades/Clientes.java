package Entidades;

public class Clientes extends Persona{
    
    private int id_cliente;
    private String s_codigo_cliente;
    private String s_tipoCliente;
    private String s_id_persona_f;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getS_id_persona_f() {
        return s_id_persona_f;
    }

    public void setS_id_persona_f(String s_id_persona_f) {
        this.s_id_persona_f = s_id_persona_f;
    }

    public String getS_codigo_cliente() {
        return s_codigo_cliente;
    }

    public void setS_codigo_cliente(String s_codigo_cliente) {
        this.s_codigo_cliente = s_codigo_cliente;
    }

    public String getS_tipoCliente() {
        return s_tipoCliente;
    }

    public void setS_tipoCliente(String s_tipoCliente) {
        this.s_tipoCliente = s_tipoCliente;
    }

    public void setS_id_cliente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
