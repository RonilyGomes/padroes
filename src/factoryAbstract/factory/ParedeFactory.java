package factory;

public abstract class ParedeFactory {
    public static Parede create(Parede tipo) throw Exception{
        return new Parede(tipo);
    }
}

