package classes;

public class CasaConfortavel extends Casa{
    
    @Override
    public CasaConfortavel(CasaEnum tipo) {
        this.tipo = tipo;
        this.comodos.add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.CONFORTAVEL));
        this.comodos.add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.CONFORTAVEL));
        
        this.comodos.add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.CONFORTAVEL));
        this.comodos.add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.CONFORTAVEL));
        
        this.comodos.add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.CONFORTAVEL));
        this.comodos.add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.CONFORTAVEL));
    }
}
