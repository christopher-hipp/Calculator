import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // addition tests
    @Test
    public void additionTestPositiveValues() {
        Calculator calculator = new Calculator();
        calculator.addition(5, 10);
        assertEquals(15, calculator.addition(5, 10));
    }

    @Test
    public void additionTestNegativeValues() {
        Calculator calculator = new Calculator();
        calculator.addition(-5, -10);
        assertEquals(-15, calculator.addition(-5, -10));
    }

    @Test
    public void additionTestDoubleValues() {
        Calculator calculator = new Calculator();
        calculator.addition(5.34, 10.69);
        assertEquals(16.03, calculator.addition(5.34, 10.69));
    }

    // subtraction tests
    @Test
    public void subtractionTestPositiveValues() {
        Calculator calculator = new Calculator();
        calculator.subtraction(10, 5);
        assertEquals(5, calculator.subtraction(10, 5));
    }

    @Test
    public void subtractionTestNegativeValues() {
        Calculator calculator = new Calculator();
        calculator.subtraction(-10, -5);
        assertEquals(-5, calculator.subtraction(-10, -5));
    }

    @Test
    public void subtractionTestDoubleValues() {
        Calculator calculator = new Calculator();
        calculator.subtraction(5.34, 10.69);
        assertEquals(-5.35, calculator.subtraction(5.34, 10.69));
    }

    // multiplication tests
    @Test
    public void multiplicationTestPositiveValues() {
        Calculator calculator = new Calculator();
        calculator.multiplication(5, 10);
        assertEquals(50, calculator.multiplication(5, 10));
    }

    @Test
    public void multiplicationTestNegativeValues() {
        Calculator calculator = new Calculator();
        calculator.multiplication(-5, -10);
        assertEquals(50, calculator.multiplication(-5, -10));
    }

    @Test
    public void multiplicationTestDoubleValues() {
        Calculator calculator = new Calculator();
        calculator.multiplication(5.3, 10.6);
        assertEquals(56.18, calculator.multiplication(5.3, 10.6));
    }

    // division tests
    @Test
    public void divisionTestPositiveValues() {
        Calculator calculator = new Calculator();
        calculator.division(5, 10);
        assertEquals(0.5, calculator.division(5, 10));
    }

    @Test
    public void divisionTestNegativeValues() {
        Calculator calculator = new Calculator();
        calculator.division(-10, -5);
        assertEquals(2, calculator.division(-10, -5));
    }

    @Test
    public void divisionTestDoubleValues() {
        Calculator calculator = new Calculator();
        calculator.division(10.6, 5.3);
        assertEquals(2, calculator.division(10.6, 5.3));
    }
}
