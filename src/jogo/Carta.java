package jogo;

public class Carta {
	private String naipe;
	private int numero;
	
	public Carta(String naipe, int numero) {
		super();
		this.naipe = naipe;
		this.numero = numero;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
