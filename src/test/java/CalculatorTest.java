import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        int result = new Calculator().sum(3, 4);
        Assert.assertEquals(7, result);
    }
}
