package pilarespoo.interfaces.equipamentos.multifuncional;

import pilarespoo.interfaces.equipamentos.copiadora.Copiadora;
import pilarespoo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import pilarespoo.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando");
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo");
	}

	@Override
	public void copiar() {
		System.out.println("Copiando");
	}

	@Override
	public void executar() {
		digitalizar();
		imprimir();
		copiar();
	}

}
