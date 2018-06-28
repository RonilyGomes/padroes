public class Ponto implements Figura {
    private Integer x, y;

    public Ponto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer perimetroFigura() {
        return null;
    }

    @Override
    public Double areaFigura() {
        return null;
    }

    @Override
    public String desenhaFigura() {
        return "ponto";
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return " ponto: " + this.x + ":" + this.y;
    }
}

