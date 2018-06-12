package classes;

public class Tinta {
    private TintaEnum tipo;
    
    public Tinta(TintaEnum tipo) {
        this.tipo = tipo;
    }
    
    public TintaEnum getTipo() {
        return this.tipo;
    }
    
    public Void setTipo(TintaEnum tipo) {
        this.tipo = tipo;
    }
}
