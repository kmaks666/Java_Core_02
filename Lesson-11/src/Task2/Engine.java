package Task2;

public class Engine {
private int numberCylinders;

public Engine(int numberCylinders) {
	super();
	this.numberCylinders = numberCylinders;
}

public int getNumberCylinders() {
	return numberCylinders;
}

@Override
public String toString() {
	return "Engine [numberCylinders=" + numberCylinders + "]";
}

}
