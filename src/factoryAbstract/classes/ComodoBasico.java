package classes;

public class ComodoBasico extends Comodo{
    
    public ComodoBasico(ComodoEnum tipo) {
        this.tipo = tipo;
        
        this.piso = PisoFactory.create(PisoEnum.CERAMICA);
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(ParedeFactory.create(ParedeEnum.GESSO));
        }
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(PortaFactory.create(PortaEnum.MDF));
        }
        
        this.tinta = TintaFactory.create(TintaEnum.LATEX);
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(MetalFactory.create(MetalEnum.FERRO));
        }
        
        for(i = 0; i < 4; i++) {
            this.paredes.add(LoucaFactory.create(LoucaEnum.ELIZABETH));
        }
    }
}
