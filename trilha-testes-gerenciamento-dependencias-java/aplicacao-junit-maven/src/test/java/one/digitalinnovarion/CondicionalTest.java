package one.digitalinnovarion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CondicionalTest {

	@Test
	void validarCondicional() {
		Assumptions.assumeTrue("rewer".equalsIgnoreCase(System.getenv("USERNAME")));
		assertEquals(10, 5 + 6);
	}
	
	@Test
	@DisabledIfEnvironmentVariable(named = "USERNAME", matches="rewerp")
	void validarvariaveisAmbiente() {
		assertEquals(6, 5 + 6);
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void validarSistemaOperacional() {
		assertEquals(25, 5 + 6);
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_21)
	void validarJRE() {
		assertEquals(25, 5 + 6);
	}

}
