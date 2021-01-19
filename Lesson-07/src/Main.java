
public class Main {

	public static void main(String[] args) {
		Su27 tiger = new Su27(18, 11, 9.4, 2200, "khaki");
		tiger.startEngine();
		tiger.flyUp();
		tiger.moveUp();
		tiger.moveRight();
		tiger.moveDown();
		tiger.moveLeft();
		tiger.stealth();
		tiger.attack();
		tiger.turbo();
		tiger.landing();

	}

}
