package exemplosList.operacoesPesquisaList;

public class AplicacaoLivro {
	public static void main(String[] args) {
		ListaLivros listaLivros = new ListaLivros();
		
		listaLivros.adicionarLivro("Programação Java", "José", 2006);
		listaLivros.adicionarLivro("O cheiro do cravo", "Maria", 2014);
		listaLivros.adicionarLivro("Programação C#", "Joaquina", 2018);
		listaLivros.adicionarLivro("Auto ajuda para dev", "Cleber", 2023);
		listaLivros.adicionarLivro("Programação C#", "José", 2010);
		
		System.out.println(listaLivros.pesquisarPorAutor("José"));
		
		System.out.println(listaLivros.pesquisarPorAnoPublicacao(2018, 2022));
		
		System.out.println(listaLivros.pesquisarPorTitulo("Programação Java"));
	}
}
