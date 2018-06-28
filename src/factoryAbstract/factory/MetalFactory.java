package factory;

import classes.Metal;
import enuns.MetalEnum;

public abstract class MetalFactory {
    public static Metal create(MetalEnum tipo) {
        return new Metal(tipo);
    }
}
