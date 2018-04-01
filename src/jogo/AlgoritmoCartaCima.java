package jogo;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoCartaCima implements AlgoritmoDasCartas{

	@Override
	public List<Carta> distribuirCartas(Baralho b) {
		List<Carta> cartas = new ArrayList<>();
		
		cartas.add(b.getCartas().get(0));
		cartas.add(b.getCartas().get(1));
		
		b.getCartas().remove(1);
		b.getCartas().remove(0);
		
		return cartas;
	}
	
}
