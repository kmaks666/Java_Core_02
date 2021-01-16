
public class Application {

	public static void main(String[] args) {
	
Animal animal = new Animal("Тигр", 75, 11);

System.out.println("Назва тварини = "+animal.getName()+" Швидкість тварини = "+animal.getSpeed()+"км/год  Вік тварини = "+animal.getAge()+"років");
animal.setName("Гепард"); animal.setSpeed(120);animal.setAge(20);	
System.out.println("Назва тварини = "+animal.getName()+" Швидкість тварини = "+animal.getSpeed()+"км/год  Вік тварини = "+animal.getAge()+"років");
	}

}
