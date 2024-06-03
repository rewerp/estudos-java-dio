import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
  public static void main(String[] args) {

    double mesada = 50;
    double valorDoce = 0;

    while (mesada > 0) {
      valorDoce = valorAleatorio();

      if (valorDoce > mesada)
        valorDoce = mesada;

      mesada = mesada - valorDoce;

      System.out.println("Doce no valor R$ " + valorDoce + " adicionado no carrinho.");
      System.out.println("Saldo mesada: R$ " + mesada);
      System.out.println("------------------------------------");

    }

    System.out.println("Joãozinho gastou toda sua mesada!");

  }

  public static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(6, 22);
  }

}
