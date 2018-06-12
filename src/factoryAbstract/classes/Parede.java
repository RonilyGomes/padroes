package classes;

public class Parede {
    private ParedeEnum tipo;
    
    public parede(ParedeEnum tipo) {
        this.tipo = tipo;
    }
    
    public ParedeEnum getTipo() {
        return this.tipo;
    }
    
    public Void setTipo(ParedeEnum tipo) {
        this.tipo = tipo;
    }
}
