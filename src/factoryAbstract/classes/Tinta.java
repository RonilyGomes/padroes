package classes;

import enuns.TintaEnum;

public class Tinta {
    private TintaEnum tipo;
    
    public Tinta(TintaEnum tipo) {
        this.tipo = tipo;
    }

    public TintaEnum getTipo() {
        return tipo;
    }

    public void setTipo(TintaEnum tipo) {
        this.tipo = tipo;
    }
}
