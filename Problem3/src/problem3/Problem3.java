/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

/**
 *
 * @author bachle
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person[] people = new Person[6];
        people[0] = new Person("6", "A", 0);
        people[1] = new Person("5", "B", 1);
        people[2] = new Person("3", "C", 2);
        people[3] = new Person("1", "D", 3);
        people[4] = new Person("4", "E", 4);
        people[5] = new Person("2", "F", 5);
        people = insertionSort(people);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getId() + " " + people[i].getName() + " " + people[i].getAge());
        }
    }

    /**
     * Sorts person array by id using insertion sort algorithm from least to greatest
     *
     * @param array
     * @return sorted array
     */
    public static Person[] insertionSort(Person[] array) {
        for (int i = 0; i < array.length; i++) {
            Person valueToSort = array[i];
            int j = i;
            while (j > 0 &&   array[j - 1].compareTo(valueToSort) > 0) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = valueToSort;
        }
        return array;
    }
}
