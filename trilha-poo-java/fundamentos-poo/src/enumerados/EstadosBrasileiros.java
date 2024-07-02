package enumerados;

public enum EstadosBrasileiros {
	CEARA("CE", "Ceará"),
	MARANHAO("MA", "Maranhão"),
	PIAUI("PI", "Piauí"),
	RIO_JANEIRO("RJ", "Rio de Janeiro"),
	SANTA_CATARINA("SC", "Santa Catarina"),
	SAO_PAULO ("SP", "São Paulo");
	
	private String sigla;
	private String nome;
	
	private EstadosBrasileiros(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}	
	
	/* O Enum permite criar um método SET e assim alterar seu valor
	 * Porém foge da proposta de apenas fornecer valores */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
 }
