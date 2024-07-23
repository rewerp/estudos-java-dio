package one.digitalinnovarion.mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.InjectMocks;

@ExtendWith(MockitoExtension.class)
class CadastrarPessoaTeste {
	
	@Mock
	private ApiCorreios apiCorreios;
	
	@InjectMocks
	private CadastrarPessoa cadastrarPessoa;

	@Test
	void validarCadastrarPessoa() {
		Mockito.when(apiCorreios.buscarDadosCEP("45123")).thenReturn("Rua Teste, 456 - Centro");
		Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("José", "123456", LocalDate.of(1989, 4, 15), "45123");
				
		assertEquals("José", pessoa.getNome());
		assertEquals("123456", pessoa.getDocumento());
		assertEquals(LocalDate.of(1989, 4, 15), pessoa.getNascimento());
		assertEquals("Rua Teste, 456 - Centro", pessoa.getEndereco());
	}

}
