public class Reta implements Figura{
    private Ponto inicio, fim;

    public Reta(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public Integer perimetroFigura() {
        Double x1 = (double) this.getInicio().getX();
        Double y1 = (double) this.getInicio().getY();
        Double x2 = (double) this.getFim().getX();
        Double y2 = (double) this.getFim().getY();
        Double distancia = Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2);

        return distancia.intValue();
    }

    @Override
    public Double areaFigura() {
        return null;
    }

    @Override
    public String desenhaFigura() {
        return "Reta";
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        return ("reta -> " + this.getInicio() + this.getFim());
    }
}
