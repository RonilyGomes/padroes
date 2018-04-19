package locadora;

public class Fita {
    public static final int NORMAL = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;
    private String titulo;
    private int codigoDePreco;

    public Fita(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }
    public String gettitulo() {
        return titulo;
    }
    public int getcodigoDePreco() {
        return codigoDePreco;
    }
    public void setcodigoDePreco(int codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }
}
