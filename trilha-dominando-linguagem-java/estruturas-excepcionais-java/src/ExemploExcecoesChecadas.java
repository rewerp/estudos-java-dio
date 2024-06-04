import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecoesChecadas {
  public static void main(String[] args) {
    
    Number valor;

    try {
      
      valor = NumberFormat.getInstance().parse("a1,75");
      System.out.println(valor);

    } catch (ParseException e) {
      
      e.printStackTrace();
      System.out.println("ATENÇÃO! Valor do texto é inválido para conversão para número.");

    }

  }
}
