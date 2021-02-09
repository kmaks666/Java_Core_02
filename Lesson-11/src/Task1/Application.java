package Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		Integer[] array = new Integer[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = randomValues(0, 100);
		}
		System.out.println("Original array = " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Array is sorted ascending = " + Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array is sorted descending = " + Arrays.toString(array));

	}

	public static int randomValues(int min, int max) {
		Random value = new Random();
		return value.nextInt(max - min + 1) + min;
	}

}
