import java.util.ArrayList;

public class Quadrilatero extends FiguraComposta{
    private ArrayList<Reta> lados = new ArrayList<>();

    public Quadrilatero(Reta lado) {
        for(int i = 1; i <= 4; i++) {
            lados.add(lado);
        }
    }

    @Override
    public Integer perimetroFigura() {
        Integer perimetro = 0;

        for(Reta r: this.lados) {
            perimetro += r.perimetroFigura();
        }

        return perimetro;
    }

    @Override
    public Double areaFigura() {
        Integer lado = lados.get(0).perimetroFigura();

        return Math.pow(lado, 2);
    }

    @Override
    public String desenhaFigura() {
        return "quadrilatero";
    }

    public ArrayList<Reta> getLados() {
        return lados;
    }

    public void addLados(Reta lado) {
        this.lados.add(lado);
    }

    @Override
    public String toString() {
        String str = "quadrilatero: ";
        for(Reta l: lados) {
            str += l;
        }
        return str;
    }
}
