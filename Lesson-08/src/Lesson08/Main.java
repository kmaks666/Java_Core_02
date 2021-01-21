package Lesson08;

import java.util.Scanner;

public class Main {
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
		System.out.println("Натисніть 1, щоб ввести і перевірити чи такий місяць існує");
		System.out.println("Натисніть 2, щоб вивести всі місяці з такою порою");
		System.out.println("Натисніть 3, щоб вивести всі місяці, які мають таку саму к-сть днів");
		System.out.println("Натисніть 4, щоб вивести всі місяці, які мають меншу к-сть днів");
		System.out.println("Натисніть 5, щоб вивести всі місяці, які мають більшу к-сть днів");
		System.out.println("Натисніть 6, щоб вивести наступну пору року");
		System.out.println("Натисніть 7, щоб вивести попередню пору року");
		System.out.println("Натисніть 8, щоб вивести всі місяці, які мають парну к-сть днів");
		System.out.println("Натисніть 9, щоб вивести всі місяці, які мають непарну к-сть днів");
		System.out.println("Натисніть 0, щоб перевірити чи введений з консолі місяць має парну кількість днів");
	}

	public static void main(String[] args) {
		Seasons[] arraySeasons = Seasons.values();
		Month[] arrayMonth = Month.values();
		Scanner scan = new Scanner(System.in);
		String globalMonth = null;
		String globalSeason = null;
		int globalDays = 0;

		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				System.out.println("Введіть назву місяця");
				scan = new Scanner(System.in);
				String month = scan.next().toUpperCase();
				boolean flag = false;
				for (Month m : arrayMonth) {
					if (m.name().equals(month)) {
						System.out.println("Місяць існує");
						globalMonth = m.name();
						globalSeason = m.getSeasons().name();
						globalDays = m.getDays();
						System.out.print(globalMonth + "  ");
						System.out.print("Пора року - " + globalSeason + "  ");
						System.out.println("Кі-сть днів - " + globalDays);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Місяць не існує");
				}
				break;
			}
			case "2": {
				System.out.println("Місяці цієї пори:");
				for (Month m : arrayMonth) {
					if (m.getSeasons().name().equalsIgnoreCase(globalSeason)) {
						System.out.print(m + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "3": {
				System.out.println("Місяці, які мають таку саму кі-сть днів:");
				for (Month m : arrayMonth) {
					if (m.getDays() == globalDays)
						System.out.print(m.name() + "  ");

				}
				System.out.println();
				break;
			}
			case "4": {
				System.out.println("Місяці, які мають меншу кі-сть днів:");
				for (Month m : arrayMonth) {
					if (m.getDays() < globalDays)
						System.out.print(m.name() + "  ");
				}
				System.out.println();
				break;
			}
			case "5": {
				System.out.println("Місяці, які мають більшу кі-сть днів");
				for (Month m : arrayMonth) {
					if (m.getDays() > globalDays)
						System.out.print(m.name() + "  ");
				}
				System.out.println();
				break;
			}
			case "6": {
				System.out.println("Наступна пора року:");
				Seasons s = Seasons.valueOf(globalSeason);
				int ordinal = s.ordinal();
				if (s.ordinal() == arraySeasons.length - 1) {
					ordinal = 0;
					System.out.println(arraySeasons[ordinal]);
				} else {
					System.out.println(arraySeasons[ordinal + 1]);
				}
				break;
			}
			case "7": {
				System.out.println("Попередня пора року:");
				Seasons s = Seasons.valueOf(globalSeason);
				int ordinal = s.ordinal();
				if (s.ordinal() == 0) {
					ordinal = arraySeasons.length - 1;
					System.out.println(arraySeasons[ordinal]);
				} else {
					System.out.println(arraySeasons[ordinal - 1]);
				}
				break;
			}
			case "8": {
				System.out.println("Місяці з парною кількість днів:");
				for (Month m : arrayMonth) {
					if (m.getDays() % 2 == 0) {
						System.out.print(m.name() + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "9": {
				System.out.println("Місяці з непарною кількість днів:");
				for (Month m : arrayMonth) {
					if (m.getDays() % 2 != 0) {
						System.out.print(m.name() + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "0": {
				Month m = Month.valueOf(globalMonth);
				if (m.getDays() % 2 == 0)
					System.out.println("Введений місяць має парну кі-сть днів");
				else
					System.out.println("Введений місяць має непарну кі-сть днів ");
				break;
			}
			default:
				System.out.println("Невірний параметр");
			}
		}
	}
}
