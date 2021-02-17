import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Menu menu=new Menu();
		Scanner scan= new Scanner(System.in);
		menu.mainMenu();
		while(true) {
			
		switch(scan.next()) {
		case "1":{
			Parliament.getInstance().addFaction();
			break;
		}
		case "2":{
			Parliament.getInstance().removeFaction();
			break;
		}
		case "3":{
			Parliament.getInstance().showAllFactions();
			break;
		}
		case "4":{
			Parliament.getInstance().clearFaction();
			break;
		}
		case "5":{
			Parliament.getInstance().activeFaction();
			break;
		}
		case "6":{
			Parliament.getInstance().addDeputyInFaction();
			break;
		}
		case "7":{
			Parliament.getInstance().removeDeputyFromFaction();
			break;
		}
		case "8":{
			Parliament.getInstance().showBribetakersInFaction();
			break;
		}
		case "9":{
			Parliament.getInstance().showBiggestBribetakerInFaction();
			break;
		}
		case "0":{
			Parliament.getInstance().showAllDeputyInFaction();
			break;
		}
		case "q":{
			System.exit(0);
		}
		case "z":{
			menu.mainMenu();
			break;
		}
		default:
			System.out.println("Enter correct value to continue...");
		}
		}

	}

}
