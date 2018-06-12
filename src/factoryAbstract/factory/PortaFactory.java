package factory;

public abstract class PortaFactory {
    public static Porta create(Porta tipo) throw Exception{
        return new Porta(tipo);
    }
}
