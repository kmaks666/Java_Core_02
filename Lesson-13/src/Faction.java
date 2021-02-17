import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {
	private String name;
	private List<Deputy> listOfDeputy = new ArrayList<Deputy>();
	Scanner scan = new Scanner(System.in);
	

	public Faction(String name, List<Deputy> listOfDeputy) {
		super();
		this.name = name;
		this.listOfDeputy = listOfDeputy;
	}
	

	public Faction(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Deputy> getListOfDeputy() {
		return listOfDeputy;
	}


	public void setListOfDeputy(List<Deputy> listOfDeputy) {
		this.listOfDeputy = listOfDeputy;
	}


	@Override
	public String toString() {
		return "Faction " + name;
	}

	public void addDeputy() {
		String firstName=null;
		String secondName=null;
		int age=0;
		boolean isBribeTaker=false;
		int sizeOfBribe;
		int height;
		int weight;
		System.out.println("Added the deputy to faction:");
		System.out.println("Enter First name:");
		if (scan.hasNext()) {
			firstName = scan.next();
		}

		System.out.println("Enter Second name:");
		if (scan.hasNext()) {
			secondName = scan.next();
		}
		//added age
		while (true) {
			int number;
			System.out.println("Enter age of deputy, deputy must be older 24 years: ");
			if (scan.hasNext()) {
				number = scan.nextInt();
				if (number >= 25) {
					age = number;
					break;
				}

				else {
					System.out.println("The deputy  must be older 24 years. Input correct age:");
				}

			}
		}
	
	//this deputy is bribetaker
	while(true) {
		System.out.println("Enter is this deputy bribetaker?( y / n ):");
		if(scan.hasNext()) {
			String answer=scan.next();
			if(answer.equalsIgnoreCase("y")) {
				isBribeTaker=true;
				break;
			}
			else if(answer.equalsIgnoreCase("n")) {
				isBribeTaker=false;
				break;
			}
			else {
				System.out.println("Input correct answer: 'y' or 'n': ");
			}
			
			}
		}
		//input height of deputy
		while(true) {
			System.out.println("Input height of deputy:");
			if(scan.hasNext()) {
				int h=scan.nextInt();
				if(h>0) {
					height=h;
					break;
				}
				else {
					System.out.println("Input integer value for height");
				}
			}
		}
		//input weight of deputy
		while(true){
			System.out.println("Input weight of deputy:");
			if(scan.hasNext()) {
				int w=scan.nextInt();
				if(w>0) {
					weight=w;
					break;
				}
				else {
					System.out.println("Input integer value for weight");
				}
			}
		}
		Deputy deputy=new Deputy(firstName, secondName, age, isBribeTaker, height, weight);
		listOfDeputy.add(deputy);
		
		listOfDeputy.get(listOfDeputy.size()-1).giveBribe();
		System.out.println(deputy.getFirtName()+" "+deputy.getSecondName()+" was added in faction succsesfull");
	}
	
	//remove deputy
	public void removeDeputy() {
		String firstName;
		Iterator<Deputy> iter=listOfDeputy.iterator();
		while(true) {
			System.out.println("Input First name of deputy to remove:");
			if(scan.hasNext()) {
				firstName=scan.next();
				break;
			}
		}
		while(iter.hasNext()) {
			Deputy deputy=iter.next();
			if(deputy.getFirtName().equalsIgnoreCase(firstName)) {
				System.out.println(deputy.getFirtName()+" "+deputy.getSecondName()+" was removed");
				iter.remove();
			}
		}
		
	}
	//show all bribetakers
	public void showAllBribetakers() {
		Iterator<Deputy> iter=listOfDeputy.iterator();
		System.out.println("The list of all bribetakers:");
		while(iter.hasNext()) {
			Deputy deputy=iter.next();
			if(deputy.isBribeTaker()) {
				System.out.println(deputy);
			}
		}
	}
	//show biggest bribetaker
	public void showBiggestBribetaker() {
		Iterator<Deputy> iter=listOfDeputy.iterator();
		int i=0;
		int max=0;
		int counter=0;
		System.out.println("The biggest bribetaker is:");
		while(iter.hasNext()) {
			Deputy deputy=iter.next();
			if(deputy.getSizeOfBribe()>max) {
				max=deputy.getSizeOfBribe();
				i=counter;
			}
			counter++;
		}
		System.out.println(listOfDeputy.get(i).toString());
		}
public void showAllDeputies() {
	Iterator<Deputy> iter=listOfDeputy.iterator();
	System.out.println("All deputies of faction:");
	while(iter.hasNext()) {
	Deputy deputy=(Deputy)iter.next();
	System.out.println(deputy);
	}
}
public void clearFaction() {
	listOfDeputy.clear();
}
}
