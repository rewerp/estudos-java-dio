package exemplosMap.operacoesOrdenacaoMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	
	private Map<LocalDate, Evento> agendaEventos;
	
	public AgendaEventos() {
		this.agendaEventos = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		agendaEventos.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> agendaEventosPorData = new TreeMap<>(agendaEventos);
		System.out.println(agendaEventosPorData);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> agendaEventosPorData = new TreeMap<>(agendaEventos);
		
		for (Map.Entry<LocalDate, Evento> entry : agendaEventosPorData.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("Próximo evento - Data: " + entry.getKey() + ", " + entry.getValue());
				break;
			}
		}
	}
	
}
