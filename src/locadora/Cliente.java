package locadora;

import java.util.*;
public class Cliente {

    private String nome;
    private Collection<Aluguel> fitasAlugadas = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extratoTotal() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator<Aluguel> alugueis = fitasAlugadas.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        while(alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel aluguel = (Aluguel)alugueis.next();
            // determina valores para aluguel linha
            valorCorrente += aluguel.extrato();
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
            if(aluguel.getFita().getCodigoDePreco() == Fita.LANCAMENTO &&
                    aluguel.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + aluguel.getFita().getTitulo() + "\t" + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
        return resultado;
    }
}

