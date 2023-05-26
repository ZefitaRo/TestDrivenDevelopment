import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void additionTest() {
        Calculator calc = new Calculator();
        assertEquals(9.5, calc.addition(4.0, 5.5));
    }

}