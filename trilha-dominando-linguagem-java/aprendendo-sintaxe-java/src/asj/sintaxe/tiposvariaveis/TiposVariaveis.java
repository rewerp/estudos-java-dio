package asj.sintaxe.tiposvariaveis;

public class TiposVariaveis {
  public static void main(String[] args) throws Exception {
    /* Declaração de variáveis */

      double salarioMinimo = 2500;

      short numeroCurto = 1;
      int numeroNormal = numeroCurto;
      short numeroCurto2 = (short) numeroNormal; // casting para tipo "short"



    /* Declaração de constantes */
      
      final double VALOR_DE_PI = 3.14;
  }
}