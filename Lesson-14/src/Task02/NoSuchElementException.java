package Task02;

public class NoSuchElementException extends Exception {

	int highLimit;

	public NoSuchElementException(int size) {
		highLimit = size;
	}

	public String toString() {
		return "You input incorrect number product. Please enter number between 1-" + highLimit;

	}
}
