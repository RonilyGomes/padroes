package classes;

public class CasaBasica extends Casa{
    
    @Override
    public CasaBasica(CasaEnum tipo) {
        this.tipo = tipo;
        this.comodos.add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.BASICA));
        
        this.comodos.add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.BASICA));
        
        this.comodos.add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.BASICA));
    }
}
