package factory;

public abstract class ComodoFactory {
    public static Comodo create(ComodoEnum tipoComodo, CasaEnum tipoCasa) throw Exception{
        if(tipoCasa == CasaEnum.BASICA) {
            return new ComodoBasico(tipoComodo);
        }
        else if(tipoCasa == CasaEnum.CONFORTAVEL) {
            return new ComodoConfortavel(tipoComodo);
        }
        else if(tipoCasa == CasaEnum.LUXO) {
            return new ComodoLuxo(tipoComodo);
        }
        
        return new throw Exception;
    }
}
