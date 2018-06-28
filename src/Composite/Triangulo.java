import java.util.ArrayList;

public class Triangulo extends FiguraComposta{
    private ArrayList<Reta> lados = new ArrayList<>();
    private Integer altura;

    public Triangulo(Reta lado, Integer altura) {
        this.altura = altura;
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
        return (this.lados.get(0).perimetroFigura() * this.altura) / 2.0;
    }

    @Override
    public String desenhaFigura() {
        return "triangulo";
    }

    public ArrayList<Reta> getLados() {
        return lados;
    }

    public void addLados(Reta lado) {
        this.lados.add(lado);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        String str = "triangulo: ";
        for(Reta l: lados) {
            str += l;
        }
        return str;
    }
}
