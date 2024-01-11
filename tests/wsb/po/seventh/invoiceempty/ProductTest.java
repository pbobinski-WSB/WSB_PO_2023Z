package wsb.po.seventh.invoiceempty;

import org.junit.jupiter.api.Test;
import wsb.po.w07.invoiceempty.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductTest {

    @Test
    void testConstructor(){
        ArithmeticException  ae = assertThrows(ArithmeticException.class,() -> new Product("a",-2));
        assertEquals("Price cannot be negative",ae.getMessage());
    }

}