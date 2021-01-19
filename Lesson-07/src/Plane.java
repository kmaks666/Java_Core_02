
public abstract class Plane {
	private double lenght, width, weight;
	NavigatePlane navigatePlane = new NavigatePlane();

	public Plane(double lenght, double width, double weight) {
		this.lenght = lenght;
		this.width = width;
		this.weight = weight;
	}

	public void startEngine() {
		int timeToReady = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("��� �� ������� " + timeToReady + "���");
	}

	public void flyUp() {
		double km = 2500 + (Math.random() * (10000 + 1));
		System.out.println("³������ ������� ��� ���������� " + km + "��");
	}

	public void landing() {
		System.out.println("˳��� �������� �� �������");
	}
	public void moveUp() {
		navigatePlane.moveUp();
	}
	public void moveLeft() {
		navigatePlane.moveLeft();
	}
	public void moveRight() {
		navigatePlane.moveRight();
	}
	public void moveDown() {
		navigatePlane.moveDown();
	}
	
	
}
