package Task2;


public class Wheel {
	private String typeMaterial;
	private int wheelDiametr;
	public Wheel(String typeMaterial, int wheelDiametr) {
		super();
		this.typeMaterial = typeMaterial;
		this.wheelDiametr = wheelDiametr;
	}
	

	public String getTypeMaterial() {
		return typeMaterial;
	}
	public int getWheelDiametr() {
		return wheelDiametr;
	}

	@Override
	public String toString() {
		return "Wheel [typeMaterial=" + typeMaterial + ", wheelDiametr=" + wheelDiametr + "]";
	}

		
}
