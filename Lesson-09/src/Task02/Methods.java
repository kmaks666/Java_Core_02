package Task02;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		
		System.out.print("Enter a= ");
		a = scan.nextInt();
		System.out.print("Enter b= ");
		b = scan.nextInt();

		try {
			if ((a < 0) && (b < 0))
				throw new IllegalArgumentException();

			try {
				if (((a == 0) && (b != 0) | (a != 0) && (b == 0)))
					throw new ArithmeticException();

				try {
					if ((a == 0) && (b == 0))
						throw new IllegalAccessException();

						if ((a > 0) && (b > 0))
							throw new MyException();
								System.out.println("addition = " + addition(a, b));
								System.out.println("subtraction = " + subtraction(a, b));
								System.out.println("multiply = " + multiply(a, b));
								System.out.println("division = " + division(a, b));
										
				} catch (IllegalAccessException exc) {
					exc.printStackTrace();
				}

			} catch (ArithmeticException exc) {
				exc.printStackTrace();
			}

		} catch (IllegalArgumentException exc) {
			exc.printStackTrace();
		}

	}

	public static double addition(double x, double y) {
		return x + y;
	}

	public static double subtraction(double x, double y) {
		return x - y;
	}

	public static double multiply(double x, double y) {
		return x * y;
	}

	public static double division(double x, double y) {
		return x / y;
	}

}
