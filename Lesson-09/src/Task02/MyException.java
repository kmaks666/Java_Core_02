package Task02;

public class MyException extends RuntimeException {

	public MyException() {
		super();
		System.out.println("For the normal functioning of the programs, " 
							+ "enter the value (a>0 && b<0) | (a<0 && b>0)");
	}

}
