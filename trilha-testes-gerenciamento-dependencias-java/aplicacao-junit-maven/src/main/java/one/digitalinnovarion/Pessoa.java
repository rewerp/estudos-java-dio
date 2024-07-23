package one.digitalinnovarion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private String nome;
	private LocalDate nascimento;
	private int[] lancamentos = {1, 2, 3, 4, 5};
	
	public Pessoa(String nome, LocalDate nascimento) {
		this.nome = nome;
		this.nascimento= nascimento;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public int[] getLancamentos() {
		return lancamentos;
	}
	
	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
	}
	
	public boolean ehMaiorDeIdade() {
		return getIdade() >= 18;
	}
	
}
