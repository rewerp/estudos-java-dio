package exemplosSet.operacoesPesquisaSet;

public class Aplicacao {
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("João Augusto", "19998563215");
		agendaContatos.adicionarContato("Zelda Deusa", "11996547788");
		agendaContatos.adicionarContato("Saria Forest", "19978453366");
		agendaContatos.adicionarContato("João José", "11985852325");
		agendaContatos.adicionarContato("Joaquim Silva", "19998744112");
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("João"));
		
		System.out.println(agendaContatos.atualizarNumeroContato("Saria Forest", "19998805030"));
	}
}
