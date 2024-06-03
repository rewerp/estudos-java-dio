public class ExemploFor {
  public static void main(String[] args) throws Exception {
    exemploCarneirinhos();
    exemploArray();
  }

  public static void exemploCarneirinhos() {
    System.out.println("===== Exemplo For - Carneirinhos =====");

    for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
      System.out.println("Contado carneirinhos: " + carneirinhos);
    }
  }

  public static void exemploArray() {
    System.out.println();
    System.out.println("===== Exemplo For - Alunos Array - Sintaxe 1 =====");

    String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno no indice = " + i + ", é " + alunos[i]);
    }

    // Outra forma de trabalhar com For em Arrays

    System.out.println();
    System.out.println("===== Exemplo For - Alunos Array - Sintaxe 2 =====");

    for (String aluno : alunos) {
      System.out.println("O nome do aluno é " + aluno);
    }
  }
}
