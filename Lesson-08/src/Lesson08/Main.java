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
		System.out.println("�������� 1, ��� ������ � ��������� �� ����� ����� ����");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� �����");
		System.out.println("�������� 3, ��� ������� �� �����, �� ����� ���� ���� �-��� ���");
		System.out.println("�������� 4, ��� ������� �� �����, �� ����� ����� �-��� ���");
		System.out.println("�������� 5, ��� ������� �� �����, �� ����� ����� �-��� ���");
		System.out.println("�������� 6, ��� ������� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� �����, �� ����� ����� �-��� ���");
		System.out.println("�������� 9, ��� ������� �� �����, �� ����� ������� �-��� ���");
		System.out.println("�������� 0, ��� ��������� �� �������� � ������ ����� �� ����� ������� ���");
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
				System.out.println("������ ����� �����");
				scan = new Scanner(System.in);
				String month = scan.next().toUpperCase();
				boolean flag = false;
				for (Month m : arrayMonth) {
					if (m.name().equals(month)) {
						System.out.println("̳���� ����");
						globalMonth = m.name();
						globalSeason = m.getSeasons().name();
						globalDays = m.getDays();
						System.out.print(globalMonth + "  ");
						System.out.print("���� ���� - " + globalSeason + "  ");
						System.out.println("ʳ-��� ��� - " + globalDays);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("̳���� �� ����");
				}
				break;
			}
			case "2": {
				System.out.println("̳���� ���� ����:");
				for (Month m : arrayMonth) {
					if (m.getSeasons().name().equalsIgnoreCase(globalSeason)) {
						System.out.print(m + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "3": {
				System.out.println("̳����, �� ����� ���� ���� �-��� ���:");
				for (Month m : arrayMonth) {
					if (m.getDays() == globalDays)
						System.out.print(m.name() + "  ");

				}
				System.out.println();
				break;
			}
			case "4": {
				System.out.println("̳����, �� ����� ����� �-��� ���:");
				for (Month m : arrayMonth) {
					if (m.getDays() < globalDays)
						System.out.print(m.name() + "  ");
				}
				System.out.println();
				break;
			}
			case "5": {
				System.out.println("̳����, �� ����� ����� �-��� ���");
				for (Month m : arrayMonth) {
					if (m.getDays() > globalDays)
						System.out.print(m.name() + "  ");
				}
				System.out.println();
				break;
			}
			case "6": {
				System.out.println("�������� ���� ����:");
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
				System.out.println("��������� ���� ����:");
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
				System.out.println("̳���� � ������ ������� ���:");
				for (Month m : arrayMonth) {
					if (m.getDays() % 2 == 0) {
						System.out.print(m.name() + "  ");
					}
				}
				System.out.println();
				break;
			}
			case "9": {
				System.out.println("̳���� � �������� ������� ���:");
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
					System.out.println("�������� ����� �� ����� �-��� ���");
				else
					System.out.println("�������� ����� �� ������� �-��� ��� ");
				break;
			}
			default:
				System.out.println("������� ��������");
			}
		}
	}
}
