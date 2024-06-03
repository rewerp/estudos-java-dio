/**
 * Classe para exemplificar a utilização SWITCH/CASE
 * em uma situação que é mais viável sua utilização.
 */

public class PlanoOperadora {
  public static void main(String[] args) {
    /*
     * Imagina um sistema de plano telefônico onde:
     * - O sistemas terá 3 planos: BASIC, MENSAGEM e TOTAL;
     * - BASIC: 100 minutors de ligação;
     * - MENSAGEM: 100 minutors de ligação + WhatsApp grátis;
     * - TOTAL: 100 minutors de ligação + WhatsApp grátis + 5Gb Youtube;
     */

    String plano ="T";

    switch (plano) {
      case "T": System.out.println("5Gb Youtube");
      case "M": System.out.println("WhatsApp grátis");
      case "B": System.out.println("100 minutors de ligação");
    }

    /* Nessa situação, como deve ser apresentado uma "soma" de informações
     * o SWITCH/CASE pode ser usado para evitar a repetição de código
     * Para isso dispensa a utilização do comando "break"
     */
  }
}