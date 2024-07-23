package one.digitalinnovarion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BancoDeDadosTest {

	@BeforeAll
	static void validarIniciarConexaoBancoDeDados() {
		BancoDeDados.iniciarConexao();
	}
	
	@Test
	void validarDadosDeRetorno() {
		assertTrue(true);
	}
	
	@AfterAll
	static void validarFinalizarConexaoBancoDeDados() {
		BancoDeDados.finalizarConexao();
	}

}
