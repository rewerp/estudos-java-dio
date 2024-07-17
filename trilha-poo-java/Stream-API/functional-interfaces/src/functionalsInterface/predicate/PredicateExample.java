package functionalsInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {

		List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "go", "ruby");

		// Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

		// Usar o Stream para filtrar as palavras com mais de 5 caracteres e em seguida
		// imprimir
		palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

		palavras.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String p) {
				return p.length() > 5;
			}
		}).forEach(System.out::println);

		palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);

		/**
		 * Usar assim = .forEach(System.out::println) é o mesmo que isso = .forEach(p ->
		 * System.out.println(p))
		 **/

	}
}
