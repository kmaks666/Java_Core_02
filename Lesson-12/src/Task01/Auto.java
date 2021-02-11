package Task01;

public class Auto {

	private int yearProduced;
	private int autoHorsePowers;
	Wheel wheel;
	Engine engine;

	public Auto(int yearProduced, int autoHorsePowers, Wheel wheel, Engine engine) {
		super();
		this.yearProduced = yearProduced;
		this.autoHorsePowers = autoHorsePowers;
		this.wheel = wheel;
		this.engine = engine;
	}

	public int getYearProduced() {
		return yearProduced;
	}

	public int getAutoHorsePowers() {
		return autoHorsePowers;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Auto [yearProduced=" + yearProduced + ", autoHorsePowers=" + autoHorsePowers + ", wheel=" + wheel
				+ ", engine=" + engine + "]";
	}

}
