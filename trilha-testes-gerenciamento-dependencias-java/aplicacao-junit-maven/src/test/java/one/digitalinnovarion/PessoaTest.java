package one.digitalinnovarion;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void validarGetIdade() {
		Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
		assertEquals(4, pessoa.getIdade());
	}
	
	@Test
	void validarEhMaiorDeIdade() {
		Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2006, 1, 1));
		assertTrue(pessoa.ehMaiorDeIdade());
		
		Pessoa pessoaDois = new Pessoa("João", LocalDate.of(2008, 1, 1));
		assertFalse(pessoaDois.ehMaiorDeIdade());
	}
	
	@Test
	void validarLancamentos() {
		Pessoa pessoa = new Pessoa("José", LocalDate.of(1989, 5, 23));
		int[] dados = {1, 2, 3, 4, 5};
		assertArrayEquals(dados, pessoa.getLancamentos());
	}

}
