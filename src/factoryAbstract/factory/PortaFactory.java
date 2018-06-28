package factory;

import classes.Porta;
import enuns.PortaEnum;

public abstract class PortaFactory {
    public static Porta create(PortaEnum tipo) {
        return new Porta(tipo);
    }
}
