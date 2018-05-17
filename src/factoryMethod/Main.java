import Enumerations.TipoNome;
import classes.Comum;
import classes.Invertido;
import containers.ContainerNome;

public class Main {

	public static void main(String[] args) throws Exception{
		
		String nome = "Ronily";
		String sobrenome = "Gomes";
		ContainerNome container = new ContainerNome();
		
		try{
			// Comum
			container.criar(TipoNome.COMUM, nome, sobrenome).imprimir();
			container.criarPorReflexao(Comum.class.getName(), nome, sobrenome).imprimir();
			
			// invertido
			container.criar(TipoNome.INVERTIDO, nome, sobrenome).imprimir();
			container.criarPorReflexao(Invertido.class.getName(), nome, sobrenome).imprimir();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
