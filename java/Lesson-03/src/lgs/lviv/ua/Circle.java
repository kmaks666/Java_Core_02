package lgs.lviv.ua;

public class Circle {
	private double radius;
	private double diametr;
	private double square;
	private double lenght;
	Circle(double diametr){
	this.diametr=diametr;
	this.radius=diametr/2;
	}
	public double getSquare() {
	square=(3.14*diametr*diametr)/4;
	return square;
	}
	public double getLenght() {
	lenght=(2*3.14*radius);
	return lenght;
	

}
}
