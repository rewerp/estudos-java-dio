package exemplosSet.operacoesBasicasSet;

public class Aplicacao {
	public static void main(String[] args) {
		
		ConjuntoConvidados convidados = new ConjuntoConvidados();
		
		convidados.adicionarConvidado("Saria", 1254);
		convidados.adicionarConvidado("João", 3236);
		convidados.adicionarConvidado("Pedro", 7185);
		convidados.adicionarConvidado("Zelda", 9576);
		convidados.adicionarConvidado("Cambista", 7185);
		
		System.out.println("Quantidade de convidados: " + convidados.contarConvidados());
		convidados.exibirConvidados();
		
		convidados.removerConvidadoPorCodigoConvite(3236);
		
		System.out.println("Quantidade de convidados: " + convidados.contarConvidados());
		convidados.exibirConvidados();
		
	}
}
