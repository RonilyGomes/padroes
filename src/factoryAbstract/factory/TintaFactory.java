package factory;

public abstract class TintaFactory {
    public static Tinta create(Tinta tipo) throw Exception{
        return new Tinta(tipo);
    }
}
