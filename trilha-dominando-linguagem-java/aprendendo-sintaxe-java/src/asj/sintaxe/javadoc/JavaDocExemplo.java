package asj.sintaxe.javadoc;

/**
 *  
 * <h3>Java Doc Exemplo</h3>
 * Classe para exemplo de Documentação Java
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para utilizar dos recursos oferecidos
 * @author Rewer Pinheiro
 * @version 1.0
 * @since 29/05/2024
 */

public class JavaDocExemplo {
  // Olá, eu sou um comentário de uma única linha

  /* Olá,
   * eu sou um comentário
   * mais detalhado
   * com diversas linhas
   */


  /**
   * Método com a finalidade de exemplificar o Java doc.
   * @param numeroUm : Type: <b>int</b> - Indica o primeiro numero da operação de soma.
   * @param numeroDois : Type: <b>int</b> - Indica o segundo numero da operação de soma.
   * @return Type: <b>int</b> - Indica o retorno da operação de soma.
   */
  public int somar(int numeroUm, int numeroDois) {
    return numeroUm + numeroDois;
  }



  // Exemplo de prática ruim para escrita de código
  public int somaMultiplica(int n, int x, String m) {
    int r = 0; // r é igual ao resultado
    if (m == "M") { // M = multiplicação
      r = n * x;
    }
    else {
      // se não realiza soma
      r = n + x;
    }

    return r;
  }
  
}
