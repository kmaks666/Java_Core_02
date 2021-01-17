package task2;

public class Student {
	String firstName;
	String secondName;
	int age;

	public Student(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public Student(String firstName, String secondName, int age) {
		this(firstName, secondName);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", secondName=" + secondName + ", age=" + age + "]";
	}

}
