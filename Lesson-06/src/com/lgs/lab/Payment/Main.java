package Payment;

public class Main {
	public static void main(String[] args) {
		FixedPay fixedPay = new FixedPay("Курч М. П.", 12500);
		HourlyPay hourlyPay = new HourlyPay("Дикий Б. В.", 180, 115);
		fixedPay.payment();
		hourlyPay.payment();
	}

}
