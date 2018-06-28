package classes;

import enuns.LoucaEnum;

public class Louca {
    private LoucaEnum tipo;
    
    public Louca(LoucaEnum tipo) {
        this.tipo = tipo;
    }

    public LoucaEnum getTipo() {
        return tipo;
    }

    public void setTipo(LoucaEnum tipo) {
        this.tipo = tipo;
    }
}
