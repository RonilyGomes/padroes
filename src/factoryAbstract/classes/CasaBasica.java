package classes;

import enuns.CasaEnum;
import enuns.ComodoEnum;
import factory.ComodoFactory;

public class CasaBasica extends Casa{

    public CasaBasica(CasaEnum tipo) {
        super(tipo);
        this.setTipo(tipo);

        try {
            this.getComodos().add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.BASICA));

            this.getComodos().add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.BASICA));

            this.getComodos().add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.BASICA));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
