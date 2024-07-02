import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    boolean continuar = true;
    int opcao = 0;

    while (continuar) {
      
      try {
        opcao = scanner.nextInt();
      }
      catch (Exception e) {
        System.out.println("Erro: Valor inválido.");
        break;
      };
        
        switch (opcao) {
            case 1:
                // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                
                try {
                  double valorDeposito = scanner.nextDouble();
                
                  saldo += valorDeposito;
                  System.out.printf("Saldo atual: %.1f", saldo);
                  System.out.println();
                }
                catch (Exception e) {
                  System.out.println("Erro: Valor inválido.");
                  continuar = false;
                };

                break;
            case 2:
                // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                
                try {
                  double valorSaque = scanner.nextDouble();

                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                  valorSaque = double // br.readLine().;
              
                  if (valorSaque > saldo) {
                    System.out.println("Saldo insuficiente.");
                  }
                  else {
                    saldo -= valorSaque;
                    System.out.printf("Saldo atual: %.1f", saldo);  
                    System.out.println();
                  }
                }
                catch (Exception e) {
                  System.out.println("Erro: Valor inválido.");
                  continuar = false;
                };

                break;
            case 3:
                // TODO: Exibir o saldo atual da conta.
                
                System.out.printf("Saldo atual: %.1f", saldo);
                System.out.println();
                
                break;
            case 4:
                System.out.println("Programa encerrado.");
                continuar = false;  // Atualiza a variável de controle para encerrar o loop
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    
    scanner.close();
  }
}
