package one.digitalinnovarion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
class EscolhendoOrdemTest {

	@Test
	@Order(1)
	@DisplayName("Validar Fluxo D")
	void validarFluxoD() {
		assertTrue(true);
	}
	
	@Test
	@Order(2)
	@DisplayName("Validar Fluxo B")
	void validarFluxoB() {
		assertTrue(true);
	}
	
	@Test
	@Order(3)
	@DisplayName("Validar Fluxo A")
	void validarFluxoA() {
		assertTrue(true);
	}
	
	@Test
	@Order(4)
	@DisplayName("Validar Fluxo C")
	void validarFluxoC() {
		assertTrue(true);
	}

}
