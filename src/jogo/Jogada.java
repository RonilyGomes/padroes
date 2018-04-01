package jogo;

import java.util.ArrayList;
import java.util.List;

public class Jogada {
	private AlgoritmoDasCartas alg;
	private Baralho deck;
	private List<Carta> mao;
	
	public Jogada() {
		this.mao = new ArrayList<>();
		this.deck = new Baralho();
		this.alg = new AlgoritmoCartaCima();
	}
	
	public void novoAlgoritmo(AlgoritmoDasCartas novoAlg) {
		this.alg = novoAlg;
	}
	
	public void novaJogada() {
		mao = alg.distribuirCartas(deck);
	}

	public String getAlg() {
		return (this.alg instanceof AlgoritmoCartaCima) 
			? "Cartas de Cima"
			: "Cartas aleatorias";		
	}
	
	public AlgoritmoDasCartas getAlgoritmo() {
		return this.alg;
	}

	public void setAlg(AlgoritmoDasCartas alg) {
		this.alg = alg;
	}

	public Baralho getDeck() {
		return deck;
	}

	public void setDeck(Baralho deck) {
		this.deck = deck;
	}

	public List<Carta> getMao() {
		return mao;
	}

	public void setMao(List<Carta> mao) {
		this.mao = mao;
	}
}
