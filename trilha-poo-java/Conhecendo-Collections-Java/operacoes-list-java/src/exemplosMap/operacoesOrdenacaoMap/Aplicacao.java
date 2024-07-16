package exemplosMap.operacoesOrdenacaoMap;

import java.time.LocalDate;

public class Aplicacao {
	public static void main(String[] args) {
		
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 9), "Viagem para USA", "Grand Canyon");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 19), "Churrasco com amigos", "Churrasco");
		agendaEventos.adicionarEvento(LocalDate.of(2025, 6, 1), "Viagem para Irlanda", "Passeio na cervejaria Guiness");
		agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 20), "Viagem para praia", "Visitar ilhas");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
		
	}
}
