import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        int result = new Calculator().sum(3, 4);
        assertEquals(7, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivision() {
        int result = new Calculator().division(4, 0);
        assertEquals(5, result);
    }
}
