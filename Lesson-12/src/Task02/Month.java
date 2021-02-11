package Task02;

public class Month {
	private String season;
	private String month;
	private int numberOfDays;
	public Month(String season, String month, int numberOfDays) {
		super();
		this.season = season;
		this.month = month;
		this.numberOfDays = numberOfDays;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + numberOfDays;
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (numberOfDays != other.numberOfDays)
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Month [season=" + season + ", month=" + month + ", numberOfDays=" + numberOfDays + "]";
	}

}
