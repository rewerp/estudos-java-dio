package pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("Marcos", "123.456.789-88");
		
		marcos.setEndereco("Rua Cinco");
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf() + " - " + marcos.getEndereco());
	}
}
