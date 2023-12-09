public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator(1, 2, '+');
        double result = calculator.calculate();
        assertEquals(3, result, 0);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator(1, 2, '-');
        double result = calculator.calculate();
        assertEquals(-1, result, 0);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator(1, 2, '*');
        double result = calculator.calculate();
        assertEquals(2, result, 0);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator(1, 2, '/');
        double result = calculator.calculate();
        assertEquals(0.5, result, 0);
    }

    @Test
    public void testInvalidOperator() {
        Calculator calculator = new Calculator(1, 2, '!');
        double result = calculator.calculate();
        assertTrue(Double.isNaN(result));
    }
}
