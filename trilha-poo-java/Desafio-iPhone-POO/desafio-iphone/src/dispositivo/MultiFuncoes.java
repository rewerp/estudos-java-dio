package dispositivo;

import interfaces.utilidades.NavegadorInternet;
import interfaces.utilidades.ReprodutorMusical;
import interfaces.utilidades.Telefonia;

public class MultiFuncoes implements ReprodutorMusical, Telefonia, NavegadorInternet {

	@Override
	public void navegarInternet() {
		System.out.println("Navegando na Internet Multifunções");
	}

	@Override
	public void fazerChamadaTelefonica() {
		System.out.println("Fazendo chamada telefonica Multifunções");
	}

	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo musica Multifunções");
	}

}
