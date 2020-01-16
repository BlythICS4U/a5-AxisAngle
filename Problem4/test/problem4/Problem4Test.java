/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author bachle
 */
public class Problem4Test {

    private static int[] testArray1;
    private static int[] sortedTestArray1;

    private static int[] testArray2;
    private static int[] sortedTestArray2;

    private static int[] testArray3;
    private static int[] sortedTestArray3;

    private static int[] testArray4;
    private static int[] sortedTestArray4;
    
    private static int[] testArray5;
    private static int[] sortedTestArray5;

    public Problem4Test() {
    }

    @BeforeClass
    public static void setUpClass() {
        testArray1 = new int[]{31, 45, 80, 60, 95, 23, 35, 75, 66, 6, 72};
        sortedTestArray1 = new int[]{6, 23, 31, 35, 45, 60, 66, 72, 75, 80, 95};

        testArray2 = new int[]{9, 1, 8, 2, 7, 4, 10, 4, 6, 2};
        sortedTestArray2 = new int[]{1, 2, 2, 4, 4, 6, 7, 8, 9, 10};

        testArray3 = new int[]{4, 2};
        sortedTestArray3 = new int[]{2, 4};

        testArray4 = new int[]{1};
        sortedTestArray4 = new int[]{1};
        
        testArray5 = new int[10];
        sortedTestArray5 = new int[10];
    }

    /**
     * Test of sortArray method, of class Problem4.
     */
    @Test
    public void sortArrayTest() {
        Assert.assertArrayEquals(Problem4.sortArray(testArray1), sortedTestArray1);

        Assert.assertArrayEquals(Problem4.sortArray(testArray2), sortedTestArray2);

        Assert.assertArrayEquals(Problem4.sortArray(testArray3), sortedTestArray3);

        Assert.assertArrayEquals(Problem4.sortArray(testArray4), sortedTestArray4);
        
        Assert.assertArrayEquals(Problem4.sortArray(testArray5), sortedTestArray5);
    }
}
