package factory;

public abstract class PisoFactory {
    public static Piso create(Piso tipo) throw Exception{
        return new Piso(tipo);
    }
}
