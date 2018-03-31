package jogo;

import java.util.List;

public class Baralho {
	private List<Carta> cartas;
	
	public Baralho(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public void embaralhar() {
		
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
}
