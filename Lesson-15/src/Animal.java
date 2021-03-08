
public class Animal {
	private String pet;
	private String nameOfPet;

	public Animal(String pet, String nameOfPet) {
		super();
		this.pet = pet;
		this.nameOfPet = nameOfPet;
	}

	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public String getNameOfPet() {
		return nameOfPet;
	}

	public void setNameOfPet(String nameOfPet) {
		this.nameOfPet = nameOfPet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfPet == null) ? 0 : nameOfPet.hashCode());
		result = prime * result + ((pet == null) ? 0 : pet.hashCode());
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
		Animal other = (Animal) obj;
		if (nameOfPet == null) {
			if (other.nameOfPet != null)
				return false;
		} else if (!nameOfPet.equals(other.nameOfPet))
			return false;
		if (pet == null) {
			if (other.pet != null)
				return false;
		} else if (!pet.equals(other.pet))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pet - " + pet + ", Pet's name - " + nameOfPet + " ";
	}

}
