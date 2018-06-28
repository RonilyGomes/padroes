package factory;

import classes.Parede;
import enuns.ParedeEnum;

public abstract class ParedeFactory {
    public static Parede create(ParedeEnum tipo) {
        return new Parede(tipo);
    }
}

