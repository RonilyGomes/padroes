package classes;

public class ComodoConfortavel extends Comodo{
    
    public ComodoConfortavel() {
        this.piso = PisoFactory.create(PisoEnum.CERAMICA_ESMALTADA);
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(ParedeFactory.create(ParedeEnum.ALVENARIA));
        }
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(PortaFactory.create(PortaEnum.MADEIRA));
        }
        
        this.tinta = TintaFactory.create(TintaEnum.ACRILICA);
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(MetalFactory.create(MetalEnum.ALUMINIO));
        }
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(LoucaFactory.create(LoucaEnum.DECA));
        }
    }
}
