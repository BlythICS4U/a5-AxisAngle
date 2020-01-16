/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author bachle
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    /**
     * Checks if divisible by 3
     *
     * @param num
     * @return true if divisible by 3 and false if not
     */
    public static boolean divisibleBy3(int num) {

        if (num < 10) {
            if (num == 3 || num == 6 || num == 9) {
                return true;
            } else {
                return false;
            }
        }
        return divisibleBy3(sumDigits(num));
    }

    /**
     * Sums up all the digits
     *
     * @param num
     * @return sum of digits
     */
    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
