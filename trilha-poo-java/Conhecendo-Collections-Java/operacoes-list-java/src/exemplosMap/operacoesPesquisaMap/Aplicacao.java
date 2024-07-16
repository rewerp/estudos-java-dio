package exemplosMap.operacoesPesquisaMap;

public class Aplicacao {
	public static void main(String[] args) {
		
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(100, "Placa de video", 10, 1890.90);
		estoqueProdutos.adicionarProduto(101, "Memoria RAM", 5, 350.50);
		estoqueProdutos.adicionarProduto(102, "Notebook Gamer", 10, 5460.50);
		estoqueProdutos.adicionarProduto(103, "Mouse", 850, 220.00);
		estoqueProdutos.adicionarProduto(104, "Teclado", 50, 149.90);
		estoqueProdutos.adicionarProduto(105, "Processador", 32, 2450.99);
		
		estoqueProdutos.exibirProdutos();
		
		System.out.println("valor Total Estoque: " + estoqueProdutos.calcularValorTotalestoque());
		
		System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
		
		System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
		
		System.out.println("Produto maior Total Estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
	}
}
