import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		ZooClub zooClub = new ZooClub("ZooClub");
		menu.mainMenu();
		while (true) {

			switch (scan.next()) {
			case "1": {
				zooClub.addMember();
				break;
			}
			case "2": {
				zooClub.addAnimal();
				break;
			}
			case "3": {
				zooClub.removeAnimalFromMember();
				break;
			}
			case "4": {
				zooClub.removeMember();
				break;
			}
			case "5": {
				zooClub.removeAnimalFromAll();
				break;
			}
			case "6": {
				zooClub.showAll();
				break;
			}
			case "z": {
				menu.mainMenu();
				break;
			}
			case "q": {
				System.exit(0);
				break;
			}
			default:
				System.out.println("You input incorrect number. Try again.");
				break;
			}
		}
	}

}
