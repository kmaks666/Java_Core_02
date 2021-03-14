package task01;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		System.out.println(myList);
		
		addToList(myList);
		System.out.println(myList);
	
		}

	public static <T> void addToList(List<T> list) {
		list.add((T) (Integer) 1);
		list.add((T) (String)"string");
		list.add((T) (Integer) 2);
		list.add((T) (String)"string");
		list.add((T) (Integer) 3);
		list.add((T) (String)"string");
		}
	
}
