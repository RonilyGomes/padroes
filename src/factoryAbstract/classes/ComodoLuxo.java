package classes;

import enuns.*;
import factory.*;

public class ComodoLuxo extends Comodo{
    
    public ComodoLuxo(ComodoEnum tipo) {
        super(tipo);
        int i;
        this.setPiso(PisoFactory.create(PisoEnum.PORCELANATO));
        
        for(i = 0; i < 4; i++) {
            this.getParedes().add(ParedeFactory.create(ParedeEnum.ALVENARIA_DRY_WALL));
        }
        
        for(i = 0; i < 4; i++) {
            this.getPortas().add(PortaFactory.create(PortaEnum.MADEIRA_DE_LEI));
        }
        
        this.setTinta(TintaFactory.create(TintaEnum.LAVAVEL));
        
        for(i = 0; i < 4; i++) {
            this.getMetais().add(MetalFactory.create(MetalEnum.INOX));
        }
        
        for(i = 0; i < 4; i++) {
            this.getLoucas().add(LoucaFactory.create(LoucaEnum.LUXO));
        }
    }
}
