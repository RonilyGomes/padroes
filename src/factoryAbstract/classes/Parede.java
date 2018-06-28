package classes;

import enuns.ParedeEnum;

public class Parede {
    private ParedeEnum tipo;

    public Parede(ParedeEnum tipo) {
        this.tipo = tipo;
    }

    public ParedeEnum getTipo() {
        return tipo;
    }

    public void setTipo(ParedeEnum tipo) {
        this.tipo = tipo;
    }
}
