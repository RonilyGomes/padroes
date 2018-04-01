package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlgoritmoCartaAleatoria implements AlgoritmoDasCartas{

	@Override
	public List<Carta> distribuirCartas(Baralho b) {
		Random gerador = new Random();
		List<Carta> cartas = new ArrayList<>();
		int num1 = gerador.nextInt(b.getCartas().size());
		int num2 = gerador.nextInt(b.getCartas().size());
		
		while(num1 == num2) num2 = gerador.nextInt(b.getCartas().size());
		
		cartas.add(b.getCartas().get(num1));
		cartas.add(b.getCartas().get(num2));
		
		if(num1 > num2) {
			b.getCartas().remove(num1);
			b.getCartas().remove(num2);
		}
		else {
			b.getCartas().remove(num2);
			b.getCartas().remove(num1);
		}
		
		return cartas;
	}

}
