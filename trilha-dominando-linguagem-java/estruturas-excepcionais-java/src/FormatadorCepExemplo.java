public class FormatadorCepExemplo {
  public static void main(String[] args) throws CepInvalidoException {
    String cepFormatado = formatarCep("2376506");
    System.out.println(cepFormatado);
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8) {
      throw new CepInvalidoException("Numero invalido");
    }

    return "23.765-064";
  }

}
