package exemplosMap.operacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, String> agendaContatos;
	
	public AgendaContatos() {
		this.agendaContatos = new HashMap<>();
	}
	
	public void adicionarContato(String nome, String telefone) {
		agendaContatos.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if (!agendaContatos.isEmpty()) {			
			agendaContatos.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatos);
	}
	
	public String pesquisarPorNome(String nome) {
		String numeroPorNome = null;
		
		if (!agendaContatos.isEmpty()) {
			numeroPorNome = agendaContatos.get(nome);
		}
		
		return numeroPorNome;
	}
}
