package wsb.po.banking.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = null;
    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount(100);
    }

    @Test
    void deposit() {
        assertEquals(100,bankAccount.getBalance());
        //wołamy deposit 20
        try {
            bankAccount.deposit(20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertEquals(120,bankAccount.getBalance());

        assertThrows(NegativeDepositException.class,() -> bankAccount.deposit(-200));
    }

    @Test
    void withdraw() {
        //TODO
    }

    @Test
    void getBalance() {
        assertEquals(100,bankAccount.getBalance());
    }
}