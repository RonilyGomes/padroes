package classes;

import enuns.CasaEnum;

import java.util.ArrayList;

public class Casa {
    private CasaEnum tipo;
    private ArrayList<Comodo> comodos = new ArrayList<>();
    
    public Casa(CasaEnum tipo) { }

    public CasaEnum getTipo() {
        return tipo;
    }

    public void setTipo(CasaEnum tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(ArrayList<Comodo> comodos) {
        this.comodos = comodos;
    }
}
