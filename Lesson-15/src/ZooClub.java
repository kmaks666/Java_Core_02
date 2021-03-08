import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;

public class ZooClub {
	private Map<Person, List<Animal>> members = new HashMap<Person, List<Animal>>();
	private String name;

	public ZooClub(String name) {
		super();
		this.members = members;
	}

	public Map<Person, List<Animal>> getMembers() {
		return members;
	}

	public void setMembers(Map<Person, List<Animal>> members) {
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((members == null) ? 0 : members.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZooClub other = (ZooClub) obj;
		if (members == null) {
			if (other.members != null)
				return false;
		} else if (!members.equals(other.members))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ZooClub [members=" + members + ", name=" + name + "]";
	}

	// add new member in club
	public void addMember() {
		final int MIN_AGE = 12;
		Scanner scan = new Scanner(System.in);
		String name = null;
		boolean flag = false;
		int age = MIN_AGE;
		int a;

		System.out.println("<--- Add new member in ZooClub --->");
		System.out.println("All members there are in Zoo Club:  " + members.keySet().toString());
		name = inputString();

		while (true) {
			System.out.println("Enter age of member(Min age - 12 years):");
			if (scan.hasNextInt()) {
				a = scan.nextInt();
				if (a >= MIN_AGE) {
					age = a;
					flag = true;
					break;
				} else {
					System.out.println("You input incorrect age. Age of member must be 12 or older.");
				}
			} else {
				// exception, if user inputed symbols or incorrect numbers
				try {
					throw new WrongInputException("The age of the member must be a number.");
				} catch (WrongInputException exc) {
					System.out.println(exc);
					break;
				}

			}
		}
		if (flag == true) {
			members.put(new Person(name, age), new ArrayList<>());
			System.out.println("The member " + name + " has been successfully added to the club.");
		} else {
			System.out.println("The member isn't added to the club. Try again.");
		}
	}

	// add new animal to member
	public void addAnimal() {
		Scanner scan = new Scanner(System.in);
		// List<Animal> animal = new ArrayList<>();
		String typeAnimal = null;
		String nameAnimal = null;
		String nameMember = null;
		int ageMember = 0;
		boolean flag = false;
		System.out.println("<--- Add animal --->");
		if (!members.isEmpty()) {
			System.out.println("Input name of a member:");

			nameMember = inputString();

			for (Map.Entry<Person, List<Animal>> key : members.entrySet()) {
				if (key.getKey().getName().equalsIgnoreCase(nameMember)) {
					System.out.println(key.getKey() + " exists in ZooClub.");
					System.out.println("Input type of animal:");

					typeAnimal = inputString();

					System.out.println("Input name of animal:");

					nameAnimal = inputString();

					key.getValue().add(new Animal(typeAnimal, nameAnimal));

					System.out.println(
							key.getValue().toString() + "  added to " + key.getKey().getName() + " succsesfully.");
					flag = true;
					break;
				}

			}
		}

		else {
			System.out.println("There aren't members in club. First of all, please, add members ");
		}
		if (flag == false) {
			System.out.println("There isn't member with that name.");
		}

	}

	// remove the animal from the member
	public void removeAnimalFromMember() {
		Scanner scan = new Scanner(System.in);
		Iterator<Entry<Person, List<Animal>>> iterator = members.entrySet().iterator();
		String nameAnimal;
		String nameMember;
		boolean checkMember = false;
		boolean checkAnimal = false;
		if (!members.isEmpty()) {
			System.out.println("<---  Remove animal from the member --->");
			System.out.println("All members in the club:");
			while (iterator.hasNext()) {
				Entry<Person, List<Animal>> next = iterator.next();
				System.out.println(next.getKey().getName() + " ---> " + next.getValue().toString());
			}
			System.out.println("Input the member's name to remove the animal:");
			nameMember = inputString();
			System.out.println("Input the animal's name to remove :");
			nameAnimal = inputString();

			Iterator<Entry<Person, List<Animal>>> iteratorPerson = members.entrySet().iterator();
			while (iteratorPerson.hasNext()) {
				Entry<Person, List<Animal>> nextPerson = iteratorPerson.next();
				if (nextPerson.getKey().getName().equalsIgnoreCase(nameMember)) {
					List<Animal> animalOfMember = nextPerson.getValue();
					Iterator<Animal> iteratorAnimal = animalOfMember.iterator();
					checkMember = true;
					while (iteratorAnimal.hasNext()) {
						Animal nextAnimal = iteratorAnimal.next();
						if (nextAnimal.getNameOfPet().equalsIgnoreCase(nameAnimal)) {
							System.out.println(nextAnimal.getPet() + " " + nextAnimal.getNameOfPet() + " is removed.");
							iteratorAnimal.remove();
							checkAnimal = true;
							break;
						}

					}
				}
			}
		} else {
			System.out.println("There aren't members in club. First of all, please, add members ");
		}
		if ((!checkMember) || (!checkAnimal)) {
			System.out.println("Inputed wrong parameters. Try again.");
		}
	}

	// remove a member from the club
	public void removeMember() {
		String nameMember = null;
		boolean flag = false;
		System.out.println("<--- Remove a member from the club --->");
		if (!members.isEmpty()) {
			showAll();
			System.out.println("Input name of the member to remove:");
			nameMember = inputString();
			Iterator<Entry<Person, List<Animal>>> iteratorPerson = members.entrySet().iterator();
			while (iteratorPerson.hasNext()) {
				Entry<Person, List<Animal>> member = iteratorPerson.next();
				if (member.getKey().getName().equalsIgnoreCase(nameMember)) {
					iteratorPerson.remove();
					System.out.println(member.getKey().getName() + "  removed from the club.");
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.println("Wrong name of the member. Try again");
			}
		} else {
			System.out.println("There aren't members in club. First of all, please, add members ");
		}

	}

	// remove animal from all members
	public void removeAnimalFromAll() {
		String typeAnimal = null;
		boolean flag = false;
		System.out.println("<--- Remove animal from all members --->");
		if (!members.isEmpty()) {
			showAll();
			System.out.println("Input the animal to remove:");
			typeAnimal = inputString();
			Iterator<Entry<Person, List<Animal>>> iterator = members.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<Person, List<Animal>> next = iterator.next();
				List<Animal> animals = next.getValue();
				Iterator<Animal> iteratorAnimal = animals.iterator();
				while (iteratorAnimal.hasNext()) {
					Animal animalToRemove = iteratorAnimal.next();
					if (animalToRemove.getPet().equalsIgnoreCase(typeAnimal)) {
						iteratorAnimal.remove();
						System.out.println(animalToRemove.getPet() + " removed from all members");
						flag = true;
						break;
					}
				}
			}
			if (!flag) {
				System.out.println("Wrong type of the animal. Try again.");
			}

		} else {
			System.out.println("The club is empty. Add members to the club.");
		}
	}

	// input string
	private String inputString() {
		Scanner scan = new Scanner(System.in);
		String str = null;
		if (scan.hasNext()) {
			str = scan.next();
		}
		return str;
	}

	// show all members of the club
	public void showAll() {
		Iterator<Entry<Person, List<Animal>>> iterator = members.entrySet().iterator();
		if (!members.isEmpty()) {
			System.out.println("All members in the club:");
			while (iterator.hasNext()) {
				System.out.println(iterator.next());

			}
		} else {
			System.out.println("There are no members in the club. First, add a member to the club.");
		}

	}

}
