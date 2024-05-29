package asj.sintaxe.operadores;

public class Operadores {
  public static void main (String[] args) {
    // operadoresAtribuicao();

    // operadoresAritimeticos();

    // operadoresConcatenacao();

    // operadoresUnarios();

    // System.out.println(operadorTernario());

    // operadoresRelacionais();

    operadoresLogicos();
  }

  public static void operadoresAtribuicao() {
    /* Operador de atribuição "=" */
    int idade = 22;
    String nome = "Rewer Pinheiro";
    boolean retornarDados = true;

    if (retornarDados) {
      System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
  }

  public static void operadoresAritimeticos() {
    /* Operadores aritiméticos ( + , - , / , *) */
    double resultado = (10 * 7) - (75 / 100) + 9;

    System.out.println(resultado);
  }

  public static void operadoresConcatenacao() {
    /* Operador de concatenação ( + ) */

    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1";

    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1";

    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1);

    System.out.println(concatenacao);
  }

  public static void operadoresUnarios() {
    int numero = 5;
    System.out.println(- numero);

    numero = - numero;
    System.out.println(numero);

    numero = numero * -1;
    System.out.println(numero);

    /* Operador de incremento e decremento */
    numero = 5;

    System.out.println(numero++);

    System.out.println(numero);

    System.out.println(++numero);

    System.out.println(numero--);

    System.out.println(--numero);
  }

  public static String operadorTernario() {
    int a, b;

    a = 6;
    b = 6;

    // if (a == b) {
    //   return "verdadeiro";
    // }
    // else {
    //   return "falso";
    // }

    return (a == b) ? "Verdadeiro" : "Falso";
  }

  public static void operadoresRelacionais() {
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;
    System.out.println("numero1 é igual a numero2? : " + simNao);

    simNao = numero1 != numero2;
    System.out.println("numero1 é diferente de numero2? : " + simNao);

    simNao = numero1 < numero2;
    System.out.println("numero1 é menor que numero2? : " + simNao);

    simNao = numero1 <= numero2;
    System.out.println("numero1 é menor ou igual que numero2? : " + simNao);

    simNao = numero1 > numero2;
    System.out.println("numero1 é maior que numero2? : " + simNao);

    simNao = numero1 >= numero2;
    System.out.println("numero1 é maior ou igual que numero2? : " + simNao);


    /* Comparador de objetos/conteudos */

    String nome1 = "Rewer";
    String nome2 = new String("Rewer");

    System.out.print("Comparando objetos: ");
    System.out.println(nome1 == nome2);
    System.out.print("Comparando conteudos: ");
    System.out.println(nome1.equals(nome2));
  }

  public static void operadoresLogicos() {
    boolean condicao1 = true;
    boolean condicao2 = false;

    String verdadeiroFalso = (condicao1 && condicao2) ? "Verdadeiro" : "Falso";
    System.out.println(verdadeiroFalso);

    verdadeiroFalso = (condicao1 || condicao2) ? "Verdadeiro" : "Falso";
    System.out.println(verdadeiroFalso);
  }
}
