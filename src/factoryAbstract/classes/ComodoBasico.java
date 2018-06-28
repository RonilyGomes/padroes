package classes;

import enuns.*;
import factory.*;

public class ComodoBasico extends Comodo{
    public ComodoBasico(ComodoEnum tipo) {
        super(tipo);
        int i;

        this.setPiso(PisoFactory.create(PisoEnum.CERAMICA));

        for(i = 0; i < 4; i++) {
            this.getParedes().add(ParedeFactory.create(ParedeEnum.GESSO));
        }
        
        for(i = 0; i < 4; i++) {
            this.getPortas().add(PortaFactory.create(PortaEnum.MDF));
        }
        
        this.setTinta(TintaFactory.create(TintaEnum.LATEX));
        
        for(i = 0; i < 4; i++) {
            this.getMetais().add(MetalFactory.create(MetalEnum.FERRO));
        }
        
        for(i = 0; i < 4; i++) {
            this.getLoucas().add(LoucaFactory.create(LoucaEnum.ELIZABETH));
        }
    }
}
