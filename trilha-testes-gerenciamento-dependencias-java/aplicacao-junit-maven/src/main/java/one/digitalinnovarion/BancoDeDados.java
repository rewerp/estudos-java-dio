package one.digitalinnovarion;

import java.util.logging.*;

public class BancoDeDados {

	private static final Logger logger = Logger.getLogger("Conexão com bando de dados");
	
	public static void iniciarConexao() {
		logger.info("Iniciou conexão");
	}
	
	public static void finalizarConexao() {
		logger.info("Finalizou conexão");
	}
	
}
