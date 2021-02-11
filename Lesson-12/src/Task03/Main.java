package Task03;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList();
		for (int i = 0; i < randomValues(0, 20); i++) {
			myList.add(i, i);
		}
		System.out.println("Original array= " + myList);
		myList.remove(randomValues(0, myList.size() - 1));
		System.out.println("Edited array= " + myList);
	}

	public static int randomValues(int min, int max) {
		Random value = new Random();
		return value.nextInt(max - min + 1) + min;
	}

}
