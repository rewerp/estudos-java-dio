package functionalsInterface.binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> numerosDois = Arrays.asList(6, 2, 8, 1, 12);
		
		BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
		
		// Utilizando função lambda e Method reference
		BinaryOperator<Integer> somarDois = Integer::sum;
		
		int resultado = numeros.stream().reduce(0, somar);
		System.out.println("A soma dos números é: " + resultado);
		
		// Utilizando função lambda
		resultado = numeros.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.println("A soma dos números é: " + resultado);
		
		// Utilizando função lambda e Method reference
		resultado = numerosDois.stream().reduce(0, Integer::sum);
		System.out.println("A soma dos números é: " + resultado);
		
	}
}
