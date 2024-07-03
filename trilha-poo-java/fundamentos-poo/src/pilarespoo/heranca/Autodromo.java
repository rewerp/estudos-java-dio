package pilarespoo.heranca;

public class Autodromo {
	public static void main(String[] args) {
		
		Carro jeep = new Carro();
		Moto honda = new Moto();
		
		jeep.setChassi("123456");
		System.out.println(jeep.getChassi());
		jeep.ligar();
		
		
		honda.setChassi("775588");
		System.out.println(honda.getChassi());
		honda.ligar();
		
	}
}
