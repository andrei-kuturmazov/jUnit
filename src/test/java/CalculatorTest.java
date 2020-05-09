import lombok.AllArgsConstructor;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@AllArgsConstructor
@RunWith(Parameterized.class)
public class CalculatorTest {

    int first, second, expected;

    @Parameterized.Parameters
    public static Collection numbers() {
        return Arrays.asList(new Object [][] {{1, 2, 3}, {2, 9, 11}, {3, 7, 4}});
    }

    @Test(timeout = 1000)
    public void testSum() {
        int result = new Calculator().sum(first, second);
        assertEquals(expected, result);
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void testDivision() {
        int result = new Calculator().division(first, second);
        assertEquals(expected, result);
    }
}
