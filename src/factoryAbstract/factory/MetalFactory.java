package factory;

public abstract class MetalFactory {
    public static Metal create(Metal tipo) throw Exception{
        return new Metal(tipo);
    }
}
