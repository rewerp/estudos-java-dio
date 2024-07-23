package one.digitalinnovarion.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

	@Mock
	private List<String> letras;
	
	@Test
	void adicionarItemNaLista() {
		Mockito.when(letras.get(0)).thenReturn("B");
		assertEquals("B", letras.get(0));
	}
	
}
