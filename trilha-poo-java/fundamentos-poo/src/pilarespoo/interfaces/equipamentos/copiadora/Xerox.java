package pilarespoo.interfaces.equipamentos.copiadora;

public class Xerox implements Copiadora {

	@Override
	public void copiar() {
		System.out.println("Copiando");
	}

	@Override
	public void executar() {
		copiar();
	}

}
