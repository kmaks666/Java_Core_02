
public class Application {

	public static void main(String[] args) {
	
Animal animal = new Animal("����", 75, 11);

System.out.println("����� ������� = "+animal.getName()+" �������� ������� = "+animal.getSpeed()+"��/���  ³� ������� = "+animal.getAge()+"����");
animal.setName("������"); animal.setSpeed(120);animal.setAge(20);	
System.out.println("����� ������� = "+animal.getName()+" �������� ������� = "+animal.getSpeed()+"��/���  ³� ������� = "+animal.getAge()+"����");
	}

}
