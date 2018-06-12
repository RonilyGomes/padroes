package classes;

public class Porta {
    private PortaEnum tipo;
    
    public Porta(PortaEnum tipo) {
        this.tipo = tipo;
    }
    
    public PortaEnum getTipo() {
        return this.tipo;
    }
    
    public Void setTipo(PortaEnum tipo) {
        this.tipo = tipo;
    }
}
