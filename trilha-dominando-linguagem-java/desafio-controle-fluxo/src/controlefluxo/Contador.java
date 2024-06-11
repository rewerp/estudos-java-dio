package controlefluxo;

import java.util.Scanner;
import controlefluxo.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.print("Digite o primeiro parâmetro: ");
			int parametroUm = terminal.nextInt();
			
			System.out.print("Digite o segundo parâmetro: ");
			int parametroDois = terminal.nextInt();
			
			System.out.println();
			System.out.println("-- Contando --");
			
			try {
				contar(parametroUm, parametroDois);
			}
			catch (ParametrosInvalidosException exception) {
			    System.out.println("** ATENÇÃO ** : O segundo parâmetro deve ser maior que o primeiro");
			}
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Numero: " + i);
		}
	}
}
