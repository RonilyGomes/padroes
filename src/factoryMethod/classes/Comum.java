package classes;

public class Comum extends Nome{

	public Comum(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	@Override
	public void imprimir() {
		System.out.println(this.getNome() + " " + this.getSobrenome());
	}
}
