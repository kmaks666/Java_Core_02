package Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("Press 1 to enter and check if such a month exists");
		System.out.println("Press 2 to display all months with this season");
		System.out.println("Press 3 to display all months that have the same number of days");
		System.out.println("Press 4 to display all months that have fewer days");
		System.out.println("Press 5 to display all months that have more days");
		System.out.println("Press 6 to display the next season");
		System.out.println("Press 7 to display the previous season");
		System.out.println("Press 8 to display all months that have an even number of days");
		System.out.println("Press 9 to display all months that have an odd number of days");
		System.out.println("Press 0 to check if the month entered from the console has an even number of days");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Month> listOfMonth = new ArrayList();
		List<String> listOfSeasons = new ArrayList();
		listOfSeasons.add("WINTER");
		listOfSeasons.add("SPRING");
		listOfSeasons.add("SUMMER");
		listOfSeasons.add("AUTUMN");
		listOfMonth.add(new Month("WINTER", "JANUARY", 31));
		listOfMonth.add(new Month("WINTER", "FEBRUARY", 28));
		listOfMonth.add(new Month("SPRING", "MARCH", 31));
		listOfMonth.add(new Month("SPRING", "APRIL", 30));
		listOfMonth.add(new Month("SPRING", "MAY", 31));
		listOfMonth.add(new Month("SUMMER", "JUNE", 30));
		listOfMonth.add(new Month("SUMMER", "JULY", 31));
		listOfMonth.add(new Month("SUMMER", "AUGUST", 31));
		listOfMonth.add(new Month("AUTUMN", "SEPTEMBER", 30));
		listOfMonth.add(new Month("AUTUMN", "OCTOBER", 31));
		listOfMonth.add(new Month("AUTUMN", "NOVEMBER", 30));
		listOfMonth.add(new Month("WINTER", "DECEMBER", 31));
		String globalMonth = null;
		String globalSeason = null;
		int globalDays = 0;
		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				System.out.println("Enter month");
				scan = new Scanner(System.in);
				String month = (scan.next());
				boolean flag = false;
				for (int i = 0; i < listOfMonth.size(); i++) {
					if (listOfMonth.get(i).getMonth().equalsIgnoreCase(month)) {
						System.out.println("The month is exist.");
						globalMonth = listOfMonth.get(i).getMonth();
						System.out.println(globalMonth);
						globalSeason = listOfMonth.get(i).getSeason();
						globalDays = listOfMonth.get(i).getNumberOfDays();
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("The month isn't exist.");
				}
				break;
			}
			case "2": {
				System.out.println("All months with this season:");
				for (int i = 0; i < listOfMonth.size(); i++) {
					if (listOfMonth.get(i).getSeason().equalsIgnoreCase(globalSeason)) {
						System.out.println(listOfMonth.get(i).getMonth());
					}
				}
				break;
			}
			case "3": {
				System.out.println("All months that have the same number of days:");
				for (int i = 0; i < listOfMonth.size(); i++) {
					if (listOfMonth.get(i).getNumberOfDays() == globalDays) {
						System.out.println(listOfMonth.get(i).getMonth());
					}
				}
				break;
			}
			case "4": {
				System.out.println("All months that have fewer days");
				for (int i = 0; i < listOfMonth.size(); i++) {
					if (listOfMonth.get(i).getNumberOfDays() < globalDays) {
						System.out.println(listOfMonth.get(i).getMonth());
					}
				}
				break;
			}
			case "5": {
				System.out.println("All months that have more days");
				for (int i = 0; i < listOfMonth.size(); i++) {
					if (listOfMonth.get(i).getNumberOfDays() > globalDays) {
						System.out.println(listOfMonth.get(i).getMonth());
					}
				}
				break;
			}
			case "6": {
				System.out.println("The next season:");
				int idx = listOfSeasons.indexOf(globalSeason);
				if (idx == listOfSeasons.size() - 1) {
					idx = 0;
					System.out.println(listOfSeasons.get(idx));
				} else {
					System.out.println(listOfSeasons.get(idx + 1));
				}
				break;
			}
			case "7": {
				System.out.println("The previous season:");
				int idx = listOfSeasons.indexOf(globalSeason);
				if (idx == 0) {
					idx = listOfSeasons.size() - 1;
					System.out.println(listOfSeasons.get(idx));
				} else {
					System.out.println(listOfSeasons.get(idx - 1));
				}
				break;
			}
			case "8": {
				System.out.println("All months that have an even number of days:");

				for (int i = 0; i < listOfMonth.size(); i++) {
					if (listOfMonth.get(i).getNumberOfDays() % 2 == 0) {
						System.out.println(listOfMonth.get(i).getMonth());
					}
				}
				break;
			}
			case "9": {
				System.out.println("All months that have an odd number of days:");
				for (int i = 0; i < listOfMonth.size(); i++) {
					if (listOfMonth.get(i).getNumberOfDays() % 2 != 0) {
						System.out.println(listOfMonth.get(i).getMonth());
					}
				}
				break;
			}
			case "0": {
				if (globalDays % 2 == 0) {
					System.out.println("The moon has an even number of days");
				} else
					System.out.println("The entered month has an odd number of days");
				break;
			}
			default:
				System.out.println("You input incorrect parametr. Please enter a parameter between 0-9");
			}
		}

	} // switch

}
