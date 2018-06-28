package classes;

import enuns.PortaEnum;

public class Porta {
    private PortaEnum tipo;
    
    public Porta(PortaEnum tipo) {
        this.tipo = tipo;
    }

    public PortaEnum getTipo() {
        return tipo;
    }

    public void setTipo(PortaEnum tipo) {
        this.tipo = tipo;
    }
}
