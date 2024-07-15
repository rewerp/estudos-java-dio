package exemplosSet.operacoesOrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	Set<Produto> cadastroProdutos;
	
	public CadastroProdutos() {
		this.cadastroProdutos = new HashSet<>();
	}
	
	public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
		cadastroProdutos.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(cadastroProdutos);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(cadastroProdutos);
		return produtosPorPreco;
	}
}
