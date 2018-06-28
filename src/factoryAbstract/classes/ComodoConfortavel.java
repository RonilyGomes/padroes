package classes;

import enuns.*;
import factory.*;

public class ComodoConfortavel extends Comodo{
    public ComodoConfortavel(ComodoEnum tipo) {
        super(tipo);
        int i;

        this.setPiso(PisoFactory.create(PisoEnum.CERAMICA_ESMALTADA));

        for(i = 0; i < 4; i++) {
            this.getParedes().add(ParedeFactory.create(ParedeEnum.ALVENARIA));
        }

        for(i = 0; i < 4; i++) {
            this.getPortas().add(PortaFactory.create(PortaEnum.MADEIRA));
        }

        this.setTinta(TintaFactory.create(TintaEnum.ACRILICA));

        for(i = 0; i < 4; i++) {
            this.getMetais().add(MetalFactory.create(MetalEnum.ALUMINIO));
        }

        for(i = 0; i < 4; i++) {
            this.getLoucas().add(LoucaFactory.create(LoucaEnum.DECA));
        }
    }
}
