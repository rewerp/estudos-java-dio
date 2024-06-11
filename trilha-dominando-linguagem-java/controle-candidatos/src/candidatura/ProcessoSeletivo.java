package candidatura;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	static String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
	
	public static void main(String[] args) {
		System.out.println("============================================");
		System.out.println("||     APLICAÇÃO DE PROCESSO SELETIVO     ||");
		System.out.println("============================================");
		System.out.println();
		
		ArrayList<String> candidatosSelecionados = new ArrayList<>();
		
		candidatosSelecionados = selecionarCandidatos();	
		
		imprimirSelecionados(candidatosSelecionados);
		
		entrandoEmContato(candidatosSelecionados);
		
		System.out.print("===== FIM DA APLICAÇÃO =====");
	}
	
	static ArrayList<String> selecionarCandidatos() {
		ArrayList<String> candidatosSelecionados = new ArrayList<>();
		int contadorSelecionados = 0;
		int candidatoAtual = 0;
		
		while (contadorSelecionados < 5) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.printf("O candidato " + candidato + " tem a pretenção salarial de R$%.2f", salarioPretendido);
			System.out.println();
			
			if (analisarCandidato(salarioPretendido)) {
				candidatosSelecionados.add(candidato);
				contadorSelecionados++;
			}
			
			candidatoAtual++;
		}
		
		System.out.println("--- Processo seletivo finalizado! ---");
		System.out.println();
		System.out.println();
		
		return candidatosSelecionados;
	}
	
	static boolean analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		
		if (salarioBase > salarioPretendido) {
			System.out.println("O candidato foi selecionado para a vaga.");
			System.out.println();
			return true;
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta.");
			System.out.println();
			return false;
		}
		else {
			System.out.println("Aguardando o resultado dos demais candidatos.");
			System.out.println();
			return false;
		}
	}
	
	static void imprimirSelecionados(ArrayList<String> candidatosSelecionados) {
		System.out.println("==== Imprimindo lista dos selecionados ====");
		System.out.println();
		
		for (String candidato: candidatosSelecionados) {
			System.out.println("Candidato selecionado: " + candidato);
			System.out.println();
		}
		
		System.out.println("--- Impressão da lista finalizada! ---");
		System.out.println();
		System.out.println();
	}
	
	static void entrandoEmContato(ArrayList<String> candidatosSelecionados) {
		System.out.println("==== Entranto em contato com selecionados ====");
		System.out.println();
		
		int tentativasRealizadas;
		boolean continuarTentando;
		boolean atendeu;
		
		for (String candidato: candidatosSelecionados) {
			
			System.out.println("- Entrando em contado com candidato: " + candidato);
			
			tentativasRealizadas = 1;
			continuarTentando = true;
			atendeu = false;
			
			do {
				atendeu = atender();
				continuarTentando = !atendeu;
				
				if (atendeu) {
					System.out.println("Contato realizado com sucesso!");
					System.out.println();
				}
				
				tentativasRealizadas++;
				
			} while(continuarTentando && tentativasRealizadas <= 3);
			
			if (!atendeu) {
				System.out.println("Não foi possível contato com o candidato!");
				System.out.println();
			}
		}
		
		System.out.println("--- Contato com selecionados finalizado! ---");
		System.out.println();
		System.out.println();
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static boolean atender() {
		return new Random().nextInt(6) == 1;
	}
}
