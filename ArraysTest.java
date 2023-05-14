package cp213;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Arrays Lab task methods.
 */
public class ArraysTest {

    /**
     * Tests arrays.
     *
     * @param args unused default parameter
     */
    public static void main(final String[] args) {
	System.out.println("Task 1");
	System.out.println(ArraysTest.task1());
	System.out.println("Task 2");
	System.out.println(ArraysTest.task2());
	System.out.println("Task 3");
	System.out.println(ArraysTest.task3());
	System.out.println("Task 4");
	System.out.println(ArraysTest.task4());
	System.out.println("Task 5");
	System.out.println(Arrays.toString(ArraysTest.task5()));
    }

    /**
     * Print the contents of the arrays first and second using a standard for loop.
     *
     * @return true if second contains the same values as first, false otherwise
     */
    public static boolean task1() {
	final int[] first = { 1, 3, 5, 7, 9 };
	final int[] second = first;
	// since arrays are objects, the array called second will
	// simply point to the memory location of the array called first
	// therefore, if items in array "first" are changed, then the items in
	// "second"will also be changed

	// declare variable to keep track of whether or not arrays are equivalent
	boolean match = true;

	System.out.println("Values in first:");

	for (int i = 0; i < first.length; i++) {
	    System.out.println(first[i]);
	}

	// printing second array values
	System.out.println("Values in second:");

	for (int i = 0; i < second.length; i++) {

	    // compare to make sure values are equal
	    if (first[i] != second[i]) {
		match = false;
	    }

	    System.out.println(second[i]);
	}

	return match;
    }

    /**
     * Double the contents of the array first with a standard for loop.
     *
     * @return true if second contains the same values as first, false otherwise
     */
    public static boolean task2() {
	final int[] first = { 1, 3, 5, 7, 9 };
	final int[] second = first;

	// doubling the contents of first which will also change contents of second
	// since the declaration of the array "second"is a pass by reference of the
	// array "first"
	for (int i = 0; i < first.length; i++) {
	    first[i] = first[i] * 2;
	} // end of for loop

	// declare variable to keep track of whether or not arrays are equivalent
	boolean match = true;

	System.out.println("Values in first:");

	for (int i = 0; i < first.length; i++) {
	    System.out.println(first[i]);
	}

	// printing second array values
	System.out.println("Values in second:");

	for (int i = 0; i < second.length; i++) {

	    // compare to make sure values are equal
	    if (first[i] != second[i]) {
		match = false;
	    }

	    System.out.println(second[i]);
	}

	return match;
    }

    /**
     * Double the contents of the array first with an enhanced for loop.
     *
     * @return true if the values in first are permanently changed, false otherwise
     */
    public static boolean task3() {
	final int[] first = { 1, 3, 5, 7, 9 };

	boolean match = true;
	int x = 0;

	System.out.println("What values from enhanced for loop have been changed to:");
	// enhanced for loop uses pass by value, not pass by reference
	// therefore, by changing i, this does not change the value in the array
	// therefore, this process does not permanently change contents in first array
	for (int i : first) {
	    i = i * 2;
	    System.out.println(i);

	    // compare value we are changing with what is in first array to see if the
	    // values in the original array have changed
	    if (i != first[x]) {
		match = false;
	    }
	    x++;
	}

	System.out.println();

	System.out.println("Seeing if values in original array are the same:");
	// check to see if contents in the array first were updated
	for (int i : first) {
	    System.out.println(i);
	}

	return match;

	// return true; - or - return false;
    }

    /**
     * Attempt to assign the array first to a row of the 2D array third.
     *
     * @return true if this is allowed, false otherwise
     */
    public static boolean task4() {
	final int[] first = { 1, 3, 5, 7, 9 };
	final int[][] third = new int[1][first.length]; // assign number of rows and columns

	boolean match = true;
	// assign the first row of 2D array "third" to have the same variables that are
	// in the array "first"
	third[0] = first;

	// verify that the contents in the first row of "third"are equal to the contents
	// in the array "first"
	for (int i = 0; i < first.length; i++) {
	    // printing the values to see what's going on
	    System.out.println("third[0][" + i + "]: " + third[0][i] + "        first[" + i + "]: " + first[i]);
	    // compare each one to make sure they match
	    if (third[0][i] != first[i]) {
		match = false;
	    }
	}

	// conclusion: therefore, third[0] = first; is valid syntax and we don't have to
	// assign values one at a time

	return match;
    }

    /**
     * Assign the values 1 through 10 to an Integer ArrayList.
     *
     * @return the contents of the ArrayList as an Integer[] array.
     */
    public static Integer[] task5() {
	final ArrayList<Integer> values = new ArrayList<>();
	// add values to original arrayList
	for (int i = 0; i < 10; i++) {
	    values.add(i);
	}

	// create an array of integers and declare its length/size
	// note: size() is used for list arrays while length is used for arrays
	Integer[] valuesArray = new Integer[values.size()];
	// convert the array of objects (arrayList) to a regular array of integers using
	// toArray() method.
	// you are calling the toArray method using object array values and sending the
	// array you want to save your integer values to which is valuesArray
	valuesArray = values.toArray(valuesArray);

	return valuesArray;

    }
}
