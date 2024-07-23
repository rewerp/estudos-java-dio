import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import one.digitalinnovation.Main;

public class MainTest {
  
  @Test
  void validarMain() {
    assertEquals(Main.helloWorld(), "Hello, world!");

    assertTrue(true);
  }

}
