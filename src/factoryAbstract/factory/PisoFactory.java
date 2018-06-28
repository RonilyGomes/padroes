package factory;

import classes.Piso;
import enuns.PisoEnum;

public abstract class PisoFactory {
    public static Piso create(PisoEnum tipo) {
        return new Piso(tipo);
    }
}
