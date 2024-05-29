import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

    System.out.println("=== Aplicação Conta Bancária ===");
    System.out.println();

    System.out.println("** Por favor, insira os dados abaixo **");
    System.out.println();

    System.out.print("> Numero da Agência: ");
    int numeroAgencia = scanner.nextInt();

    System.out.print("> Numero da Conta com dígito: ");
    String numeroConta = scanner.next();

    System.out.print("> Saldo inicial: ");
    String saldoInicial = formatoMoeda.format(scanner.nextDouble());

    System.out.print("> Nome do cliente: ");
    String nomeCliente = scanner.next();

    System.out.println();
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
                       ", conta " + numeroConta + " e seu saldo inicial de " + saldoInicial + " já está disponível para saque");
  }
}
