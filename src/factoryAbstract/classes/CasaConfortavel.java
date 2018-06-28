package classes;

import enuns.CasaEnum;
import enuns.ComodoEnum;
import factory.ComodoFactory;

public class CasaConfortavel extends Casa{

    public CasaConfortavel(CasaEnum tipo) {
        super(tipo);
        this.setTipo(tipo);

        try {
            this.getComodos().add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.CONFORTAVEL));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.CONFORTAVEL));

            this.getComodos().add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.CONFORTAVEL));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.CONFORTAVEL));

            this.getComodos().add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.CONFORTAVEL));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.CONFORTAVEL));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
