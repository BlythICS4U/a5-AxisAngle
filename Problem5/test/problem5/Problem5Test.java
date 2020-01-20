/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author bachle
 */
public class Problem5Test {

    private static String[] words1;
    private static int[] words1Index;

    private static String[] words2;
    private static int[] words2Index;

    private static String[] words3;
    private static int[] words3Index;

    private static String[] words4;
    private static int[] words4Index;

    private static String[] words5;
    private static int[] words5Index;

    public Problem5Test() {
    }

    @BeforeClass
    public static void setUpClass() {
        words1 = new String[]{"alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf",
            "hotel", "india", "juliet", "kilo", "lima", "mike", "november",
            "oscar", "papa", "quebec", "romeo", "sierra", "tango", "uniform",
            "victor", "vietcong", "whiskey", "xray", "yankee", "zulu","zzz"};
        words1Index = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 25, 26};
        
        words2 = new String[]{"charlie", "delta", "echo", "foxtrot", "golf",
            "hotel", "india", "juliet", "kilo", "lima", "mike", "november",
            "oscar", "papa", "quebec", "romeo", "sierra", "tango", "uniform",
            "victor", "vietcong", "whiskey"};
        words2Index = new int[]{-1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, -1, -1, -1};

        words3 = new String[]{"charlie", "delta", "echo", "foxtrot", "golf",
            "hotel", "india", "juliet", "kilo", "lima", "mike", "november",
            "oscar", "papa", "sierra", "tango", "uniform",
            "victor", "vietcong", "xray", "yankee", "zulu"};
          words3Index = new int[]{-1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, -1, -1, 14, 15, 16, 17, -1, 19, 20, 21};
        
        words4 = new String[]{"charlie", "victor", "zulu"};
        words4Index = new int[]{-1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, 2};

        words5 = new String[]{"bruh"};
        words5Index = new int[]{-1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, };
        System.out.println(words5Index.length);
    }

    
        /**
     * Test of getCharIndex method, of class Problem5.
     */
    @Test
    public void getCharIndexTest() {
        int i = 0;
        for (char letter = 'a'; letter < 'z'; letter++) {
            assertEquals(Problem5.getCharIndex(letter), i);
            i++;
        }
    }

        /**
     * Test of getIndexOfLetters method, of class Problem5.
     */
    @Test
    public void getIndexOfLettersTest() {
        Assert.assertArrayEquals(Problem5.getIndexOfLetters(words1),words1Index);
        Assert.assertArrayEquals(Problem5.getIndexOfLetters(words2),words2Index);
        Assert.assertArrayEquals(Problem5.getIndexOfLetters(words3),words3Index);
        Assert.assertArrayEquals(Problem5.getIndexOfLetters(words4),words4Index);
        Assert.assertArrayEquals(Problem5.getIndexOfLetters(words5),words5Index);
    }

        /**
     * Test of binarySearch method, of class Problem5.
     */
    @Test
    public void binarySearchTest() {
        assertEquals(Problem5.binarySearch(words1, "alfa"), 0);
        assertEquals(Problem5.binarySearch(words1, "bravo"), 1);
        assertEquals(Problem5.binarySearch(words1, "charlie"), 2);
        assertEquals(Problem5.binarySearch(words1, "delta"), 3);
        assertEquals(Problem5.binarySearch(words1, "echo"), 4);
        assertEquals(Problem5.binarySearch(words1, "foxtrot"), 5);
        assertEquals(Problem5.binarySearch(words1, "golf"), 6);
        assertEquals(Problem5.binarySearch(words1, "hotel"), 7);
        assertEquals(Problem5.binarySearch(words1, "india"), 8);
        assertEquals(Problem5.binarySearch(words1, "juliet"), 9);
        assertEquals(Problem5.binarySearch(words1, "kilo"), 10);
        assertEquals(Problem5.binarySearch(words1, "lima"), 11);
        assertEquals(Problem5.binarySearch(words1, "mike"), 12);
        assertEquals(Problem5.binarySearch(words1, "november"), 13);
        assertEquals(Problem5.binarySearch(words1, "oscar"), 14);
        assertEquals(Problem5.binarySearch(words1, "papa"), 15);
        assertEquals(Problem5.binarySearch(words1, "quebec"), 16);
        assertEquals(Problem5.binarySearch(words1, "romeo"), 17);
        assertEquals(Problem5.binarySearch(words1, "sierra"), 18);
        assertEquals(Problem5.binarySearch(words1, "tango"), 19);
        assertEquals(Problem5.binarySearch(words1, "uniform"), 20);
        assertEquals(Problem5.binarySearch(words1, "victor"), 21);
        assertEquals(Problem5.binarySearch(words1, "whiskey"), 23);
        assertEquals(Problem5.binarySearch(words1, "xray"), 24);
        assertEquals(Problem5.binarySearch(words1, "yankee"), 25);
        assertEquals(Problem5.binarySearch(words1, "zulu"), 26);
        assertEquals(Problem5.binarySearch(words1, "zzz"), 27);
        
        assertEquals(Problem5.binarySearch(words1, "alter"), -1);
        assertEquals(Problem5.binarySearch(words1, "bruh"), -1);
        assertEquals(Problem5.binarySearch(words1, "asdsaq2"), -1);
        assertEquals(Problem5.binarySearch(words1, "bravoCharlieUniformHotel"), -1);
        assertEquals(Problem5.binarySearch(words1, "zul"), -1);

        assertEquals(Problem5.binarySearch(words2, "uniform"), 18);
        assertEquals(Problem5.binarySearch(words2, "vietcong"), 20);
        assertEquals(Problem5.binarySearch(words2, "whiskey"), 21);
        assertEquals(Problem5.binarySearch(words2, "charlie"), 0);

        assertEquals(Problem5.binarySearch(words3, "echo"), 2);
        assertEquals(Problem5.binarySearch(words3, "vietcong"), 18);
        assertEquals(Problem5.binarySearch(words3, "zulu"), 21);
        assertEquals(Problem5.binarySearch(words3, "charlie"), 0);

        assertEquals(Problem5.binarySearch(words3, "a"), -1);
        assertEquals(Problem5.binarySearch(words3, "asdijaijdaijda"), -1);
        assertEquals(Problem5.binarySearch(words3, "funny"), -1);
        assertEquals(Problem5.binarySearch(words3, "b"), -1);
        
        assertEquals(Problem5.binarySearch(words4, "victor"), 1);
        assertEquals(Problem5.binarySearch(words4, "charlie"), 0);

        assertEquals(Problem5.binarySearch(words5, "bruh"), 0);
    }

}
