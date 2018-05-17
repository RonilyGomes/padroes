package classes;

public class Invertido extends Nome{

	public Invertido(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	@Override
	public void imprimir() {
		System.out.println(this.getSobrenome() + " " + this.getNome());
	}
}
