package functionalsInterface.classOptional;

import java.util.Optional;

public class ClassOptionalExample {
	public static void main(String[] args) {
		
		Optional<String> optionalValue = Optional.ofNullable(null);
		String teste = optionalValue.orElse("vazio");
		System.out.println(teste);
		
		// Utilizando Optional com Supplier
		boolean validado = true;
		String testeDois = optionalValue.orElseGet(() -> {
			if (validado) {return "Valor foi validado";}
			else {return "Valor invalido";}
		});
		System.out.println(testeDois);
				
		// Utilizando Optional com Consumer
		Optional<String> optionalValueDois = Optional.of("Hello");
		optionalValueDois.ifPresent(value -> System.out.println("Valor presente: " + value));
		
		// Utilizando Optional com Exception
		String testeTres = optionalValue.orElseThrow(() -> new RuntimeException("Valor está nulo"));
		System.out.println(testeTres);
		
	}
}
