package one.digitalinnovarion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
	void validarTransferir() {
		assertThrowsExactly(IllegalArgumentException.class, () -> TransferenciaEntreContas.transferir(123, 456, 0));
	}
	
	@Test
	void validarSemExcecao() {
		assertDoesNotThrow(() -> TransferenciaEntreContas.transferir(123, 456, 0));
	}

}
