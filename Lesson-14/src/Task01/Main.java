package Task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

	private static final String Student = null;

	public static void main(String[] args) {

		HashSet<Student> student = new HashSet<>();

		student.add(new Student("Kurch Marian", 4));
		student.add(new Student("Vasylenko Inna", 4));
		student.add(new Student("Shevchenko Oleksandr", 3));
		student.add(new Student("Dovgyy Volodymyr", 2));
		student.add(new Student("Zhepko Iryna", 1));
		student.add(new Student("Vasylenko Andriy", 2));
		student.add(new Student("Koval Ivan", 4));
		System.out.println("     Unsorted list:");

		for (Student s : student) {
			System.out.println(s);
		}

		TreeSet<Student> studentSortByName = new TreeSet<>(new StudentSortingByName());
		studentSortByName.addAll(student);
		System.out.println("     Sorting by name:");
		for (Object o : studentSortByName) {
			System.out.println(o.toString());
		}

		TreeSet<Student> studentSortByLevel = new TreeSet<>(new StudentSortingByLevel());
		studentSortByLevel.addAll(student);
		System.out.println("     Sorting by level:");
		for (Object o : studentSortByLevel) {
			System.out.println(o.toString());
		}

	}

}
