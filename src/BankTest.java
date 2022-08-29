import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank = new Bank();
    Konto konto = new Konto("Fille");


    @Test
    void create() {
        assertTrue(true, konto.getName());
        assertTrue(false, konto.getName());
    }
}