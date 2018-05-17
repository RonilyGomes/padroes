package containers;

import Enumerations.TipoNome;
import classes.Comum;
import classes.Invertido;
import classes.Nome;

public class ContainerNome {
	public Nome criar (TipoNome n, String nome, String sobrenome) throws Exception {
		if(n == TipoNome.COMUM) return new Comum(nome, sobrenome);
		if(n == TipoNome.INVERTIDO) return new Invertido(nome, sobrenome);
		
		throw new Exception();
	}
	
	public Nome criarPorReflexao (String classe, String nome, String sobrenome) throws Exception {
		try {
			return (Nome) Class.forName(classe).getConstructor(String.class, String.class).newInstance(nome, sobrenome);
		}
		catch(Exception e) {
			throw new Exception("Classe incorreta!");
		}
	}
}
