package Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("Press 1 to display all elements from array");
		System.out.println("Press 2 to replace all entries with one");
	}

	public static void main(String[] args) {
		String[] typeMaterial = {"Skin","Alcantara"};
		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();
			switch (scan.nextInt()) {
			case 1: {
				Auto[][] auto = new Auto[randomValues(1, 5)][randomValues(1, 5)];
				for (int i = 0; i < auto.length; i++) {
					for (int j = 0; j < auto[i].length; j++) {
						auto[i][j] = new Auto(randomValues(1950, 2021), randomValues(60, 900),
								new Wheel(typeMaterial[randomValues(0, typeMaterial.length - 1)].toString(),
										randomValues(35, 55)),
								new Engine(randomValues(4, 16)));
					}
				}
				System.out.println(Arrays.deepToString(auto));
				break;
			}
			case 2:{
				Auto autoNew = new Auto(randomValues(1950, 2021), randomValues(60, 900),
						new Wheel(typeMaterial[randomValues(0, typeMaterial.length - 1)].toString(),
								randomValues(35, 55)),
						new Engine(randomValues(4, 16)));
				Auto[] auto=new Auto[randomValues(1, 5)];
				Arrays.fill(auto, autoNew);
				System.out.println(Arrays.deepToString(auto));
				break;
			}
			default:{
				System.out.println("Wrong number. Try again.");
			}
			}
		}

	}

	public static int randomValues(int min, int max) {
		Random value = new Random();
		return value.nextInt(max - min + 1) + min;
	}

}
