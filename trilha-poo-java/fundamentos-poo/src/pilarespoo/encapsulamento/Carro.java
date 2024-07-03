package pilarespoo.encapsulamento;

public class Carro {
	public void ligar() {
		confereCombustivel();
		confereCambio();
		System.out.println("CARRO LIGADO");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo câmbio");
	}
}
