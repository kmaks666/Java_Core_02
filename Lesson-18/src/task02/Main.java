package task02;

public class Main {

	public static void main(String[] args) {
		MyMap<String, Integer> student=new MyMap<>();
		String key="Zhepko Andrii";
		Integer value=18;
		
		student.addToMap("Kurch Marian", 21);
		student.addToMap("Zhepko Iryna", 22);
		student.addToMap("Zhepko Andrii", 21);
		student.addToMap("Shevchenko Oleksandra", 19);
		student.addToMap("Bodnar Vadym", 23);
		student.addToMap("Kurii Kateryna", 18);
		
		System.out.println("	Students:");
		student.showAll();
		System.out.println();
		System.out.println("	All names:");
		student.showAllKeys();
		System.out.println();
		System.out.println("	All ages:");
		student.showAllValues();
		System.out.println();
		System.out.println("	Remove student by name: "+key);
		student.removeFromMapByKey(key);
		student.showAll();
		System.out.println();
		System.out.println("	Remove student by age: "+value);
		student.removeFromMapByValue(value);
		student.showAll();
		

	}

}
