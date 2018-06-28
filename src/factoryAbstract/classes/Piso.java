package classes;

import enuns.PisoEnum;

public class Piso {
    private PisoEnum tipo;
    
    public Piso(PisoEnum tipo) {
        this.tipo = tipo;
    }

    public PisoEnum getTipo() {
        return tipo;
    }

    public void setTipo(PisoEnum tipo) {
        this.tipo = tipo;
    }
}
