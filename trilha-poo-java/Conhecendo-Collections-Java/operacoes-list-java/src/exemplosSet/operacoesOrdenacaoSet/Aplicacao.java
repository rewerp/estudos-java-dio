package exemplosSet.operacoesOrdenacaoSet;

public class Aplicacao {
	public static void main(String[] args) {
		
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1234, "Placa de video", 2500, 10);
		cadastroProdutos.adicionarProduto(1235, "HDD 250GB", 250.90, 5);
		cadastroProdutos.adicionarProduto(1236, "Mouse", 185.99, 50);
		cadastroProdutos.adicionarProduto(1237, "Teclado", 148.90, 40);
		cadastroProdutos.adicionarProduto(1238, "Processador", 1890.90, 8);
		
		System.out.println(cadastroProdutos.cadastroProdutos);
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		
	}
}
