package jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
	private List<Carta> cartas;
	
	public Baralho() {
		this.cartas = new ArrayList<Carta>();
		List<String> naipes = new ArrayList<>();
		naipes.add("O");
		naipes.add("P");
		naipes.add("C");
		naipes.add("E");
		
		for(int i = 0; i < naipes.size(); i++) {
			for(int j = 1; j <= 13; j++) {
				Carta c = new Carta(naipes.get(i), j);
				cartas.add(c);
			}
		}
	}	

	public void embaralhar() {
		Collections.shuffle(this.cartas);
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
}
