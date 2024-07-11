package pilarespoo.interfaces;

import pilarespoo.interfaces.equipamentos.copiadora.Copiadora;
import pilarespoo.interfaces.equipamentos.copiadora.Xerox;
import pilarespoo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import pilarespoo.interfaces.equipamentos.digitalizadora.Scanner;
import pilarespoo.interfaces.equipamentos.impressora.Deskjet;
import pilarespoo.interfaces.equipamentos.impressora.Impressora;
import pilarespoo.interfaces.equipamentos.impressora.Laserjet;
import pilarespoo.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Aplicacao {
	public static void main(String[] args) {
		Impressora impressora = new Deskjet();
		Digitalizadora digitalizadora = new Scanner();
		Copiadora copiadora = new Xerox();
		
		impressora.executar();
		digitalizadora.executar();
		copiadora.executar();
	}
}
