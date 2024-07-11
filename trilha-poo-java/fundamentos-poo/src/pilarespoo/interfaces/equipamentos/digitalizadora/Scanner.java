package pilarespoo.interfaces.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando");
	}

	@Override
	public void executar() {
		digitalizar();
	}

}
