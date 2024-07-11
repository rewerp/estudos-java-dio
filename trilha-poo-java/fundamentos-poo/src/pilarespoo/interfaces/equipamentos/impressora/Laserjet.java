package pilarespoo.interfaces.equipamentos.impressora;

public class Laserjet implements Impressora {

	@Override
	public void imprimir() {
		System.out.println("Imprimindo Laserjet");
	}

	@Override
	public void executar() {
		imprimir();
	}

}
