package classes;

import enuns.CasaEnum;
import enuns.ComodoEnum;
import factory.ComodoFactory;

public class CasaLuxo extends Casa{

    public CasaLuxo(CasaEnum tipo) {
        super(tipo);
        this.setTipo(tipo);

        try {
            this.getComodos().add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.LUXO));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.LUXO));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.BANHEIRO, CasaEnum.LUXO));

            this.getComodos().add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.LUXO));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.LUXO));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.SALA, CasaEnum.LUXO));

            this.getComodos().add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.LUXO));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.LUXO));
            this.getComodos().add(ComodoFactory.create(ComodoEnum.OUTRO, CasaEnum.LUXO));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
