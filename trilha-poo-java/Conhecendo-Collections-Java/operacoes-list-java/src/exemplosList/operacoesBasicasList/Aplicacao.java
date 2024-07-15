package exemplosList.operacoesBasicasList;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		ListaTarefa listaTarefas = new ListaTarefa();
		
		Scanner scanner = new Scanner(System.in);
		
		boolean continuar = true;
		String descricao;
		String opcaoContinuar;
		
		while (continuar) {
			System.out.println("Digite o nome da tarefa: ");
			descricao = scanner.nextLine();
			
			if (!descricao.isBlank()) {
				listaTarefas.adicionarTarefa(descricao);
			}
			
		
			System.out.println("Deseja adicionar outra tarefa? (S/N): ");
			opcaoContinuar = scanner.nextLine();
			
			continuar = opcaoContinuar.equalsIgnoreCase("s");
		}
		
		System.out.println("");
		
		System.out.print("Quantidade de tarefas cadastradas: ");
		System.out.println(listaTarefas.obterNumeroTotalTarefas());
		
		System.out.println("");
		
		System.out.println("== Lista de tarefas ==");
		listaTarefas.obterDescricoesTarefas();
//		listaTarefas.listarDescricaoTarefas();
		
		scanner.close();
	}
}
