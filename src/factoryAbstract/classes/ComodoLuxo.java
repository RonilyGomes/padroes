package classes;

public class ComodoLuxo extends Comodo{
    
    public ComodoLuxo() {
        this.piso = PisoFactory.create(PisoEnum.PORCELANATO);
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(ParedeFactory.create(ParedeEnum.ALVENARIA_DRY_WALL));
        }
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(PortaFactory.create(PortaEnum.MADEIRA_DE_LEI));
        }
        
        this.tinta = TintaFactory.create(TintaEnum.LAVAVEL);
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(MetalFactory.create(MetalEnum.INOX));
        }
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(LoucaFactory.create(LoucaEnum.LUXO));
        }
    }
}
