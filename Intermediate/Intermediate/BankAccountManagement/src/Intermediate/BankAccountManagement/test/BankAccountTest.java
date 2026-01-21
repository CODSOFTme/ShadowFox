import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void depositTest() {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void withdrawTest() {
        BankAccount account = new BankAccount(1000);
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    void insufficientBalanceTest() {
        BankAccount account = new BankAccount(500);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1000);
        });
    }

    @Test
    void negativeDepositTest() {
        BankAccount account = new BankAccount(500);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-200);
        });
    }
}
