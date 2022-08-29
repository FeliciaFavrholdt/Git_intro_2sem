import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

   Konto konto = new Konto("Maja");

   @Test
   void deposit() {

      assertEquals(100, konto.deposit(100));
      assertEquals(200, konto.deposit(100));
      assertEquals(200, konto.deposit(-100));
   }
}