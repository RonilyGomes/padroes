package factory;

import classes.Comodo;
import classes.ComodoBasico;
import classes.ComodoConfortavel;
import classes.ComodoLuxo;
import enuns.CasaEnum;
import enuns.ComodoEnum;

public abstract class ComodoFactory {

    public static Comodo create(ComodoEnum tipoComodo, CasaEnum tipoCasa) {
        if(tipoCasa == CasaEnum.BASICA) {
            return new ComodoBasico(tipoComodo);
        }
        else if(tipoCasa == CasaEnum.CONFORTAVEL) {
            return new ComodoConfortavel(tipoComodo);
        }
        return new ComodoLuxo(tipoComodo);
    }
}
