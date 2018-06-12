package factory;

public abstract class LoucaFactory {
    public static Louca create(Louca tipo) throw Exception{
        return new Louca(tipo);
    }
}
