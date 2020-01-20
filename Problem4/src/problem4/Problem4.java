/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

/**
 *
 * @author bachle
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] testArray = sortArray(new int[]{31, 45, 80, 60, 95, 23, 35, 75, 66, 6, 72});
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }

    /**
     * Wrapper for algorithm
     *
     * @param array
     * @return sorted array
     */
    public static int[] sortArray(int[] array) {
        return algorithm(array, array.length);
    }

    /**
     * RUNTIME COMPLEXITY IS: O(n^2)
     *
     * No such array would perform better using the described algorithm against
     * insertion sort.This is because the described algorithm will always have
     * the same number of iterations regardless of how the input array declared
     *
     * The worst scenario for insertion sort would have the same number of
     * iterations as the described algorithm. An example of the worst scenario
     * for insertion sort would be any array from greatest to least 
     * ex: [5, 4, 3, 2, 1].
     *
     * @param array
     * @param arrayLength
     * @return sorted array
     */
    public static int[] algorithm(int[] array, int arrayLength) {

        if (arrayLength <= 1) {
            return array;
        }

        int temp = array[arrayLength - 1];

        int maxValue = array[0];
        int maxValueIndex = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                maxValueIndex = i;
            }
        }
        array[arrayLength - 1] = maxValue;
        array[maxValueIndex] = temp;
        return algorithm(array, arrayLength - 1);
    }
}
