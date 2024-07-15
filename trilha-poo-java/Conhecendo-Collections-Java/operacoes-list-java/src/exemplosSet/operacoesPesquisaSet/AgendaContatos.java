package exemplosSet.operacoesPesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	Set<Contato> agendaContatos;
	
	public AgendaContatos() {
		this.agendaContatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, String telefone) {
		agendaContatos.add(new Contato(nome, telefone));
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for (Contato c : agendaContatos) {
			if (c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, String novoTelefone) {
		Contato contatoAtualizado = null;
		
		for (Contato c : agendaContatos) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setTelefone(novoTelefone);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
}
