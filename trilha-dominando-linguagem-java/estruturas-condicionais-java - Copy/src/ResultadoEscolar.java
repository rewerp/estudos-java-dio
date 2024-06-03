public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota;
    String resultado;
    
    System.out.println("=== Estrutura condicional ===");
    
    nota = 6;    

    if (nota >= 7) {
      System.out.println("Aprovado");
    }
    else if (nota > 5 && nota <7) {
      System.out.println("Recuperação");
    }
    else {
      System.out.println("Reprovado");
    }


    System.out.println();
    System.out.println("=== Estrutura condicional ternária simples ===");

    nota = 7;

    resultado = nota >= 7 ? "Aprovado" : "Reprovado";

    System.out.println(resultado);


    System.out.println();
    System.out.println("=== Estrutura condicional ternária composta ===");

    nota = 4;

    resultado = (nota >= 7) ? "Aprovado" : (nota > 5 && nota < 7) ? "Recuperação" : "Reprovado";

    System.out.println(resultado);
  }
}
