package Payment;

public class HourlyPay extends Workers implements Payment {
	private double countHours, priceHour, money, summ;

	public HourlyPay(String name, double countHours, double priceHour) {
		super(name);
		this.countHours = countHours;
		this.priceHour = priceHour;
	}

	@Override
	public void payment() {
		money = this.countHours * this.priceHour;
		summ = money - money * 0.085;
		System.out.println(super.name + " зарплата - " + summ);

	}

}
