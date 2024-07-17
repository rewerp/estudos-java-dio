package functionalsInterface.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
	public static void main(String[] args) {

		Supplier<String> saudacao = () -> "Olá mundo!";

		List<String> listaSaudacoes = Stream.generate(saudacao).limit(3).toList();
		
		List<String> listaSaudacoesDois = Stream.generate(() -> "Olá! tudo bem?")
				.limit(3)
				.toList();

		System.out.println("== Exemplo ==");
		listaSaudacoes.forEach(s -> System.out.println(s));
		
		// Utilizando Method reference
		System.out.println("== Utilizando Method reference ==");
		listaSaudacoes.forEach(System.out::println);
		
		System.out.println("== Exemplo de Supplier Dois ==");
		listaSaudacoesDois.forEach(System.out::println);

	}
}
