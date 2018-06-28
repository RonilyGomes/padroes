package factory;

import classes.Tinta;
import enuns.TintaEnum;

public abstract class TintaFactory {
    public static Tinta create(TintaEnum tipo) {
        return new Tinta(tipo);
    }
}
