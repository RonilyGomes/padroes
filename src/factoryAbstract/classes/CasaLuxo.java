package classes;

public class CasaLuxo extends Casa{
    
    @Override
    public CasaLuxo(CasaEnum tipo) {
        this.tipo = tipo;
        this.comodos.add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.LUXO));
        this.comodos.add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.LUXO));
        this.comodos.add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.LUXO));
        
        this.comodos.add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.LUXO));
        this.comodos.add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.LUXO));
        this.comodos.add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.LUXO));
        
        this.comodos.add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.LUXO));
        this.comodos.add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.LUXO));
        this.comodos.add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.LUXO));
    }
}
