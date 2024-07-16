package exemplosMap.operacoesPesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutos;
	
	public EstoqueProdutos() {
		this.estoqueProdutos = new HashMap<>();
	}
	
	public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
		estoqueProdutos.put(codigo, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutos);
	}
	
	public double calcularValorTotalestoque() {
		double valorTotalEstoque = 0;
		
		if (!estoqueProdutos.isEmpty()) {
			for (Produto p : estoqueProdutos.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		
		if (!estoqueProdutos.isEmpty()) {
			for (Produto p : estoqueProdutos.values()) {
				if (p.getPreco() > maiorPreco) {					
					produtoMaisCaro = p;
					maiorPreco = p.getPreco();
				}
			}	
		}
		
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		
		if (!estoqueProdutos.isEmpty()) {
			for (Produto p : estoqueProdutos.values()) {
				if (p.getPreco() < menorPreco) {					
					produtoMaisBarato = p;
					menorPreco = p.getPreco();
				}
			}	
		}
		
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaisCaro = null;
		double valorTotalEstoque = 0;
		double maiorPreco = Double.MIN_VALUE;
		
		if (!estoqueProdutos.isEmpty()) {
			for (Produto p : estoqueProdutos.values()) {
				valorTotalEstoque = p.getQuantidade() * p.getPreco();
				
				if (valorTotalEstoque > maiorPreco) {					
					produtoMaisCaro = p;
					maiorPreco = valorTotalEstoque;
				}
			}	
		}
		
		return produtoMaisCaro;
	}
	
}
