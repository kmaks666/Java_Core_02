package Task01;

/**
 * @Main
 * @program for working with the calendar
 * @version 1.0
 * @author Masik 
 */

import java.util.Scanner;

public class Main {
	/* Class for determining and deriving the characteristics of the months */
	
	enum Seasons {
		WINTER, SPRING, SUMMER, AUTUMN
	};

	enum Month {
		JANUARY(Seasons.WINTER, 31),
		FEBRUARY(Seasons.WINTER, 28),
		MARCH(Seasons.SPRING, 31), 
		APRIL(Seasons.SPRING, 30),
		MAY(Seasons.SPRING, 31), 
		JUNE(Seasons.SUMMER, 30),
		JULY(Seasons.SUMMER, 31), 
		AUGUST(Seasons.SUMMER, 31),
		SEPTEMBER(Seasons.AUTUMN, 30), 
		OCTOBER(Seasons.AUTUMN, 31), 
		NOVEMBER(Seasons.AUTUMN, 30),
		DECEMBER(Seasons.WINTER, 31);

		int days;
		Seasons seasons;

		Month(Seasons seasons, int days) {
			this.days = days;
			this.seasons = seasons;
		}

		public int getDays() {
			return days;
		}

		public Seasons getSeasons() {
			return seasons;
		}
	}

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
		System.out.println("Press 0 to check if the month entered "
							+ "from the console has an even number of days");
	}

	public static void main(String[] args) {
		
		String globalMonth = null;
		String globalSeason = null;
		int globalDays = 0;
		Seasons[] arraySeasons = Seasons.values();
		Month[] arrayMonth = Month.values();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				//check if such a month exists
				System.out.println("Enter month");
				scan = new Scanner(System.in);
				String month = scan.next().toUpperCase();
				boolean flag = false;
				
				try {
					for (Month m : arrayMonth) {
						if (m.name().equals(month)) {
							System.out.println("The month exists");
							globalMonth = m.name();
							globalSeason = m.getSeasons().name();
							globalDays = m.getDays();
							System.out.print(globalMonth + "  ");
							System.out.print("Season - " + globalSeason + "  ");
							System.out.println("Number of days - " + globalDays);
							flag = true;
						}
					}
					if (!flag) {
						throw new WrongInputConsoleParametersException(month);
					}
				} catch (WrongInputConsoleParametersException exc) {
					System.out.println(exc);
				}
				break;
			}
			case "2": {
				//display all months with this season
				System.out.println("All months with this season:");
				for (Month m : arrayMonth) {
					if (m.getSeasons().name().equalsIgnoreCase(globalSeason)) {
						System.out.print(m + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "3": {
				//display all months that have the same number of day
				System.out.println("All months that have the same number of days:");
				for (Month m : arrayMonth) {
					if (m.getDays() == globalDays) {
						System.out.print(m.name() + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "4": {
				//display all months that have fewer days
				System.out.println("All months that have fewer days");
				for (Month m : arrayMonth) {
					if (m.getDays() < globalDays) {
						System.out.print(m.name() + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "5": {
				//display all months that have more days
				System.out.println("All months that have more days");
				for (Month m : arrayMonth) {
					if (m.getDays() > globalDays) {
						System.out.print(m.name() + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "6": {
				//display the next season
				System.out.println("Next season:");
				Seasons s = Seasons.valueOf(globalSeason);
				int ordinal = s.ordinal();
				if (s.ordinal() == arraySeasons.length - 1) {
					ordinal = 0;
					System.out.println(arraySeasons[ordinal]);
				} 
				else {
					System.out.println(arraySeasons[ordinal + 1]);
				}
				break;
			}
			case "7": {
				//display the previous season
				System.out.println("Previous season:");
				Seasons s = Seasons.valueOf(globalSeason);
				int ordinal = s.ordinal();
				if (s.ordinal() == 0) {
					ordinal = arraySeasons.length - 1;
					System.out.println(arraySeasons[ordinal]);
				} 
				else {
					System.out.println(arraySeasons[ordinal - 1]);
				}
				break;
			}
			case "8": {
				//display all months that have an even number of days
				System.out.println("All months that have an even number of days:");
				for (Month m : arrayMonth) {
					if (m.getDays() % 2 == 0) {
						System.out.print(m.name() + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "9": {
				//display all months that have an odd number of days
				System.out.println("All months that have an odd number of days:");
				for (Month m : arrayMonth) {
					if (m.getDays() % 2 != 0) {
						System.out.print(m.name() + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "0": {
				//if the month entered has an even number of days
				Month m = Month.valueOf(globalMonth);
				if (m.getDays() % 2 == 0) {
					System.out.println("The moon has an even number of days");
				}
				else {
					System.out.println("The entered month has an odd number of days");
				}
				break;
			}
			default:
				System.out.println("You input incorrect parameter. Please enter a parameter between 0-9");
			}
		}
	}
}
