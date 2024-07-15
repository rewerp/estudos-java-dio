package exemplosList.operacoesOrdenacaoList;

public class Aplicacao {
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		
		ordenacaoPessoas.adicionarPessoa("José", 38, 1.75);
		ordenacaoPessoas.adicionarPessoa("Joaquim", 19, 1.90);
		ordenacaoPessoas.adicionarPessoa("Pedro", 24, 1.86);
		ordenacaoPessoas.adicionarPessoa("Maria", 57, 1.62);
		ordenacaoPessoas.adicionarPessoa("João", 53, 1.78);
		ordenacaoPessoas.adicionarPessoa("Jessica", 16, 1.67);
		
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}
}
