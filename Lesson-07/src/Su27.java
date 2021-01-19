
public class Su27 extends Plane implements Turbo, Attack, Stealth {
	private int maxSpeed;
	private String color;

	public Su27(double lenght, double width, double weight, int maxSpeed, String color) {
		super(lenght, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public void turbo() {
		int turboSpeed = this.maxSpeed + (int) (Math.random() * (200 + 1));
		System.out.println("Ввімкнуто прискорення. Швидкість становить - " + turboSpeed + "км/год");
	}

	public void stealth() {
		int timeShadow = (int) (Math.random() * (100 + 1));
		System.out.println("Невидимий режим " + timeShadow + "хв");

	}

	public void attack() {
		int countBombs = (int) (Math.random() * (10 + 1));
		System.out.println("Випущено " + countBombs + " ракет");

	}

}
