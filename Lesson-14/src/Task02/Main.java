package Task02;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		menu.mainMenu();
		Commodity commodity = new Commodity();

		while (true) {
			switch (scan.next()) {
			case "1": {

				commodity.addCommodity();
				break;
			}
			case "2": {
				commodity.removeProduct();
				break;
			}
			case "3": {
				commodity.removeProduct();
				commodity.addCommodity();
			}
			case "4": {
				commodity.showAllProducts();
				break;
			}
			case "5": {
				commodity.commoditySortHeight();
				break;
			}
			case "6": {
				commodity.commoditySortWidth();
				break;
			}
			case "7": {
				commodity.commoditySortWeight();
				break;
			}
			case "8": {
				commodity.showSelected();
				break;
			}
			case "z": {
				menu.mainMenu();
				break;
			}
			case "q": {
				System.exit(0);
			}
			default:
				System.out.println("Enter correct value to continue...");

			}
		}
	}
}
