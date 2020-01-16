/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author bachle
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] words = readFile("wordList.txt");

        binarySearch(words, "zoo");
        System.out.println(words[99889]);

    }

    /**
     * Reads text file
     *
     * @param fileName
     * @return String array
     */
    public static String[] readFile(String fileName) {
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(fileName));

            ArrayList<String> words = new ArrayList<String>();
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                words.add(contentLine);
            }
            return words.toArray(new String[words.size()]);

        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
                ioe.printStackTrace(System.out);
            }
        }
        return null;
    }

    /**
     * Gets the indexes of each character
     *
     * @param arrayInput
     * @return Indexes of all characters
     */
    public static int[] getIndexOfLetters(String[] arrayInput) {
        int[] array = new int[26];
        Arrays.fill(array, -1);
        char temp = ' ';
        for (int i = 0; i < arrayInput.length; i++) {
            if (temp != arrayInput[i].charAt(0)) {
                temp = arrayInput[i].charAt(0);
                int index = getCharIndex(temp);
                array[index] = i;
            }
        }

        return array;
    }

    /**
     * Finds desired word
     *
     * @param array
     * @param word
     * @return the index of the word and -1 if word not found
     */
    public static int binarySearch(String[] array, String word) {
        int[] index = getIndexOfLetters(array);
        int high = array.length - 1;
        char letter = word.charAt(0);
        int lowIndex=getCharIndex(letter);
        int low = index[lowIndex];

        if (low == -1) {
            System.out.println(word + " does not exist in array");
            return -1;
        }

         for (int i = lowIndex+1; i < 26; i++) {
                if (index[i] != -1) {
                    high = index[i]-1;
                    break;
                }
           }
        
        while (low <= high) {
            int middle = (int) Math.floor((high + low) / 2);
            if (word.compareTo(array[middle]) > 0) {
                low = middle + 1;
            } else if (word.compareTo(array[middle]) < 0) {
                high = middle - 1;
            } else {
                System.out.println("The word " + word + " has been found at index " + middle);
                return middle;
            }
        }
        System.out.println(word + " does not exist in array");
        return -1;
    }

    public static int getCharIndex(char letter) {
        return letter - 97;
    }
}
