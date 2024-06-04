import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class ExemploExcecoes {
  public static void main(String[] args) throws Exception {
    try {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("==== Entrada de dados ====");

      System.out.print("Digite seu nome: ");
      String nome = scanner.next();

      System.out.print("Digite sua idade: ");
      int idade = scanner.nextInt();

      System.out.print("Digite sua altura: ");
      double altura = scanner.nextDouble();


      System.out.println();
      System.out.println("==== Exibição dos dados ====");

      System.out.println("Olá! Meu nome é " + nome);
      System.out.println("Tenho " + idade + "anos");
      System.out.println("Minha altura é " + altura + " m.");
    }
    catch(InputMismatchException e) {
      System.out.println();
      System.out.println("== ATENÇÃO ==");
      System.out.println("Os campos idade e altura precisam ser numéricos!");
    }

  }
}
