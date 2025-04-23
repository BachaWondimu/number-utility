package bacha.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberUtilTest {
    NumberUtil util =  new NumberUtil();
    @Test
    public void testPower() {
        assertEquals(8, util.power(2, 3));
        assertEquals(1, util.power(5, 0));
    }

    @Test
    public void testSumOfDigits() {
        assertEquals(6, util.sumOfDigits(123));
        assertEquals(15, util.sumOfDigits(555));
    }

    @Test
    public void testLCM() {
        assertEquals(12, util.lcm(3, 4));
        assertEquals(60, util.lcm(12, 15));
    }

    @Test
    public void testCountFactors() {
        assertEquals(6, util.countFactors(28)); // 1, 2, 4, 7, 14, 28
        assertEquals(3, util.countFactors(9));  // 1, 3, 9
    }

}
