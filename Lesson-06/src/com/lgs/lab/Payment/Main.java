package Payment;

public class Main {
	public static void main(String[] args) {
		FixedPay fixedPay = new FixedPay("���� �. �.", 12500);
		HourlyPay hourlyPay = new HourlyPay("����� �. �.", 180, 115);
		fixedPay.payment();
		hourlyPay.payment();
	}

}
