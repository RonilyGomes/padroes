package factory;

import classes.Louca;
import enuns.LoucaEnum;

public abstract class LoucaFactory {
    public static Louca create(LoucaEnum tipo) {
        return new Louca(tipo);
    }
}
