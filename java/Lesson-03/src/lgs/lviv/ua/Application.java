package lgs.lviv.ua;

public class Application {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
	    Rectangle r2=new Rectangle(20,30);
	    Circle c1=new Circle(25);
	    System.out.println(r1);
		System.out.println(r2);
		System.out.println("Площа кола =  "+c1.getSquare());
		System.out.println("Довжина кола =  "+c1.getLenght());
	}

}
