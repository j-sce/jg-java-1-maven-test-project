package student_julija_scerbicka.lesson_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    public void sumTest() {
        int result = calc.sum(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void diffTest() {
        int result = calc.difference(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void multiplyTest() {
        int result = calc.product(10, 5);
        assertEquals(50, result);
    }

    @Test
    public void divisionTest() {
        int result = calc.ratio(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void evenTest() {
        boolean result = calc.isEven(10);
        assertTrue(result);
    }

    @Test
    public void oddTest() {
        boolean result = calc.isEven(7);
        assertFalse(result);
    }

    @Test
    public void maxOfTwoNumbersTest() {
        int result = calc.maxOfTwoNumbers(-8, 7);
        assertEquals(7, result);
    }

    @Test
    public void maxOfThreeNumbersTest() {
        int result = calc.maxOfThreeNumbers(-8, 7, 0);
        assertEquals(7, result);
    }

}