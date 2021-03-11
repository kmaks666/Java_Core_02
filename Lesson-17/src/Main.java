import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int min = -100;
		int max = 100;
		int size = 13;
		Integer[] array = new Integer[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = genNum(min, max);
		}
		System.out.println("<------------------  Original Array  ------------------>");
		System.out.println(Arrays.toString(array));
		System.out.println();

		//		First task
		System.out.println("First:");
		Collection collection = new Collection(array);
		Iterator iteratorFirst = collection.createFirst();
		while (iteratorFirst.hasNext()) {
			System.out.print(iteratorFirst.next() + "  ");
		}

		
		//		Second Task
		System.out.println();
		System.out.println("Second:");
		Iterator iteratorSecond = collection.createSecond();
		while (iteratorSecond.hasNext()) {
			System.out.print(iteratorSecond.next() + "  ");
		}

		//		Third Task
		System.out.println();
		System.out.println("Third:");
		Iterator iteratorThird = collection.createThird();
		while (iteratorThird.hasNext()) {
			System.out.print(iteratorThird.next() + "  ");
		}
		
		//		Fourth Task
		System.out.println();
		System.out.println("Fourth:");
		Iterator iteratorFourth= collection.createFourth();
		while (iteratorFourth.hasNext()) {
			System.out.print(iteratorFourth.next() + "  ");
		}
		
		//		Fifth Task
		System.out.println();
		System.out.println("Fifth:");
		Iterator iteratorFifth= collection.createFifth();
		while (iteratorFifth.hasNext()) {
			System.out.print(iteratorFifth.next() + "  ");
		}

	}

	private static int genNum(int min, int max) {
		int number;
		number = (int) (Math.random() * (max - min) + min);
		return number;
	}
}
