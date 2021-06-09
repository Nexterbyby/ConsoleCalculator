package ch.bbw.je;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 * @author Nexterbyby
 * @version 0.0.1 26.05.2021
 * @since 0.0.1 26.05.2021
 */
public class CalculatorTest {
    Calculator c;

    @Before
    public void initialize(){
        c = new Calculator();
    }

    @Test
    public void testSimpleAddition(){
        assertEquals(c.summe(1, 4), 5);
        assertEquals(c.summe(-3, 4), 1);
        assertEquals(c.summe(36, -33), 3);
        assertEquals(c.summe(-11, -5), -16);
    }

    @Test
    public void testMAXINTAdditionExceptions(){
        assertThrows(Exception.class, () -> c.summe(Integer.MAX_VALUE, 1), "MAX_INT plus an int is outside of range");
        assertThrows(Exception.class, () -> c.summe(Integer.MAX_VALUE, Integer.MAX_VALUE), "MAX_INT plus MAX_INT is outside of range");
    }

    @Test
    public void testAdditionOfAdditions(){
        assertEquals(c.summe(c.summe(12, 2), c.summe(23, 1)), 38);
        assertEquals(c.summe(c.summe(1, 1), c.summe(1, 1)), 4);
    }

    @Test
    public void testSimpleSubtraction(){
        assertEquals(c.subtraction(2,6), -4);
        assertEquals(c.subtraction(5,3),  2);
        assertEquals(c.subtraction(-3,3), -6);
        assertEquals(c.subtraction(-45,-45), 0);
    }

    @Test
    public void testMAXINTSubtraction(){
        assertEquals(c.subtraction(Integer.MAX_VALUE, Integer.MAX_VALUE), 0);
        assertEquals(c.subtraction(-1, Integer.MAX_VALUE), Integer.MIN_VALUE);
    }

    @Test
    public void testMININTSubtractionException(){
        assertThrows(Exception.class, () -> c.subtraction(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testSubtractionOfSubtraction(){
        assertEquals(c.subtraction(c.subtraction(-2,-2), c.subtraction(2,3)), 1);
    }

}
