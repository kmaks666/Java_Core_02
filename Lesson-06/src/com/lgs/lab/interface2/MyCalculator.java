package com.lgs.lab.interface2;

public class MyCalculator implements com.lgs.lab.interface1.Numerable {
	double a;
	double b;

	public MyCalculator() {
	}

	public MyCalculator(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double plus() {
		return this.a + this.b;
	}

	public double minus() {
		return this.a - this.b;
	}

	public double multiply() {
		return this.a * this.b;
	}

	public double devide() {
		return this.a / this.b;
	}

	public String toString() {
		return "a=" + a + ", b=" + b + ", plus=" + plus() + ", minus=" + minus() + ", multiply=" + multiply()
				+ ", devide=" + devide();
	}
}
