package one.digitalinnovarion.mockito;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private String documento;
	private LocalDate nascimento;
	private String endereco;
		
	public Pessoa(String nome, String documento, LocalDate nascimento) {
		super();
		this.nome = nome;
		this.documento = documento;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getDocumento() {
		return documento;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
