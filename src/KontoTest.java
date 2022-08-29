import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

   Konto konto = new Konto("Maja");
   Konto konto1 = new Konto("Naja", 100);

   @Test
   void deposit() {

      assertEquals(100, konto.deposit(100));
      assertEquals(200, konto.deposit(100));
      assertEquals(200, konto.deposit(-100));
   }

   @Test
   void withdraw() {
      assertEquals(100, konto1.withdraw(-100));
      assertEquals(100, konto1.withdraw(1000));
      assertEquals(0, konto1.withdraw(100));

   }
}