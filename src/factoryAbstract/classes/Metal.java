package classes;

import enuns.MetalEnum;

public class Metal {
    private MetalEnum tipo;
    
    public Metal(MetalEnum tipo) {
        this.tipo = tipo;
    }

    public MetalEnum getTipo() {
        return tipo;
    }

    public void setTipo(MetalEnum tipo) {
        this.tipo = tipo;
    }
}
