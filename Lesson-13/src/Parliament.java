import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Parliament {
	private static Parliament instance;

	private Parliament() {
	}

	public static Parliament getInstance() {
		if (instance == null) {
			instance = new Parliament();
		}
		return instance;
	}

	List<Faction> listOfFaction = new ArrayList<Faction>();
	Scanner scan = new Scanner(System.in);

	// added faction
	public void addFaction() {
		String f = null;
		System.out.println("Input name of faction:");
		if (scan.hasNext()) {
			f = scan.next();
		}
		Faction faction = new Faction(f);
		listOfFaction.add(faction);
		System.out.println(faction.toString() + " added in Parliament succsefull");

	}

	// remove faction
	public void removeFaction() {
		String f = null;
		Iterator<Faction> iter = listOfFaction.iterator();
		System.out.println("Input name of faction to remove");
		showAllFactions();
		if (scan.hasNext()) {
			f = scan.next();
		}
		while (iter.hasNext()) {
			Faction faction = iter.next();
			if (listOfFaction.size() > 0) {
				if (faction.getName().equalsIgnoreCase(f)) {
					iter.remove();
				} 
			}
			else {
				System.out.println("In parliament aren't factions. First of all, add factions in parliament");
				break;
			}
		}
	}

	// show all factions
	public void showAllFactions() {
		Iterator<Faction> iter = listOfFaction.iterator();
		System.out.println("All factions in parliament:");
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}

	// clear choosen factions
	public void clearFaction() {
		Faction faction = chooseFaction();
		faction.clearFaction();
		System.out.println("All deputies in this faction are removed");

	}

	// choose faction private
	private Faction chooseFaction() {
		Iterator<Faction> iter = listOfFaction.iterator();
		Faction choosenFaction = new Faction(null);
		String f = null;
		showAllFactions();
		System.out.println("Input faction to choose:");
		if (scan.hasNext()) {
			f = scan.next();
		}
		if (!listOfFaction.isEmpty()) {
			while (iter.hasNext()) {
				Faction faction = iter.next();
				if (faction.getName().equalsIgnoreCase(f)) {
					choosenFaction = faction;
					System.out.println("Choosen faction is: " + faction.toString());
				} 
			}
		} else {
			System.out.println("In parliament aren't factions. First of all, add factions in parliament");
		}
		return choosenFaction;
	}

	// activated faction
	public void activeFaction() {
		Faction faction = chooseFaction();
	}

	// add deputies in faction
	public void addDeputyInFaction() {
		Faction faction = chooseFaction();
		faction.addDeputy();
	}

	// remove deputy from faction
	public void removeDeputyFromFaction() {
		Faction faction = chooseFaction();
		
		faction.removeDeputy();
	}

	public void showBribetakersInFaction() {
		Faction faction = chooseFaction();
		faction.showAllBribetakers();
	}

	public void showBiggestBribetakerInFaction() {
		Faction faction = chooseFaction();
		faction.showBiggestBribetaker();
	}
	
	public void showAllDeputyInFaction() {
		Faction faction=chooseFaction();
		faction.showAllDeputies();
		
	}

}
