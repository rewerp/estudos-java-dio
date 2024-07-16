package exemplosMap.operacoesBasicasMap;

public class Aplicacao {
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Zelda", "19986541235");
		agendaContatos.adicionarContato("Saria", "19998805030");
		agendaContatos.adicionarContato("Joao", "11985563322");
		agendaContatos.adicionarContato("Jose", "19998788554");
		agendaContatos.adicionarContato("Maria", "11989568956");
		agendaContatos.adicionarContato("Saria", "19987875454");
		
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContato("Jose");
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Zelda"));

	}
}
