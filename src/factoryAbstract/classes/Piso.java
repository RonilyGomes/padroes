package classes;

public class Piso {
    private PisoEnum tipo;
    
    public Piso(PisoEnum tipo) {
        this.tipo = tipo;
    }
    
    public PisoEnum getTipo() {
        return this.tipo;
    }
    
    public Void setTipo(PisoEnum tipo) {
        this.tipo = tipo;
    }
}
