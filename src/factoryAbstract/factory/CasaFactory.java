package factory;

import classes.*;

public abstract class CasaFactory {
    public static Casa create(CasaEnum tipo) {
        if(tipo == CasaEnum.BASICA) {
            return new CasaBasica(tipo);
        }
        else if(tipo == CasaEnum.CONFORTAVEL) {
            return new CasaConfortavel(tipo);
        }
        else if(tipo == CasaEnum.LUXO) {
            return new CasaLuxo(tipo);
        }
        
        return new throw Exception;
    }
}
