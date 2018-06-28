package classes;

import enuns.ComodoEnum;

import java.util.ArrayList;

public class Comodo {
    private ComodoEnum tipo;
    private Piso piso;
    private ArrayList<Parede> paredes = new ArrayList<>();
    private ArrayList<Porta> portas = new ArrayList<>();
    private Tinta tinta;
    private ArrayList<Metal> metais = new ArrayList<>(); 
    private ArrayList<Louca> loucas = new ArrayList<>();
    
    public Comodo(ComodoEnum tipo) {
        this.tipo = tipo;
    }

    public ComodoEnum getTipo() {
        return tipo;
    }

    public void setTipo(ComodoEnum tipo) {
        this.tipo = tipo;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    public ArrayList<Parede> getParedes() {
        return paredes;
    }

    public void setParedes(ArrayList<Parede> paredes) {
        this.paredes = paredes;
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }

    public Tinta getTinta() {
        return tinta;
    }

    public void setTinta(Tinta tinta) {
        this.tinta = tinta;
    }

    public ArrayList<Metal> getMetais() {
        return metais;
    }

    public void setMetais(ArrayList<Metal> metais) {
        this.metais = metais;
    }

    public ArrayList<Louca> getLoucas() {
        return loucas;
    }

    public void setLoucas(ArrayList<Louca> loucas) {
        this.loucas = loucas;
    }
}
