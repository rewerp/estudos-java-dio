package one.digitalinnovarion.mockito;

import java.time.LocalDate;

public class CadastrarPessoa {

	private ApiCorreios apiCorreios;
	
	public CadastrarPessoa(final ApiCorreios apiCorreios) {
		this.apiCorreios = apiCorreios;
	}
	
	public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
		Pessoa pessoa = new Pessoa(nome, documento, nascimento);
		pessoa.setEndereco(apiCorreios.buscarDadosCEP(cep));
		
		return pessoa;
	}

}
