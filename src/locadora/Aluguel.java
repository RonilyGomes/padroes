package locadora;

import java.util.Iterator;

public class Aluguel {
    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public double extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;

//        Iterator<Aluguel> alugueis = fitasAlugadas.iterator();


        double valorCorrente = 0.0;
        // determina valores para aluguel linha
        switch(this.getFita().getCodigoDePreco()) {
            case Fita.NORMAL:
                valorCorrente += 2;
                if(this.getDiasAlugada() > 2) {
                    valorCorrente += (this.getDiasAlugada() - 2) * 1.5;
                }
                break;
            case Fita.LANCAMENTO:
                valorCorrente += this.getDiasAlugada() * 3;
                break;
            case Fita.INFANTIL:
                valorCorrente += 1.5;
                if(this.getDiasAlugada() > 3) {
                    valorCorrente += (this.getDiasAlugada() - 3) * 1.5;
                }
                break;
        } //switch

        // mostra valores para este aluguel
        return valorCorrente;
    }
}
