package exemplosList.operacoesOrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	List<Pessoa> listaPessoas = new ArrayList<>();
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
}
