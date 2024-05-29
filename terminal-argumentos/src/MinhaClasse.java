import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
  public static void main(String[] args) throws Exception {
    entradaPorArgumentos(args);
    entradaPorScanner();
  }

  public static void entradaPorArgumentos(String [] args) {
    String nome = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("=== ENTRADA DE DADOS POR ARGUMENTOS ===");
    System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos");
    System.out.println("Minha altura é " + altura + " m");
  }

  public static void entradaPorScanner() {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("=== ENTRADA DE DADOS POR SCANNER ===");

    System.out.print("Digite seu nome: ");
    String nome = scanner.next();
    
    System.out.print("Digite seu sobrenome: ");
    String sobrenome = scanner.next();
    
    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();
    
    System.out.print("Digite sua altura: ");
    double altura = scanner.nextDouble();


    System.out.println("--- SEUS DADOS ---");
    System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos");
    System.out.println("Minha altura é " + altura + " m");
  }
}
