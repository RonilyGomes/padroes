package classes;

public class Metal {
    private MetalEnum tipo;
    
    public Metal(MetalEnum tipo) {
        this.tipo = tipo;
    }
    
    public MetalEnum getTipo() {
        return this.tipo;
    }
    
    public Void setTipo(MetalEnum tipo) {
        this.tipo = tipo;
    }
}
