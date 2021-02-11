package Task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("Press 1 to display all elements from array");
		System.out.println("Press 2 to replace all entries with one");
	}

	public static void main(String[] args) {
		List<String> typeMaterial = new ArrayList();
		List<Auto> auto = new ArrayList();
		Scanner scan = new Scanner(System.in);
		typeMaterial.add("Skin");
		typeMaterial.add("Alcantara");

		while (true) {
			menu();
			switch (scan.nextInt()) {
			case 1: {
				for (int i = 0; i < randomValues(1, 5); i++) {
					auto.add(new Auto(randomValues(1950, 2021), randomValues(60, 900),
							new Wheel(typeMaterial.get(randomValues(0, typeMaterial.size() - 1)), randomValues(35, 55)),
							new Engine(randomValues(4, 16))));
				}
				System.out.println(auto);
				break;
			}
			case 2: {
				List autoNew = new ArrayList();
				autoNew.add(new Auto(randomValues(1950, 2021), randomValues(60, 900),
						new Wheel(typeMaterial.get(randomValues(0, typeMaterial.size() - 1)), randomValues(35, 55)),
						new Engine(randomValues(4, 16))));
				for (int i = 0; i < randomValues(1, 5); i++) {
					auto.addAll(i, autoNew);
				}
				System.out.println(auto);
				break;
			}
			default: {
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
