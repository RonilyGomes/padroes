public class Circulo extends FiguraComposta {
    private Ponto centro;
    private Double raio;

    public Circulo(Double raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }

    @Override
    public Integer perimetroFigura() {
        Double resultado = (2 * Math.PI) * this.raio;

        return resultado.intValue();
    }

    @Override
    public Double areaFigura() {
        return Math.pow(Math.PI * this.raio, 2);
    }

    @Override
    public String desenhaFigura() {
        return "circulo";
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "circulo: " + this.centro + ", " +this.raio;
    }
}
