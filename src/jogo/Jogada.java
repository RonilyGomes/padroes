package jogo;

public class Jogada {
	private AlgoritmoDasCartas alg;
	private Baralho deck;
	
	public Jogada(AlgoritmoDasCartas alg, Baralho deck) {
		this.alg = alg;
		this.deck = deck;
	}

	public AlgoritmoDasCartas getAlg() {
		return alg;
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
}
