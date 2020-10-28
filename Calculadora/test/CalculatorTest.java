package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.Calculator;

public class CalculatorTest {
    @Test
    public void addTest() {
        Calculator calculator = new Calculator();

        calculator.setOperand1(3);
        calculator.setOperand2(9);
        double d = calculator.add();

        assertEquals(12, d, 0.0001);
    }
    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();

        calculator.setOperand1(1);
        calculator.setOperand2(0);
        double d = calculator.divide();

        assertEquals(0.0, d, 0.0001);
    }
}
