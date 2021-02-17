import java.util.Scanner;

public class Deputy extends Human {
	private String firtName;
	private String secondName;
	private int age;
	private boolean isBribeTaker;
	private int sizeOfBribe;
	Scanner scan = new Scanner(System.in);

	public Deputy(String firtName, String secondName, int age, boolean isBribeTaker, int height, int weight) {
		super(height, weight);
		this.firtName = firtName;
		this.secondName = secondName;
		this.age = age;
		this.isBribeTaker = isBribeTaker;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return isBribeTaker;
	}

	public void setBribeTaker(boolean isBribeTaker) {
		this.isBribeTaker = isBribeTaker;
	}



	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy [firtName=" + firtName + ", secondName=" + secondName + ", age=" + age + ", isBribeTaker="
				+ isBribeTaker + ", sizeOfBribe=" + sizeOfBribe + "]";
	}

	public void giveBribe() {
		if (!isBribeTaker) {
			System.out.println("This deputy doesn't take a bribe");
		} else {
			while(true){
			System.out.println("Enter bribe:");
			int money = scan.nextInt();
			if (money > 5000) {
				System.out.println("The police wiil amprison the deputy!");
				break;
			} 
			else {
				this.sizeOfBribe = money;
				break;
			}
		}
	}
		
	}

}
