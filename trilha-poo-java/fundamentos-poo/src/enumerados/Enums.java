package enumerados;

public class Enums {
	public static void main(String[] args) {
		
		for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getNomeMaiusculo());
		}
		
		System.out.println("---------------------------");
		
		EstadosBrasileiros eb = EstadosBrasileiros.SAO_PAULO;
		
		eb.setSigla("KKK");
		
		System.out.println(eb.getSigla());
		System.out.println(eb.getNome());
		System.out.println(eb.getNomeMaiusculo());
		
	}
}
