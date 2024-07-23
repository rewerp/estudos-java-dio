package one.digitalinnovarion;

public class TransferenciaEntreContas {
	
	public static void main(String[] args) {
		transferir(123, 456, 0);
	}

	public static void transferir(int contaOrigem, int contaDestino, double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor deve ser maior que zero.");
		}
	}
	
}
