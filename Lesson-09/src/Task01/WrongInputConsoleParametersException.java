package Task01;

/**
 * WrongInputConsoleParametersException
 * @author Masik
  */

public class WrongInputConsoleParametersException extends Exception{
	/* Class of check of correctness of the entered data*/
	
	String monthCheking;

	WrongInputConsoleParametersException(String a) {
		monthCheking = a;
	}

	public String toString() {
		return "You input incorrect name of month - '" + monthCheking
				+ "' Please enter JANUARY, MARCH, JUNE...";
	}

}