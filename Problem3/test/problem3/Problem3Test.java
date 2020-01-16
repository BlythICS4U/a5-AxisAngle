/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author bachle
 */
public class Problem3Test {

    private static Person[] people1;
    private static Person[] people1Sorted;

    private static Person[] people2;
    private static Person[] people2Sorted;

    private static Person[] people3;
    private static Person[] people3Sorted;

    private static Person[] people4;
    private static Person[] people4Sorted;

    public Problem3Test() {
    }

    @BeforeClass
    public static void setUpClass() {
        people1 = new Person[6];
        people1[0] = new Person("6", "A", 0);
        people1[1] = new Person("5", "B", 1);
        people1[2] = new Person("3", "C", 2);
        people1[3] = new Person("1", "D", 3);
        people1[4] = new Person("4", "E", 4);
        people1[5] = new Person("2", "F", 5);

        people1Sorted = new Person[6];
        people1Sorted[0] = new Person("1", "D", 3);
        people1Sorted[1] = new Person("2", "F", 5);
        people1Sorted[2] = new Person("3", "C", 2);
        people1Sorted[3] = new Person("4", "E", 4);
        people1Sorted[4] = new Person("5", "B", 1);
        people1Sorted[5] = new Person("6", "A", 0);

        people2 = new Person[10];
        people2[0] = new Person("99", "A", 0);
        people2[1] = new Person("81", "B", 1);
        people2[2] = new Person("76", "C", 2);
        people2[3] = new Person("19", "D", 3);
        people2[4] = new Person("98", "E", 4);
        people2[5] = new Person("34", "F", 5);
        people2[6] = new Person("74", "A", 0);
        people2[7] = new Person("100", "B", 1);
        people2[8] = new Person("20", "C", 2);
        people2[9] = new Person("61", "D", 3);

        people2Sorted = new Person[10];
        people2Sorted[0] = new Person("19", "D", 3);
        people2Sorted[1] = new Person("20", "C", 2);
        people2Sorted[2] = new Person("34", "F", 5);
        people2Sorted[3] = new Person("61", "D", 3);
        people2Sorted[4] = new Person("74", "A", 0);
        people2Sorted[5] = new Person("76", "C", 2);
        people2Sorted[6] = new Person("81", "B", 1);
        people2Sorted[7] = new Person("98", "E", 4);
        people2Sorted[8] = new Person("99", "A", 0);
        people2Sorted[9] = new Person("100", "B", 1);

        people3 = new Person[1];
        people3[0] = new Person("69", "bruh", 1337);

        people3Sorted = new Person[1];
        people3Sorted[0] = new Person("69", "bruh", 1337);

        people4 = new Person[4];
        people4[0] = new Person("69", "A", 0);
        people4[1] = new Person("69", "B", 1);
        people4[2] = new Person("69", "C", 2);
        people4[3] = new Person("69", "D", 3);

        people4Sorted = new Person[4];
        people4Sorted[0] = new Person("69", "A", 0);
        people4Sorted[1] = new Person("69", "B", 1);
        people4Sorted[2] = new Person("69", "C", 2);
        people4Sorted[3] = new Person("69", "D", 3);
    }

    /**
     * Test of insertionSort method, of class Problem3.
     */
    @Test
    public void insertionSortTest() {

        Person[] sorted1 = Problem3.insertionSort(people1);
        Person[] sorted2 = Problem3.insertionSort(people2);
        Person[] sorted3 = Problem3.insertionSort(people3);
        Person[] sorted4 = Problem3.insertionSort(people4);

        for (int i = 0; i < sorted1.length; i++) {
            comparePeople(people1Sorted[i] , sorted1[i]);
        }

        for (int i = 0; i < sorted2.length; i++) {
           comparePeople(people2Sorted[i] , sorted2[i]);
        }

         comparePeople(people3Sorted[0] , sorted3[0]);

        for(int i = 0; i < sorted4.length; i++)
        {
            comparePeople(people4Sorted[i],sorted4[i]);
        }
    }
    
    /**
     * Tests if 2 objects are the same
     * @param p1
     * @param p2 
     */
    private void comparePeople(Person p1, Person p2){
            assertEquals(p1.getId(), p2.getId());
            assertEquals(p1.getName(), p2.getName());
            assertEquals(p1.getAge(), p2.getAge());

    }

    /**
     * Test of compareTo method of class Person
     */
    @Test
    public void compareToTest() {
        Person thing1 = new Person("69", "Thing1", 1);
        Person thing2 = new Person("1337", "Thing2", 2);
        Person thing3 = new Person("69", "Thing3", 3);

        assertEquals(thing2.compareTo(thing1), 1268);
        assertEquals(thing1.compareTo(thing2), -1268);
        assertEquals(thing1.compareTo(thing3), 0);
    }
}
