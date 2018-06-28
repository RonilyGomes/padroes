package factory;

import classes.*;
import enuns.CasaEnum;

public abstract class CasaFactory {
    public static Casa create(CasaEnum tipo) {
        if(tipo == CasaEnum.BASICA) {
            return new CasaBasica(tipo);
        }
        else if(tipo == CasaEnum.CONFORTAVEL) {
            return new CasaConfortavel(tipo);
        }

        return new CasaLuxo(tipo);
    }
}
