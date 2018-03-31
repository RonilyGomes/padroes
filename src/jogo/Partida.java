package jogo;

public class Partida {
	private Jogada jogadas;

	public Partida(Jogada jogadas) {
		super();
		this.jogadas = jogadas;
	}

	public Jogada getJogadas() {
		return jogadas;
	}

	public void setJogadas(Jogada jogadas) {
		this.jogadas = jogadas;
	}
}
