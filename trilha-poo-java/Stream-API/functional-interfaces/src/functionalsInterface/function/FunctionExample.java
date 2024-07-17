package functionalsInterface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

		Function<Integer, Integer> dobrar = numero -> numero * 2;

		// Primeiro exemplo de implementação com a variavel Function
		List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

		// Segundo exemplo de implementação sem a variavel Function
		List<Integer> numerosDobradosDois = numeros.stream().map(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer n) {
				return n * 2;
			}
		}).toList();

		// Terceiro exemplo de implementação sem a variavel Function e usando lambda
		List<Integer> numerosDobradosTres = numeros.stream().map(n -> n * 2).toList();

		numerosDobrados.forEach(System.out::println);
		numerosDobradosDois.forEach(System.out::println);
		numerosDobradosTres.forEach(System.out::println);

	}
}
