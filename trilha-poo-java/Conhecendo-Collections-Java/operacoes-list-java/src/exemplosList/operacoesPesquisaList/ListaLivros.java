package exemplosList.operacoesPesquisaList;

import java.util.ArrayList;
import java.util.List;

public class ListaLivros {
	private List<Livro> listaLivros;
	
	public ListaLivros() {
		this.listaLivros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listaLivros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		for (Livro livro : listaLivros) {
			if (livro.getAutor().equalsIgnoreCase(autor)) {
				livrosPorAutor.add(livro);
			}
		}
		
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorAnoPublicacao(int anoInicial, int anoFinal) {
		List<Livro> livrosPorAnoPublicacao = new ArrayList<>();
		
		for (Livro livro : listaLivros) {
			if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
				livrosPorAnoPublicacao.add(livro);
			}
		}
		
		return livrosPorAnoPublicacao;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null; 
		
		for (Livro livro : listaLivros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				livroPorTitulo = livro;
				break;
			}
		}
		
		return livroPorTitulo;
	}
}
