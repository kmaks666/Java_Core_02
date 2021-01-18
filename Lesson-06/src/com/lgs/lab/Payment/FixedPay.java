package Payment;

public class FixedPay extends Workers implements Payment {
	private double money = 12500;
	private double summ;

	public FixedPay(String name, double money) {
		super(name);
		this.money = money;
	}

	@Override
	public void payment() {
		summ = money - money * 0.085;
		System.out.println(super.name + " зарплата - " + summ);

	}
}
