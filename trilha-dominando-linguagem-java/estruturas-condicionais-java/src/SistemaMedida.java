/**
 * Classe para exemplificar a utilização de IF e SWITCH/CASE
 * para verificar se realmente existe um ganho de estrutura.
 */

public class SistemaMedida {
  public static void main(String[] args) {
    String sigla = "A";

    System.out.println("--- Usando IF ---");

    if (sigla == "P") {
      System.out.println("Tamanho Pequeno");
    }
    else if (sigla == "M") {
      System.out.println("Tamanho Médio");
    }
    else if (sigla == "G") {
      System.out.println("Tamanho Grande");
    }
    else {
      System.out.println("Tamanho indefinido");
    }

    System.out.println();
    System.out.println("--- Usando SWITCH/CASE ---");

    sigla = "P";

    switch (sigla) {
      case "P": {
        System.out.println("Tamanho Pequeno");
        break;
      }
      case "M": {
        System.out.println("Tamanho Médio");
        break;
      }
      case "G": {
        System.out.println("Tamanho Grande");
        break;
      }
      default:
        System.out.println("Tamanho indefinido");
    }
  }
}
