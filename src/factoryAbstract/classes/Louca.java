package classes;

public class Louca {
    private LoucaEnum tipo;
    
    public Louca(LoucaEnum tipo) {
        this.tipo = tipo;
    }
    
    public LoucaEnum getTipo() {
        return this.tipo;
    }
    
    public Void setTipo(LoucaEnum tipo) {
        this.tipo = tipo;
    }
}
