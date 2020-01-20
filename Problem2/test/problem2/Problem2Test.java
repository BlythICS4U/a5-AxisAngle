/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bachle
 */
public class Problem2Test {

    public Problem2Test() {
    }

    /**
     * Test of divisibleByBy3 method, of class Problem2.
     */
    @Test
    public void divisibleBy3Test() {
        assertTrue(Problem2.divisibleBy3(3));
        assertTrue(Problem2.divisibleBy3(6));
        assertTrue(Problem2.divisibleBy3(9));
        assertTrue(Problem2.divisibleBy3(69));
        
        assertFalse(Problem2.divisibleBy3(5));
        assertFalse(Problem2.divisibleBy3(7));
        assertFalse(Problem2.divisibleBy3(13));
        assertFalse(Problem2.divisibleBy3(113));
    }

    /**
     * Test of sumDigits method, of class Problem2.
     */
    @Test
    public void sumDigitsTest() {
        assertEquals(Problem2.sumDigits(1235), 11);
        assertEquals(Problem2.sumDigits(0), 0);
        assertEquals(Problem2.sumDigits(3), 3);
        assertEquals(Problem2.sumDigits(10), 1);

    }

}
