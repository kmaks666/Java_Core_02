package Task01;

import java.util.Comparator;

public class StudentSortingByName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getName().compareTo(s2.getName()) > 0) {
			return 1;
		} else if (s1.getName().compareTo(s2.getName()) < 0) {
			return -1;
		} else {
			if (s1.getLevel() > s2.getLevel()) {
				return 1;
			} else if (s1.getLevel() < s2.getLevel()) {
				return -1;
			} else
				return 0;
		}
	}
}
